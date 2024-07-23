package net.fellter.vanillasabplus.util;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.sign_blocks.ModHangingSignBlock;
import net.fellter.vanillasabplus.sign.sign_blocks.ModSignBlock;
import net.fellter.vanillasabplus.sign.sign_blocks.ModWallHangingSignBlock;
import net.fellter.vanillasabplus.sign.sign_blocks.ModWallSignBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block STONE_SIGN = createSignBlock("stone_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block WALL_STONE_SIGN = createWallSignBlock("stone_wall_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE).dropsLike(STONE_SIGN));
    public static final Block HANGING_STONE_SIGN = createHangingSignBlock("stone_hanging_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block HANGING_WALL_STONE_SIGN = createWallHangingSignBlock("stone_wall_hanging_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE).dropsLike(HANGING_STONE_SIGN));

    public static final Block COBBLESTONE_SIGN = createSignBlock("cobblestone_sign", "cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block WALL_COBBLESTONE_SIGN = createWallSignBlock("cobblestone_wall_sign", "cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.COBBLESTONE).dropsLike(COBBLESTONE_SIGN));
    public static final Block HANGING_COBBLESTONE_SIGN = createHangingSignBlock("cobblestone_hanging_sign", "cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block HANGING_WALL_COBBLESTONE_SIGN = createWallHangingSignBlock("cobblestone_wall_hanging_sign", "cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.COBBLESTONE).dropsLike(HANGING_COBBLESTONE_SIGN));

    public static final Block MOSSY_COBBLESTONE_SIGN = createSignBlock("mossy_cobblestone_sign", "mossy_cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block WALL_MOSSY_COBBLESTONE_SIGN = createWallSignBlock("mossy_cobblestone_wall_sign", "mossy_cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).dropsLike(MOSSY_COBBLESTONE_SIGN));
    public static final Block HANGING_MOSSY_COBBLESTONE_SIGN = createHangingSignBlock("mossy_cobblestone_hanging_sign", "mossy_cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block HANGING_WALL_MOSSY_COBBLESTONE_SIGN = createWallHangingSignBlock("mossy_cobblestone_wall_hanging_sign", "mossy_cobblestone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).dropsLike(HANGING_MOSSY_COBBLESTONE_SIGN));

    public static final Block SMOOTH_STONE_SIGN = createSignBlock("smooth_stone_sign", "smooth_stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block WALL_SMOOTH_STONE_SIGN = createWallSignBlock("smooth_stone_wall_sign", "smooth_stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).dropsLike(SMOOTH_STONE_SIGN));
    public static final Block HANGING_SMOOTH_STONE_SIGN = createHangingSignBlock("smooth_stone_hanging_sign", "smooth_stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block HANGING_WALL_SMOOTH_STONE_SIGN = createWallHangingSignBlock("smooth_stone_wall_hanging_sign", "smooth_stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).dropsLike(HANGING_SMOOTH_STONE_SIGN));

    public static final Block STONE_BRICKS_SIGN = createSignBlock("stone_bricks_sign", "stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block WALL_STONE_BRICKS_SIGN = createWallSignBlock("stone_bricks_wall_sign", "stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).dropsLike(STONE_BRICKS_SIGN));
    public static final Block HANGING_STONE_BRICKS_SIGN = createHangingSignBlock("stone_bricks_hanging_sign", "stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block HANGING_WALL_STONE_BRICKS_SIGN = createWallHangingSignBlock("stone_bricks_wall_hanging_sign", "stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).dropsLike(HANGING_STONE_BRICKS_SIGN));

    public static final Block CRACKED_STONE_BRICKS_SIGN = createSignBlock("cracked_stone_bricks_sign", "cracked_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block WALL_CRACKED_STONE_BRICKS_SIGN = createWallSignBlock("cracked_stone_bricks_wall_sign", "cracked_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).dropsLike(CRACKED_STONE_BRICKS_SIGN));
    public static final Block HANGING_CRACKED_STONE_BRICKS_SIGN = createHangingSignBlock("cracked_stone_bricks_hanging_sign", "cracked_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block HANGING_WALL_CRACKED_STONE_BRICKS_SIGN = createWallHangingSignBlock("cracked_stone_bricks_wall_hanging_sign", "cracked_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).dropsLike(HANGING_CRACKED_STONE_BRICKS_SIGN));

    public static final Block MOSSY_STONE_BRICKS_SIGN = createSignBlock("mossy_stone_bricks_sign", "mossy_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    public static final Block WALL_MOSSY_STONE_BRICKS_SIGN = createWallSignBlock("mossy_stone_bricks_wall_sign", "mossy_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).dropsLike(MOSSY_STONE_BRICKS_SIGN));
    public static final Block HANGING_MOSSY_STONE_BRICKS_SIGN = createHangingSignBlock("mossy_stone_bricks_hanging_sign", "mossy_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    public static final Block HANGING_WALL_MOSSY_STONE_BRICKS_SIGN = createWallHangingSignBlock("mossy_stone_bricks_wall_hanging_sign", "mossy_stone_bricks", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).dropsLike(HANGING_MOSSY_STONE_BRICKS_SIGN));

    public static final Block GRANITE_SIGN = createSignBlock("granite_sign", "granite", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block WALL_GRANITE_SIGN = createWallSignBlock("granite_wall_sign", "granite", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.GRANITE).dropsLike(GRANITE_SIGN));
    public static final Block HANGING_GRANITE_SIGN = createHangingSignBlock("granite_hanging_sign", "granite", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block HANGING_WALL_GRANITE_SIGN = createWallHangingSignBlock("granite_wall_hanging_sign", "granite", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.GRANITE).dropsLike(HANGING_GRANITE_SIGN));








    private static Block createSignBlock(String name, String texture, WoodType woodType, AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name),
                new ModSignBlock(Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/" + texture), woodType, settings.solid().noCollision()));
    }

    private static Block createWallSignBlock(String name, String texture, WoodType woodType, AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name),
                new ModWallSignBlock(Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/" + texture), woodType, settings.solid().noCollision()));
    }

    private static Block createHangingSignBlock(String name, String texture, WoodType woodType, AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name),
                new ModHangingSignBlock(Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/hanging/" + texture),
                        Identifier.of(VanillaSABPlus.MOD_ID, "textures/gui/hanging_signs/" + texture), woodType, settings.solid().noCollision()));
    }

    private static Block createWallHangingSignBlock(String name, String texture, WoodType woodType, AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name),
                new ModWallHangingSignBlock(Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/hanging/" + texture),
                        Identifier.of(VanillaSABPlus.MOD_ID, "textures/gui/hanging_signs/" + texture), woodType, settings.solid().noCollision()));
    }


    public static void registerVSABPBlocks() {
        VanillaSABPlus.LOGGER.info("Registering Mod Blocks for " + VanillaSABPlus.MOD_ID);
    }





}
