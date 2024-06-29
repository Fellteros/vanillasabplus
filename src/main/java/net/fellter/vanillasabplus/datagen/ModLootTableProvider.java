package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillasabplus.util.ModBlocks;
import net.fellter.vanillasabplus.util.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.STONE_SIGN);
        addDrop(ModBlocks.WALL_STONE_SIGN);
        addDrop(ModBlocks.HANGING_STONE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_STONE_SIGN);
    }
}
