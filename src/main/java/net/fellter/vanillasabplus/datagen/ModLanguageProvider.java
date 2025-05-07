package net.fellter.vanillasabplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;

import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.loader.impl.util.StringUtil;

public class ModLanguageProvider extends FabricLanguageProvider {
	public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}

	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
		Registries.ENTITY_TYPE.forEach(entityType -> {
			Identifier identifier = Registries.ENTITY_TYPE.getId(entityType);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID)) {
				Entity entity = VanillaSABPlus.MOD_BOAT_SOURCE_MAP.get(entityType);
				StringBuilder stringBuilder = new StringBuilder();
				String[] var10000;

				if (entity instanceof ChestBoatEntity) {
					var10000 = identifier.getPath().replaceAll("_chest", "").split("_");

					for (String s : var10000) {
						stringBuilder.append(StringUtil.capitalize(s)).append(" ");
					}

					translationBuilder.add(entityType, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).append(" with Chest").toString());
				} else {
					var10000 = identifier.getPath().split("_");

					for (String string : var10000) {
						stringBuilder.append(StringUtil.capitalize(string)).append(" ");
					}

					translationBuilder.add(entityType, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString());
				}
			}
		});

		Registries.ITEM.forEach(item -> {
			Identifier identifier = Registries.ITEM.getId(item);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID)) {
				StringBuilder stringBuilder = new StringBuilder();
				String[] var10000;

				if (item instanceof BoatItem && VanillaSABPlus.MOD_BOAT_SOURCE_MAP.get(((BoatItem) item).boatEntityType) instanceof ChestBoatEntity) {
					var10000 = identifier.getPath().replaceAll("_chest", "").split("_");

					for (String s : var10000) {
						stringBuilder.append(StringUtil.capitalize(s)).append(" ");
					}

					translationBuilder.add(item, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).append(" with Chest").toString());
				} else {
					var10000 = identifier.getPath().split("_");

					for (String string : var10000) {
						stringBuilder.append(StringUtil.capitalize(string)).append(" ");
					}

					translationBuilder.add(item, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString());
				}
			}
		});

		translationBuilder.add("itemGroup.vsabp_boat", "Vanilla+ Boats");
		translationBuilder.add("itemGroup.vsabp_sign", "Vanilla+ Signs");
	}
}
