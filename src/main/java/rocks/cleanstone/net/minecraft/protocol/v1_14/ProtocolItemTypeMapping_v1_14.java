package rocks.cleanstone.net.minecraft.protocol.v1_14;

import org.springframework.stereotype.Component;

import rocks.cleanstone.game.material.item.mapping.SimpleItemTypeMapping;
import rocks.cleanstone.game.material.item.vanilla.VanillaItemType;

import static rocks.cleanstone.game.material.item.vanilla.VanillaItemType.*;

/**
 * Maps Cleanstone's internal item types to the Minecraft client's format
 * !! GENERATED FILE. This file was generated using the php-converter script. !!
 * */
@Component("protocolItemTypeMapping_v1_14")
public class ProtocolItemTypeMapping_v1_14 extends SimpleItemTypeMapping<Integer> {
    public ProtocolItemTypeMapping_v1_14() {
        super(VanillaItemType.STONE);
        setID(AIR, 0);
        setID(STONE, 1);
        setID(GRANITE, 2);
        setID(POLISHED_GRANITE, 3);
        setID(DIORITE, 4);
        setID(POLISHED_DIORITE, 5);
        setID(ANDESITE, 6);
        setID(POLISHED_ANDESITE, 7);
        setID(GRASS_BLOCK, 8);
        setID(DIRT, 9);
        setID(COARSE_DIRT, 10);
        setID(PODZOL, 11);
        setID(COBBLESTONE, 12);
        setID(OAK_PLANKS, 13);
        setID(SPRUCE_PLANKS, 14);
        setID(BIRCH_PLANKS, 15);
        setID(JUNGLE_PLANKS, 16);
        setID(ACACIA_PLANKS, 17);
        setID(DARK_OAK_PLANKS, 18);
        setID(OAK_SAPLING, 19);
        setID(SPRUCE_SAPLING, 20);
        setID(BIRCH_SAPLING, 21);
        setID(JUNGLE_SAPLING, 22);
        setID(ACACIA_SAPLING, 23);
        setID(DARK_OAK_SAPLING, 24);
        setID(BEDROCK, 25);
        setID(SAND, 26);
        setID(RED_SAND, 27);
        setID(GRAVEL, 28);
        setID(GOLD_ORE, 29);
        setID(IRON_ORE, 30);
        setID(COAL_ORE, 31);
        setID(OAK_LOG, 32);
        setID(SPRUCE_LOG, 33);
        setID(BIRCH_LOG, 34);
        setID(JUNGLE_LOG, 35);
        setID(ACACIA_LOG, 36);
        setID(DARK_OAK_LOG, 37);
        setID(STRIPPED_OAK_LOG, 38);
        setID(STRIPPED_SPRUCE_LOG, 39);
        setID(STRIPPED_BIRCH_LOG, 40);
        setID(STRIPPED_JUNGLE_LOG, 41);
        setID(STRIPPED_ACACIA_LOG, 42);
        setID(STRIPPED_DARK_OAK_LOG, 43);
        setID(STRIPPED_OAK_WOOD, 44);
        setID(STRIPPED_SPRUCE_WOOD, 45);
        setID(STRIPPED_BIRCH_WOOD, 46);
        setID(STRIPPED_JUNGLE_WOOD, 47);
        setID(STRIPPED_ACACIA_WOOD, 48);
        setID(STRIPPED_DARK_OAK_WOOD, 49);
        setID(OAK_WOOD, 50);
        setID(SPRUCE_WOOD, 51);
        setID(BIRCH_WOOD, 52);
        setID(JUNGLE_WOOD, 53);
        setID(ACACIA_WOOD, 54);
        setID(DARK_OAK_WOOD, 55);
        setID(OAK_LEAVES, 56);
        setID(SPRUCE_LEAVES, 57);
        setID(BIRCH_LEAVES, 58);
        setID(JUNGLE_LEAVES, 59);
        setID(ACACIA_LEAVES, 60);
        setID(DARK_OAK_LEAVES, 61);
        setID(SPONGE, 62);
        setID(WET_SPONGE, 63);
        setID(GLASS, 64);
        setID(LAPIS_ORE, 65);
        setID(LAPIS_BLOCK, 66);
        setID(DISPENSER, 67);
        setID(SANDSTONE, 68);
        setID(CHISELED_SANDSTONE, 69);
        setID(CUT_SANDSTONE, 70);
        setID(NOTE_BLOCK, 71);
        setID(POWERED_RAIL, 72);
        setID(DETECTOR_RAIL, 73);
        setID(STICKY_PISTON, 74);
        setID(COBWEB, 75);
        setID(GRASS, 76);
        setID(FERN, 77);
        setID(DEAD_BUSH, 78);
        setID(SEAGRASS, 79);
        setID(SEA_PICKLE, 80);
        setID(PISTON, 81);
        setID(WHITE_WOOL, 82);
        setID(ORANGE_WOOL, 83);
        setID(MAGENTA_WOOL, 84);
        setID(LIGHT_BLUE_WOOL, 85);
        setID(YELLOW_WOOL, 86);
        setID(LIME_WOOL, 87);
        setID(PINK_WOOL, 88);
        setID(GRAY_WOOL, 89);
        setID(LIGHT_GRAY_WOOL, 90);
        setID(CYAN_WOOL, 91);
        setID(PURPLE_WOOL, 92);
        setID(BLUE_WOOL, 93);
        setID(BROWN_WOOL, 94);
        setID(GREEN_WOOL, 95);
        setID(RED_WOOL, 96);
        setID(BLACK_WOOL, 97);
        setID(DANDELION, 98);
        setID(POPPY, 99);
        setID(BLUE_ORCHID, 100);
        setID(ALLIUM, 101);
        setID(AZURE_BLUET, 102);
        setID(RED_TULIP, 103);
        setID(ORANGE_TULIP, 104);
        setID(WHITE_TULIP, 105);
        setID(PINK_TULIP, 106);
        setID(OXEYE_DAISY, 107);
        setID(CORNFLOWER, 108);
        setID(LILY_OF_THE_VALLEY, 109);
        setID(WITHER_ROSE, 110);
        setID(BROWN_MUSHROOM, 111);
        setID(RED_MUSHROOM, 112);
        setID(GOLD_BLOCK, 113);
        setID(IRON_BLOCK, 114);
        setID(OAK_SLAB, 115);
        setID(SPRUCE_SLAB, 116);
        setID(BIRCH_SLAB, 117);
        setID(JUNGLE_SLAB, 118);
        setID(ACACIA_SLAB, 119);
        setID(DARK_OAK_SLAB, 120);
        setID(STONE_SLAB, 121);
        setID(SMOOTH_STONE_SLAB, 122);
        setID(SANDSTONE_SLAB, 123);
        setID(CUT_SANDSTONE_SLAB, 124);
        setID(PETRIFIED_OAK_SLAB, 125);
        setID(COBBLESTONE_SLAB, 126);
        setID(BRICK_SLAB, 127);
        setID(STONE_BRICK_SLAB, 128);
        setID(NETHER_BRICK_SLAB, 129);
        setID(QUARTZ_SLAB, 130);
        setID(RED_SANDSTONE_SLAB, 131);
        setID(CUT_RED_SANDSTONE_SLAB, 132);
        setID(PURPUR_SLAB, 133);
        setID(PRISMARINE_SLAB, 134);
        setID(PRISMARINE_BRICK_SLAB, 135);
        setID(DARK_PRISMARINE_SLAB, 136);
        setID(SMOOTH_QUARTZ, 137);
        setID(SMOOTH_RED_SANDSTONE, 138);
        setID(SMOOTH_SANDSTONE, 139);
        setID(SMOOTH_STONE, 140);
        setID(BRICKS, 141);
        setID(TNT, 142);
        setID(BOOKSHELF, 143);
        setID(MOSSY_COBBLESTONE, 144);
        setID(OBSIDIAN, 145);
        setID(TORCH, 146);
        setID(END_ROD, 147);
        setID(CHORUS_PLANT, 148);
        setID(CHORUS_FLOWER, 149);
        setID(PURPUR_BLOCK, 150);
        setID(PURPUR_PILLAR, 151);
        setID(PURPUR_STAIRS, 152);
        setID(SPAWNER, 153);
        setID(OAK_STAIRS, 154);
        setID(CHEST, 155);
        setID(DIAMOND_ORE, 156);
        setID(DIAMOND_BLOCK, 157);
        setID(CRAFTING_TABLE, 158);
        setID(FARMLAND, 159);
        setID(FURNACE, 160);
        setID(LADDER, 161);
        setID(RAIL, 162);
        setID(COBBLESTONE_STAIRS, 163);
        setID(LEVER, 164);
        setID(STONE_PRESSURE_PLATE, 165);
        setID(OAK_PRESSURE_PLATE, 166);
        setID(SPRUCE_PRESSURE_PLATE, 167);
        setID(BIRCH_PRESSURE_PLATE, 168);
        setID(JUNGLE_PRESSURE_PLATE, 169);
        setID(ACACIA_PRESSURE_PLATE, 170);
        setID(DARK_OAK_PRESSURE_PLATE, 171);
        setID(REDSTONE_ORE, 172);
        setID(REDSTONE_TORCH, 173);
        setID(STONE_BUTTON, 174);
        setID(SNOW, 175);
        setID(ICE, 176);
        setID(SNOW_BLOCK, 177);
        setID(CACTUS, 178);
        setID(CLAY, 179);
        setID(JUKEBOX, 180);
        setID(OAK_FENCE, 181);
        setID(SPRUCE_FENCE, 182);
        setID(BIRCH_FENCE, 183);
        setID(JUNGLE_FENCE, 184);
        setID(ACACIA_FENCE, 185);
        setID(DARK_OAK_FENCE, 186);
        setID(PUMPKIN, 187);
        setID(CARVED_PUMPKIN, 188);
        setID(NETHERRACK, 189);
        setID(SOUL_SAND, 190);
        setID(GLOWSTONE, 191);
        setID(JACK_O_LANTERN, 192);
        setID(OAK_TRAPDOOR, 193);
        setID(SPRUCE_TRAPDOOR, 194);
        setID(BIRCH_TRAPDOOR, 195);
        setID(JUNGLE_TRAPDOOR, 196);
        setID(ACACIA_TRAPDOOR, 197);
        setID(DARK_OAK_TRAPDOOR, 198);
        setID(INFESTED_STONE, 199);
        setID(INFESTED_COBBLESTONE, 200);
        setID(INFESTED_STONE_BRICKS, 201);
        setID(INFESTED_MOSSY_STONE_BRICKS, 202);
        setID(INFESTED_CRACKED_STONE_BRICKS, 203);
        setID(INFESTED_CHISELED_STONE_BRICKS, 204);
        setID(STONE_BRICKS, 205);
        setID(MOSSY_STONE_BRICKS, 206);
        setID(CRACKED_STONE_BRICKS, 207);
        setID(CHISELED_STONE_BRICKS, 208);
        setID(BROWN_MUSHROOM_BLOCK, 209);
        setID(RED_MUSHROOM_BLOCK, 210);
        setID(MUSHROOM_STEM, 211);
        setID(IRON_BARS, 212);
        setID(GLASS_PANE, 213);
        setID(MELON, 214);
        setID(VINE, 215);
        setID(OAK_FENCE_GATE, 216);
        setID(SPRUCE_FENCE_GATE, 217);
        setID(BIRCH_FENCE_GATE, 218);
        setID(JUNGLE_FENCE_GATE, 219);
        setID(ACACIA_FENCE_GATE, 220);
        setID(DARK_OAK_FENCE_GATE, 221);
        setID(BRICK_STAIRS, 222);
        setID(STONE_BRICK_STAIRS, 223);
        setID(MYCELIUM, 224);
        setID(LILY_PAD, 225);
        setID(NETHER_BRICKS, 226);
        setID(NETHER_BRICK_FENCE, 227);
        setID(NETHER_BRICK_STAIRS, 228);
        setID(ENCHANTING_TABLE, 229);
        setID(END_PORTAL_FRAME, 230);
        setID(END_STONE, 231);
        setID(END_STONE_BRICKS, 232);
        setID(DRAGON_EGG, 233);
        setID(REDSTONE_LAMP, 234);
        setID(SANDSTONE_STAIRS, 235);
        setID(EMERALD_ORE, 236);
        setID(ENDER_CHEST, 237);
        setID(TRIPWIRE_HOOK, 238);
        setID(EMERALD_BLOCK, 239);
        setID(SPRUCE_STAIRS, 240);
        setID(BIRCH_STAIRS, 241);
        setID(JUNGLE_STAIRS, 242);
        setID(COMMAND_BLOCK, 243);
        setID(BEACON, 244);
        setID(COBBLESTONE_WALL, 245);
        setID(MOSSY_COBBLESTONE_WALL, 246);
        setID(BRICK_WALL, 247);
        setID(PRISMARINE_WALL, 248);
        setID(RED_SANDSTONE_WALL, 249);
        setID(MOSSY_STONE_BRICK_WALL, 250);
        setID(GRANITE_WALL, 251);
        setID(STONE_BRICK_WALL, 252);
        setID(NETHER_BRICK_WALL, 253);
        setID(ANDESITE_WALL, 254);
        setID(RED_NETHER_BRICK_WALL, 255);
        setID(SANDSTONE_WALL, 256);
        setID(END_STONE_BRICK_WALL, 257);
        setID(DIORITE_WALL, 258);
        setID(OAK_BUTTON, 259);
        setID(SPRUCE_BUTTON, 260);
        setID(BIRCH_BUTTON, 261);
        setID(JUNGLE_BUTTON, 262);
        setID(ACACIA_BUTTON, 263);
        setID(DARK_OAK_BUTTON, 264);
        setID(ANVIL, 265);
        setID(CHIPPED_ANVIL, 266);
        setID(DAMAGED_ANVIL, 267);
        setID(TRAPPED_CHEST, 268);
        setID(LIGHT_WEIGHTED_PRESSURE_PLATE, 269);
        setID(HEAVY_WEIGHTED_PRESSURE_PLATE, 270);
        setID(DAYLIGHT_DETECTOR, 271);
        setID(REDSTONE_BLOCK, 272);
        setID(NETHER_QUARTZ_ORE, 273);
        setID(HOPPER, 274);
        setID(CHISELED_QUARTZ_BLOCK, 275);
        setID(QUARTZ_BLOCK, 276);
        setID(QUARTZ_PILLAR, 277);
        setID(QUARTZ_STAIRS, 278);
        setID(ACTIVATOR_RAIL, 279);
        setID(DROPPER, 280);
        setID(WHITE_TERRACOTTA, 281);
        setID(ORANGE_TERRACOTTA, 282);
        setID(MAGENTA_TERRACOTTA, 283);
        setID(LIGHT_BLUE_TERRACOTTA, 284);
        setID(YELLOW_TERRACOTTA, 285);
        setID(LIME_TERRACOTTA, 286);
        setID(PINK_TERRACOTTA, 287);
        setID(GRAY_TERRACOTTA, 288);
        setID(LIGHT_GRAY_TERRACOTTA, 289);
        setID(CYAN_TERRACOTTA, 290);
        setID(PURPLE_TERRACOTTA, 291);
        setID(BLUE_TERRACOTTA, 292);
        setID(BROWN_TERRACOTTA, 293);
        setID(GREEN_TERRACOTTA, 294);
        setID(RED_TERRACOTTA, 295);
        setID(BLACK_TERRACOTTA, 296);
        setID(BARRIER, 297);
        setID(IRON_TRAPDOOR, 298);
        setID(HAY_BLOCK, 299);
        setID(WHITE_CARPET, 300);
        setID(ORANGE_CARPET, 301);
        setID(MAGENTA_CARPET, 302);
        setID(LIGHT_BLUE_CARPET, 303);
        setID(YELLOW_CARPET, 304);
        setID(LIME_CARPET, 305);
        setID(PINK_CARPET, 306);
        setID(GRAY_CARPET, 307);
        setID(LIGHT_GRAY_CARPET, 308);
        setID(CYAN_CARPET, 309);
        setID(PURPLE_CARPET, 310);
        setID(BLUE_CARPET, 311);
        setID(BROWN_CARPET, 312);
        setID(GREEN_CARPET, 313);
        setID(RED_CARPET, 314);
        setID(BLACK_CARPET, 315);
        setID(TERRACOTTA, 316);
        setID(COAL_BLOCK, 317);
        setID(PACKED_ICE, 318);
        setID(ACACIA_STAIRS, 319);
        setID(DARK_OAK_STAIRS, 320);
        setID(SLIME_BLOCK, 321);
        setID(GRASS_PATH, 322);
        setID(SUNFLOWER, 323);
        setID(LILAC, 324);
        setID(ROSE_BUSH, 325);
        setID(PEONY, 326);
        setID(TALL_GRASS, 327);
        setID(LARGE_FERN, 328);
        setID(WHITE_STAINED_GLASS, 329);
        setID(ORANGE_STAINED_GLASS, 330);
        setID(MAGENTA_STAINED_GLASS, 331);
        setID(LIGHT_BLUE_STAINED_GLASS, 332);
        setID(YELLOW_STAINED_GLASS, 333);
        setID(LIME_STAINED_GLASS, 334);
        setID(PINK_STAINED_GLASS, 335);
        setID(GRAY_STAINED_GLASS, 336);
        setID(LIGHT_GRAY_STAINED_GLASS, 337);
        setID(CYAN_STAINED_GLASS, 338);
        setID(PURPLE_STAINED_GLASS, 339);
        setID(BLUE_STAINED_GLASS, 340);
        setID(BROWN_STAINED_GLASS, 341);
        setID(GREEN_STAINED_GLASS, 342);
        setID(RED_STAINED_GLASS, 343);
        setID(BLACK_STAINED_GLASS, 344);
        setID(WHITE_STAINED_GLASS_PANE, 345);
        setID(ORANGE_STAINED_GLASS_PANE, 346);
        setID(MAGENTA_STAINED_GLASS_PANE, 347);
        setID(LIGHT_BLUE_STAINED_GLASS_PANE, 348);
        setID(YELLOW_STAINED_GLASS_PANE, 349);
        setID(LIME_STAINED_GLASS_PANE, 350);
        setID(PINK_STAINED_GLASS_PANE, 351);
        setID(GRAY_STAINED_GLASS_PANE, 352);
        setID(LIGHT_GRAY_STAINED_GLASS_PANE, 353);
        setID(CYAN_STAINED_GLASS_PANE, 354);
        setID(PURPLE_STAINED_GLASS_PANE, 355);
        setID(BLUE_STAINED_GLASS_PANE, 356);
        setID(BROWN_STAINED_GLASS_PANE, 357);
        setID(GREEN_STAINED_GLASS_PANE, 358);
        setID(RED_STAINED_GLASS_PANE, 359);
        setID(BLACK_STAINED_GLASS_PANE, 360);
        setID(PRISMARINE, 361);
        setID(PRISMARINE_BRICKS, 362);
        setID(DARK_PRISMARINE, 363);
        setID(PRISMARINE_STAIRS, 364);
        setID(PRISMARINE_BRICK_STAIRS, 365);
        setID(DARK_PRISMARINE_STAIRS, 366);
        setID(SEA_LANTERN, 367);
        setID(RED_SANDSTONE, 368);
        setID(CHISELED_RED_SANDSTONE, 369);
        setID(CUT_RED_SANDSTONE, 370);
        setID(RED_SANDSTONE_STAIRS, 371);
        setID(REPEATING_COMMAND_BLOCK, 372);
        setID(CHAIN_COMMAND_BLOCK, 373);
        setID(MAGMA_BLOCK, 374);
        setID(NETHER_WART_BLOCK, 375);
        setID(RED_NETHER_BRICKS, 376);
        setID(BONE_BLOCK, 377);
        setID(STRUCTURE_VOID, 378);
        setID(OBSERVER, 379);
        setID(SHULKER_BOX, 380);
        setID(WHITE_SHULKER_BOX, 381);
        setID(ORANGE_SHULKER_BOX, 382);
        setID(MAGENTA_SHULKER_BOX, 383);
        setID(LIGHT_BLUE_SHULKER_BOX, 384);
        setID(YELLOW_SHULKER_BOX, 385);
        setID(LIME_SHULKER_BOX, 386);
        setID(PINK_SHULKER_BOX, 387);
        setID(GRAY_SHULKER_BOX, 388);
        setID(LIGHT_GRAY_SHULKER_BOX, 389);
        setID(CYAN_SHULKER_BOX, 390);
        setID(PURPLE_SHULKER_BOX, 391);
        setID(BLUE_SHULKER_BOX, 392);
        setID(BROWN_SHULKER_BOX, 393);
        setID(GREEN_SHULKER_BOX, 394);
        setID(RED_SHULKER_BOX, 395);
        setID(BLACK_SHULKER_BOX, 396);
        setID(WHITE_GLAZED_TERRACOTTA, 397);
        setID(ORANGE_GLAZED_TERRACOTTA, 398);
        setID(MAGENTA_GLAZED_TERRACOTTA, 399);
        setID(LIGHT_BLUE_GLAZED_TERRACOTTA, 400);
        setID(YELLOW_GLAZED_TERRACOTTA, 401);
        setID(LIME_GLAZED_TERRACOTTA, 402);
        setID(PINK_GLAZED_TERRACOTTA, 403);
        setID(GRAY_GLAZED_TERRACOTTA, 404);
        setID(LIGHT_GRAY_GLAZED_TERRACOTTA, 405);
        setID(CYAN_GLAZED_TERRACOTTA, 406);
        setID(PURPLE_GLAZED_TERRACOTTA, 407);
        setID(BLUE_GLAZED_TERRACOTTA, 408);
        setID(BROWN_GLAZED_TERRACOTTA, 409);
        setID(GREEN_GLAZED_TERRACOTTA, 410);
        setID(RED_GLAZED_TERRACOTTA, 411);
        setID(BLACK_GLAZED_TERRACOTTA, 412);
        setID(WHITE_CONCRETE, 413);
        setID(ORANGE_CONCRETE, 414);
        setID(MAGENTA_CONCRETE, 415);
        setID(LIGHT_BLUE_CONCRETE, 416);
        setID(YELLOW_CONCRETE, 417);
        setID(LIME_CONCRETE, 418);
        setID(PINK_CONCRETE, 419);
        setID(GRAY_CONCRETE, 420);
        setID(LIGHT_GRAY_CONCRETE, 421);
        setID(CYAN_CONCRETE, 422);
        setID(PURPLE_CONCRETE, 423);
        setID(BLUE_CONCRETE, 424);
        setID(BROWN_CONCRETE, 425);
        setID(GREEN_CONCRETE, 426);
        setID(RED_CONCRETE, 427);
        setID(BLACK_CONCRETE, 428);
        setID(WHITE_CONCRETE_POWDER, 429);
        setID(ORANGE_CONCRETE_POWDER, 430);
        setID(MAGENTA_CONCRETE_POWDER, 431);
        setID(LIGHT_BLUE_CONCRETE_POWDER, 432);
        setID(YELLOW_CONCRETE_POWDER, 433);
        setID(LIME_CONCRETE_POWDER, 434);
        setID(PINK_CONCRETE_POWDER, 435);
        setID(GRAY_CONCRETE_POWDER, 436);
        setID(LIGHT_GRAY_CONCRETE_POWDER, 437);
        setID(CYAN_CONCRETE_POWDER, 438);
        setID(PURPLE_CONCRETE_POWDER, 439);
        setID(BLUE_CONCRETE_POWDER, 440);
        setID(BROWN_CONCRETE_POWDER, 441);
        setID(GREEN_CONCRETE_POWDER, 442);
        setID(RED_CONCRETE_POWDER, 443);
        setID(BLACK_CONCRETE_POWDER, 444);
        setID(TURTLE_EGG, 445);
        setID(DEAD_TUBE_CORAL_BLOCK, 446);
        setID(DEAD_BRAIN_CORAL_BLOCK, 447);
        setID(DEAD_BUBBLE_CORAL_BLOCK, 448);
        setID(DEAD_FIRE_CORAL_BLOCK, 449);
        setID(DEAD_HORN_CORAL_BLOCK, 450);
        setID(TUBE_CORAL_BLOCK, 451);
        setID(BRAIN_CORAL_BLOCK, 452);
        setID(BUBBLE_CORAL_BLOCK, 453);
        setID(FIRE_CORAL_BLOCK, 454);
        setID(HORN_CORAL_BLOCK, 455);
        setID(TUBE_CORAL, 456);
        setID(BRAIN_CORAL, 457);
        setID(BUBBLE_CORAL, 458);
        setID(FIRE_CORAL, 459);
        setID(HORN_CORAL, 460);
        setID(DEAD_BRAIN_CORAL, 461);
        setID(DEAD_BUBBLE_CORAL, 462);
        setID(DEAD_FIRE_CORAL, 463);
        setID(DEAD_HORN_CORAL, 464);
        setID(DEAD_TUBE_CORAL, 465);
        setID(TUBE_CORAL_FAN, 466);
        setID(BRAIN_CORAL_FAN, 467);
        setID(BUBBLE_CORAL_FAN, 468);
        setID(FIRE_CORAL_FAN, 469);
        setID(HORN_CORAL_FAN, 470);
        setID(DEAD_TUBE_CORAL_FAN, 471);
        setID(DEAD_BRAIN_CORAL_FAN, 472);
        setID(DEAD_BUBBLE_CORAL_FAN, 473);
        setID(DEAD_FIRE_CORAL_FAN, 474);
        setID(DEAD_HORN_CORAL_FAN, 475);
        setID(BLUE_ICE, 476);
        setID(CONDUIT, 477);
        setID(POLISHED_GRANITE_STAIRS, 478);
        setID(SMOOTH_RED_SANDSTONE_STAIRS, 479);
        setID(MOSSY_STONE_BRICK_STAIRS, 480);
        setID(POLISHED_DIORITE_STAIRS, 481);
        setID(MOSSY_COBBLESTONE_STAIRS, 482);
        setID(END_STONE_BRICK_STAIRS, 483);
        setID(STONE_STAIRS, 484);
        setID(SMOOTH_SANDSTONE_STAIRS, 485);
        setID(SMOOTH_QUARTZ_STAIRS, 486);
        setID(GRANITE_STAIRS, 487);
        setID(ANDESITE_STAIRS, 488);
        setID(RED_NETHER_BRICK_STAIRS, 489);
        setID(POLISHED_ANDESITE_STAIRS, 490);
        setID(DIORITE_STAIRS, 491);
        setID(POLISHED_GRANITE_SLAB, 492);
        setID(SMOOTH_RED_SANDSTONE_SLAB, 493);
        setID(MOSSY_STONE_BRICK_SLAB, 494);
        setID(POLISHED_DIORITE_SLAB, 495);
        setID(MOSSY_COBBLESTONE_SLAB, 496);
        setID(END_STONE_BRICK_SLAB, 497);
        setID(SMOOTH_SANDSTONE_SLAB, 498);
        setID(SMOOTH_QUARTZ_SLAB, 499);
        setID(GRANITE_SLAB, 500);
        setID(ANDESITE_SLAB, 501);
        setID(RED_NETHER_BRICK_SLAB, 502);
        setID(POLISHED_ANDESITE_SLAB, 503);
        setID(DIORITE_SLAB, 504);
        setID(SCAFFOLDING, 505);
        setID(IRON_DOOR, 506);
        setID(OAK_DOOR, 507);
        setID(SPRUCE_DOOR, 508);
        setID(BIRCH_DOOR, 509);
        setID(JUNGLE_DOOR, 510);
        setID(ACACIA_DOOR, 511);
        setID(DARK_OAK_DOOR, 512);
        setID(REPEATER, 513);
        setID(COMPARATOR, 514);
        setID(STRUCTURE_BLOCK, 515);
        setID(JIGSAW, 516);
        setID(COMPOSTER, 517);
        setID(TURTLE_HELMET, 518);
        setID(SCUTE, 519);
        setID(IRON_SHOVEL, 520);
        setID(IRON_PICKAXE, 521);
        setID(IRON_AXE, 522);
        setID(FLINT_AND_STEEL, 523);
        setID(APPLE, 524);
        setID(BOW, 525);
        setID(ARROW, 526);
        setID(COAL, 527);
        setID(CHARCOAL, 528);
        setID(DIAMOND, 529);
        setID(IRON_INGOT, 530);
        setID(GOLD_INGOT, 531);
        setID(IRON_SWORD, 532);
        setID(WOODEN_SWORD, 533);
        setID(WOODEN_SHOVEL, 534);
        setID(WOODEN_PICKAXE, 535);
        setID(WOODEN_AXE, 536);
        setID(STONE_SWORD, 537);
        setID(STONE_SHOVEL, 538);
        setID(STONE_PICKAXE, 539);
        setID(STONE_AXE, 540);
        setID(DIAMOND_SWORD, 541);
        setID(DIAMOND_SHOVEL, 542);
        setID(DIAMOND_PICKAXE, 543);
        setID(DIAMOND_AXE, 544);
        setID(STICK, 545);
        setID(BOWL, 546);
        setID(MUSHROOM_STEW, 547);
        setID(GOLDEN_SWORD, 548);
        setID(GOLDEN_SHOVEL, 549);
        setID(GOLDEN_PICKAXE, 550);
        setID(GOLDEN_AXE, 551);
        setID(STRING, 552);
        setID(FEATHER, 553);
        setID(GUNPOWDER, 554);
        setID(WOODEN_HOE, 555);
        setID(STONE_HOE, 556);
        setID(IRON_HOE, 557);
        setID(DIAMOND_HOE, 558);
        setID(GOLDEN_HOE, 559);
        setID(WHEAT_SEEDS, 560);
        setID(WHEAT, 561);
        setID(BREAD, 562);
        setID(LEATHER_HELMET, 563);
        setID(LEATHER_CHESTPLATE, 564);
        setID(LEATHER_LEGGINGS, 565);
        setID(LEATHER_BOOTS, 566);
        setID(CHAINMAIL_HELMET, 567);
        setID(CHAINMAIL_CHESTPLATE, 568);
        setID(CHAINMAIL_LEGGINGS, 569);
        setID(CHAINMAIL_BOOTS, 570);
        setID(IRON_HELMET, 571);
        setID(IRON_CHESTPLATE, 572);
        setID(IRON_LEGGINGS, 573);
        setID(IRON_BOOTS, 574);
        setID(DIAMOND_HELMET, 575);
        setID(DIAMOND_CHESTPLATE, 576);
        setID(DIAMOND_LEGGINGS, 577);
        setID(DIAMOND_BOOTS, 578);
        setID(GOLDEN_HELMET, 579);
        setID(GOLDEN_CHESTPLATE, 580);
        setID(GOLDEN_LEGGINGS, 581);
        setID(GOLDEN_BOOTS, 582);
        setID(FLINT, 583);
        setID(PORKCHOP, 584);
        setID(COOKED_PORKCHOP, 585);
        setID(PAINTING, 586);
        setID(GOLDEN_APPLE, 587);
        setID(ENCHANTED_GOLDEN_APPLE, 588);
        setID(OAK_SIGN, 589);
        setID(SPRUCE_SIGN, 590);
        setID(BIRCH_SIGN, 591);
        setID(JUNGLE_SIGN, 592);
        setID(ACACIA_SIGN, 593);
        setID(DARK_OAK_SIGN, 594);
        setID(BUCKET, 595);
        setID(WATER_BUCKET, 596);
        setID(LAVA_BUCKET, 597);
        setID(MINECART, 598);
        setID(SADDLE, 599);
        setID(REDSTONE, 600);
        setID(SNOWBALL, 601);
        setID(OAK_BOAT, 602);
        setID(LEATHER, 603);
        setID(MILK_BUCKET, 604);
        setID(PUFFERFISH_BUCKET, 605);
        setID(SALMON_BUCKET, 606);
        setID(COD_BUCKET, 607);
        setID(TROPICAL_FISH_BUCKET, 608);
        setID(BRICK, 609);
        setID(CLAY_BALL, 610);
        setID(SUGAR_CANE, 611);
        setID(KELP, 612);
        setID(DRIED_KELP_BLOCK, 613);
        setID(BAMBOO, 614);
        setID(PAPER, 615);
        setID(BOOK, 616);
        setID(SLIME_BALL, 617);
        setID(CHEST_MINECART, 618);
        setID(FURNACE_MINECART, 619);
        setID(EGG, 620);
        setID(COMPASS, 621);
        setID(FISHING_ROD, 622);
        setID(CLOCK, 623);
        setID(GLOWSTONE_DUST, 624);
        setID(COD, 625);
        setID(SALMON, 626);
        setID(TROPICAL_FISH, 627);
        setID(PUFFERFISH, 628);
        setID(COOKED_COD, 629);
        setID(COOKED_SALMON, 630);
        setID(INK_SAC, 631);
        setID(RED_DYE, 632);
        setID(GREEN_DYE, 633);
        setID(COCOA_BEANS, 634);
        setID(LAPIS_LAZULI, 635);
        setID(PURPLE_DYE, 636);
        setID(CYAN_DYE, 637);
        setID(LIGHT_GRAY_DYE, 638);
        setID(GRAY_DYE, 639);
        setID(PINK_DYE, 640);
        setID(LIME_DYE, 641);
        setID(YELLOW_DYE, 642);
        setID(LIGHT_BLUE_DYE, 643);
        setID(MAGENTA_DYE, 644);
        setID(ORANGE_DYE, 645);
        setID(BONE_MEAL, 646);
        setID(BLUE_DYE, 647);
        setID(BROWN_DYE, 648);
        setID(BLACK_DYE, 649);
        setID(WHITE_DYE, 650);
        setID(BONE, 651);
        setID(SUGAR, 652);
        setID(CAKE, 653);
        setID(WHITE_BED, 654);
        setID(ORANGE_BED, 655);
        setID(MAGENTA_BED, 656);
        setID(LIGHT_BLUE_BED, 657);
        setID(YELLOW_BED, 658);
        setID(LIME_BED, 659);
        setID(PINK_BED, 660);
        setID(GRAY_BED, 661);
        setID(LIGHT_GRAY_BED, 662);
        setID(CYAN_BED, 663);
        setID(PURPLE_BED, 664);
        setID(BLUE_BED, 665);
        setID(BROWN_BED, 666);
        setID(GREEN_BED, 667);
        setID(RED_BED, 668);
        setID(BLACK_BED, 669);
        setID(COOKIE, 670);
        setID(FILLED_MAP, 671);
        setID(SHEARS, 672);
        setID(MELON_SLICE, 673);
        setID(DRIED_KELP, 674);
        setID(PUMPKIN_SEEDS, 675);
        setID(MELON_SEEDS, 676);
        setID(BEEF, 677);
        setID(COOKED_BEEF, 678);
        setID(CHICKEN, 679);
        setID(COOKED_CHICKEN, 680);
        setID(ROTTEN_FLESH, 681);
        setID(ENDER_PEARL, 682);
        setID(BLAZE_ROD, 683);
        setID(GHAST_TEAR, 684);
        setID(GOLD_NUGGET, 685);
        setID(NETHER_WART, 686);
        setID(POTION, 687);
        setID(GLASS_BOTTLE, 688);
        setID(SPIDER_EYE, 689);
        setID(FERMENTED_SPIDER_EYE, 690);
        setID(BLAZE_POWDER, 691);
        setID(MAGMA_CREAM, 692);
        setID(BREWING_STAND, 693);
        setID(CAULDRON, 694);
        setID(ENDER_EYE, 695);
        setID(GLISTERING_MELON_SLICE, 696);
        setID(BAT_SPAWN_EGG, 697);
        setID(BLAZE_SPAWN_EGG, 698);
        setID(CAT_SPAWN_EGG, 699);
        setID(CAVE_SPIDER_SPAWN_EGG, 700);
        setID(CHICKEN_SPAWN_EGG, 701);
        setID(COD_SPAWN_EGG, 702);
        setID(COW_SPAWN_EGG, 703);
        setID(CREEPER_SPAWN_EGG, 704);
        setID(DOLPHIN_SPAWN_EGG, 705);
        setID(DONKEY_SPAWN_EGG, 706);
        setID(DROWNED_SPAWN_EGG, 707);
        setID(ELDER_GUARDIAN_SPAWN_EGG, 708);
        setID(ENDERMAN_SPAWN_EGG, 709);
        setID(ENDERMITE_SPAWN_EGG, 710);
        setID(EVOKER_SPAWN_EGG, 711);
        setID(FOX_SPAWN_EGG, 712);
        setID(GHAST_SPAWN_EGG, 713);
        setID(GUARDIAN_SPAWN_EGG, 714);
        setID(HORSE_SPAWN_EGG, 715);
        setID(HUSK_SPAWN_EGG, 716);
        setID(LLAMA_SPAWN_EGG, 717);
        setID(MAGMA_CUBE_SPAWN_EGG, 718);
        setID(MOOSHROOM_SPAWN_EGG, 719);
        setID(MULE_SPAWN_EGG, 720);
        setID(OCELOT_SPAWN_EGG, 721);
        setID(PANDA_SPAWN_EGG, 722);
        setID(PARROT_SPAWN_EGG, 723);
        setID(PHANTOM_SPAWN_EGG, 724);
        setID(PIG_SPAWN_EGG, 725);
        setID(PILLAGER_SPAWN_EGG, 726);
        setID(POLAR_BEAR_SPAWN_EGG, 727);
        setID(PUFFERFISH_SPAWN_EGG, 728);
        setID(RABBIT_SPAWN_EGG, 729);
        setID(RAVAGER_SPAWN_EGG, 730);
        setID(SALMON_SPAWN_EGG, 731);
        setID(SHEEP_SPAWN_EGG, 732);
        setID(SHULKER_SPAWN_EGG, 733);
        setID(SILVERFISH_SPAWN_EGG, 734);
        setID(SKELETON_SPAWN_EGG, 735);
        setID(SKELETON_HORSE_SPAWN_EGG, 736);
        setID(SLIME_SPAWN_EGG, 737);
        setID(SPIDER_SPAWN_EGG, 738);
        setID(SQUID_SPAWN_EGG, 739);
        setID(STRAY_SPAWN_EGG, 740);
        setID(TRADER_LLAMA_SPAWN_EGG, 741);
        setID(TROPICAL_FISH_SPAWN_EGG, 742);
        setID(TURTLE_SPAWN_EGG, 743);
        setID(VEX_SPAWN_EGG, 744);
        setID(VILLAGER_SPAWN_EGG, 745);
        setID(VINDICATOR_SPAWN_EGG, 746);
        setID(WANDERING_TRADER_SPAWN_EGG, 747);
        setID(WITCH_SPAWN_EGG, 748);
        setID(WITHER_SKELETON_SPAWN_EGG, 749);
        setID(WOLF_SPAWN_EGG, 750);
        setID(ZOMBIE_SPAWN_EGG, 751);
        setID(ZOMBIE_HORSE_SPAWN_EGG, 752);
        setID(ZOMBIE_PIGMAN_SPAWN_EGG, 753);
        setID(ZOMBIE_VILLAGER_SPAWN_EGG, 754);
        setID(EXPERIENCE_BOTTLE, 755);
        setID(FIRE_CHARGE, 756);
        setID(WRITABLE_BOOK, 757);
        setID(WRITTEN_BOOK, 758);
        setID(EMERALD, 759);
        setID(ITEM_FRAME, 760);
        setID(FLOWER_POT, 761);
        setID(CARROT, 762);
        setID(POTATO, 763);
        setID(BAKED_POTATO, 764);
        setID(POISONOUS_POTATO, 765);
        setID(MAP, 766);
        setID(GOLDEN_CARROT, 767);
        setID(SKELETON_SKULL, 768);
        setID(WITHER_SKELETON_SKULL, 769);
        setID(PLAYER_HEAD, 770);
        setID(ZOMBIE_HEAD, 771);
        setID(CREEPER_HEAD, 772);
        setID(DRAGON_HEAD, 773);
        setID(CARROT_ON_A_STICK, 774);
        setID(NETHER_STAR, 775);
        setID(PUMPKIN_PIE, 776);
        setID(FIREWORK_ROCKET, 777);
        setID(FIREWORK_STAR, 778);
        setID(ENCHANTED_BOOK, 779);
        setID(NETHER_BRICK, 780);
        setID(QUARTZ, 781);
        setID(TNT_MINECART, 782);
        setID(HOPPER_MINECART, 783);
        setID(PRISMARINE_SHARD, 784);
        setID(PRISMARINE_CRYSTALS, 785);
        setID(RABBIT, 786);
        setID(COOKED_RABBIT, 787);
        setID(RABBIT_STEW, 788);
        setID(RABBIT_FOOT, 789);
        setID(RABBIT_HIDE, 790);
        setID(ARMOR_STAND, 791);
        setID(IRON_HORSE_ARMOR, 792);
        setID(GOLDEN_HORSE_ARMOR, 793);
        setID(DIAMOND_HORSE_ARMOR, 794);
        setID(LEATHER_HORSE_ARMOR, 795);
        setID(LEAD, 796);
        setID(NAME_TAG, 797);
        setID(COMMAND_BLOCK_MINECART, 798);
        setID(MUTTON, 799);
        setID(COOKED_MUTTON, 800);
        setID(WHITE_BANNER, 801);
        setID(ORANGE_BANNER, 802);
        setID(MAGENTA_BANNER, 803);
        setID(LIGHT_BLUE_BANNER, 804);
        setID(YELLOW_BANNER, 805);
        setID(LIME_BANNER, 806);
        setID(PINK_BANNER, 807);
        setID(GRAY_BANNER, 808);
        setID(LIGHT_GRAY_BANNER, 809);
        setID(CYAN_BANNER, 810);
        setID(PURPLE_BANNER, 811);
        setID(BLUE_BANNER, 812);
        setID(BROWN_BANNER, 813);
        setID(GREEN_BANNER, 814);
        setID(RED_BANNER, 815);
        setID(BLACK_BANNER, 816);
        setID(END_CRYSTAL, 817);
        setID(CHORUS_FRUIT, 818);
        setID(POPPED_CHORUS_FRUIT, 819);
        setID(BEETROOT, 820);
        setID(BEETROOT_SEEDS, 821);
        setID(BEETROOT_SOUP, 822);
        setID(DRAGON_BREATH, 823);
        setID(SPLASH_POTION, 824);
        setID(SPECTRAL_ARROW, 825);
        setID(TIPPED_ARROW, 826);
        setID(LINGERING_POTION, 827);
        setID(SHIELD, 828);
        setID(ELYTRA, 829);
        setID(SPRUCE_BOAT, 830);
        setID(BIRCH_BOAT, 831);
        setID(JUNGLE_BOAT, 832);
        setID(ACACIA_BOAT, 833);
        setID(DARK_OAK_BOAT, 834);
        setID(TOTEM_OF_UNDYING, 835);
        setID(SHULKER_SHELL, 836);
        setID(IRON_NUGGET, 837);
        setID(KNOWLEDGE_BOOK, 838);
        setID(DEBUG_STICK, 839);
        setID(MUSIC_DISC_13, 840);
        setID(MUSIC_DISC_CAT, 841);
        setID(MUSIC_DISC_BLOCKS, 842);
        setID(MUSIC_DISC_CHIRP, 843);
        setID(MUSIC_DISC_FAR, 844);
        setID(MUSIC_DISC_MALL, 845);
        setID(MUSIC_DISC_MELLOHI, 846);
        setID(MUSIC_DISC_STAL, 847);
        setID(MUSIC_DISC_STRAD, 848);
        setID(MUSIC_DISC_WARD, 849);
        setID(MUSIC_DISC_11, 850);
        setID(MUSIC_DISC_WAIT, 851);
        setID(TRIDENT, 852);
        setID(PHANTOM_MEMBRANE, 853);
        setID(NAUTILUS_SHELL, 854);
        setID(HEART_OF_THE_SEA, 855);
        setID(CROSSBOW, 856);
        setID(SUSPICIOUS_STEW, 857);
        setID(LOOM, 858);
        setID(FLOWER_BANNER_PATTERN, 859);
        setID(CREEPER_BANNER_PATTERN, 860);
        setID(SKULL_BANNER_PATTERN, 861);
        setID(MOJANG_BANNER_PATTERN, 862);
        setID(GLOBE_BANNER_PATTERN, 863);
        setID(BARREL, 864);
        setID(SMOKER, 865);
        setID(BLAST_FURNACE, 866);
        setID(CARTOGRAPHY_TABLE, 867);
        setID(FLETCHING_TABLE, 868);
        setID(GRINDSTONE, 869);
        setID(LECTERN, 870);
        setID(SMITHING_TABLE, 871);
        setID(STONECUTTER, 872);
        setID(BELL, 873);
        setID(LANTERN, 874);
        setID(SWEET_BERRIES, 875);
        setID(CAMPFIRE, 876);
    }
}
