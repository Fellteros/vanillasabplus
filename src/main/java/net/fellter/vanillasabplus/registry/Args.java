package net.fellter.vanillasabplus.registry;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.jetbrains.annotations.NotNull;

import net.fellter.vanillasabplus.shared.ModBlocks;
import net.fellter.vanillasabplus.shared.ModItems;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.BlockTags;

public final class Args {
	public static final Map<ItemConvertible, DatagenArgs> DATAGEN_ARGS = new LinkedHashMap<>();

	private static void putInDatagenArgs(ItemConvertible itemConvertible, DatagenArgs datagenArgs) {
		DatagenArgs oldArgs = DATAGEN_ARGS.get(itemConvertible);

		if (oldArgs == null) {
			DATAGEN_ARGS.put(itemConvertible, datagenArgs);
		} else {
			throw new IllegalStateException("Entry " + itemConvertible.asItem().getTranslationKey() + " has already been put in DatagenArgs source map.");
		}
	}

	private static void putInDatagenArgs(DatagenArgs datagenArgs, @NotNull ItemConvertible... itemConvertibles) {
		if (itemConvertibles.length > 0) {
			Arrays.asList(itemConvertibles).forEach(itemConvertible -> putInDatagenArgs(itemConvertible, datagenArgs));
		}
	}

	public static DatagenArgs get(ItemConvertible itemConvertible) {
		if (DATAGEN_ARGS.containsKey(itemConvertible)) {
			return DATAGEN_ARGS.get(itemConvertible);
		}

		return null;
	}

