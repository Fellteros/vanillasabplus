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
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block STONE_MOD = registerBlock("stone_mod",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block STONE_SIGN = createSignBlock("stone_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block WALL_STONE_SIGN = createWallSignBlock("stone_wall_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE).dropsLike(STONE_SIGN));
    public static final Block HANGING_STONE_SIGN = createHangingSignBlock("stone_hanging_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block HANGING_WALL_STONE_SIGN = createWallHangingSignBlock("stone_wall_hanging_sign", "stone", WoodType.OAK, AbstractBlock.Settings.copy(Blocks.STONE));

    public static final BlockFamily STONE_FAMILY = BlockFamilies.register(STONE_MOD).sign(STONE_SIGN, WALL_STONE_SIGN).build();




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

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
