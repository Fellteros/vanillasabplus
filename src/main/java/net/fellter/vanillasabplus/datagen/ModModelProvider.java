package net.fellter.vanillasabplus.datagen;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.model.ModBlockStateModelGenerator;
import net.fellter.vanillasabplus.registry.Args;
import net.fellter.vanillasabplus.registry.DatagenArgs;
import net.fellter.vanillasabplus.sign.ModHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModSignBlock;
import net.fellter.vanillasabplus.sign.ModWallHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModWallSignBlock;

import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

@Environment(EnvType.CLIENT)
public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator bsmg) {
		Registries.BLOCK.forEach(block -> {
			Identifier identifier = Registries.BLOCK.getId(block);
			DatagenArgs datagenArgs = Args.get(block);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID) && datagenArgs != null) {
				if (block instanceof ModWallHangingSignBlock || block instanceof ModWallSignBlock) {
					ModBlockStateModelGenerator.registerSign(bsmg, datagenArgs.parentBlock, block);
				} else if (block instanceof ModHangingSignBlock || block instanceof ModSignBlock) {
					ModBlockStateModelGenerator.registerSignWithItem(bsmg, datagenArgs.parentBlock, block);
				}
			}
		});
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		Registries.ITEM.forEach(item -> {
			Identifier identifier = Registries.ITEM.getId(item);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID) && !(item instanceof SignItem)) {
				itemModelGenerator.register(item, Models.GENERATED);
			}
		});
	}
}