	public static void registerDatagenArgs() {
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.WARPED_PLANKS), ModItems.WARPED_BOAT, ModItems.WARPED_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRIMSON_PLANKS), ModItems.CRIMSON_BOAT, ModItems.CRIMSON_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.STONE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.STONE_SIGN, ModBlocks.STONE_WALL_SIGN, ModBlocks.STONE_HANGING_SIGN, ModBlocks.STONE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.STONE), ModItems.STONE_BOAT, ModItems.STONE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.COBBLESTONE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.COBBLESTONE_SIGN, ModBlocks.COBBLESTONE_WALL_SIGN, ModBlocks.COBBLESTONE_HANGING_SIGN, ModBlocks.COBBLESTONE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.COBBLESTONE), ModItems.COBBLESTONE_BOAT, ModItems.COBBLESTONE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.MOSSY_COBBLESTONE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.MOSSY_COBBLESTONE_SIGN, ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN, ModBlocks.MOSSY_COBBLESTONE_HANGING_SIGN, ModBlocks.MOSSY_COBBLESTONE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.MOSSY_COBBLESTONE), ModItems.MOSSY_COBBLESTONE_BOAT, ModItems.MOSSY_COBBLESTONE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.SMOOTH_STONE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.SMOOTH_STONE_SIGN, ModBlocks.SMOOTH_STONE_WALL_SIGN, ModBlocks.SMOOTH_STONE_HANGING_SIGN, ModBlocks.SMOOTH_STONE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.SMOOTH_STONE), ModItems.SMOOTH_STONE_BOAT, ModItems.SMOOTH_STONE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.STONE_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.STONE_BRICKS_SIGN, ModBlocks.STONE_BRICKS_WALL_SIGN, ModBlocks.STONE_BRICKS_HANGING_SIGN, ModBlocks.STONE_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.STONE_BRICKS), ModItems.STONE_BRICKS_BOAT, ModItems.STONE_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_STONE_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CRACKED_STONE_BRICKS_SIGN, ModBlocks.CRACKED_STONE_BRICKS_WALL_SIGN, ModBlocks.CRACKED_STONE_BRICKS_HANGING_SIGN, ModBlocks.CRACKED_STONE_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_STONE_BRICKS), ModItems.CRACKED_STONE_BRICKS_BOAT, ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.MOSSY_STONE_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.MOSSY_STONE_BRICKS_SIGN, ModBlocks.MOSSY_STONE_BRICKS_WALL_SIGN, ModBlocks.MOSSY_STONE_BRICKS_HANGING_SIGN, ModBlocks.MOSSY_STONE_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.MOSSY_STONE_BRICKS), ModItems.MOSSY_STONE_BRICKS_BOAT, ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.GRANITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.GRANITE_SIGN, ModBlocks.GRANITE_WALL_SIGN, ModBlocks.GRANITE_HANGING_SIGN, ModBlocks.GRANITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.GRANITE), ModItems.GRANITE_BOAT, ModItems.GRANITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_GRANITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.POLISHED_GRANITE_SIGN, ModBlocks.POLISHED_GRANITE_WALL_SIGN, ModBlocks.POLISHED_GRANITE_HANGING_SIGN, ModBlocks.POLISHED_GRANITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_GRANITE), ModItems.POLISHED_GRANITE_BOAT, ModItems.POLISHED_GRANITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DIORITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.DIORITE_SIGN, ModBlocks.DIORITE_WALL_SIGN, ModBlocks.DIORITE_HANGING_SIGN, ModBlocks.DIORITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DIORITE), ModItems.DIORITE_BOAT, ModItems.DIORITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_DIORITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.POLISHED_DIORITE_SIGN, ModBlocks.POLISHED_DIORITE_WALL_SIGN, ModBlocks.POLISHED_DIORITE_HANGING_SIGN, ModBlocks.POLISHED_DIORITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_DIORITE), ModItems.POLISHED_DIORITE_BOAT, ModItems.POLISHED_DIORITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.ANDESITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.ANDESITE_SIGN, ModBlocks.ANDESITE_WALL_SIGN, ModBlocks.ANDESITE_HANGING_SIGN, ModBlocks.ANDESITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.ANDESITE), ModItems.ANDESITE_BOAT, ModItems.ANDESITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_ANDESITE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.POLISHED_ANDESITE_SIGN, ModBlocks.POLISHED_ANDESITE_WALL_SIGN, ModBlocks.POLISHED_ANDESITE_HANGING_SIGN, ModBlocks.POLISHED_ANDESITE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_ANDESITE), ModItems.POLISHED_ANDESITE_BOAT, ModItems.POLISHED_ANDESITE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.DEEPSLATE_SIGN, ModBlocks.DEEPSLATE_WALL_SIGN, ModBlocks.DEEPSLATE_HANGING_SIGN, ModBlocks.DEEPSLATE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE), ModItems.DEEPSLATE_BOAT, ModItems.DEEPSLATE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.COBBLED_DEEPSLATE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.COBBLED_DEEPSLATE_SIGN, ModBlocks.COBBLED_DEEPSLATE_WALL_SIGN, ModBlocks.COBBLED_DEEPSLATE_HANGING_SIGN, ModBlocks.COBBLED_DEEPSLATE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.COBBLED_DEEPSLATE), ModItems.COBBLED_DEEPSLATE_BOAT, ModItems.COBBLED_DEEPSLATE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_DEEPSLATE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CHISELED_DEEPSLATE_SIGN, ModBlocks.CHISELED_DEEPSLATE_WALL_SIGN, ModBlocks.CHISELED_DEEPSLATE_HANGING_SIGN, ModBlocks.CHISELED_DEEPSLATE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_DEEPSLATE), ModItems.CHISELED_DEEPSLATE_BOAT, ModItems.CHISELED_DEEPSLATE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_DEEPSLATE).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.POLISHED_DEEPSLATE_SIGN, ModBlocks.POLISHED_DEEPSLATE_WALL_SIGN, ModBlocks.POLISHED_DEEPSLATE_HANGING_SIGN, ModBlocks.POLISHED_DEEPSLATE_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_DEEPSLATE), ModItems.POLISHED_DEEPSLATE_BOAT, ModItems.POLISHED_DEEPSLATE_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.DEEPSLATE_BRICKS_SIGN, ModBlocks.DEEPSLATE_BRICKS_WALL_SIGN, ModBlocks.DEEPSLATE_BRICKS_HANGING_SIGN, ModBlocks.DEEPSLATE_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE_BRICKS), ModItems.DEEPSLATE_BRICKS_BOAT, ModItems.DEEPSLATE_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_DEEPSLATE_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CRACKED_DEEPSLATE_BRICKS_SIGN, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL_SIGN, ModBlocks.CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN, ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_DEEPSLATE_BRICKS), ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT, ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE_TILES).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.DEEPSLATE_TILES_SIGN, ModBlocks.DEEPSLATE_TILES_WALL_SIGN, ModBlocks.DEEPSLATE_TILES_HANGING_SIGN, ModBlocks.DEEPSLATE_TILES_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.DEEPSLATE_TILES), ModItems.DEEPSLATE_TILES_BOAT, ModItems.DEEPSLATE_TILES_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_DEEPSLATE_TILES).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CRACKED_DEEPSLATE_TILES_SIGN, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL_SIGN, ModBlocks.CRACKED_DEEPSLATE_TILES_HANGING_SIGN, ModBlocks.CRACKED_DEEPSLATE_TILES_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CRACKED_DEEPSLATE_TILES), ModItems.CRACKED_DEEPSLATE_TILES_BOAT, ModItems.CRACKED_DEEPSLATE_TILES_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.TUFF).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.TUFF_SIGN, ModBlocks.TUFF_WALL_SIGN, ModBlocks.TUFF_HANGING_SIGN, ModBlocks.TUFF_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.TUFF), ModItems.TUFF_BOAT, ModItems.TUFF_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_TUFF).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CHISELED_TUFF_SIGN, ModBlocks.CHISELED_TUFF_WALL_SIGN, ModBlocks.CHISELED_TUFF_HANGING_SIGN, ModBlocks.CHISELED_TUFF_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_TUFF), ModItems.CHISELED_TUFF_BOAT, ModItems.CHISELED_TUFF_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_TUFF).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.POLISHED_TUFF_SIGN, ModBlocks.POLISHED_TUFF_WALL_SIGN, ModBlocks.POLISHED_TUFF_HANGING_SIGN, ModBlocks.POLISHED_TUFF_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.POLISHED_TUFF), ModItems.POLISHED_TUFF_BOAT, ModItems.POLISHED_TUFF_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.TUFF_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.TUFF_BRICKS_SIGN, ModBlocks.TUFF_BRICKS_WALL_SIGN, ModBlocks.TUFF_BRICKS_HANGING_SIGN, ModBlocks.TUFF_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.TUFF_BRICKS), ModItems.TUFF_BRICKS_BOAT, ModItems.TUFF_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_TUFF_BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.CHISELED_TUFF_BRICKS_SIGN, ModBlocks.CHISELED_TUFF_BRICKS_WALL_SIGN, ModBlocks.CHISELED_TUFF_BRICKS_HANGING_SIGN, ModBlocks.CHISELED_TUFF_BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.CHISELED_TUFF_BRICKS), ModItems.CHISELED_TUFF_BRICKS_BOAT, ModItems.CHISELED_TUFF_BRICKS_CHEST_BOAT);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.BRICKS).blockTags(BlockTags.PICKAXE_MINEABLE), ModBlocks.BRICKS_SIGN, ModBlocks.BRICKS_WALL_SIGN, ModBlocks.BRICKS_HANGING_SIGN, ModBlocks.BRICKS_WALL_HANGING_SIGN);
		putInDatagenArgs(new DatagenArgs().parentBlock(Blocks.BRICKS), ModItems.BRICKS_BOAT, ModItems.BRICKS_CHEST_BOAT);
	}
}
