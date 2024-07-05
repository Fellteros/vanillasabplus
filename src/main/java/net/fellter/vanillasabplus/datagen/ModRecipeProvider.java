package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillasabplus.util.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.recipe.Ingredient;
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
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.HANGING_STONE_SIGN, Blocks.STONE);
        RecipeProvider.createSignRecipe(ModItems.STONE_SIGN, Ingredient.ofItems(Blocks.STONE));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.COBBLESTONE_BOAT, Blocks.COBBLESTONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.COBBLESTONE_CHEST_BOAT, Blocks.COBBLESTONE);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.COBBLESTONE_HANGING_SIGN, Blocks.COBBLESTONE);
        RecipeProvider.createSignRecipe(ModItems.COBBLESTONE_SIGN, Ingredient.ofItems(Blocks.COBBLESTONE));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.MOSSY_COBBLESTONE_BOAT, Blocks.MOSSY_COBBLESTONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.MOSSY_COBBLESTONE_CHEST_BOAT, Blocks.MOSSY_COBBLESTONE);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.MOSSY_COBBLESTONE_HANGING_SIGN, Blocks.MOSSY_COBBLESTONE);
        RecipeProvider.createSignRecipe(ModItems.MOSSY_COBBLESTONE_SIGN, Ingredient.ofItems(Blocks.MOSSY_COBBLESTONE));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.SMOOTH_STONE_BOAT, Blocks.SMOOTH_STONE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.SMOOTH_STONE_CHEST_BOAT, Blocks.SMOOTH_STONE);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.SMOOTH_STONE_HANGING_SIGN, Blocks.SMOOTH_STONE);
        RecipeProvider.createSignRecipe(ModItems.SMOOTH_STONE_SIGN, Ingredient.ofItems(Blocks.SMOOTH_STONE));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.STONE_BRICKS_BOAT, Blocks.STONE_BRICKS);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.STONE_BRICKS_CHEST_BOAT, Blocks.STONE_BRICKS);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.STONE_BRICKS_HANGING_SIGN, Blocks.STONE_BRICKS);
        RecipeProvider.createSignRecipe(ModItems.STONE_BRICKS_SIGN, Ingredient.ofItems(Blocks.STONE_BRICKS));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.CRACKED_STONE_BRICKS_BOAT, Blocks.CRACKED_STONE_BRICKS);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT, Blocks.CRACKED_STONE_BRICKS);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.CRACKED_STONE_BRICKS_HANGING_SIGN, Blocks.CRACKED_STONE_BRICKS);
        RecipeProvider.createSignRecipe(ModItems.CRACKED_STONE_BRICKS_SIGN, Ingredient.ofItems(Blocks.CRACKED_STONE_BRICKS));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.MOSSY_STONE_BRICKS_BOAT, Blocks.MOSSY_STONE_BRICKS);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT, Blocks.MOSSY_STONE_BRICKS);
        RecipeProvider.offerHangingSignRecipe(exporter, ModItems.MOSSY_STONE_BRICKS_HANGING_SIGN, Blocks.MOSSY_STONE_BRICKS);
        RecipeProvider.createSignRecipe(ModItems.MOSSY_STONE_BRICKS_SIGN, Ingredient.ofItems(Blocks.MOSSY_STONE_BRICKS));

        RecipeProvider.offerBoatRecipe(exporter, ModItems.GRANITE_BOAT, Blocks.GRANITE);
        RecipeProvider.offerChestBoatRecipe(exporter, ModItems.GRANITE_CHEST_BOAT, Blocks.GRANITE);
    }
}
