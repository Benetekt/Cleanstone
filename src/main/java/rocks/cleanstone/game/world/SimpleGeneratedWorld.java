package rocks.cleanstone.game.world;

import com.google.common.base.Preconditions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.task.AsyncListenableTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import rocks.cleanstone.game.Position;
import rocks.cleanstone.game.block.Block;
import rocks.cleanstone.game.entity.RotatablePosition;
import rocks.cleanstone.game.entity.Rotation;
import rocks.cleanstone.game.world.chunk.Chunk;
import rocks.cleanstone.game.world.chunk.ChunkProvider;
import rocks.cleanstone.game.world.data.WorldDataSource;
import rocks.cleanstone.game.world.generation.WorldGenerator;
import rocks.cleanstone.game.world.region.Region;
import rocks.cleanstone.game.world.region.RegionManager;
import rocks.cleanstone.net.packet.enums.Difficulty;
import rocks.cleanstone.net.packet.enums.Dimension;
import rocks.cleanstone.net.packet.enums.LevelType;

public class SimpleGeneratedWorld implements World {

    protected final WorldGenerator generator;
    protected final WorldDataSource dataSource;
    protected final RegionManager regionManager;
    protected final ChunkProvider chunkProvider;
    private final String id;
    private final AsyncListenableTaskExecutor executor;
    private Dimension dimension = Dimension.OVERWORLD; //TODO: Move
    private Difficulty difficulty = Difficulty.PEACEFUL; //TODO: Move
    private LevelType levelType = LevelType.FLAT; //TODO: Move
    private RotatablePosition spawnPosition;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public SimpleGeneratedWorld(String id, ChunkProvider chunkProvider, WorldGenerator generator,
                                WorldDataSource dataSource, RegionManager regionManager,
                                RotatablePosition spawnPosition,
                                AsyncListenableTaskExecutor executor) {
        this.id = id;
        this.chunkProvider = chunkProvider;
        this.generator = generator;
        this.dataSource = dataSource;
        this.regionManager = regionManager;
        this.spawnPosition = spawnPosition;
        this.executor = executor;
    }

    public SimpleGeneratedWorld(String id, ChunkProvider chunkProvider, WorldGenerator generator,
                                WorldDataSource dataSource, RegionManager regionManager,
                                AsyncListenableTaskExecutor executor) {
        this(id, chunkProvider, generator, dataSource, regionManager, null, executor);
    }

    private static int getRelativeBlockCoordinate(int blockCoordinate) {
        int relX;
        if (blockCoordinate > 0) {
            relX = blockCoordinate % Chunk.WIDTH;
        } else {
            relX = Chunk.WIDTH + blockCoordinate % Chunk.WIDTH;
            if (relX == Chunk.WIDTH) relX = 0;
        }
        return relX;
    }

    private static int getChunkCoordinate(int blockCoordinate) {
        return blockCoordinate >> 4;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }

    @Override
    public LevelType getLevelType() {
        return levelType;
    }

    @Override
    public RotatablePosition getFirstSpawnPosition() {
        if (spawnPosition == null) {
            spawnPosition = new RotatablePosition(new Position(0, 46, 0), new Rotation(0, 0)); //TODO: Check if y is highest block
        }
        return spawnPosition;
    }

    @Override
    public WorldDataSource getDataSource() {
        return dataSource;
    }

    @Override
    public ListenableFuture<Block> getBlockAt(int x, int y, int z) {
        Preconditions.checkArgument(y < Chunk.HEIGHT && y >= 0,
                "Coordinate y (" + y + ") is not in allowed range (0<=y<" + Chunk.HEIGHT + ")");

        int chunkX = getChunkCoordinate(x), chunkY = getChunkCoordinate(z);
        int relX = getRelativeBlockCoordinate(x), relZ = getRelativeBlockCoordinate(z);
        return executor.submitListenable(() -> {
            return getChunk(chunkX, chunkY).get().getBlock(relX, y, relZ);
        });
    }

    @Override
    public ListenableFuture<Block> getBlockAt(Position position) {
        return getBlockAt((int) position.getX(), (int) position.getY(), (int) position.getZ());
    }

    @Override
    public void setBlockAt(int x, int y, int z, Block block) {
        Preconditions.checkArgument(y < Chunk.HEIGHT && y >= 0,
                "Coordinate y (" + y + ") is not in allowed range (0<=y<" + Chunk.HEIGHT + ")");
        Preconditions.checkNotNull(block, "block cannot be null");

        int chunkX = getChunkCoordinate(x), chunkY = getChunkCoordinate(z);
        int relX = getRelativeBlockCoordinate(x), relZ = getRelativeBlockCoordinate(z);

        getChunk(chunkX, chunkY).addCallback(chunk -> {
            chunk.setBlock(relX, y, relZ, block);
            dataSource.saveChunk(chunk);
        }, throwable -> {
            logger.error("Failed to get chunk " + chunkX + ":" + chunkY + " in world " + id, throwable);
        });
    }

    @Override
    public void setBlockAt(Position position, Block block) {
        setBlockAt((int) position.getX(), (int) position.getY(), (int) position.getZ(), block);
    }

    @Override
    public ListenableFuture<Chunk> getChunk(int chunkX, int chunkY) {
        return executor.submitListenable(() -> {
            return getRegion(chunkX, chunkY).get().getChunk(chunkX, chunkY).get();
        });
    }

    @Override
    public ListenableFuture<Chunk> getChunkAt(Position position) {
        int chunkX = getChunkCoordinate((int) position.getX());
        int chunkY = getChunkCoordinate((int) position.getZ());
        return getChunk(chunkX, chunkY);
    }

    private ListenableFuture<Region> getRegion(int chunkX, int chunkY) {
        return regionManager.getRegion(chunkX, chunkY);
    }
}
