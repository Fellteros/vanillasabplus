package net.fellter.vanillasabplus.shared;

import java.util.function.Function;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.ModHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModSignBlock;
import net.fellter.vanillasabplus.sign.ModWallHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModWallSignBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block STONE_SIGN = registerBlock("stone_sign", settings -> new ModSignBlock("stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE));
	public static final Block STONE_WALL_SIGN = registerBlock("stone_wall_sign", settings -> new ModWallSignBlock("stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE).lootTable(STONE_SIGN.getLootTableKey()));
	public static final Block STONE_HANGING_SIGN = registerBlock("stone_hanging_sign", settings -> new ModHangingSignBlock("stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE));
	public static final Block STONE_WALL_HANGING_SIGN = registerBlock("stone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE).lootTable(STONE_HANGING_SIGN.getLootTableKey()));

	public static final Block COBBLESTONE_SIGN = registerBlock("cobblestone_sign", settings -> new ModSignBlock("cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
	public static final Block COBBLESTONE_WALL_SIGN = registerBlock("cobblestone_wall_sign", settings -> new ModWallSignBlock("cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLESTONE).lootTable(COBBLESTONE_SIGN.getLootTableKey()));
	public static final Block COBBLESTONE_HANGING_SIGN = registerBlock("cobblestone_hanging_sign", settings -> new ModHangingSignBlock("cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLESTONE));
	public static final Block COBBLESTONE_WALL_HANGING_SIGN = registerBlock("cobblestone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLESTONE).lootTable(COBBLESTONE_HANGING_SIGN.getLootTableKey()));

	public static final Block MOSSY_COBBLESTONE_SIGN = registerBlock("mossy_cobblestone_sign", settings -> new ModSignBlock("mossy_cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
	public static final Block MOSSY_COBBLESTONE_WALL_SIGN = registerBlock("mossy_cobblestone_wall_sign", settings -> new ModWallSignBlock("mossy_cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).lootTable(MOSSY_COBBLESTONE_SIGN.getLootTableKey()));
	public static final Block MOSSY_COBBLESTONE_HANGING_SIGN = registerBlock("mossy_cobblestone_hanging_sign", settings -> new ModHangingSignBlock("mossy_cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE));
	public static final Block MOSSY_COBBLESTONE_WALL_HANGING_SIGN = registerBlock("mossy_cobblestone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("mossy_cobblestone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).lootTable(MOSSY_COBBLESTONE_HANGING_SIGN.getLootTableKey()));

	public static final Block SMOOTH_STONE_SIGN = registerBlock("smooth_stone_sign", settings -> new ModSignBlock("smooth_stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
	public static final Block SMOOTH_STONE_WALL_SIGN = registerBlock("smooth_stone_wall_sign", settings -> new ModWallSignBlock("smooth_stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).lootTable(SMOOTH_STONE_SIGN.getLootTableKey()));
	public static final Block SMOOTH_STONE_HANGING_SIGN = registerBlock("smooth_stone_hanging_sign", settings -> new ModHangingSignBlock("smooth_stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE));
	public static final Block SMOOTH_STONE_WALL_HANGING_SIGN = registerBlock("smooth_stone_wall_hanging_sign", settings -> new ModWallHangingSignBlock("smooth_stone", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).lootTable(SMOOTH_STONE_HANGING_SIGN.getLootTableKey()));

	public static final Block STONE_BRICKS_SIGN = registerBlock("stone_bricks_sign", settings -> new ModSignBlock("stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
	public static final Block STONE_BRICKS_WALL_SIGN = registerBlock("stone_bricks_wall_sign", settings -> new ModWallSignBlock("stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).lootTable(STONE_BRICKS_SIGN.getLootTableKey()));
	public static final Block STONE_BRICKS_HANGING_SIGN = registerBlock("stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE_BRICKS));
	public static final Block STONE_BRICKS_WALL_HANGING_SIGN = registerBlock("stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).lootTable(STONE_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block CRACKED_STONE_BRICKS_SIGN = registerBlock("cracked_stone_bricks_sign", settings -> new ModSignBlock("cracked_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
	public static final Block CRACKED_STONE_BRICKS_WALL_SIGN = registerBlock("cracked_stone_bricks_wall_sign", settings -> new ModWallSignBlock("cracked_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).lootTable(CRACKED_STONE_BRICKS_SIGN.getLootTableKey()));
	public static final Block CRACKED_STONE_BRICKS_HANGING_SIGN = registerBlock("cracked_stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("cracked_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS));
	public static final Block CRACKED_STONE_BRICKS_WALL_HANGING_SIGN = registerBlock("cracked_stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cracked_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).lootTable(CRACKED_STONE_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block MOSSY_STONE_BRICKS_SIGN = registerBlock("mossy_stone_bricks_sign", settings -> new ModSignBlock("mossy_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
	public static final Block MOSSY_STONE_BRICKS_WALL_SIGN = registerBlock("mossy_stone_bricks_wall_sign", settings -> new ModWallSignBlock("mossy_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).lootTable(MOSSY_STONE_BRICKS_SIGN.getLootTableKey()));
	public static final Block MOSSY_STONE_BRICKS_HANGING_SIGN = registerBlock("mossy_stone_bricks_hanging_sign", settings -> new ModHangingSignBlock("mossy_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS));
	public static final Block MOSSY_STONE_BRICKS_WALL_HANGING_SIGN = registerBlock("mossy_stone_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("mossy_stone_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).lootTable(MOSSY_STONE_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block GRANITE_SIGN = registerBlock("granite_sign", settings -> new ModSignBlock("granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.GRANITE));
	public static final Block GRANITE_WALL_SIGN = registerBlock("granite_wall_sign", settings -> new ModWallSignBlock("granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.GRANITE).lootTable(GRANITE_SIGN.getLootTableKey()));
	public static final Block GRANITE_HANGING_SIGN = registerBlock("granite_hanging_sign", settings -> new ModHangingSignBlock("granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.GRANITE));
	public static final Block GRANITE_WALL_HANGING_SIGN = registerBlock("granite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.GRANITE).lootTable(GRANITE_HANGING_SIGN.getLootTableKey()));

	public static final Block POLISHED_GRANITE_SIGN = registerBlock("polished_granite_sign", settings -> new ModSignBlock("polished_granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
	public static final Block POLISHED_GRANITE_WALL_SIGN = registerBlock("polished_granite_wall_sign", settings -> new ModWallSignBlock("polished_granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).lootTable(POLISHED_GRANITE_SIGN.getLootTableKey()));
	public static final Block POLISHED_GRANITE_HANGING_SIGN = registerBlock("polished_granite_hanging_sign", settings -> new ModHangingSignBlock("polished_granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE));
	public static final Block POLISHED_GRANITE_WALL_HANGING_SIGN = registerBlock("polished_granite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_granite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).lootTable(POLISHED_GRANITE_HANGING_SIGN.getLootTableKey()));

	public static final Block DIORITE_SIGN = registerBlock("diorite_sign", settings -> new ModSignBlock("diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DIORITE));
	public static final Block DIORITE_WALL_SIGN = registerBlock("diorite_wall_sign", settings -> new ModWallSignBlock("diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DIORITE).lootTable(DIORITE_SIGN.getLootTableKey()));
	public static final Block DIORITE_HANGING_SIGN = registerBlock("diorite_hanging_sign", settings -> new ModHangingSignBlock("diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DIORITE));
	public static final Block DIORITE_WALL_HANGING_SIGN = registerBlock("diorite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DIORITE).lootTable(DIORITE_HANGING_SIGN.getLootTableKey()));

	public static final Block POLISHED_DIORITE_SIGN = registerBlock("polished_diorite_sign", settings -> new ModSignBlock("polished_diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
	public static final Block POLISHED_DIORITE_WALL_SIGN = registerBlock("polished_diorite_wall_sign", settings -> new ModWallSignBlock("polished_diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).lootTable(POLISHED_DIORITE_SIGN.getLootTableKey()));
	public static final Block POLISHED_DIORITE_HANGING_SIGN = registerBlock("polished_diorite_hanging_sign", settings -> new ModHangingSignBlock("polished_diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE));
	public static final Block POLISHED_DIORITE_WALL_HANGING_SIGN = registerBlock("polished_diorite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_diorite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).lootTable(POLISHED_DIORITE_HANGING_SIGN.getLootTableKey()));

	public static final Block ANDESITE_SIGN = registerBlock("andesite_sign", settings -> new ModSignBlock("andesite.png", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.ANDESITE));
	public static final Block ANDESITE_WALL_SIGN = registerBlock("andesite_wall_sign", settings -> new ModWallSignBlock("andesite.png", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.ANDESITE).lootTable(ANDESITE_SIGN.getLootTableKey()));
	public static final Block ANDESITE_HANGING_SIGN = registerBlock("andesite_hanging_sign", settings -> new ModHangingSignBlock("andesite.png", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.ANDESITE));
	public static final Block ANDESITE_WALL_HANGING_SIGN = registerBlock("andesite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("andesite.png", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.ANDESITE).lootTable(ANDESITE_HANGING_SIGN.getLootTableKey()));

	public static final Block POLISHED_ANDESITE_SIGN = registerBlock("polished_andesite_sign", settings -> new ModSignBlock("polished_andesite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
	public static final Block POLISHED_ANDESITE_WALL_SIGN = registerBlock("polished_andesite_wall_sign", settings -> new ModWallSignBlock("polished_andesite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).lootTable(POLISHED_ANDESITE_SIGN.getLootTableKey()));
	public static final Block POLISHED_ANDESITE_HANGING_SIGN = registerBlock("polished_andesite_hanging_sign", settings -> new ModHangingSignBlock("polished_andesite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE));
	public static final Block POLISHED_ANDESITE_WALL_HANGING_SIGN = registerBlock("polished_andesite_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_andesite", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).lootTable(POLISHED_ANDESITE_HANGING_SIGN.getLootTableKey()));

	public static final Block DEEPSLATE_SIGN = registerBlock("deepslate_sign", settings -> new ModSignBlock("deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
	public static final Block DEEPSLATE_WALL_SIGN = registerBlock("deepslate_wall_sign", settings -> new ModWallSignBlock("deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE).lootTable(DEEPSLATE_SIGN.getLootTableKey()));
	public static final Block DEEPSLATE_HANGING_SIGN = registerBlock("deepslate_hanging_sign", settings -> new ModHangingSignBlock("deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
	public static final Block DEEPSLATE_WALL_HANGING_SIGN = registerBlock("deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE).lootTable(DEEPSLATE_HANGING_SIGN.getLootTableKey()));

	public static final Block COBBLED_DEEPSLATE_SIGN = registerBlock("cobbled_deepslate_sign", settings -> new ModSignBlock("cobbled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
	public static final Block COBBLED_DEEPSLATE_WALL_SIGN = registerBlock("cobbled_deepslate_wall_sign", settings -> new ModWallSignBlock("cobbled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).lootTable(COBBLED_DEEPSLATE_SIGN.getLootTableKey()));
	public static final Block COBBLED_DEEPSLATE_HANGING_SIGN = registerBlock("cobbled_deepslate_hanging_sign", settings -> new ModHangingSignBlock("cobbled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE));
	public static final Block COBBLED_DEEPSLATE_WALL_HANGING_SIGN = registerBlock("cobbled_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cobbled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).lootTable(COBBLED_DEEPSLATE_HANGING_SIGN.getLootTableKey()));

	public static final Block CHISELED_DEEPSLATE_SIGN = registerBlock("chiseled_deepslate_sign", settings -> new ModSignBlock("chiseled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
	public static final Block CHISELED_DEEPSLATE_WALL_SIGN = registerBlock("chiseled_deepslate_wall_sign", settings -> new ModWallSignBlock("chiseled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).lootTable(CHISELED_DEEPSLATE_SIGN.getLootTableKey()));
	public static final Block CHISELED_DEEPSLATE_HANGING_SIGN = registerBlock("chiseled_deepslate_hanging_sign", settings -> new ModHangingSignBlock("chiseled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE));
	public static final Block CHISELED_DEEPSLATE_WALL_HANGING_SIGN = registerBlock("chiseled_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("chiseled_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).lootTable(CHISELED_DEEPSLATE_HANGING_SIGN.getLootTableKey()));

	public static final Block POLISHED_DEEPSLATE_SIGN = registerBlock("polished_deepslate_sign", settings -> new ModSignBlock("polished_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
	public static final Block POLISHED_DEEPSLATE_WALL_SIGN = registerBlock("polished_deepslate_wall_sign", settings -> new ModWallSignBlock("polished_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).lootTable(POLISHED_DEEPSLATE_SIGN.getLootTableKey()));
	public static final Block POLISHED_DEEPSLATE_HANGING_SIGN = registerBlock("polished_deepslate_hanging_sign", settings -> new ModHangingSignBlock("polished_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE));
	public static final Block POLISHED_DEEPSLATE_WALL_HANGING_SIGN = registerBlock("polished_deepslate_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_deepslate", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).lootTable(POLISHED_DEEPSLATE_HANGING_SIGN.getLootTableKey()));

	public static final Block DEEPSLATE_BRICKS_SIGN = registerBlock("deepslate_bricks_sign", settings -> new ModSignBlock("deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
	public static final Block DEEPSLATE_BRICKS_WALL_SIGN = registerBlock("deepslate_bricks_wall_sign", settings -> new ModWallSignBlock("deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).lootTable(DEEPSLATE_BRICKS_SIGN.getLootTableKey()));
	public static final Block DEEPSLATE_BRICKS_HANGING_SIGN = registerBlock("deepslate_bricks_hanging_sign", settings -> new ModHangingSignBlock("deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS));
	public static final Block DEEPSLATE_BRICKS_WALL_HANGING_SIGN = registerBlock("deepslate_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).lootTable(DEEPSLATE_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlock("cracked_deepslate_bricks_sign", settings -> new ModSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
	public static final Block CRACKED_DEEPSLATE_BRICKS_WALL_SIGN = registerBlock("cracked_deepslate_bricks_wall_sign", settings -> new ModWallSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lootTable(CRACKED_DEEPSLATE_BRICKS_SIGN.getLootTableKey()));
	public static final Block CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN = registerBlock("cracked_deepslate_bricks_hanging_sign", settings -> new ModHangingSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS));
	public static final Block CRACKED_DEEPSLATE_BRICKS_WALL_HANGING_SIGN = registerBlock("cracked_deepslate_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cracked_deepslate_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).lootTable(CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block DEEPSLATE_TILES_SIGN = registerBlock("deepslate_tiles_sign", settings -> new ModSignBlock("deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
	public static final Block DEEPSLATE_TILES_WALL_SIGN = registerBlock("deepslate_tiles_wall_sign", settings -> new ModWallSignBlock("deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES).lootTable(DEEPSLATE_TILES_SIGN.getLootTableKey()));
	public static final Block DEEPSLATE_TILES_HANGING_SIGN = registerBlock("deepslate_tiles_hanging_sign", settings -> new ModHangingSignBlock("deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES));
	public static final Block DEEPSLATE_TILES_WALL_HANGING_SIGN = registerBlock("deepslate_tiles_wall_hanging_sign", settings -> new ModWallHangingSignBlock("deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILES).lootTable(DEEPSLATE_TILES_HANGING_SIGN.getLootTableKey()));

	public static final Block CRACKED_DEEPSLATE_TILES_SIGN = registerBlock("cracked_deepslate_tiles_sign", settings -> new ModSignBlock("cracked_deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES));
	public static final Block CRACKED_DEEPSLATE_TILES_WALL_SIGN = registerBlock("cracked_deepslate_tiles_wall_sign", settings -> new ModWallSignBlock("cracked_deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).lootTable(CRACKED_DEEPSLATE_TILES_SIGN.getLootTableKey()));
	public static final Block CRACKED_DEEPSLATE_TILES_HANGING_SIGN = registerBlock("cracked_deepslate_tiles_hanging_sign", settings -> new ModHangingSignBlock("cracked_deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES));
	public static final Block CRACKED_DEEPSLATE_TILES_WALL_HANGING_SIGN = registerBlock("cracked_deepslate_tiles_wall_hanging_sign", settings -> new ModWallHangingSignBlock("cracked_deepslate_tiles", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).lootTable(CRACKED_DEEPSLATE_TILES_HANGING_SIGN.getLootTableKey()));

	public static final Block TUFF_SIGN = registerBlock("tuff_sign", settings -> new ModSignBlock("tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF));
	public static final Block TUFF_WALL_SIGN = registerBlock("tuff_wall_sign", settings -> new ModWallSignBlock("tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF).lootTable(TUFF_SIGN.getLootTableKey()));
	public static final Block TUFF_HANGING_SIGN = registerBlock("tuff_hanging_sign", settings -> new ModHangingSignBlock("tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF));
	public static final Block TUFF_WALL_HANGING_SIGN = registerBlock("tuff_wall_hanging_sign", settings -> new ModWallHangingSignBlock("tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF).lootTable(TUFF_HANGING_SIGN.getLootTableKey()));

	public static final Block CHISELED_TUFF_SIGN = registerBlock("chiseled_tuff_sign", settings -> new ModSignBlock("chiseled_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
	public static final Block CHISELED_TUFF_WALL_SIGN = registerBlock("chiseled_tuff_wall_sign", settings -> new ModWallSignBlock("chiseled_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF).lootTable(CHISELED_TUFF_SIGN.getLootTableKey()));
	public static final Block CHISELED_TUFF_HANGING_SIGN = registerBlock("chiseled_tuff_hanging_sign", settings -> new ModHangingSignBlock("chiseled_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF));
	public static final Block CHISELED_TUFF_WALL_HANGING_SIGN = registerBlock("chiseled_tuff_wall_hanging_sign", settings -> new ModWallHangingSignBlock("chiseled_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF).lootTable(CHISELED_TUFF_HANGING_SIGN.getLootTableKey()));

	public static final Block POLISHED_TUFF_SIGN = registerBlock("polished_tuff_sign", settings -> new ModSignBlock("polished_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
	public static final Block POLISHED_TUFF_WALL_SIGN = registerBlock("polished_tuff_wall_sign", settings -> new ModWallSignBlock("polished_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF).lootTable(POLISHED_TUFF_SIGN.getLootTableKey()));
	public static final Block POLISHED_TUFF_HANGING_SIGN = registerBlock("polished_tuff_hanging_sign", settings -> new ModHangingSignBlock("polished_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF));
	public static final Block POLISHED_TUFF_WALL_HANGING_SIGN = registerBlock("polished_tuff_wall_hanging_sign", settings -> new ModWallHangingSignBlock("polished_tuff", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF).lootTable(POLISHED_TUFF_HANGING_SIGN.getLootTableKey()));

	public static final Block TUFF_BRICKS_SIGN = registerBlock("tuff_bricks_sign", settings -> new ModSignBlock("tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
	public static final Block TUFF_BRICKS_WALL_SIGN = registerBlock("tuff_bricks_wall_sign", settings -> new ModWallSignBlock("tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS).lootTable(TUFF_BRICKS_SIGN.getLootTableKey()));
	public static final Block TUFF_BRICKS_HANGING_SIGN = registerBlock("tuff_bricks_hanging_sign", settings -> new ModHangingSignBlock("tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS));
	public static final Block TUFF_BRICKS_WALL_HANGING_SIGN = registerBlock("tuff_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.TUFF_BRICKS).lootTable(TUFF_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block CHISELED_TUFF_BRICKS_SIGN = registerBlock("chiseled_tuff_bricks_sign", settings -> new ModSignBlock("chiseled_tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS));
	public static final Block CHISELED_TUFF_BRICKS_WALL_SIGN = registerBlock("chiseled_tuff_bricks_wall_sign", settings -> new ModWallSignBlock("chiseled_tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS).lootTable(CHISELED_TUFF_BRICKS_SIGN.getLootTableKey()));
	public static final Block CHISELED_TUFF_BRICKS_HANGING_SIGN = registerBlock("chiseled_tuff_bricks_hanging_sign", settings -> new ModHangingSignBlock("chiseled_tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS));
	public static final Block CHISELED_TUFF_BRICKS_WALL_HANGING_SIGN = registerBlock("chiseled_tuff_bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("chiseled_tuff_bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS).lootTable(CHISELED_TUFF_BRICKS_HANGING_SIGN.getLootTableKey()));

	public static final Block BRICKS_SIGN = registerBlock("bricks_sign", settings -> new ModSignBlock("bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.BRICKS));
	public static final Block BRICKS_WALL_SIGN = registerBlock("bricks_wall_sign", settings -> new ModWallSignBlock("bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.BRICKS).lootTable(BRICKS_SIGN.getLootTableKey()));
	public static final Block BRICKS_HANGING_SIGN = registerBlock("bricks_hanging_sign", settings -> new ModHangingSignBlock("bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.BRICKS));
	public static final Block BRICKS_WALL_HANGING_SIGN = registerBlock("bricks_wall_hanging_sign", settings -> new ModWallHangingSignBlock("bricks", WoodType.OAK, settings),
			AbstractBlock.Settings.copy(Blocks.BRICKS).lootTable(BRICKS_HANGING_SIGN.getLootTableKey()));

	private static RegistryKey<Block> keyOfBlock(String name) {
		return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name));
	}

	private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function, AbstractBlock.Settings settings) {
		return Registry.register(Registries.BLOCK, Identifier.of(VanillaSABPlus.MOD_ID, name), function.apply(settings.registryKey(keyOfBlock(name)).noCollision()));
	}

	public static void registerModBlocks() {
	}
}
