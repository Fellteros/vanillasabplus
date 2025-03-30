package net.fellter.vanillasabplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;

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
				String[] var10000 = identifier.getPath().split("_");
				StringBuilder stringBuilder = new StringBuilder();
				for (String string : var10000) {
					stringBuilder.append(StringUtil.capitalize(string)).append(" ");
				}
				translationBuilder.add(entityType, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString());
			}
		});

		Registries.ITEM.forEach(item -> {
			Identifier identifier = Registries.ITEM.getId(item);
			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID)) {
				String[] var10000 = identifier.getPath().split("_");
				StringBuilder stringBuilder = new StringBuilder();
				for (String string : var10000) {
					stringBuilder.append(StringUtil.capitalize(string)).append(" ");
				}
				translationBuilder.add(item, stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString());
			}
		});

		translationBuilder.add("itemGroup.vsabp_boat", "Vanilla+ Boats");
		translationBuilder.add("itemGroup.vsabp_sign", "Vanilla+ Signs");
	}
}
