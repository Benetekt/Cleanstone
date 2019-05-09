package rocks.cleanstone.net.minecraft.protocol.v1_13_2;

import org.springframework.stereotype.Component;

import rocks.cleanstone.game.material.item.mapping.SimpleItemTypeMapping;
import rocks.cleanstone.game.material.item.vanilla.VanillaItemType;

import static rocks.cleanstone.game.material.item.vanilla.VanillaItemType.*;

/**
 * Maps Cleanstone's internal item types to the Minecraft client's format
 * !! GENERATED FILE. This file was generated using the php-converter script. !!
 * */
@Component("protocolItemTypeMapping_v1_13_2")
public class ProtocolItemTypeMapping_v1_13_2 extends SimpleItemTypeMapping<Integer> {
    public ProtocolItemTypeMapping_v1_13_2() {
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
        setID(BROWN_MUSHROOM, 108);
        setID(RED_MUSHROOM, 109);
        setID(GOLD_BLOCK, 110);
        setID(IRON_BLOCK, 111);
        setID(OAK_SLAB, 112);
        setID(SPRUCE_SLAB, 113);
        setID(BIRCH_SLAB, 114);
        setID(JUNGLE_SLAB, 115);
        setID(ACACIA_SLAB, 116);
        setID(DARK_OAK_SLAB, 117);
        setID(STONE_SLAB, 118);
        setID(SANDSTONE_SLAB, 119);
        setID(PETRIFIED_OAK_SLAB, 120);
        setID(COBBLESTONE_SLAB, 121);
        setID(BRICK_SLAB, 122);
        setID(STONE_BRICK_SLAB, 123);
        setID(NETHER_BRICK_SLAB, 124);
        setID(QUARTZ_SLAB, 125);
        setID(RED_SANDSTONE_SLAB, 126);
        setID(PURPUR_SLAB, 127);
        setID(PRISMARINE_SLAB, 128);
        setID(PRISMARINE_BRICK_SLAB, 129);
        setID(DARK_PRISMARINE_SLAB, 130);
        setID(SMOOTH_QUARTZ, 131);
        setID(SMOOTH_RED_SANDSTONE, 132);
        setID(SMOOTH_SANDSTONE, 133);
        setID(SMOOTH_STONE, 134);
        setID(BRICKS, 135);
        setID(TNT, 136);
        setID(BOOKSHELF, 137);
        setID(MOSSY_COBBLESTONE, 138);
        setID(OBSIDIAN, 139);
        setID(TORCH, 140);
        setID(END_ROD, 141);
        setID(CHORUS_PLANT, 142);
        setID(CHORUS_FLOWER, 143);
        setID(PURPUR_BLOCK, 144);
        setID(PURPUR_PILLAR, 145);
        setID(PURPUR_STAIRS, 146);
        setID(SPAWNER, 147);
        setID(OAK_STAIRS, 148);
        setID(CHEST, 149);
        setID(DIAMOND_ORE, 150);
        setID(DIAMOND_BLOCK, 151);
        setID(CRAFTING_TABLE, 152);
        setID(FARMLAND, 153);
        setID(FURNACE, 154);
        setID(LADDER, 155);
        setID(RAIL, 156);
        setID(COBBLESTONE_STAIRS, 157);
        setID(LEVER, 158);
        setID(STONE_PRESSURE_PLATE, 159);
        setID(OAK_PRESSURE_PLATE, 160);
        setID(SPRUCE_PRESSURE_PLATE, 161);
        setID(BIRCH_PRESSURE_PLATE, 162);
        setID(JUNGLE_PRESSURE_PLATE, 163);
        setID(ACACIA_PRESSURE_PLATE, 164);
        setID(DARK_OAK_PRESSURE_PLATE, 165);
        setID(REDSTONE_ORE, 166);
        setID(REDSTONE_TORCH, 167);
        setID(STONE_BUTTON, 168);
        setID(SNOW, 169);
        setID(ICE, 170);
        setID(SNOW_BLOCK, 171);
        setID(CACTUS, 172);
        setID(CLAY, 173);
        setID(JUKEBOX, 174);
        setID(OAK_FENCE, 175);
        setID(SPRUCE_FENCE, 176);
        setID(BIRCH_FENCE, 177);
        setID(JUNGLE_FENCE, 178);
        setID(ACACIA_FENCE, 179);
        setID(DARK_OAK_FENCE, 180);
        setID(PUMPKIN, 181);
        setID(CARVED_PUMPKIN, 182);
        setID(NETHERRACK, 183);
        setID(SOUL_SAND, 184);
        setID(GLOWSTONE, 185);
        setID(JACK_O_LANTERN, 186);
        setID(OAK_TRAPDOOR, 187);
        setID(SPRUCE_TRAPDOOR, 188);
        setID(BIRCH_TRAPDOOR, 189);
        setID(JUNGLE_TRAPDOOR, 190);
        setID(ACACIA_TRAPDOOR, 191);
        setID(DARK_OAK_TRAPDOOR, 192);
        setID(INFESTED_STONE, 193);
        setID(INFESTED_COBBLESTONE, 194);
        setID(INFESTED_STONE_BRICKS, 195);
        setID(INFESTED_MOSSY_STONE_BRICKS, 196);
        setID(INFESTED_CRACKED_STONE_BRICKS, 197);
        setID(INFESTED_CHISELED_STONE_BRICKS, 198);
        setID(STONE_BRICKS, 199);
        setID(MOSSY_STONE_BRICKS, 200);
        setID(CRACKED_STONE_BRICKS, 201);
        setID(CHISELED_STONE_BRICKS, 202);
        setID(BROWN_MUSHROOM_BLOCK, 203);
        setID(RED_MUSHROOM_BLOCK, 204);
        setID(MUSHROOM_STEM, 205);
        setID(IRON_BARS, 206);
        setID(GLASS_PANE, 207);
        setID(MELON, 208);
        setID(VINE, 209);
        setID(OAK_FENCE_GATE, 210);
        setID(SPRUCE_FENCE_GATE, 211);
        setID(BIRCH_FENCE_GATE, 212);
        setID(JUNGLE_FENCE_GATE, 213);
        setID(ACACIA_FENCE_GATE, 214);
        setID(DARK_OAK_FENCE_GATE, 215);
        setID(BRICK_STAIRS, 216);
        setID(STONE_BRICK_STAIRS, 217);
        setID(MYCELIUM, 218);
        setID(LILY_PAD, 219);
        setID(NETHER_BRICKS, 220);
        setID(NETHER_BRICK_FENCE, 221);
        setID(NETHER_BRICK_STAIRS, 222);
        setID(ENCHANTING_TABLE, 223);
        setID(END_PORTAL_FRAME, 224);
        setID(END_STONE, 225);
        setID(END_STONE_BRICKS, 226);
        setID(DRAGON_EGG, 227);
        setID(REDSTONE_LAMP, 228);
        setID(SANDSTONE_STAIRS, 229);
        setID(EMERALD_ORE, 230);
        setID(ENDER_CHEST, 231);
        setID(TRIPWIRE_HOOK, 232);
        setID(EMERALD_BLOCK, 233);
        setID(SPRUCE_STAIRS, 234);
        setID(BIRCH_STAIRS, 235);
        setID(JUNGLE_STAIRS, 236);
        setID(COMMAND_BLOCK, 237);
        setID(BEACON, 238);
        setID(COBBLESTONE_WALL, 239);
        setID(MOSSY_COBBLESTONE_WALL, 240);
        setID(OAK_BUTTON, 241);
        setID(SPRUCE_BUTTON, 242);
        setID(BIRCH_BUTTON, 243);
        setID(JUNGLE_BUTTON, 244);
        setID(ACACIA_BUTTON, 245);
        setID(DARK_OAK_BUTTON, 246);
        setID(ANVIL, 247);
        setID(CHIPPED_ANVIL, 248);
        setID(DAMAGED_ANVIL, 249);
        setID(TRAPPED_CHEST, 250);
        setID(LIGHT_WEIGHTED_PRESSURE_PLATE, 251);
        setID(HEAVY_WEIGHTED_PRESSURE_PLATE, 252);
        setID(DAYLIGHT_DETECTOR, 253);
        setID(REDSTONE_BLOCK, 254);
        setID(NETHER_QUARTZ_ORE, 255);
        setID(HOPPER, 256);
        setID(CHISELED_QUARTZ_BLOCK, 257);
        setID(QUARTZ_BLOCK, 258);
        setID(QUARTZ_PILLAR, 259);
        setID(QUARTZ_STAIRS, 260);
        setID(ACTIVATOR_RAIL, 261);
        setID(DROPPER, 262);
        setID(WHITE_TERRACOTTA, 263);
        setID(ORANGE_TERRACOTTA, 264);
        setID(MAGENTA_TERRACOTTA, 265);
        setID(LIGHT_BLUE_TERRACOTTA, 266);
        setID(YELLOW_TERRACOTTA, 267);
        setID(LIME_TERRACOTTA, 268);
        setID(PINK_TERRACOTTA, 269);
        setID(GRAY_TERRACOTTA, 270);
        setID(LIGHT_GRAY_TERRACOTTA, 271);
        setID(CYAN_TERRACOTTA, 272);
        setID(PURPLE_TERRACOTTA, 273);
        setID(BLUE_TERRACOTTA, 274);
        setID(BROWN_TERRACOTTA, 275);
        setID(GREEN_TERRACOTTA, 276);
        setID(RED_TERRACOTTA, 277);
        setID(BLACK_TERRACOTTA, 278);
        setID(BARRIER, 279);
        setID(IRON_TRAPDOOR, 280);
        setID(HAY_BLOCK, 281);
        setID(WHITE_CARPET, 282);
        setID(ORANGE_CARPET, 283);
        setID(MAGENTA_CARPET, 284);
        setID(LIGHT_BLUE_CARPET, 285);
        setID(YELLOW_CARPET, 286);
        setID(LIME_CARPET, 287);
        setID(PINK_CARPET, 288);
        setID(GRAY_CARPET, 289);
        setID(LIGHT_GRAY_CARPET, 290);
        setID(CYAN_CARPET, 291);
        setID(PURPLE_CARPET, 292);
        setID(BLUE_CARPET, 293);
        setID(BROWN_CARPET, 294);
        setID(GREEN_CARPET, 295);
        setID(RED_CARPET, 296);
        setID(BLACK_CARPET, 297);
        setID(TERRACOTTA, 298);
        setID(COAL_BLOCK, 299);
        setID(PACKED_ICE, 300);
        setID(ACACIA_STAIRS, 301);
        setID(DARK_OAK_STAIRS, 302);
        setID(SLIME_BLOCK, 303);
        setID(GRASS_PATH, 304);
        setID(SUNFLOWER, 305);
        setID(LILAC, 306);
        setID(ROSE_BUSH, 307);
        setID(PEONY, 308);
        setID(TALL_GRASS, 309);
        setID(LARGE_FERN, 310);
        setID(WHITE_STAINED_GLASS, 311);
        setID(ORANGE_STAINED_GLASS, 312);
        setID(MAGENTA_STAINED_GLASS, 313);
        setID(LIGHT_BLUE_STAINED_GLASS, 314);
        setID(YELLOW_STAINED_GLASS, 315);
        setID(LIME_STAINED_GLASS, 316);
        setID(PINK_STAINED_GLASS, 317);
        setID(GRAY_STAINED_GLASS, 318);
        setID(LIGHT_GRAY_STAINED_GLASS, 319);
        setID(CYAN_STAINED_GLASS, 320);
        setID(PURPLE_STAINED_GLASS, 321);
        setID(BLUE_STAINED_GLASS, 322);
        setID(BROWN_STAINED_GLASS, 323);
        setID(GREEN_STAINED_GLASS, 324);
        setID(RED_STAINED_GLASS, 325);
        setID(BLACK_STAINED_GLASS, 326);
        setID(WHITE_STAINED_GLASS_PANE, 327);
        setID(ORANGE_STAINED_GLASS_PANE, 328);
        setID(MAGENTA_STAINED_GLASS_PANE, 329);
        setID(LIGHT_BLUE_STAINED_GLASS_PANE, 330);
        setID(YELLOW_STAINED_GLASS_PANE, 331);
        setID(LIME_STAINED_GLASS_PANE, 332);
        setID(PINK_STAINED_GLASS_PANE, 333);
        setID(GRAY_STAINED_GLASS_PANE, 334);
        setID(LIGHT_GRAY_STAINED_GLASS_PANE, 335);
        setID(CYAN_STAINED_GLASS_PANE, 336);
        setID(PURPLE_STAINED_GLASS_PANE, 337);
        setID(BLUE_STAINED_GLASS_PANE, 338);
        setID(BROWN_STAINED_GLASS_PANE, 339);
        setID(GREEN_STAINED_GLASS_PANE, 340);
        setID(RED_STAINED_GLASS_PANE, 341);
        setID(BLACK_STAINED_GLASS_PANE, 342);
        setID(PRISMARINE, 343);
        setID(PRISMARINE_BRICKS, 344);
        setID(DARK_PRISMARINE, 345);
        setID(PRISMARINE_STAIRS, 346);
        setID(PRISMARINE_BRICK_STAIRS, 347);
        setID(DARK_PRISMARINE_STAIRS, 348);
        setID(SEA_LANTERN, 349);
        setID(RED_SANDSTONE, 350);
        setID(CHISELED_RED_SANDSTONE, 351);
        setID(CUT_RED_SANDSTONE, 352);
        setID(RED_SANDSTONE_STAIRS, 353);
        setID(REPEATING_COMMAND_BLOCK, 354);
        setID(CHAIN_COMMAND_BLOCK, 355);
        setID(MAGMA_BLOCK, 356);
        setID(NETHER_WART_BLOCK, 357);
        setID(RED_NETHER_BRICKS, 358);
        setID(BONE_BLOCK, 359);
        setID(STRUCTURE_VOID, 360);
        setID(OBSERVER, 361);
        setID(SHULKER_BOX, 362);
        setID(WHITE_SHULKER_BOX, 363);
        setID(ORANGE_SHULKER_BOX, 364);
        setID(MAGENTA_SHULKER_BOX, 365);
        setID(LIGHT_BLUE_SHULKER_BOX, 366);
        setID(YELLOW_SHULKER_BOX, 367);
        setID(LIME_SHULKER_BOX, 368);
        setID(PINK_SHULKER_BOX, 369);
        setID(GRAY_SHULKER_BOX, 370);
        setID(LIGHT_GRAY_SHULKER_BOX, 371);
        setID(CYAN_SHULKER_BOX, 372);
        setID(PURPLE_SHULKER_BOX, 373);
        setID(BLUE_SHULKER_BOX, 374);
        setID(BROWN_SHULKER_BOX, 375);
        setID(GREEN_SHULKER_BOX, 376);
        setID(RED_SHULKER_BOX, 377);
        setID(BLACK_SHULKER_BOX, 378);
        setID(WHITE_GLAZED_TERRACOTTA, 379);
        setID(ORANGE_GLAZED_TERRACOTTA, 380);
        setID(MAGENTA_GLAZED_TERRACOTTA, 381);
        setID(LIGHT_BLUE_GLAZED_TERRACOTTA, 382);
        setID(YELLOW_GLAZED_TERRACOTTA, 383);
        setID(LIME_GLAZED_TERRACOTTA, 384);
        setID(PINK_GLAZED_TERRACOTTA, 385);
        setID(GRAY_GLAZED_TERRACOTTA, 386);
        setID(LIGHT_GRAY_GLAZED_TERRACOTTA, 387);
        setID(CYAN_GLAZED_TERRACOTTA, 388);
        setID(PURPLE_GLAZED_TERRACOTTA, 389);
        setID(BLUE_GLAZED_TERRACOTTA, 390);
        setID(BROWN_GLAZED_TERRACOTTA, 391);
        setID(GREEN_GLAZED_TERRACOTTA, 392);
        setID(RED_GLAZED_TERRACOTTA, 393);
        setID(BLACK_GLAZED_TERRACOTTA, 394);
        setID(WHITE_CONCRETE, 395);
        setID(ORANGE_CONCRETE, 396);
        setID(MAGENTA_CONCRETE, 397);
        setID(LIGHT_BLUE_CONCRETE, 398);
        setID(YELLOW_CONCRETE, 399);
        setID(LIME_CONCRETE, 400);
        setID(PINK_CONCRETE, 401);
        setID(GRAY_CONCRETE, 402);
        setID(LIGHT_GRAY_CONCRETE, 403);
        setID(CYAN_CONCRETE, 404);
        setID(PURPLE_CONCRETE, 405);
        setID(BLUE_CONCRETE, 406);
        setID(BROWN_CONCRETE, 407);
        setID(GREEN_CONCRETE, 408);
        setID(RED_CONCRETE, 409);
        setID(BLACK_CONCRETE, 410);
        setID(WHITE_CONCRETE_POWDER, 411);
        setID(ORANGE_CONCRETE_POWDER, 412);
        setID(MAGENTA_CONCRETE_POWDER, 413);
        setID(LIGHT_BLUE_CONCRETE_POWDER, 414);
        setID(YELLOW_CONCRETE_POWDER, 415);
        setID(LIME_CONCRETE_POWDER, 416);
        setID(PINK_CONCRETE_POWDER, 417);
        setID(GRAY_CONCRETE_POWDER, 418);
        setID(LIGHT_GRAY_CONCRETE_POWDER, 419);
        setID(CYAN_CONCRETE_POWDER, 420);
        setID(PURPLE_CONCRETE_POWDER, 421);
        setID(BLUE_CONCRETE_POWDER, 422);
        setID(BROWN_CONCRETE_POWDER, 423);
        setID(GREEN_CONCRETE_POWDER, 424);
        setID(RED_CONCRETE_POWDER, 425);
        setID(BLACK_CONCRETE_POWDER, 426);
        setID(TURTLE_EGG, 427);
        setID(DEAD_TUBE_CORAL_BLOCK, 428);
        setID(DEAD_BRAIN_CORAL_BLOCK, 429);
        setID(DEAD_BUBBLE_CORAL_BLOCK, 430);
        setID(DEAD_FIRE_CORAL_BLOCK, 431);
        setID(DEAD_HORN_CORAL_BLOCK, 432);
        setID(TUBE_CORAL_BLOCK, 433);
        setID(BRAIN_CORAL_BLOCK, 434);
        setID(BUBBLE_CORAL_BLOCK, 435);
        setID(FIRE_CORAL_BLOCK, 436);
        setID(HORN_CORAL_BLOCK, 437);
        setID(TUBE_CORAL, 438);
        setID(BRAIN_CORAL, 439);
        setID(BUBBLE_CORAL, 440);
        setID(FIRE_CORAL, 441);
        setID(HORN_CORAL, 442);
        setID(DEAD_BRAIN_CORAL, 443);
        setID(DEAD_BUBBLE_CORAL, 444);
        setID(DEAD_FIRE_CORAL, 445);
        setID(DEAD_HORN_CORAL, 446);
        setID(DEAD_TUBE_CORAL, 447);
        setID(TUBE_CORAL_FAN, 448);
        setID(BRAIN_CORAL_FAN, 449);
        setID(BUBBLE_CORAL_FAN, 450);
        setID(FIRE_CORAL_FAN, 451);
        setID(HORN_CORAL_FAN, 452);
        setID(DEAD_TUBE_CORAL_FAN, 453);
        setID(DEAD_BRAIN_CORAL_FAN, 454);
        setID(DEAD_BUBBLE_CORAL_FAN, 455);
        setID(DEAD_FIRE_CORAL_FAN, 456);
        setID(DEAD_HORN_CORAL_FAN, 457);
        setID(BLUE_ICE, 458);
        setID(CONDUIT, 459);
        setID(IRON_DOOR, 460);
        setID(OAK_DOOR, 461);
        setID(SPRUCE_DOOR, 462);
        setID(BIRCH_DOOR, 463);
        setID(JUNGLE_DOOR, 464);
        setID(ACACIA_DOOR, 465);
        setID(DARK_OAK_DOOR, 466);
        setID(REPEATER, 467);
        setID(COMPARATOR, 468);
        setID(STRUCTURE_BLOCK, 469);
        setID(TURTLE_HELMET, 470);
        setID(SCUTE, 471);
        setID(IRON_SHOVEL, 472);
        setID(IRON_PICKAXE, 473);
        setID(IRON_AXE, 474);
        setID(FLINT_AND_STEEL, 475);
        setID(APPLE, 476);
        setID(BOW, 477);
        setID(ARROW, 478);
        setID(COAL, 479);
        setID(CHARCOAL, 480);
        setID(DIAMOND, 481);
        setID(IRON_INGOT, 482);
        setID(GOLD_INGOT, 483);
        setID(IRON_SWORD, 484);
        setID(WOODEN_SWORD, 485);
        setID(WOODEN_SHOVEL, 486);
        setID(WOODEN_PICKAXE, 487);
        setID(WOODEN_AXE, 488);
        setID(STONE_SWORD, 489);
        setID(STONE_SHOVEL, 490);
        setID(STONE_PICKAXE, 491);
        setID(STONE_AXE, 492);
        setID(DIAMOND_SWORD, 493);
        setID(DIAMOND_SHOVEL, 494);
        setID(DIAMOND_PICKAXE, 495);
        setID(DIAMOND_AXE, 496);
        setID(STICK, 497);
        setID(BOWL, 498);
        setID(MUSHROOM_STEW, 499);
        setID(GOLDEN_SWORD, 500);
        setID(GOLDEN_SHOVEL, 501);
        setID(GOLDEN_PICKAXE, 502);
        setID(GOLDEN_AXE, 503);
        setID(STRING, 504);
        setID(FEATHER, 505);
        setID(GUNPOWDER, 506);
        setID(WOODEN_HOE, 507);
        setID(STONE_HOE, 508);
        setID(IRON_HOE, 509);
        setID(DIAMOND_HOE, 510);
        setID(GOLDEN_HOE, 511);
        setID(WHEAT_SEEDS, 512);
        setID(WHEAT, 513);
        setID(BREAD, 514);
        setID(LEATHER_HELMET, 515);
        setID(LEATHER_CHESTPLATE, 516);
        setID(LEATHER_LEGGINGS, 517);
        setID(LEATHER_BOOTS, 518);
        setID(CHAINMAIL_HELMET, 519);
        setID(CHAINMAIL_CHESTPLATE, 520);
        setID(CHAINMAIL_LEGGINGS, 521);
        setID(CHAINMAIL_BOOTS, 522);
        setID(IRON_HELMET, 523);
        setID(IRON_CHESTPLATE, 524);
        setID(IRON_LEGGINGS, 525);
        setID(IRON_BOOTS, 526);
        setID(DIAMOND_HELMET, 527);
        setID(DIAMOND_CHESTPLATE, 528);
        setID(DIAMOND_LEGGINGS, 529);
        setID(DIAMOND_BOOTS, 530);
        setID(GOLDEN_HELMET, 531);
        setID(GOLDEN_CHESTPLATE, 532);
        setID(GOLDEN_LEGGINGS, 533);
        setID(GOLDEN_BOOTS, 534);
        setID(FLINT, 535);
        setID(PORKCHOP, 536);
        setID(COOKED_PORKCHOP, 537);
        setID(PAINTING, 538);
        setID(GOLDEN_APPLE, 539);
        setID(ENCHANTED_GOLDEN_APPLE, 540);
        setID(OAK_SIGN, 541);
        setID(BUCKET, 542);
        setID(WATER_BUCKET, 543);
        setID(LAVA_BUCKET, 544);
        setID(MINECART, 545);
        setID(SADDLE, 546);
        setID(REDSTONE, 547);
        setID(SNOWBALL, 548);
        setID(OAK_BOAT, 549);
        setID(LEATHER, 550);
        setID(MILK_BUCKET, 551);
        setID(PUFFERFISH_BUCKET, 552);
        setID(SALMON_BUCKET, 553);
        setID(COD_BUCKET, 554);
        setID(TROPICAL_FISH_BUCKET, 555);
        setID(BRICK, 556);
        setID(CLAY_BALL, 557);
        setID(SUGAR_CANE, 558);
        setID(KELP, 559);
        setID(DRIED_KELP_BLOCK, 560);
        setID(PAPER, 561);
        setID(BOOK, 562);
        setID(SLIME_BALL, 563);
        setID(CHEST_MINECART, 564);
        setID(FURNACE_MINECART, 565);
        setID(EGG, 566);
        setID(COMPASS, 567);
        setID(FISHING_ROD, 568);
        setID(CLOCK, 569);
        setID(GLOWSTONE_DUST, 570);
        setID(COD, 571);
        setID(SALMON, 572);
        setID(TROPICAL_FISH, 573);
        setID(PUFFERFISH, 574);
        setID(COOKED_COD, 575);
        setID(COOKED_SALMON, 576);
        setID(INK_SAC, 577);
        setID(RED_DYE, 578);
        setID(GREEN_DYE, 579);
        setID(COCOA_BEANS, 580);
        setID(LAPIS_LAZULI, 581);
        setID(PURPLE_DYE, 582);
        setID(CYAN_DYE, 583);
        setID(LIGHT_GRAY_DYE, 584);
        setID(GRAY_DYE, 585);
        setID(PINK_DYE, 586);
        setID(LIME_DYE, 587);
        setID(YELLOW_DYE, 588);
        setID(LIGHT_BLUE_DYE, 589);
        setID(MAGENTA_DYE, 590);
        setID(ORANGE_DYE, 591);
        setID(BONE_MEAL, 592);
        setID(BONE, 593);
        setID(SUGAR, 594);
        setID(CAKE, 595);
        setID(WHITE_BED, 596);
        setID(ORANGE_BED, 597);
        setID(MAGENTA_BED, 598);
        setID(LIGHT_BLUE_BED, 599);
        setID(YELLOW_BED, 600);
        setID(LIME_BED, 601);
        setID(PINK_BED, 602);
        setID(GRAY_BED, 603);
        setID(LIGHT_GRAY_BED, 604);
        setID(CYAN_BED, 605);
        setID(PURPLE_BED, 606);
        setID(BLUE_BED, 607);
        setID(BROWN_BED, 608);
        setID(GREEN_BED, 609);
        setID(RED_BED, 610);
        setID(BLACK_BED, 611);
        setID(COOKIE, 612);
        setID(FILLED_MAP, 613);
        setID(SHEARS, 614);
        setID(MELON_SLICE, 615);
        setID(DRIED_KELP, 616);
        setID(PUMPKIN_SEEDS, 617);
        setID(MELON_SEEDS, 618);
        setID(BEEF, 619);
        setID(COOKED_BEEF, 620);
        setID(CHICKEN, 621);
        setID(COOKED_CHICKEN, 622);
        setID(ROTTEN_FLESH, 623);
        setID(ENDER_PEARL, 624);
        setID(BLAZE_ROD, 625);
        setID(GHAST_TEAR, 626);
        setID(GOLD_NUGGET, 627);
        setID(NETHER_WART, 628);
        setID(POTION, 629);
        setID(GLASS_BOTTLE, 630);
        setID(SPIDER_EYE, 631);
        setID(FERMENTED_SPIDER_EYE, 632);
        setID(BLAZE_POWDER, 633);
        setID(MAGMA_CREAM, 634);
        setID(BREWING_STAND, 635);
        setID(CAULDRON, 636);
        setID(ENDER_EYE, 637);
        setID(GLISTERING_MELON_SLICE, 638);
        setID(BAT_SPAWN_EGG, 639);
        setID(BLAZE_SPAWN_EGG, 640);
        setID(CAVE_SPIDER_SPAWN_EGG, 641);
        setID(CHICKEN_SPAWN_EGG, 642);
        setID(COD_SPAWN_EGG, 643);
        setID(COW_SPAWN_EGG, 644);
        setID(CREEPER_SPAWN_EGG, 645);
        setID(DOLPHIN_SPAWN_EGG, 646);
        setID(DONKEY_SPAWN_EGG, 647);
        setID(DROWNED_SPAWN_EGG, 648);
        setID(ELDER_GUARDIAN_SPAWN_EGG, 649);
        setID(ENDERMAN_SPAWN_EGG, 650);
        setID(ENDERMITE_SPAWN_EGG, 651);
        setID(EVOKER_SPAWN_EGG, 652);
        setID(GHAST_SPAWN_EGG, 653);
        setID(GUARDIAN_SPAWN_EGG, 654);
        setID(HORSE_SPAWN_EGG, 655);
        setID(HUSK_SPAWN_EGG, 656);
        setID(LLAMA_SPAWN_EGG, 657);
        setID(MAGMA_CUBE_SPAWN_EGG, 658);
        setID(MOOSHROOM_SPAWN_EGG, 659);
        setID(MULE_SPAWN_EGG, 660);
        setID(OCELOT_SPAWN_EGG, 661);
        setID(PARROT_SPAWN_EGG, 662);
        setID(PHANTOM_SPAWN_EGG, 663);
        setID(PIG_SPAWN_EGG, 664);
        setID(POLAR_BEAR_SPAWN_EGG, 665);
        setID(PUFFERFISH_SPAWN_EGG, 666);
        setID(RABBIT_SPAWN_EGG, 667);
        setID(SALMON_SPAWN_EGG, 668);
        setID(SHEEP_SPAWN_EGG, 669);
        setID(SHULKER_SPAWN_EGG, 670);
        setID(SILVERFISH_SPAWN_EGG, 671);
        setID(SKELETON_SPAWN_EGG, 672);
        setID(SKELETON_HORSE_SPAWN_EGG, 673);
        setID(SLIME_SPAWN_EGG, 674);
        setID(SPIDER_SPAWN_EGG, 675);
        setID(SQUID_SPAWN_EGG, 676);
        setID(STRAY_SPAWN_EGG, 677);
        setID(TROPICAL_FISH_SPAWN_EGG, 678);
        setID(TURTLE_SPAWN_EGG, 679);
        setID(VEX_SPAWN_EGG, 680);
        setID(VILLAGER_SPAWN_EGG, 681);
        setID(VINDICATOR_SPAWN_EGG, 682);
        setID(WITCH_SPAWN_EGG, 683);
        setID(WITHER_SKELETON_SPAWN_EGG, 684);
        setID(WOLF_SPAWN_EGG, 685);
        setID(ZOMBIE_SPAWN_EGG, 686);
        setID(ZOMBIE_HORSE_SPAWN_EGG, 687);
        setID(ZOMBIE_PIGMAN_SPAWN_EGG, 688);
        setID(ZOMBIE_VILLAGER_SPAWN_EGG, 689);
        setID(EXPERIENCE_BOTTLE, 690);
        setID(FIRE_CHARGE, 691);
        setID(WRITABLE_BOOK, 692);
        setID(WRITTEN_BOOK, 693);
        setID(EMERALD, 694);
        setID(ITEM_FRAME, 695);
        setID(FLOWER_POT, 696);
        setID(CARROT, 697);
        setID(POTATO, 698);
        setID(BAKED_POTATO, 699);
        setID(POISONOUS_POTATO, 700);
        setID(MAP, 701);
        setID(GOLDEN_CARROT, 702);
        setID(SKELETON_SKULL, 703);
        setID(WITHER_SKELETON_SKULL, 704);
        setID(PLAYER_HEAD, 705);
        setID(ZOMBIE_HEAD, 706);
        setID(CREEPER_HEAD, 707);
        setID(DRAGON_HEAD, 708);
        setID(CARROT_ON_A_STICK, 709);
        setID(NETHER_STAR, 710);
        setID(PUMPKIN_PIE, 711);
        setID(FIREWORK_ROCKET, 712);
        setID(FIREWORK_STAR, 713);
        setID(ENCHANTED_BOOK, 714);
        setID(NETHER_BRICK, 715);
        setID(QUARTZ, 716);
        setID(TNT_MINECART, 717);
        setID(HOPPER_MINECART, 718);
        setID(PRISMARINE_SHARD, 719);
        setID(PRISMARINE_CRYSTALS, 720);
        setID(RABBIT, 721);
        setID(COOKED_RABBIT, 722);
        setID(RABBIT_STEW, 723);
        setID(RABBIT_FOOT, 724);
        setID(RABBIT_HIDE, 725);
        setID(ARMOR_STAND, 726);
        setID(IRON_HORSE_ARMOR, 727);
        setID(GOLDEN_HORSE_ARMOR, 728);
        setID(DIAMOND_HORSE_ARMOR, 729);
        setID(LEAD, 730);
        setID(NAME_TAG, 731);
        setID(COMMAND_BLOCK_MINECART, 732);
        setID(MUTTON, 733);
        setID(COOKED_MUTTON, 734);
        setID(WHITE_BANNER, 735);
        setID(ORANGE_BANNER, 736);
        setID(MAGENTA_BANNER, 737);
        setID(LIGHT_BLUE_BANNER, 738);
        setID(YELLOW_BANNER, 739);
        setID(LIME_BANNER, 740);
        setID(PINK_BANNER, 741);
        setID(GRAY_BANNER, 742);
        setID(LIGHT_GRAY_BANNER, 743);
        setID(CYAN_BANNER, 744);
        setID(PURPLE_BANNER, 745);
        setID(BLUE_BANNER, 746);
        setID(BROWN_BANNER, 747);
        setID(GREEN_BANNER, 748);
        setID(RED_BANNER, 749);
        setID(BLACK_BANNER, 750);
        setID(END_CRYSTAL, 751);
        setID(CHORUS_FRUIT, 752);
        setID(POPPED_CHORUS_FRUIT, 753);
        setID(BEETROOT, 754);
        setID(BEETROOT_SEEDS, 755);
        setID(BEETROOT_SOUP, 756);
        setID(DRAGON_BREATH, 757);
        setID(SPLASH_POTION, 758);
        setID(SPECTRAL_ARROW, 759);
        setID(TIPPED_ARROW, 760);
        setID(LINGERING_POTION, 761);
        setID(SHIELD, 762);
        setID(ELYTRA, 763);
        setID(SPRUCE_BOAT, 764);
        setID(BIRCH_BOAT, 765);
        setID(JUNGLE_BOAT, 766);
        setID(ACACIA_BOAT, 767);
        setID(DARK_OAK_BOAT, 768);
        setID(TOTEM_OF_UNDYING, 769);
        setID(SHULKER_SHELL, 770);
        setID(IRON_NUGGET, 771);
        setID(KNOWLEDGE_BOOK, 772);
        setID(DEBUG_STICK, 773);
        setID(MUSIC_DISC_13, 774);
        setID(MUSIC_DISC_CAT, 775);
        setID(MUSIC_DISC_BLOCKS, 776);
        setID(MUSIC_DISC_CHIRP, 777);
        setID(MUSIC_DISC_FAR, 778);
        setID(MUSIC_DISC_MALL, 779);
        setID(MUSIC_DISC_MELLOHI, 780);
        setID(MUSIC_DISC_STAL, 781);
        setID(MUSIC_DISC_STRAD, 782);
        setID(MUSIC_DISC_WARD, 783);
        setID(MUSIC_DISC_11, 784);
        setID(MUSIC_DISC_WAIT, 785);
        setID(TRIDENT, 786);
        setID(PHANTOM_MEMBRANE, 787);
        setID(NAUTILUS_SHELL, 788);
        setID(HEART_OF_THE_SEA, 789);
    }
}
