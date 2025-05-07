package net.fellter.vanillasabplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;

import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
	public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generate() {
		Registries.BLOCK.forEach(block -> {
			Identifier identifier = Registries.BLOCK.getId(block);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID)) {
				addDrop(block);
			}
		});
	}
}
