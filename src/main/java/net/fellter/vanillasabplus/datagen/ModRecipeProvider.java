package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillasabplus.util.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        RecipeProvider.offerBoatRecipe(exporter, ModItems.CRIMSON_BOAT, Blocks.CRIMSON_PLANKS);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.CRIMSON_CHEST_BOAT, Blocks.CRIMSON_PLANKS);

        RecipeProvider.offerBoatRecipe(exporter, ModItems.WARPED_BOAT, Blocks.WARPED_PLANKS);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.WARPED_CHEST_BOAT, Blocks.WARPED_PLANKS);

        RecipeProvider.offerBoatRecipe(exporter, ModItems.STONE_BOAT, Blocks.STONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.STONE_CHEST_BOAT, Blocks.STONE);

        RecipeProvider.offerBoatRecipe(exporter, ModItems.COBBLESTONE_BOAT, Blocks.COBBLESTONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.COBBLESTONE_CHEST_BOAT, Blocks.COBBLESTONE);

        RecipeProvider.offerBoatRecipe(exporter, ModItems.MOSSY_COBBLESTONE_BOAT, Blocks.MOSSY_COBBLESTONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.MOSSY_COBBLESTONE_CHEST_BOAT, Blocks.MOSSY_COBBLESTONE);
    }
}
