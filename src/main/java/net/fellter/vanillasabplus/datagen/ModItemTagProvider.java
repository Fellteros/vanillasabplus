package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillasabplus.util.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ModItems.CRIMSON_BOAT)
                .add(ModItems.WARPED_BOAT)
                .add(ModItems.STONE_BOAT)
                .add(ModItems.COBBLESTONE_BOAT)
                .add(ModItems.MOSSY_COBBLESTONE_BOAT)
                .add(ModItems.SMOOTH_STONE_BOAT)
                .add(ModItems.STONE_BRICKS_BOAT)
                .add(ModItems.CRACKED_STONE_BRICKS_BOAT)
                .add(ModItems.MOSSY_STONE_BRICKS_BOAT)
                .add(ModItems.GRANITE_BOAT)
                .add(ModItems.POLISHED_GRANITE_BOAT)
                .add(ModItems.DIORITE_BOAT)
                .add(ModItems.POLISHED_DIORITE_BOAT)
                .add(ModItems.ANDESITE_BOAT)
                .add(ModItems.POLISHED_ANDESITE_BOAT);


        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.CRIMSON_CHEST_BOAT)
                .add(ModItems.WARPED_CHEST_BOAT)
                .add(ModItems.STONE_CHEST_BOAT)
                .add(ModItems.COBBLESTONE_CHEST_BOAT)
                .add(ModItems.MOSSY_COBBLESTONE_CHEST_BOAT)
                .add(ModItems.SMOOTH_STONE_CHEST_BOAT)
                .add(ModItems.STONE_BRICKS_CHEST_BOAT)
                .add(ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT)
                .add(ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT)
                .add(ModItems.GRANITE_CHEST_BOAT)
                .add(ModItems.POLISHED_GRANITE_CHEST_BOAT)
                .add(ModItems.DIORITE_CHEST_BOAT)
                .add(ModItems.POLISHED_DIORITE_CHEST_BOAT)
                .add(ModItems.ANDESITE_CHEST_BOAT)
                .add(ModItems.POLISHED_ANDESITE_CHEST_BOAT);
    }
}
