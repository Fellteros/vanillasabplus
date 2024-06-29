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
                .add(ModItems.MOSSY_COBBLESTONE_BOAT);


        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.CRIMSON_CHEST_BOAT)
                .add(ModItems.WARPED_CHEST_BOAT)
                .add(ModItems.STONE_CHEST_BOAT)
                .add(ModItems.COBBLESTONE_CHEST_BOAT)
                .add(ModItems.MOSSY_COBBLESTONE_CHEST_BOAT);
    }
}