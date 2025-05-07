package net.fellter.vanillasabplus.datagen;

import java.util.concurrent.CompletableFuture;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.registry.Args;
import net.fellter.vanillasabplus.registry.DatagenArgs;
import net.fellter.vanillasabplus.sign.ModHangingSignBlock;
import net.fellter.vanillasabplus.sign.ModSignBlock;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

public class ModRecipeProvider extends FabricRecipeProvider {
	public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			public void offerSignRecipe(ItemConvertible output, ItemConvertible input) {
				ShapedRecipeJsonBuilder.create(this.registries.getOrThrow(RegistryKeys.ITEM), RecipeCategory.DECORATIONS, output, 3)
						.group("sign")
						.input('#', input)
						.input('X', Items.STICK)
						.pattern("###")
						.pattern("###")
						.pattern(" X ")
						.criterion(hasItem(input), conditionsFromItem(input))
						.offerTo(exporter);
			}

			@Override
			public void generate() {
				Registries.ITEM.forEach(item -> {
					Identifier identifier = Registries.ITEM.getId(item);
					DatagenArgs datagenArgs = Args.get(item);

					if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID) && item instanceof BoatItem && datagenArgs != null) {
						VanillaSABPlus.LOGGER.info(identifier.toTranslationKey());
						Entity entity = VanillaSABPlus.MOD_BOAT_SOURCE_MAP.get(((BoatItem) item).boatEntityType);

						if (entity instanceof ChestBoatEntity) {
							offerChestBoatRecipe(item, Registries.ITEM.get(Identifier.of(VanillaSABPlus.MOD_ID, identifier.getPath().replaceFirst("_chest", ""))));
						} else if (entity instanceof BoatEntity) {
							offerBoatRecipe(item, datagenArgs.parentBlock);
						}
					}
				});

				Registries.BLOCK.forEach(block -> {
					Identifier identifier = Registries.BLOCK.getId(block);
					DatagenArgs datagenArgs = Args.get(block);

					if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID) && datagenArgs != null) {
						if (block instanceof ModHangingSignBlock) {
							offerHangingSignRecipe(block, datagenArgs.parentBlock);
						} else if (block instanceof ModSignBlock) {
							offerSignRecipe(block, datagenArgs.parentBlock);
						}
					}
				});
			}
		};
	}

	@Override
	public String getName() {
		return "Recipes";
	}
}
