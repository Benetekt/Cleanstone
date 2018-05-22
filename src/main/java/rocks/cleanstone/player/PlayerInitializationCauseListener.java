package rocks.cleanstone.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

import rocks.cleanstone.core.CleanstoneServer;
import rocks.cleanstone.game.Position;
import rocks.cleanstone.game.entity.Rotation;
import rocks.cleanstone.game.entity.vanilla.Human;
import rocks.cleanstone.game.entity.vanilla.SimpleHuman;
import rocks.cleanstone.game.world.SimpleGeneratedWorld;
import rocks.cleanstone.game.world.region.EntityManager;
import rocks.cleanstone.net.Connection;
import rocks.cleanstone.net.minecraft.login.event.AsyncLoginSuccessEvent;
import rocks.cleanstone.net.minecraft.packet.data.Text;
import rocks.cleanstone.net.minecraft.packet.enums.PlayerAbilities;
import rocks.cleanstone.net.minecraft.packet.outbound.DisconnectPacket;
import rocks.cleanstone.player.event.AsyncPlayerLoginEvent;

import java.util.Arrays;

public class PlayerInitializationCauseListener {

    private final PlayerManager playerManager;
    private final EntityManager entityManager;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public PlayerInitializationCauseListener(PlayerManager playerManager, EntityManager entityManager) {
        this.playerManager = playerManager;
        this.entityManager = entityManager;
    }

    @Async(value = "playerExec")
    @EventListener
    public void onPlayerLoginSuccess(AsyncLoginSuccessEvent loginEvent) {
        Connection connection = loginEvent.getConnection();
        PlayerID playerID = playerManager.getPlayerID(loginEvent.getUUID(), loginEvent.getName());

        Player alreadyOnlinePlayer = playerManager.getOnlinePlayer(playerID);
        if (alreadyOnlinePlayer != null) {
            alreadyOnlinePlayer.kick(Text.of(CleanstoneServer.getMessage(
                    "core.player.logged-in-from-another-location")));
            playerManager.terminatePlayer(alreadyOnlinePlayer);
        }

        AsyncPlayerLoginEvent playerEvent = CleanstoneServer.publishEvent(
                new AsyncPlayerLoginEvent(connection, playerID, loginEvent.getUserProperties()));
        if (playerEvent.isCancelled()) {
            connection.close(new DisconnectPacket(playerEvent.getKickReason()));
            return;
        }
        OnlinePlayer player = new OnlinePlayer(playerID, connection, loginEvent.getUserProperties());

        if (playerManager.isPlayerOperator(playerID)) {
            player.setOp(true);
        }


        {
            Position position = new Position(0, 46, 0, new SimpleGeneratedWorld("", null, null));
            Rotation rotation = new Rotation(0, 0);

            Human human = new SimpleHuman(position, rotation);

            human = (Human) entityManager.addEntityWithoutID(human);

            player.setEntity(human);
        }

        player.setPlayerAbilities(Arrays.asList(PlayerAbilities.IS_CREATIVE, PlayerAbilities.CAN_FLY));

        playerManager.initializePlayer(player);
    }
}
