package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillasabplus.shared.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

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

                offerBoatRecipe(ModItems.CRIMSON_BOAT, Blocks.CRIMSON_PLANKS);
                offerChestBoatRecipe(ModItems.CRIMSON_CHEST_BOAT, Blocks.CRIMSON_PLANKS);

                offerBoatRecipe(ModItems.WARPED_BOAT, Blocks.WARPED_PLANKS);
                offerChestBoatRecipe(ModItems.WARPED_CHEST_BOAT, Blocks.WARPED_PLANKS);

                offerBoatRecipe(ModItems.STONE_BOAT, Blocks.STONE);
                offerChestBoatRecipe(ModItems.STONE_CHEST_BOAT, Blocks.STONE);
                offerHangingSignRecipe(ModItems.HANGING_STONE_SIGN, Blocks.STONE);
                offerSignRecipe(ModItems.STONE_SIGN, Blocks.STONE);

                offerBoatRecipe(ModItems.COBBLESTONE_BOAT, Blocks.COBBLESTONE);
                offerChestBoatRecipe(ModItems.COBBLESTONE_CHEST_BOAT, Blocks.COBBLESTONE);
                offerHangingSignRecipe(ModItems.COBBLESTONE_HANGING_SIGN, Blocks.COBBLESTONE);
                offerSignRecipe(ModItems.COBBLESTONE_SIGN, Blocks.COBBLESTONE);

                offerBoatRecipe(ModItems.MOSSY_COBBLESTONE_BOAT, Blocks.MOSSY_COBBLESTONE);
                offerChestBoatRecipe(ModItems.MOSSY_COBBLESTONE_CHEST_BOAT, Blocks.MOSSY_COBBLESTONE);
                offerHangingSignRecipe(ModItems.MOSSY_COBBLESTONE_HANGING_SIGN, Blocks.MOSSY_COBBLESTONE);
                offerSignRecipe(ModItems.MOSSY_COBBLESTONE_SIGN, Blocks.MOSSY_COBBLESTONE);

                offerBoatRecipe(ModItems.SMOOTH_STONE_BOAT, Blocks.SMOOTH_STONE);
                offerChestBoatRecipe(ModItems.SMOOTH_STONE_CHEST_BOAT, Blocks.SMOOTH_STONE);
                offerHangingSignRecipe(ModItems.SMOOTH_STONE_HANGING_SIGN, Blocks.SMOOTH_STONE);
                offerSignRecipe(ModItems.SMOOTH_STONE_SIGN, Blocks.SMOOTH_STONE);

                offerBoatRecipe(ModItems.STONE_BRICKS_BOAT, Blocks.STONE_BRICKS);
                offerChestBoatRecipe(ModItems.STONE_BRICKS_CHEST_BOAT, Blocks.STONE_BRICKS);
                offerHangingSignRecipe(ModItems.STONE_BRICKS_HANGING_SIGN, Blocks.STONE_BRICKS);
                offerSignRecipe(ModItems.STONE_BRICKS_SIGN, Blocks.STONE_BRICKS);

                offerBoatRecipe(ModItems.CRACKED_STONE_BRICKS_BOAT, Blocks.CRACKED_STONE_BRICKS);
                offerChestBoatRecipe(ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT, Blocks.CRACKED_STONE_BRICKS);
                offerHangingSignRecipe(ModItems.CRACKED_STONE_BRICKS_HANGING_SIGN, Blocks.CRACKED_STONE_BRICKS);
                offerSignRecipe(ModItems.CRACKED_STONE_BRICKS_SIGN, Blocks.CRACKED_STONE_BRICKS);

                offerBoatRecipe(ModItems.MOSSY_STONE_BRICKS_BOAT, Blocks.MOSSY_STONE_BRICKS);
                offerChestBoatRecipe(ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT, Blocks.MOSSY_STONE_BRICKS);
                offerHangingSignRecipe(ModItems.MOSSY_STONE_BRICKS_HANGING_SIGN, Blocks.MOSSY_STONE_BRICKS);
                offerSignRecipe(ModItems.MOSSY_STONE_BRICKS_SIGN, Blocks.MOSSY_STONE_BRICKS);

                offerBoatRecipe(ModItems.GRANITE_BOAT, Blocks.GRANITE);
                offerChestBoatRecipe(ModItems.GRANITE_CHEST_BOAT, Blocks.GRANITE);
                offerHangingSignRecipe(ModItems.GRANITE_HANGING_SIGN, Blocks.GRANITE);
                offerSignRecipe(ModItems.GRANITE_SIGN, Blocks.GRANITE);

                offerBoatRecipe(ModItems.POLISHED_GRANITE_BOAT, Blocks.POLISHED_GRANITE);
                offerChestBoatRecipe(ModItems.POLISHED_GRANITE_CHEST_BOAT, Blocks.POLISHED_GRANITE);
                offerHangingSignRecipe(ModItems.POLISHED_GRANITE_HANGING_SIGN, Blocks.POLISHED_GRANITE);
                offerSignRecipe(ModItems.POLISHED_GRANITE_SIGN, Blocks.POLISHED_GRANITE);

                offerBoatRecipe(ModItems.DIORITE_BOAT, Blocks.DIORITE);
                offerChestBoatRecipe(ModItems.DIORITE_CHEST_BOAT, Blocks.DIORITE);
                offerHangingSignRecipe(ModItems.DIORITE_HANGING_SIGN, Blocks.DIORITE);
                offerSignRecipe(ModItems.DIORITE_SIGN, Blocks.DIORITE);

                offerBoatRecipe(ModItems.POLISHED_DIORITE_BOAT, Blocks.POLISHED_DIORITE);
                offerChestBoatRecipe(ModItems.POLISHED_DIORITE_CHEST_BOAT, Blocks.POLISHED_DIORITE);
                offerHangingSignRecipe(ModItems.POLISHED_DIORITE_HANGING_SIGN, Blocks.POLISHED_DIORITE);
                offerSignRecipe(ModItems.POLISHED_DIORITE_SIGN, Blocks.POLISHED_DIORITE);

                offerBoatRecipe(ModItems.ANDESITE_BOAT, Blocks.ANDESITE);
                offerChestBoatRecipe(ModItems.ANDESITE_CHEST_BOAT, Blocks.ANDESITE);
                offerHangingSignRecipe(ModItems.ANDESITE_HANGING_SIGN, Blocks.ANDESITE);
                offerSignRecipe(ModItems.ANDESITE_SIGN, Blocks.ANDESITE);

                offerBoatRecipe(ModItems.POLISHED_ANDESITE_BOAT, Blocks.POLISHED_ANDESITE);
                offerChestBoatRecipe(ModItems.POLISHED_ANDESITE_CHEST_BOAT, Blocks.POLISHED_ANDESITE);
                offerHangingSignRecipe(ModItems.POLISHED_ANDESITE_HANGING_SIGN, Blocks.POLISHED_ANDESITE);
                offerSignRecipe(ModItems.POLISHED_ANDESITE_SIGN, Blocks.POLISHED_ANDESITE);

                offerBoatRecipe(ModItems.DEEPSLATE_BOAT, Blocks.DEEPSLATE);
                offerChestBoatRecipe(ModItems.DEEPSLATE_CHEST_BOAT, Blocks.DEEPSLATE);
                offerHangingSignRecipe(ModItems.DEEPSLATE_HANGING_SIGN, Blocks.DEEPSLATE);
                offerSignRecipe(ModItems.DEEPSLATE_SIGN, Blocks.DEEPSLATE);

                offerBoatRecipe(ModItems.COBBLED_DEEPSLATE_BOAT, Blocks.COBBLED_DEEPSLATE);
                offerChestBoatRecipe(ModItems.COBBLED_DEEPSLATE_CHEST_BOAT, Blocks.COBBLED_DEEPSLATE);
                offerHangingSignRecipe(ModItems.COBBLED_DEEPSLATE_HANGING_SIGN, Blocks.COBBLED_DEEPSLATE);
                offerSignRecipe(ModItems.COBBLED_DEEPSLATE_SIGN, Blocks.COBBLED_DEEPSLATE);

                offerBoatRecipe(ModItems.CHISELED_DEEPSLATE_BOAT, Blocks.CHISELED_DEEPSLATE);
                offerChestBoatRecipe(ModItems.CHISELED_DEEPSLATE_CHEST_BOAT, Blocks.CHISELED_DEEPSLATE);
                offerHangingSignRecipe(ModItems.CHISELED_DEEPSLATE_HANGING_SIGN, Blocks.CHISELED_DEEPSLATE);
                offerSignRecipe(ModItems.CHISELED_DEEPSLATE_SIGN, Blocks.CHISELED_DEEPSLATE);

                offerBoatRecipe(ModItems.POLISHED_DEEPSLATE_BOAT, Blocks.POLISHED_DEEPSLATE);
                offerChestBoatRecipe(ModItems.POLISHED_DEEPSLATE_CHEST_BOAT, Blocks.POLISHED_DEEPSLATE);
                offerHangingSignRecipe(ModItems.POLISHED_DEEPSLATE_HANGING_SIGN, Blocks.POLISHED_DEEPSLATE);
                offerSignRecipe(ModItems.POLISHED_DEEPSLATE_SIGN, Blocks.POLISHED_DEEPSLATE);

                offerBoatRecipe(ModItems.DEEPSLATE_BRICKS_BOAT, Blocks.DEEPSLATE_BRICKS);
                offerChestBoatRecipe(ModItems.DEEPSLATE_BRICKS_CHEST_BOAT, Blocks.DEEPSLATE_BRICKS);
                offerHangingSignRecipe(ModItems.DEEPSLATE_BRICKS_HANGING_SIGN, Blocks.DEEPSLATE_BRICKS);
                offerSignRecipe(ModItems.DEEPSLATE_BRICKS_SIGN, Blocks.DEEPSLATE_BRICKS);

                offerBoatRecipe(ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT, Blocks.CRACKED_DEEPSLATE_BRICKS);
                offerChestBoatRecipe(ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, Blocks.CRACKED_DEEPSLATE_BRICKS);
                offerHangingSignRecipe(ModItems.CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN, Blocks.CRACKED_DEEPSLATE_BRICKS);
                offerSignRecipe(ModItems.CRACKED_DEEPSLATE_BRICKS_SIGN, Blocks.CRACKED_DEEPSLATE_BRICKS);

            }
        };
    }


    @Override
    public String getName() {
        return this.toString();
    }
}
