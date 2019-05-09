package rocks.cleanstone.game.material.item.vanilla;

import rocks.cleanstone.game.block.Block;
import rocks.cleanstone.game.block.Face;
import rocks.cleanstone.game.entity.Entity;
import rocks.cleanstone.game.inventory.item.ItemStack;
import rocks.cleanstone.game.material.item.ItemType;

/**
 * A list of Cleanstone's item types
 * !! GENERATED FILE. This file was generated using the php-converter script. !!
 * */
public enum VanillaItemType implements ItemType {
    AIR("air"),
    STONE("stone"),
    GRANITE("granite"),
    POLISHED_GRANITE("polished_granite"),
    DIORITE("diorite"),
    POLISHED_DIORITE("polished_diorite"),
    ANDESITE("andesite"),
    POLISHED_ANDESITE("polished_andesite"),
    GRASS_BLOCK("grass_block"),
    DIRT("dirt"),
    COARSE_DIRT("coarse_dirt"),
    PODZOL("podzol"),
    COBBLESTONE("cobblestone"),
    OAK_PLANKS("oak_planks"),
    SPRUCE_PLANKS("spruce_planks"),
    BIRCH_PLANKS("birch_planks"),
    JUNGLE_PLANKS("jungle_planks"),
    ACACIA_PLANKS("acacia_planks"),
    DARK_OAK_PLANKS("dark_oak_planks"),
    OAK_SAPLING("oak_sapling"),
    SPRUCE_SAPLING("spruce_sapling"),
    BIRCH_SAPLING("birch_sapling"),
    JUNGLE_SAPLING("jungle_sapling"),
    ACACIA_SAPLING("acacia_sapling"),
    DARK_OAK_SAPLING("dark_oak_sapling"),
    BEDROCK("bedrock"),
    SAND("sand"),
    RED_SAND("red_sand"),
    GRAVEL("gravel"),
    GOLD_ORE("gold_ore"),
    IRON_ORE("iron_ore"),
    COAL_ORE("coal_ore"),
    OAK_LOG("oak_log"),
    SPRUCE_LOG("spruce_log"),
    BIRCH_LOG("birch_log"),
    JUNGLE_LOG("jungle_log"),
    ACACIA_LOG("acacia_log"),
    DARK_OAK_LOG("dark_oak_log"),
    STRIPPED_OAK_LOG("stripped_oak_log"),
    STRIPPED_SPRUCE_LOG("stripped_spruce_log"),
    STRIPPED_BIRCH_LOG("stripped_birch_log"),
    STRIPPED_JUNGLE_LOG("stripped_jungle_log"),
    STRIPPED_ACACIA_LOG("stripped_acacia_log"),
    STRIPPED_DARK_OAK_LOG("stripped_dark_oak_log"),
    STRIPPED_OAK_WOOD("stripped_oak_wood"),
    STRIPPED_SPRUCE_WOOD("stripped_spruce_wood"),
    STRIPPED_BIRCH_WOOD("stripped_birch_wood"),
    STRIPPED_JUNGLE_WOOD("stripped_jungle_wood"),
    STRIPPED_ACACIA_WOOD("stripped_acacia_wood"),
    STRIPPED_DARK_OAK_WOOD("stripped_dark_oak_wood"),
    OAK_WOOD("oak_wood"),
    SPRUCE_WOOD("spruce_wood"),
    BIRCH_WOOD("birch_wood"),
    JUNGLE_WOOD("jungle_wood"),
    ACACIA_WOOD("acacia_wood"),
    DARK_OAK_WOOD("dark_oak_wood"),
    OAK_LEAVES("oak_leaves"),
    SPRUCE_LEAVES("spruce_leaves"),
    BIRCH_LEAVES("birch_leaves"),
    JUNGLE_LEAVES("jungle_leaves"),
    ACACIA_LEAVES("acacia_leaves"),
    DARK_OAK_LEAVES("dark_oak_leaves"),
    SPONGE("sponge"),
    WET_SPONGE("wet_sponge"),
    GLASS("glass"),
    LAPIS_ORE("lapis_ore"),
    LAPIS_BLOCK("lapis_block"),
    DISPENSER("dispenser"),
    SANDSTONE("sandstone"),
    CHISELED_SANDSTONE("chiseled_sandstone"),
    CUT_SANDSTONE("cut_sandstone"),
    NOTE_BLOCK("note_block"),
    POWERED_RAIL("powered_rail"),
    DETECTOR_RAIL("detector_rail"),
    STICKY_PISTON("sticky_piston"),
    COBWEB("cobweb"),
    GRASS("grass"),
    FERN("fern"),
    DEAD_BUSH("dead_bush"),
    SEAGRASS("seagrass"),
    SEA_PICKLE("sea_pickle"),
    PISTON("piston"),
    WHITE_WOOL("white_wool"),
    ORANGE_WOOL("orange_wool"),
    MAGENTA_WOOL("magenta_wool"),
    LIGHT_BLUE_WOOL("light_blue_wool"),
    YELLOW_WOOL("yellow_wool"),
    LIME_WOOL("lime_wool"),
    PINK_WOOL("pink_wool"),
    GRAY_WOOL("gray_wool"),
    LIGHT_GRAY_WOOL("light_gray_wool"),
    CYAN_WOOL("cyan_wool"),
    PURPLE_WOOL("purple_wool"),
    BLUE_WOOL("blue_wool"),
    BROWN_WOOL("brown_wool"),
    GREEN_WOOL("green_wool"),
    RED_WOOL("red_wool"),
    BLACK_WOOL("black_wool"),
    DANDELION("dandelion"),
    POPPY("poppy"),
    BLUE_ORCHID("blue_orchid"),
    ALLIUM("allium"),
    AZURE_BLUET("azure_bluet"),
    RED_TULIP("red_tulip"),
    ORANGE_TULIP("orange_tulip"),
    WHITE_TULIP("white_tulip"),
    PINK_TULIP("pink_tulip"),
    OXEYE_DAISY("oxeye_daisy"),
    CORNFLOWER("cornflower"),
    LILY_OF_THE_VALLEY("lily_of_the_valley"),
    WITHER_ROSE("wither_rose"),
    BROWN_MUSHROOM("brown_mushroom"),
    RED_MUSHROOM("red_mushroom"),
    GOLD_BLOCK("gold_block"),
    IRON_BLOCK("iron_block"),
    OAK_SLAB("oak_slab"),
    SPRUCE_SLAB("spruce_slab"),
    BIRCH_SLAB("birch_slab"),
    JUNGLE_SLAB("jungle_slab"),
    ACACIA_SLAB("acacia_slab"),
    DARK_OAK_SLAB("dark_oak_slab"),
    STONE_SLAB("stone_slab"),
    SMOOTH_STONE_SLAB("smooth_stone_slab"),
    SANDSTONE_SLAB("sandstone_slab"),
    CUT_SANDSTONE_SLAB("cut_sandstone_slab"),
    PETRIFIED_OAK_SLAB("petrified_oak_slab"),
    COBBLESTONE_SLAB("cobblestone_slab"),
    BRICK_SLAB("brick_slab"),
    STONE_BRICK_SLAB("stone_brick_slab"),
    NETHER_BRICK_SLAB("nether_brick_slab"),
    QUARTZ_SLAB("quartz_slab"),
    RED_SANDSTONE_SLAB("red_sandstone_slab"),
    CUT_RED_SANDSTONE_SLAB("cut_red_sandstone_slab"),
    PURPUR_SLAB("purpur_slab"),
    PRISMARINE_SLAB("prismarine_slab"),
    PRISMARINE_BRICK_SLAB("prismarine_brick_slab"),
    DARK_PRISMARINE_SLAB("dark_prismarine_slab"),
    SMOOTH_QUARTZ("smooth_quartz"),
    SMOOTH_RED_SANDSTONE("smooth_red_sandstone"),
    SMOOTH_SANDSTONE("smooth_sandstone"),
    SMOOTH_STONE("smooth_stone"),
    BRICKS("bricks"),
    TNT("tnt"),
    BOOKSHELF("bookshelf"),
    MOSSY_COBBLESTONE("mossy_cobblestone"),
    OBSIDIAN("obsidian"),
    TORCH("torch"),
    END_ROD("end_rod"),
    CHORUS_PLANT("chorus_plant"),
    CHORUS_FLOWER("chorus_flower"),
    PURPUR_BLOCK("purpur_block"),
    PURPUR_PILLAR("purpur_pillar"),
    PURPUR_STAIRS("purpur_stairs"),
    SPAWNER("spawner"),
    OAK_STAIRS("oak_stairs"),
    CHEST("chest"),
    DIAMOND_ORE("diamond_ore"),
    DIAMOND_BLOCK("diamond_block"),
    CRAFTING_TABLE("crafting_table"),
    FARMLAND("farmland"),
    FURNACE("furnace"),
    LADDER("ladder"),
    RAIL("rail"),
    COBBLESTONE_STAIRS("cobblestone_stairs"),
    LEVER("lever"),
    STONE_PRESSURE_PLATE("stone_pressure_plate"),
    OAK_PRESSURE_PLATE("oak_pressure_plate"),
    SPRUCE_PRESSURE_PLATE("spruce_pressure_plate"),
    BIRCH_PRESSURE_PLATE("birch_pressure_plate"),
    JUNGLE_PRESSURE_PLATE("jungle_pressure_plate"),
    ACACIA_PRESSURE_PLATE("acacia_pressure_plate"),
    DARK_OAK_PRESSURE_PLATE("dark_oak_pressure_plate"),
    REDSTONE_ORE("redstone_ore"),
    REDSTONE_TORCH("redstone_torch"),
    STONE_BUTTON("stone_button"),
    SNOW("snow"),
    ICE("ice"),
    SNOW_BLOCK("snow_block"),
    CACTUS("cactus"),
    CLAY("clay"),
    JUKEBOX("jukebox"),
    OAK_FENCE("oak_fence"),
    SPRUCE_FENCE("spruce_fence"),
    BIRCH_FENCE("birch_fence"),
    JUNGLE_FENCE("jungle_fence"),
    ACACIA_FENCE("acacia_fence"),
    DARK_OAK_FENCE("dark_oak_fence"),
    PUMPKIN("pumpkin"),
    CARVED_PUMPKIN("carved_pumpkin"),
    NETHERRACK("netherrack"),
    SOUL_SAND("soul_sand"),
    GLOWSTONE("glowstone"),
    JACK_O_LANTERN("jack_o_lantern"),
    OAK_TRAPDOOR("oak_trapdoor"),
    SPRUCE_TRAPDOOR("spruce_trapdoor"),
    BIRCH_TRAPDOOR("birch_trapdoor"),
    JUNGLE_TRAPDOOR("jungle_trapdoor"),
    ACACIA_TRAPDOOR("acacia_trapdoor"),
    DARK_OAK_TRAPDOOR("dark_oak_trapdoor"),
    INFESTED_STONE("infested_stone"),
    INFESTED_COBBLESTONE("infested_cobblestone"),
    INFESTED_STONE_BRICKS("infested_stone_bricks"),
    INFESTED_MOSSY_STONE_BRICKS("infested_mossy_stone_bricks"),
    INFESTED_CRACKED_STONE_BRICKS("infested_cracked_stone_bricks"),
    INFESTED_CHISELED_STONE_BRICKS("infested_chiseled_stone_bricks"),
    STONE_BRICKS("stone_bricks"),
    MOSSY_STONE_BRICKS("mossy_stone_bricks"),
    CRACKED_STONE_BRICKS("cracked_stone_bricks"),
    CHISELED_STONE_BRICKS("chiseled_stone_bricks"),
    BROWN_MUSHROOM_BLOCK("brown_mushroom_block"),
    RED_MUSHROOM_BLOCK("red_mushroom_block"),
    MUSHROOM_STEM("mushroom_stem"),
    IRON_BARS("iron_bars"),
    GLASS_PANE("glass_pane"),
    MELON("melon"),
    VINE("vine"),
    OAK_FENCE_GATE("oak_fence_gate"),
    SPRUCE_FENCE_GATE("spruce_fence_gate"),
    BIRCH_FENCE_GATE("birch_fence_gate"),
    JUNGLE_FENCE_GATE("jungle_fence_gate"),
    ACACIA_FENCE_GATE("acacia_fence_gate"),
    DARK_OAK_FENCE_GATE("dark_oak_fence_gate"),
    BRICK_STAIRS("brick_stairs"),
    STONE_BRICK_STAIRS("stone_brick_stairs"),
    MYCELIUM("mycelium"),
    LILY_PAD("lily_pad"),
    NETHER_BRICKS("nether_bricks"),
    NETHER_BRICK_FENCE("nether_brick_fence"),
    NETHER_BRICK_STAIRS("nether_brick_stairs"),
    ENCHANTING_TABLE("enchanting_table"),
    END_PORTAL_FRAME("end_portal_frame"),
    END_STONE("end_stone"),
    END_STONE_BRICKS("end_stone_bricks"),
    DRAGON_EGG("dragon_egg"),
    REDSTONE_LAMP("redstone_lamp"),
    SANDSTONE_STAIRS("sandstone_stairs"),
    EMERALD_ORE("emerald_ore"),
    ENDER_CHEST("ender_chest"),
    TRIPWIRE_HOOK("tripwire_hook"),
    EMERALD_BLOCK("emerald_block"),
    SPRUCE_STAIRS("spruce_stairs"),
    BIRCH_STAIRS("birch_stairs"),
    JUNGLE_STAIRS("jungle_stairs"),
    COMMAND_BLOCK("command_block"),
    BEACON("beacon"),
    COBBLESTONE_WALL("cobblestone_wall"),
    MOSSY_COBBLESTONE_WALL("mossy_cobblestone_wall"),
    BRICK_WALL("brick_wall"),
    PRISMARINE_WALL("prismarine_wall"),
    RED_SANDSTONE_WALL("red_sandstone_wall"),
    MOSSY_STONE_BRICK_WALL("mossy_stone_brick_wall"),
    GRANITE_WALL("granite_wall"),
    STONE_BRICK_WALL("stone_brick_wall"),
    NETHER_BRICK_WALL("nether_brick_wall"),
    ANDESITE_WALL("andesite_wall"),
    RED_NETHER_BRICK_WALL("red_nether_brick_wall"),
    SANDSTONE_WALL("sandstone_wall"),
    END_STONE_BRICK_WALL("end_stone_brick_wall"),
    DIORITE_WALL("diorite_wall"),
    OAK_BUTTON("oak_button"),
    SPRUCE_BUTTON("spruce_button"),
    BIRCH_BUTTON("birch_button"),
    JUNGLE_BUTTON("jungle_button"),
    ACACIA_BUTTON("acacia_button"),
    DARK_OAK_BUTTON("dark_oak_button"),
    ANVIL("anvil"),
    CHIPPED_ANVIL("chipped_anvil"),
    DAMAGED_ANVIL("damaged_anvil"),
    TRAPPED_CHEST("trapped_chest"),
    LIGHT_WEIGHTED_PRESSURE_PLATE("light_weighted_pressure_plate"),
    HEAVY_WEIGHTED_PRESSURE_PLATE("heavy_weighted_pressure_plate"),
    DAYLIGHT_DETECTOR("daylight_detector"),
    REDSTONE_BLOCK("redstone_block"),
    NETHER_QUARTZ_ORE("nether_quartz_ore"),
    HOPPER("hopper"),
    CHISELED_QUARTZ_BLOCK("chiseled_quartz_block"),
    QUARTZ_BLOCK("quartz_block"),
    QUARTZ_PILLAR("quartz_pillar"),
    QUARTZ_STAIRS("quartz_stairs"),
    ACTIVATOR_RAIL("activator_rail"),
    DROPPER("dropper"),
    WHITE_TERRACOTTA("white_terracotta"),
    ORANGE_TERRACOTTA("orange_terracotta"),
    MAGENTA_TERRACOTTA("magenta_terracotta"),
    LIGHT_BLUE_TERRACOTTA("light_blue_terracotta"),
    YELLOW_TERRACOTTA("yellow_terracotta"),
    LIME_TERRACOTTA("lime_terracotta"),
    PINK_TERRACOTTA("pink_terracotta"),
    GRAY_TERRACOTTA("gray_terracotta"),
    LIGHT_GRAY_TERRACOTTA("light_gray_terracotta"),
    CYAN_TERRACOTTA("cyan_terracotta"),
    PURPLE_TERRACOTTA("purple_terracotta"),
    BLUE_TERRACOTTA("blue_terracotta"),
    BROWN_TERRACOTTA("brown_terracotta"),
    GREEN_TERRACOTTA("green_terracotta"),
    RED_TERRACOTTA("red_terracotta"),
    BLACK_TERRACOTTA("black_terracotta"),
    BARRIER("barrier"),
    IRON_TRAPDOOR("iron_trapdoor"),
    HAY_BLOCK("hay_block"),
    WHITE_CARPET("white_carpet"),
    ORANGE_CARPET("orange_carpet"),
    MAGENTA_CARPET("magenta_carpet"),
    LIGHT_BLUE_CARPET("light_blue_carpet"),
    YELLOW_CARPET("yellow_carpet"),
    LIME_CARPET("lime_carpet"),
    PINK_CARPET("pink_carpet"),
    GRAY_CARPET("gray_carpet"),
    LIGHT_GRAY_CARPET("light_gray_carpet"),
    CYAN_CARPET("cyan_carpet"),
    PURPLE_CARPET("purple_carpet"),
    BLUE_CARPET("blue_carpet"),
    BROWN_CARPET("brown_carpet"),
    GREEN_CARPET("green_carpet"),
    RED_CARPET("red_carpet"),
    BLACK_CARPET("black_carpet"),
    TERRACOTTA("terracotta"),
    COAL_BLOCK("coal_block"),
    PACKED_ICE("packed_ice"),
    ACACIA_STAIRS("acacia_stairs"),
    DARK_OAK_STAIRS("dark_oak_stairs"),
    SLIME_BLOCK("slime_block"),
    GRASS_PATH("grass_path"),
    SUNFLOWER("sunflower"),
    LILAC("lilac"),
    ROSE_BUSH("rose_bush"),
    PEONY("peony"),
    TALL_GRASS("tall_grass"),
    LARGE_FERN("large_fern"),
    WHITE_STAINED_GLASS("white_stained_glass"),
    ORANGE_STAINED_GLASS("orange_stained_glass"),
    MAGENTA_STAINED_GLASS("magenta_stained_glass"),
    LIGHT_BLUE_STAINED_GLASS("light_blue_stained_glass"),
    YELLOW_STAINED_GLASS("yellow_stained_glass"),
    LIME_STAINED_GLASS("lime_stained_glass"),
    PINK_STAINED_GLASS("pink_stained_glass"),
    GRAY_STAINED_GLASS("gray_stained_glass"),
    LIGHT_GRAY_STAINED_GLASS("light_gray_stained_glass"),
    CYAN_STAINED_GLASS("cyan_stained_glass"),
    PURPLE_STAINED_GLASS("purple_stained_glass"),
    BLUE_STAINED_GLASS("blue_stained_glass"),
    BROWN_STAINED_GLASS("brown_stained_glass"),
    GREEN_STAINED_GLASS("green_stained_glass"),
    RED_STAINED_GLASS("red_stained_glass"),
    BLACK_STAINED_GLASS("black_stained_glass"),
    WHITE_STAINED_GLASS_PANE("white_stained_glass_pane"),
    ORANGE_STAINED_GLASS_PANE("orange_stained_glass_pane"),
    MAGENTA_STAINED_GLASS_PANE("magenta_stained_glass_pane"),
    LIGHT_BLUE_STAINED_GLASS_PANE("light_blue_stained_glass_pane"),
    YELLOW_STAINED_GLASS_PANE("yellow_stained_glass_pane"),
    LIME_STAINED_GLASS_PANE("lime_stained_glass_pane"),
    PINK_STAINED_GLASS_PANE("pink_stained_glass_pane"),
    GRAY_STAINED_GLASS_PANE("gray_stained_glass_pane"),
    LIGHT_GRAY_STAINED_GLASS_PANE("light_gray_stained_glass_pane"),
    CYAN_STAINED_GLASS_PANE("cyan_stained_glass_pane"),
    PURPLE_STAINED_GLASS_PANE("purple_stained_glass_pane"),
    BLUE_STAINED_GLASS_PANE("blue_stained_glass_pane"),
    BROWN_STAINED_GLASS_PANE("brown_stained_glass_pane"),
    GREEN_STAINED_GLASS_PANE("green_stained_glass_pane"),
    RED_STAINED_GLASS_PANE("red_stained_glass_pane"),
    BLACK_STAINED_GLASS_PANE("black_stained_glass_pane"),
    PRISMARINE("prismarine"),
    PRISMARINE_BRICKS("prismarine_bricks"),
    DARK_PRISMARINE("dark_prismarine"),
    PRISMARINE_STAIRS("prismarine_stairs"),
    PRISMARINE_BRICK_STAIRS("prismarine_brick_stairs"),
    DARK_PRISMARINE_STAIRS("dark_prismarine_stairs"),
    SEA_LANTERN("sea_lantern"),
    RED_SANDSTONE("red_sandstone"),
    CHISELED_RED_SANDSTONE("chiseled_red_sandstone"),
    CUT_RED_SANDSTONE("cut_red_sandstone"),
    RED_SANDSTONE_STAIRS("red_sandstone_stairs"),
    REPEATING_COMMAND_BLOCK("repeating_command_block"),
    CHAIN_COMMAND_BLOCK("chain_command_block"),
    MAGMA_BLOCK("magma_block"),
    NETHER_WART_BLOCK("nether_wart_block"),
    RED_NETHER_BRICKS("red_nether_bricks"),
    BONE_BLOCK("bone_block"),
    STRUCTURE_VOID("structure_void"),
    OBSERVER("observer"),
    SHULKER_BOX("shulker_box"),
    WHITE_SHULKER_BOX("white_shulker_box"),
    ORANGE_SHULKER_BOX("orange_shulker_box"),
    MAGENTA_SHULKER_BOX("magenta_shulker_box"),
    LIGHT_BLUE_SHULKER_BOX("light_blue_shulker_box"),
    YELLOW_SHULKER_BOX("yellow_shulker_box"),
    LIME_SHULKER_BOX("lime_shulker_box"),
    PINK_SHULKER_BOX("pink_shulker_box"),
    GRAY_SHULKER_BOX("gray_shulker_box"),
    LIGHT_GRAY_SHULKER_BOX("light_gray_shulker_box"),
    CYAN_SHULKER_BOX("cyan_shulker_box"),
    PURPLE_SHULKER_BOX("purple_shulker_box"),
    BLUE_SHULKER_BOX("blue_shulker_box"),
    BROWN_SHULKER_BOX("brown_shulker_box"),
    GREEN_SHULKER_BOX("green_shulker_box"),
    RED_SHULKER_BOX("red_shulker_box"),
    BLACK_SHULKER_BOX("black_shulker_box"),
    WHITE_GLAZED_TERRACOTTA("white_glazed_terracotta"),
    ORANGE_GLAZED_TERRACOTTA("orange_glazed_terracotta"),
    MAGENTA_GLAZED_TERRACOTTA("magenta_glazed_terracotta"),
    LIGHT_BLUE_GLAZED_TERRACOTTA("light_blue_glazed_terracotta"),
    YELLOW_GLAZED_TERRACOTTA("yellow_glazed_terracotta"),
    LIME_GLAZED_TERRACOTTA("lime_glazed_terracotta"),
    PINK_GLAZED_TERRACOTTA("pink_glazed_terracotta"),
    GRAY_GLAZED_TERRACOTTA("gray_glazed_terracotta"),
    LIGHT_GRAY_GLAZED_TERRACOTTA("light_gray_glazed_terracotta"),
    CYAN_GLAZED_TERRACOTTA("cyan_glazed_terracotta"),
    PURPLE_GLAZED_TERRACOTTA("purple_glazed_terracotta"),
    BLUE_GLAZED_TERRACOTTA("blue_glazed_terracotta"),
    BROWN_GLAZED_TERRACOTTA("brown_glazed_terracotta"),
    GREEN_GLAZED_TERRACOTTA("green_glazed_terracotta"),
    RED_GLAZED_TERRACOTTA("red_glazed_terracotta"),
    BLACK_GLAZED_TERRACOTTA("black_glazed_terracotta"),
    WHITE_CONCRETE("white_concrete"),
    ORANGE_CONCRETE("orange_concrete"),
    MAGENTA_CONCRETE("magenta_concrete"),
    LIGHT_BLUE_CONCRETE("light_blue_concrete"),
    YELLOW_CONCRETE("yellow_concrete"),
    LIME_CONCRETE("lime_concrete"),
    PINK_CONCRETE("pink_concrete"),
    GRAY_CONCRETE("gray_concrete"),
    LIGHT_GRAY_CONCRETE("light_gray_concrete"),
    CYAN_CONCRETE("cyan_concrete"),
    PURPLE_CONCRETE("purple_concrete"),
    BLUE_CONCRETE("blue_concrete"),
    BROWN_CONCRETE("brown_concrete"),
    GREEN_CONCRETE("green_concrete"),
    RED_CONCRETE("red_concrete"),
    BLACK_CONCRETE("black_concrete"),
    WHITE_CONCRETE_POWDER("white_concrete_powder"),
    ORANGE_CONCRETE_POWDER("orange_concrete_powder"),
    MAGENTA_CONCRETE_POWDER("magenta_concrete_powder"),
    LIGHT_BLUE_CONCRETE_POWDER("light_blue_concrete_powder"),
    YELLOW_CONCRETE_POWDER("yellow_concrete_powder"),
    LIME_CONCRETE_POWDER("lime_concrete_powder"),
    PINK_CONCRETE_POWDER("pink_concrete_powder"),
    GRAY_CONCRETE_POWDER("gray_concrete_powder"),
    LIGHT_GRAY_CONCRETE_POWDER("light_gray_concrete_powder"),
    CYAN_CONCRETE_POWDER("cyan_concrete_powder"),
    PURPLE_CONCRETE_POWDER("purple_concrete_powder"),
    BLUE_CONCRETE_POWDER("blue_concrete_powder"),
    BROWN_CONCRETE_POWDER("brown_concrete_powder"),
    GREEN_CONCRETE_POWDER("green_concrete_powder"),
    RED_CONCRETE_POWDER("red_concrete_powder"),
    BLACK_CONCRETE_POWDER("black_concrete_powder"),
    TURTLE_EGG("turtle_egg"),
    DEAD_TUBE_CORAL_BLOCK("dead_tube_coral_block"),
    DEAD_BRAIN_CORAL_BLOCK("dead_brain_coral_block"),
    DEAD_BUBBLE_CORAL_BLOCK("dead_bubble_coral_block"),
    DEAD_FIRE_CORAL_BLOCK("dead_fire_coral_block"),
    DEAD_HORN_CORAL_BLOCK("dead_horn_coral_block"),
    TUBE_CORAL_BLOCK("tube_coral_block"),
    BRAIN_CORAL_BLOCK("brain_coral_block"),
    BUBBLE_CORAL_BLOCK("bubble_coral_block"),
    FIRE_CORAL_BLOCK("fire_coral_block"),
    HORN_CORAL_BLOCK("horn_coral_block"),
    TUBE_CORAL("tube_coral"),
    BRAIN_CORAL("brain_coral"),
    BUBBLE_CORAL("bubble_coral"),
    FIRE_CORAL("fire_coral"),
    HORN_CORAL("horn_coral"),
    DEAD_BRAIN_CORAL("dead_brain_coral"),
    DEAD_BUBBLE_CORAL("dead_bubble_coral"),
    DEAD_FIRE_CORAL("dead_fire_coral"),
    DEAD_HORN_CORAL("dead_horn_coral"),
    DEAD_TUBE_CORAL("dead_tube_coral"),
    TUBE_CORAL_FAN("tube_coral_fan"),
    BRAIN_CORAL_FAN("brain_coral_fan"),
    BUBBLE_CORAL_FAN("bubble_coral_fan"),
    FIRE_CORAL_FAN("fire_coral_fan"),
    HORN_CORAL_FAN("horn_coral_fan"),
    DEAD_TUBE_CORAL_FAN("dead_tube_coral_fan"),
    DEAD_BRAIN_CORAL_FAN("dead_brain_coral_fan"),
    DEAD_BUBBLE_CORAL_FAN("dead_bubble_coral_fan"),
    DEAD_FIRE_CORAL_FAN("dead_fire_coral_fan"),
    DEAD_HORN_CORAL_FAN("dead_horn_coral_fan"),
    BLUE_ICE("blue_ice"),
    CONDUIT("conduit"),
    POLISHED_GRANITE_STAIRS("polished_granite_stairs"),
    SMOOTH_RED_SANDSTONE_STAIRS("smooth_red_sandstone_stairs"),
    MOSSY_STONE_BRICK_STAIRS("mossy_stone_brick_stairs"),
    POLISHED_DIORITE_STAIRS("polished_diorite_stairs"),
    MOSSY_COBBLESTONE_STAIRS("mossy_cobblestone_stairs"),
    END_STONE_BRICK_STAIRS("end_stone_brick_stairs"),
    STONE_STAIRS("stone_stairs"),
    SMOOTH_SANDSTONE_STAIRS("smooth_sandstone_stairs"),
    SMOOTH_QUARTZ_STAIRS("smooth_quartz_stairs"),
    GRANITE_STAIRS("granite_stairs"),
    ANDESITE_STAIRS("andesite_stairs"),
    RED_NETHER_BRICK_STAIRS("red_nether_brick_stairs"),
    POLISHED_ANDESITE_STAIRS("polished_andesite_stairs"),
    DIORITE_STAIRS("diorite_stairs"),
    POLISHED_GRANITE_SLAB("polished_granite_slab"),
    SMOOTH_RED_SANDSTONE_SLAB("smooth_red_sandstone_slab"),
    MOSSY_STONE_BRICK_SLAB("mossy_stone_brick_slab"),
    POLISHED_DIORITE_SLAB("polished_diorite_slab"),
    MOSSY_COBBLESTONE_SLAB("mossy_cobblestone_slab"),
    END_STONE_BRICK_SLAB("end_stone_brick_slab"),
    SMOOTH_SANDSTONE_SLAB("smooth_sandstone_slab"),
    SMOOTH_QUARTZ_SLAB("smooth_quartz_slab"),
    GRANITE_SLAB("granite_slab"),
    ANDESITE_SLAB("andesite_slab"),
    RED_NETHER_BRICK_SLAB("red_nether_brick_slab"),
    POLISHED_ANDESITE_SLAB("polished_andesite_slab"),
    DIORITE_SLAB("diorite_slab"),
    SCAFFOLDING("scaffolding"),
    IRON_DOOR("iron_door"),
    OAK_DOOR("oak_door"),
    SPRUCE_DOOR("spruce_door"),
    BIRCH_DOOR("birch_door"),
    JUNGLE_DOOR("jungle_door"),
    ACACIA_DOOR("acacia_door"),
    DARK_OAK_DOOR("dark_oak_door"),
    REPEATER("repeater"),
    COMPARATOR("comparator"),
    STRUCTURE_BLOCK("structure_block"),
    JIGSAW("jigsaw"),
    COMPOSTER("composter"),
    TURTLE_HELMET("turtle_helmet"),
    SCUTE("scute"),
    IRON_SHOVEL("iron_shovel"),
    IRON_PICKAXE("iron_pickaxe"),
    IRON_AXE("iron_axe"),
    FLINT_AND_STEEL("flint_and_steel"),
    APPLE("apple"),
    BOW("bow"),
    ARROW("arrow"),
    COAL("coal"),
    CHARCOAL("charcoal"),
    DIAMOND("diamond"),
    IRON_INGOT("iron_ingot"),
    GOLD_INGOT("gold_ingot"),
    IRON_SWORD("iron_sword"),
    WOODEN_SWORD("wooden_sword"),
    WOODEN_SHOVEL("wooden_shovel"),
    WOODEN_PICKAXE("wooden_pickaxe"),
    WOODEN_AXE("wooden_axe"),
    STONE_SWORD("stone_sword"),
    STONE_SHOVEL("stone_shovel"),
    STONE_PICKAXE("stone_pickaxe"),
    STONE_AXE("stone_axe"),
    DIAMOND_SWORD("diamond_sword"),
    DIAMOND_SHOVEL("diamond_shovel"),
    DIAMOND_PICKAXE("diamond_pickaxe"),
    DIAMOND_AXE("diamond_axe"),
    STICK("stick"),
    BOWL("bowl"),
    MUSHROOM_STEW("mushroom_stew"),
    GOLDEN_SWORD("golden_sword"),
    GOLDEN_SHOVEL("golden_shovel"),
    GOLDEN_PICKAXE("golden_pickaxe"),
    GOLDEN_AXE("golden_axe"),
    STRING("string"),
    FEATHER("feather"),
    GUNPOWDER("gunpowder"),
    WOODEN_HOE("wooden_hoe"),
    STONE_HOE("stone_hoe"),
    IRON_HOE("iron_hoe"),
    DIAMOND_HOE("diamond_hoe"),
    GOLDEN_HOE("golden_hoe"),
    WHEAT_SEEDS("wheat_seeds"),
    WHEAT("wheat"),
    BREAD("bread"),
    LEATHER_HELMET("leather_helmet"),
    LEATHER_CHESTPLATE("leather_chestplate"),
    LEATHER_LEGGINGS("leather_leggings"),
    LEATHER_BOOTS("leather_boots"),
    CHAINMAIL_HELMET("chainmail_helmet"),
    CHAINMAIL_CHESTPLATE("chainmail_chestplate"),
    CHAINMAIL_LEGGINGS("chainmail_leggings"),
    CHAINMAIL_BOOTS("chainmail_boots"),
    IRON_HELMET("iron_helmet"),
    IRON_CHESTPLATE("iron_chestplate"),
    IRON_LEGGINGS("iron_leggings"),
    IRON_BOOTS("iron_boots"),
    DIAMOND_HELMET("diamond_helmet"),
    DIAMOND_CHESTPLATE("diamond_chestplate"),
    DIAMOND_LEGGINGS("diamond_leggings"),
    DIAMOND_BOOTS("diamond_boots"),
    GOLDEN_HELMET("golden_helmet"),
    GOLDEN_CHESTPLATE("golden_chestplate"),
    GOLDEN_LEGGINGS("golden_leggings"),
    GOLDEN_BOOTS("golden_boots"),
    FLINT("flint"),
    PORKCHOP("porkchop"),
    COOKED_PORKCHOP("cooked_porkchop"),
    PAINTING("painting"),
    GOLDEN_APPLE("golden_apple"),
    ENCHANTED_GOLDEN_APPLE("enchanted_golden_apple"),
    OAK_SIGN("oak_sign"),
    SPRUCE_SIGN("spruce_sign"),
    BIRCH_SIGN("birch_sign"),
    JUNGLE_SIGN("jungle_sign"),
    ACACIA_SIGN("acacia_sign"),
    DARK_OAK_SIGN("dark_oak_sign"),
    BUCKET("bucket"),
    WATER_BUCKET("water_bucket"),
    LAVA_BUCKET("lava_bucket"),
    MINECART("minecart"),
    SADDLE("saddle"),
    REDSTONE("redstone"),
    SNOWBALL("snowball"),
    OAK_BOAT("oak_boat"),
    LEATHER("leather"),
    MILK_BUCKET("milk_bucket"),
    PUFFERFISH_BUCKET("pufferfish_bucket"),
    SALMON_BUCKET("salmon_bucket"),
    COD_BUCKET("cod_bucket"),
    TROPICAL_FISH_BUCKET("tropical_fish_bucket"),
    BRICK("brick"),
    CLAY_BALL("clay_ball"),
    SUGAR_CANE("sugar_cane"),
    KELP("kelp"),
    DRIED_KELP_BLOCK("dried_kelp_block"),
    BAMBOO("bamboo"),
    PAPER("paper"),
    BOOK("book"),
    SLIME_BALL("slime_ball"),
    CHEST_MINECART("chest_minecart"),
    FURNACE_MINECART("furnace_minecart"),
    EGG("egg"),
    COMPASS("compass"),
    FISHING_ROD("fishing_rod"),
    CLOCK("clock"),
    GLOWSTONE_DUST("glowstone_dust"),
    COD("cod"),
    SALMON("salmon"),
    TROPICAL_FISH("tropical_fish"),
    PUFFERFISH("pufferfish"),
    COOKED_COD("cooked_cod"),
    COOKED_SALMON("cooked_salmon"),
    INK_SAC("ink_sac"),
    RED_DYE("red_dye"),
    GREEN_DYE("green_dye"),
    COCOA_BEANS("cocoa_beans"),
    LAPIS_LAZULI("lapis_lazuli"),
    PURPLE_DYE("purple_dye"),
    CYAN_DYE("cyan_dye"),
    LIGHT_GRAY_DYE("light_gray_dye"),
    GRAY_DYE("gray_dye"),
    PINK_DYE("pink_dye"),
    LIME_DYE("lime_dye"),
    YELLOW_DYE("yellow_dye"),
    LIGHT_BLUE_DYE("light_blue_dye"),
    MAGENTA_DYE("magenta_dye"),
    ORANGE_DYE("orange_dye"),
    BONE_MEAL("bone_meal"),
    BLUE_DYE("blue_dye"),
    BROWN_DYE("brown_dye"),
    BLACK_DYE("black_dye"),
    WHITE_DYE("white_dye"),
    BONE("bone"),
    SUGAR("sugar"),
    CAKE("cake"),
    WHITE_BED("white_bed"),
    ORANGE_BED("orange_bed"),
    MAGENTA_BED("magenta_bed"),
    LIGHT_BLUE_BED("light_blue_bed"),
    YELLOW_BED("yellow_bed"),
    LIME_BED("lime_bed"),
    PINK_BED("pink_bed"),
    GRAY_BED("gray_bed"),
    LIGHT_GRAY_BED("light_gray_bed"),
    CYAN_BED("cyan_bed"),
    PURPLE_BED("purple_bed"),
    BLUE_BED("blue_bed"),
    BROWN_BED("brown_bed"),
    GREEN_BED("green_bed"),
    RED_BED("red_bed"),
    BLACK_BED("black_bed"),
    COOKIE("cookie"),
    FILLED_MAP("filled_map"),
    SHEARS("shears"),
    MELON_SLICE("melon_slice"),
    DRIED_KELP("dried_kelp"),
    PUMPKIN_SEEDS("pumpkin_seeds"),
    MELON_SEEDS("melon_seeds"),
    BEEF("beef"),
    COOKED_BEEF("cooked_beef"),
    CHICKEN("chicken"),
    COOKED_CHICKEN("cooked_chicken"),
    ROTTEN_FLESH("rotten_flesh"),
    ENDER_PEARL("ender_pearl"),
    BLAZE_ROD("blaze_rod"),
    GHAST_TEAR("ghast_tear"),
    GOLD_NUGGET("gold_nugget"),
    NETHER_WART("nether_wart"),
    POTION("potion"),
    GLASS_BOTTLE("glass_bottle"),
    SPIDER_EYE("spider_eye"),
    FERMENTED_SPIDER_EYE("fermented_spider_eye"),
    BLAZE_POWDER("blaze_powder"),
    MAGMA_CREAM("magma_cream"),
    BREWING_STAND("brewing_stand"),
    CAULDRON("cauldron"),
    ENDER_EYE("ender_eye"),
    GLISTERING_MELON_SLICE("glistering_melon_slice"),
    BAT_SPAWN_EGG("bat_spawn_egg"),
    BLAZE_SPAWN_EGG("blaze_spawn_egg"),
    CAT_SPAWN_EGG("cat_spawn_egg"),
    CAVE_SPIDER_SPAWN_EGG("cave_spider_spawn_egg"),
    CHICKEN_SPAWN_EGG("chicken_spawn_egg"),
    COD_SPAWN_EGG("cod_spawn_egg"),
    COW_SPAWN_EGG("cow_spawn_egg"),
    CREEPER_SPAWN_EGG("creeper_spawn_egg"),
    DOLPHIN_SPAWN_EGG("dolphin_spawn_egg"),
    DONKEY_SPAWN_EGG("donkey_spawn_egg"),
    DROWNED_SPAWN_EGG("drowned_spawn_egg"),
    ELDER_GUARDIAN_SPAWN_EGG("elder_guardian_spawn_egg"),
    ENDERMAN_SPAWN_EGG("enderman_spawn_egg"),
    ENDERMITE_SPAWN_EGG("endermite_spawn_egg"),
    EVOKER_SPAWN_EGG("evoker_spawn_egg"),
    FOX_SPAWN_EGG("fox_spawn_egg"),
    GHAST_SPAWN_EGG("ghast_spawn_egg"),
    GUARDIAN_SPAWN_EGG("guardian_spawn_egg"),
    HORSE_SPAWN_EGG("horse_spawn_egg"),
    HUSK_SPAWN_EGG("husk_spawn_egg"),
    LLAMA_SPAWN_EGG("llama_spawn_egg"),
    MAGMA_CUBE_SPAWN_EGG("magma_cube_spawn_egg"),
    MOOSHROOM_SPAWN_EGG("mooshroom_spawn_egg"),
    MULE_SPAWN_EGG("mule_spawn_egg"),
    OCELOT_SPAWN_EGG("ocelot_spawn_egg"),
    PANDA_SPAWN_EGG("panda_spawn_egg"),
    PARROT_SPAWN_EGG("parrot_spawn_egg"),
    PHANTOM_SPAWN_EGG("phantom_spawn_egg"),
    PIG_SPAWN_EGG("pig_spawn_egg"),
    PILLAGER_SPAWN_EGG("pillager_spawn_egg"),
    POLAR_BEAR_SPAWN_EGG("polar_bear_spawn_egg"),
    PUFFERFISH_SPAWN_EGG("pufferfish_spawn_egg"),
    RABBIT_SPAWN_EGG("rabbit_spawn_egg"),
    RAVAGER_SPAWN_EGG("ravager_spawn_egg"),
    SALMON_SPAWN_EGG("salmon_spawn_egg"),
    SHEEP_SPAWN_EGG("sheep_spawn_egg"),
    SHULKER_SPAWN_EGG("shulker_spawn_egg"),
    SILVERFISH_SPAWN_EGG("silverfish_spawn_egg"),
    SKELETON_SPAWN_EGG("skeleton_spawn_egg"),
    SKELETON_HORSE_SPAWN_EGG("skeleton_horse_spawn_egg"),
    SLIME_SPAWN_EGG("slime_spawn_egg"),
    SPIDER_SPAWN_EGG("spider_spawn_egg"),
    SQUID_SPAWN_EGG("squid_spawn_egg"),
    STRAY_SPAWN_EGG("stray_spawn_egg"),
    TRADER_LLAMA_SPAWN_EGG("trader_llama_spawn_egg"),
    TROPICAL_FISH_SPAWN_EGG("tropical_fish_spawn_egg"),
    TURTLE_SPAWN_EGG("turtle_spawn_egg"),
    VEX_SPAWN_EGG("vex_spawn_egg"),
    VILLAGER_SPAWN_EGG("villager_spawn_egg"),
    VINDICATOR_SPAWN_EGG("vindicator_spawn_egg"),
    WANDERING_TRADER_SPAWN_EGG("wandering_trader_spawn_egg"),
    WITCH_SPAWN_EGG("witch_spawn_egg"),
    WITHER_SKELETON_SPAWN_EGG("wither_skeleton_spawn_egg"),
    WOLF_SPAWN_EGG("wolf_spawn_egg"),
    ZOMBIE_SPAWN_EGG("zombie_spawn_egg"),
    ZOMBIE_HORSE_SPAWN_EGG("zombie_horse_spawn_egg"),
    ZOMBIE_PIGMAN_SPAWN_EGG("zombie_pigman_spawn_egg"),
    ZOMBIE_VILLAGER_SPAWN_EGG("zombie_villager_spawn_egg"),
    EXPERIENCE_BOTTLE("experience_bottle"),
    FIRE_CHARGE("fire_charge"),
    WRITABLE_BOOK("writable_book"),
    WRITTEN_BOOK("written_book"),
    EMERALD("emerald"),
    ITEM_FRAME("item_frame"),
    FLOWER_POT("flower_pot"),
    CARROT("carrot"),
    POTATO("potato"),
    BAKED_POTATO("baked_potato"),
    POISONOUS_POTATO("poisonous_potato"),
    MAP("map"),
    GOLDEN_CARROT("golden_carrot"),
    SKELETON_SKULL("skeleton_skull"),
    WITHER_SKELETON_SKULL("wither_skeleton_skull"),
    PLAYER_HEAD("player_head"),
    ZOMBIE_HEAD("zombie_head"),
    CREEPER_HEAD("creeper_head"),
    DRAGON_HEAD("dragon_head"),
    CARROT_ON_A_STICK("carrot_on_a_stick"),
    NETHER_STAR("nether_star"),
    PUMPKIN_PIE("pumpkin_pie"),
    FIREWORK_ROCKET("firework_rocket"),
    FIREWORK_STAR("firework_star"),
    ENCHANTED_BOOK("enchanted_book"),
    NETHER_BRICK("nether_brick"),
    QUARTZ("quartz"),
    TNT_MINECART("tnt_minecart"),
    HOPPER_MINECART("hopper_minecart"),
    PRISMARINE_SHARD("prismarine_shard"),
    PRISMARINE_CRYSTALS("prismarine_crystals"),
    RABBIT("rabbit"),
    COOKED_RABBIT("cooked_rabbit"),
    RABBIT_STEW("rabbit_stew"),
    RABBIT_FOOT("rabbit_foot"),
    RABBIT_HIDE("rabbit_hide"),
    ARMOR_STAND("armor_stand"),
    IRON_HORSE_ARMOR("iron_horse_armor"),
    GOLDEN_HORSE_ARMOR("golden_horse_armor"),
    DIAMOND_HORSE_ARMOR("diamond_horse_armor"),
    LEATHER_HORSE_ARMOR("leather_horse_armor"),
    LEAD("lead"),
    NAME_TAG("name_tag"),
    COMMAND_BLOCK_MINECART("command_block_minecart"),
    MUTTON("mutton"),
    COOKED_MUTTON("cooked_mutton"),
    WHITE_BANNER("white_banner"),
    ORANGE_BANNER("orange_banner"),
    MAGENTA_BANNER("magenta_banner"),
    LIGHT_BLUE_BANNER("light_blue_banner"),
    YELLOW_BANNER("yellow_banner"),
    LIME_BANNER("lime_banner"),
    PINK_BANNER("pink_banner"),
    GRAY_BANNER("gray_banner"),
    LIGHT_GRAY_BANNER("light_gray_banner"),
    CYAN_BANNER("cyan_banner"),
    PURPLE_BANNER("purple_banner"),
    BLUE_BANNER("blue_banner"),
    BROWN_BANNER("brown_banner"),
    GREEN_BANNER("green_banner"),
    RED_BANNER("red_banner"),
    BLACK_BANNER("black_banner"),
    END_CRYSTAL("end_crystal"),
    CHORUS_FRUIT("chorus_fruit"),
    POPPED_CHORUS_FRUIT("popped_chorus_fruit"),
    BEETROOT("beetroot"),
    BEETROOT_SEEDS("beetroot_seeds"),
    BEETROOT_SOUP("beetroot_soup"),
    DRAGON_BREATH("dragon_breath"),
    SPLASH_POTION("splash_potion"),
    SPECTRAL_ARROW("spectral_arrow"),
    TIPPED_ARROW("tipped_arrow"),
    LINGERING_POTION("lingering_potion"),
    SHIELD("shield"),
    ELYTRA("elytra"),
    SPRUCE_BOAT("spruce_boat"),
    BIRCH_BOAT("birch_boat"),
    JUNGLE_BOAT("jungle_boat"),
    ACACIA_BOAT("acacia_boat"),
    DARK_OAK_BOAT("dark_oak_boat"),
    TOTEM_OF_UNDYING("totem_of_undying"),
    SHULKER_SHELL("shulker_shell"),
    IRON_NUGGET("iron_nugget"),
    KNOWLEDGE_BOOK("knowledge_book"),
    DEBUG_STICK("debug_stick"),
    MUSIC_DISC_13("music_disc_13"),
    MUSIC_DISC_CAT("music_disc_cat"),
    MUSIC_DISC_BLOCKS("music_disc_blocks"),
    MUSIC_DISC_CHIRP("music_disc_chirp"),
    MUSIC_DISC_FAR("music_disc_far"),
    MUSIC_DISC_MALL("music_disc_mall"),
    MUSIC_DISC_MELLOHI("music_disc_mellohi"),
    MUSIC_DISC_STAL("music_disc_stal"),
    MUSIC_DISC_STRAD("music_disc_strad"),
    MUSIC_DISC_WARD("music_disc_ward"),
    MUSIC_DISC_11("music_disc_11"),
    MUSIC_DISC_WAIT("music_disc_wait"),
    TRIDENT("trident"),
    PHANTOM_MEMBRANE("phantom_membrane"),
    NAUTILUS_SHELL("nautilus_shell"),
    HEART_OF_THE_SEA("heart_of_the_sea"),
    CROSSBOW("crossbow"),
    SUSPICIOUS_STEW("suspicious_stew"),
    LOOM("loom"),
    FLOWER_BANNER_PATTERN("flower_banner_pattern"),
    CREEPER_BANNER_PATTERN("creeper_banner_pattern"),
    SKULL_BANNER_PATTERN("skull_banner_pattern"),
    MOJANG_BANNER_PATTERN("mojang_banner_pattern"),
    GLOBE_BANNER_PATTERN("globe_banner_pattern"),
    BARREL("barrel"),
    SMOKER("smoker"),
    BLAST_FURNACE("blast_furnace"),
    CARTOGRAPHY_TABLE("cartography_table"),
    FLETCHING_TABLE("fletching_table"),
    GRINDSTONE("grindstone"),
    LECTERN("lectern"),
    SMITHING_TABLE("smithing_table"),
    STONECUTTER("stonecutter"),
    BELL("bell"),
    LANTERN("lantern"),
    SWEET_BERRIES("sweet_berries"),
    CAMPFIRE("campfire");

    private final String minecraftID;
    private final int stackSize;

    VanillaItemType(String minecraftID, int stackSize) {
        this.minecraftID = minecraftID;
        this.stackSize = stackSize;
    }

    VanillaItemType(String minecraftID) {
        this(minecraftID, 64);
    }

    @Override
    public int getStackSize() {
        return stackSize;
    }

    @Override
    public void rightClickAir(Entity entity, ItemStack holding) {
    }

    @Override
    public void rightClickBlock(Entity entity, Block block, Face face) {
    }

    @Override
    public int getID() {
        return -ordinal();
    }

    @Override
    public String getMinecraftID() {
        return "minecraft:" + minecraftID;
    }
}