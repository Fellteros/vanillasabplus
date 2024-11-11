package net.fellter.vanillasabplus.shared;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.sign_blocks.*;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {


    public static final Block STONE_SIGN = registerBlock("stone_sign", settings -> new ModSignBlock("stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block WALL_STONE_SIGN = registerBlock("stone_wall_sign", settings -> new ModWallSignBlock("stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE).lootTable(STONE_SIGN.getLootTableKey()));
    public static final Block HANGING_STONE_SIGN = registerBlock("stone_hanging_sign", settings -> new ModHangingSignBlock("stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE));
    public static final Block HANGING_WALL_STONE_SIGN = registerBlock("stone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE).lootTable(HANGING_STONE_SIGN.getLootTableKey()));

    public static final Block COBBLESTONE_SIGN = registerBlock("cobblestone_sign", settings -> new ModSignBlock("cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block WALL_COBBLESTONE_SIGN = registerBlock("cobblestone_wall_sign", settings -> new ModWallSignBlock("cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE).lootTable(COBBLESTONE_SIGN.getLootTableKey()));
    public static final Block HANGING_COBBLESTONE_SIGN = registerBlock("cobblestone_hanging_sign", settings -> new ModHangingSignBlock("cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
    public static final Block HANGING_WALL_COBBLESTONE_SIGN = registerBlock("cobblestone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLESTONE).lootTable(HANGING_COBBLESTONE_SIGN.getLootTableKey()));

    public static final Block MOSSY_COBBLESTONE_SIGN = registerBlock("mossy_cobblestone_sign", settings -> new ModSignBlock("mossy_cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block WALL_MOSSY_COBBLESTONE_SIGN = registerBlock("mossy_cobblestone_wall_sign", settings -> new ModWallSignBlock("mossy_cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).lootTable(MOSSY_COBBLESTONE_SIGN.getLootTableKey()));
    public static final Block HANGING_MOSSY_COBBLESTONE_SIGN = registerBlock("mossy_cobblestone_hanging_sign", settings -> new ModHangingSignBlock("mossy_cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
    public static final Block HANGING_WALL_MOSSY_COBBLESTONE_SIGN = registerBlock("mossy_cobblestone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("mossy_cobblestone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).lootTable(HANGING_MOSSY_COBBLESTONE_SIGN.getLootTableKey()));

    public static final Block SMOOTH_STONE_SIGN = registerBlock("smooth_stone_sign", settings -> new ModSignBlock("smooth_stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block WALL_SMOOTH_STONE_SIGN = registerBlock("smooth_stone_wall_sign", settings -> new ModWallSignBlock("smooth_stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).lootTable(SMOOTH_STONE_SIGN.getLootTableKey()));
    public static final Block HANGING_SMOOTH_STONE_SIGN = registerBlock("smooth_stone_hanging_sign", settings -> new ModHangingSignBlock("smooth_stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
    public static final Block HANGING_WALL_SMOOTH_STONE_SIGN = registerBlock("smooth_stone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("smooth_stone", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).lootTable(HANGING_SMOOTH_STONE_SIGN.getLootTableKey()));

    public static final Block STONE_BRICKS_SIGN = registerBlock("stone_bricks_sign", settings -> new ModSignBlock("stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block WALL_STONE_BRICKS_SIGN = registerBlock("stone_bricks_wall_sign", settings -> new ModWallSignBlock("stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).lootTable(STONE_BRICKS_SIGN.getLootTableKey()));
    public static final Block HANGING_STONE_BRICKS_SIGN = registerBlock("stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
    public static final Block HANGING_WALL_STONE_BRICKS_SIGN = registerBlock("stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).lootTable(HANGING_STONE_BRICKS_SIGN.getLootTableKey()));

    public static final Block CRACKED_STONE_BRICKS_SIGN = registerBlock("cracked_stone_bricks_sign", settings -> new ModSignBlock("cracked_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block WALL_CRACKED_STONE_BRICKS_SIGN = registerBlock("cracked_stone_bricks_wall_sign", settings -> new ModWallSignBlock("cracked_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).lootTable(CRACKED_STONE_BRICKS_SIGN.getLootTableKey()));
    public static final Block HANGING_CRACKED_STONE_BRICKS_SIGN = registerBlock("cracked_stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("cracked_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
    public static final Block HANGING_WALL_CRACKED_STONE_BRICKS_SIGN = registerBlock("cracked_stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cracked_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).lootTable(HANGING_CRACKED_STONE_BRICKS_SIGN.getLootTableKey()));

    public static final Block MOSSY_STONE_BRICKS_SIGN = registerBlock("mossy_stone_bricks_sign", settings -> new ModSignBlock("mossy_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    public static final Block WALL_MOSSY_STONE_BRICKS_SIGN = registerBlock("mossy_stone_bricks_wall_sign", settings -> new ModWallSignBlock("mossy_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).lootTable(MOSSY_STONE_BRICKS_SIGN.getLootTableKey()));
    public static final Block HANGING_MOSSY_STONE_BRICKS_SIGN = registerBlock("mossy_stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("mossy_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
    public static final Block HANGING_WALL_MOSSY_STONE_BRICKS_SIGN = registerBlock("mossy_stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("mossy_stone_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).lootTable(HANGING_MOSSY_STONE_BRICKS_SIGN.getLootTableKey()));

    public static final Block GRANITE_SIGN = registerBlock("granite_sign", settings -> new ModSignBlock("granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block WALL_GRANITE_SIGN = registerBlock("granite_wall_sign", settings -> new ModWallSignBlock("granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.GRANITE).lootTable(GRANITE_SIGN.getLootTableKey()));
    public static final Block HANGING_GRANITE_SIGN = registerBlock("granite_hanging_sign", settings -> new ModHangingSignBlock("granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final Block HANGING_WALL_GRANITE_SIGN = registerBlock("granite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.GRANITE).lootTable(HANGING_GRANITE_SIGN.getLootTableKey()));

    public static final Block POLISHED_GRANITE_SIGN = registerBlock("polished_granite_sign", settings -> new ModSignBlock("polished_granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block WALL_POLISHED_GRANITE_SIGN = registerBlock("polished_granite_wall_sign", settings -> new ModWallSignBlock("polished_granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).lootTable(POLISHED_GRANITE_SIGN.getLootTableKey()));
    public static final Block HANGING_POLISHED_GRANITE_SIGN = registerBlock("polished_granite_hanging_sign", settings -> new ModHangingSignBlock("polished_granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
    public static final Block HANGING_WALL_POLISHED_GRANITE_SIGN = registerBlock("polished_granite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_granite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).lootTable(HANGING_POLISHED_GRANITE_SIGN.getLootTableKey()));

    public static final Block DIORITE_SIGN = registerBlock("diorite_sign", settings -> new ModSignBlock("diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block WALL_DIORITE_SIGN = registerBlock("diorite_wall_sign", settings -> new ModWallSignBlock("diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DIORITE).lootTable(DIORITE_SIGN.getLootTableKey()));
    public static final Block HANGING_DIORITE_SIGN = registerBlock("diorite_hanging_sign", settings -> new ModHangingSignBlock("diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final Block HANGING_WALL_DIORITE_SIGN = registerBlock("diorite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DIORITE).lootTable(HANGING_DIORITE_SIGN.getLootTableKey()));

    public static final Block POLISHED_DIORITE_SIGN = registerBlock("polished_diorite_sign", settings -> new ModSignBlock("polished_diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block WALL_POLISHED_DIORITE_SIGN = registerBlock("polished_diorite_wall_sign", settings -> new ModWallSignBlock("polished_diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).lootTable(POLISHED_DIORITE_SIGN.getLootTableKey()));
    public static final Block HANGING_POLISHED_DIORITE_SIGN = registerBlock("polished_diorite_hanging_sign", settings -> new ModHangingSignBlock("polished_diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
    public static final Block HANGING_WALL_POLISHED_DIORITE_SIGN = registerBlock("polished_diorite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_diorite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).lootTable(HANGING_POLISHED_DIORITE_SIGN.getLootTableKey()));

    public static final Block ANDESITE_SIGN = registerBlock("andesite_sign", settings -> new ModSignBlock("andesite.png", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block WALL_ANDESITE_SIGN = registerBlock("andesite_wall_sign", settings -> new ModWallSignBlock("andesite.png", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.ANDESITE).lootTable(ANDESITE_SIGN.getLootTableKey()));
    public static final Block HANGING_ANDESITE_SIGN = registerBlock("andesite_hanging_sign", settings -> new ModHangingSignBlock("andesite.png", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final Block HANGING_WALL_ANDESITE_SIGN = registerBlock("andesite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("andesite.png", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.ANDESITE).lootTable(HANGING_ANDESITE_SIGN.getLootTableKey()));
    
    public static final Block POLISHED_ANDESITE_SIGN = registerBlock("polished_andesite_sign", settings -> new ModSignBlock("polished_andesite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block WALL_POLISHED_ANDESITE_SIGN = registerBlock("polished_andesite_wall_sign", settings -> new ModWallSignBlock("polished_andesite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).lootTable(POLISHED_ANDESITE_SIGN.getLootTableKey()));
    public static final Block HANGING_POLISHED_ANDESITE_SIGN = registerBlock("polished_andesite_hanging_sign", settings -> new ModHangingSignBlock("polished_andesite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
    public static final Block HANGING_WALL_POLISHED_ANDESITE_SIGN = registerBlock("polished_andesite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_andesite", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).lootTable(HANGING_POLISHED_ANDESITE_SIGN.getLootTableKey()));
    
    public static final Block DEEPSLATE_SIGN = registerBlock("deepslate_sign", settings -> new ModSignBlock("deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block WALL_DEEPSLATE_SIGN = registerBlock("deepslate_wall_sign", settings -> new ModWallSignBlock("deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE).lootTable(DEEPSLATE_SIGN.getLootTableKey()));
    public static final Block HANGING_DEEPSLATE_SIGN = registerBlock("deepslate_hanging_sign", settings -> new ModHangingSignBlock("deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block HANGING_WALL_DEEPSLATE_SIGN = registerBlock("deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE).lootTable(HANGING_DEEPSLATE_SIGN.getLootTableKey()));
    
    public static final Block COBBLED_DEEPSLATE_SIGN = registerBlock("cobbled_deepslate_sign", settings -> new ModSignBlock("cobbled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block WALL_COBBLED_DEEPSLATE_SIGN = registerBlock("cobbled_deepslate_wall_sign", settings -> new ModWallSignBlock("cobbled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).lootTable(COBBLED_DEEPSLATE_SIGN.getLootTableKey()));
    public static final Block HANGING_COBBLED_DEEPSLATE_SIGN = registerBlock("cobbled_deepslate_hanging_sign", settings -> new ModHangingSignBlock("cobbled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
    public static final Block HANGING_WALL_COBBLED_DEEPSLATE_SIGN = registerBlock("cobbled_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cobbled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).lootTable(HANGING_COBBLED_DEEPSLATE_SIGN.getLootTableKey()));
    
    public static final Block CHISELED_DEEPSLATE_SIGN = registerBlock("chiseled_deepslate_sign", settings -> new ModSignBlock("chiseled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block WALL_CHISELED_DEEPSLATE_SIGN = registerBlock("chiseled_deepslate_wall_sign", settings -> new ModWallSignBlock("chiseled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).lootTable(CHISELED_DEEPSLATE_SIGN.getLootTableKey()));
    public static final Block HANGING_CHISELED_DEEPSLATE_SIGN = registerBlock("chiseled_deepslate_hanging_sign", settings -> new ModHangingSignBlock("chiseled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
    public static final Block HANGING_WALL_CHISELED_DEEPSLATE_SIGN = registerBlock("chiseled_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("chiseled_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).lootTable(HANGING_CHISELED_DEEPSLATE_SIGN.getLootTableKey()));
    
    public static final Block POLISHED_DEEPSLATE_SIGN = registerBlock("polished_deepslate_sign", settings -> new ModSignBlock("polished_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
    public static final Block WALL_POLISHED_DEEPSLATE_SIGN = registerBlock("polished_deepslate_wall_sign", settings -> new ModWallSignBlock("polished_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).lootTable(POLISHED_DEEPSLATE_SIGN.getLootTableKey()));
    public static final Block HANGING_POLISHED_DEEPSLATE_SIGN = registerBlock("polished_deepslate_hanging_sign", settings -> new ModHangingSignBlock("polished_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
    public static final Block HANGING_WALL_POLISHED_DEEPSLATE_SIGN = registerBlock("polished_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_deepslate", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).lootTable(HANGING_POLISHED_DEEPSLATE_SIGN.getLootTableKey()));
    
    public static final Block DEEPSLATE_BRICKS_SIGN = registerBlock("deepslate_bricks_sign", settings -> new ModSignBlock("deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block WALL_DEEPSLATE_BRICKS_SIGN = registerBlock("deepslate_bricks_wall_sign", settings -> new ModWallSignBlock("deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).lootTable(DEEPSLATE_BRICKS_SIGN.getLootTableKey()));
    public static final Block HANGING_DEEPSLATE_BRICKS_SIGN = registerBlock("deepslate_bricks_hanging_sign", settings -> new ModHangingSignBlock("deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
    public static final Block HANGING_WALL_DEEPSLATE_BRICKS_SIGN = registerBlock("deepslate_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).lootTable(HANGING_DEEPSLATE_BRICKS_SIGN.getLootTableKey()));

    public static final Block CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlock("cracked_deepslate_bricks_sign", settings -> new ModSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block WALL_CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlock("cracked_deepslate_bricks_wall_sign", settings -> new ModWallSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lootTable(CRACKED_DEEPSLATE_BRICKS_SIGN.getLootTableKey()));
    public static final Block HANGING_CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlock("cracked_deepslate_bricks_hanging_sign", settings -> new ModHangingSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
    public static final Block HANGING_WALL_CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlock("cracked_deepslate_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings.noCollision()),
            AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lootTable(HANGING_CRACKED_DEEPSLATE_BRICKS_SIGN.getLootTableKey()));





    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name));
    }

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function,
                                       AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name), function.apply(settings.registryKey(keyOfBlock(name))));
    }


    public static void registerModBlocks() {
    }





}
