package net.fellter.vanillasabplus.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.registry.Args;
import net.fellter.vanillasabplus.sign.ModHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModSignBlock;
import net.fellter.vanillasabplus.sign.ModWallHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModWallSignBlock;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		Registries.BLOCK.forEach(block -> {
			if (Registries.BLOCK.getId(block).getNamespace().equals(VanillaSABPlus.MOD_ID)) {
				if (block instanceof ModWallHangingSignBlock) {
					getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS).add(block);
				} else if (block instanceof ModHangingSignBlock) {
					getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS).add(block);
				} else if (block instanceof ModWallSignBlock) {
					getOrCreateTagBuilder(BlockTags.WALL_SIGNS).add(block);
					getOrCreateTagBuilder(BlockTags.ALL_SIGNS).add(block);
				} else if (block instanceof ModSignBlock) {
					getOrCreateTagBuilder(BlockTags.STANDING_SIGNS).add(block);
					getOrCreateTagBuilder(BlockTags.ALL_SIGNS).add(block);
				}

				if (Args.DATAGEN_ARGS.containsKey(block) && Args.DATAGEN_ARGS.get(block).blockTags != null) {
					List<TagKey<Block>> key = Args.DATAGEN_ARGS.get(block).blockTags;

					for (TagKey<Block> blockTagKey : key) {
						getOrCreateTagBuilder(blockTagKey).add(block);
					}
				}
			}
		});

		getOrCreateTagBuilder(BlockTags.SIGNS).addTag(BlockTags.STANDING_SIGNS).addTag(BlockTags.WALL_SIGNS).addTag(BlockTags.CEILING_HANGING_SIGNS).addTag(BlockTags.WALL_HANGING_SIGNS);
	}
}
