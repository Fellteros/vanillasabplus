package net.fellter.vanillasabplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;

import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
		super(output, completableFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		Registries.ITEM.forEach(item -> {
			if (Registries.ITEM.getId(item).getNamespace().equals(VanillaSABPlus.MOD_ID) && item instanceof BoatItem) {
				Entity entity = VanillaSABPlus.MOD_BOAT_SOURCE_MAP.get(((BoatItem) item).boatEntityType);
				if (entity instanceof ChestBoatEntity) getOrCreateTagBuilder(ItemTags.CHEST_BOATS).add(item);
				if (entity instanceof BoatEntity) getOrCreateTagBuilder(ItemTags.BOATS).add(item);
			}
		});
	}
}
