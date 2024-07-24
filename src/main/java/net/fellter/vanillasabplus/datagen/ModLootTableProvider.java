package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fellter.vanillasabplus.util.ModBlocks;
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

        addDrop(ModBlocks.COBBLESTONE_SIGN);
        addDrop(ModBlocks.WALL_COBBLESTONE_SIGN);
        addDrop(ModBlocks.HANGING_COBBLESTONE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_COBBLESTONE_SIGN);

        addDrop(ModBlocks.MOSSY_COBBLESTONE_SIGN);
        addDrop(ModBlocks.WALL_MOSSY_COBBLESTONE_SIGN);
        addDrop(ModBlocks.HANGING_MOSSY_COBBLESTONE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_MOSSY_COBBLESTONE_SIGN);

        addDrop(ModBlocks.SMOOTH_STONE_SIGN);
        addDrop(ModBlocks.WALL_SMOOTH_STONE_SIGN);
        addDrop(ModBlocks.HANGING_SMOOTH_STONE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_SMOOTH_STONE_SIGN);

        addDrop(ModBlocks.STONE_BRICKS_SIGN);
        addDrop(ModBlocks.WALL_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_WALL_STONE_BRICKS_SIGN);

        addDrop(ModBlocks.CRACKED_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.WALL_CRACKED_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_CRACKED_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_WALL_CRACKED_STONE_BRICKS_SIGN);

        addDrop(ModBlocks.MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN);

        addDrop(ModBlocks.MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN);
        addDrop(ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN);

        addDrop(ModBlocks.GRANITE_SIGN);
        addDrop(ModBlocks.WALL_GRANITE_SIGN);
        addDrop(ModBlocks.HANGING_GRANITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_GRANITE_SIGN);

        addDrop(ModBlocks.POLISHED_GRANITE_SIGN);
        addDrop(ModBlocks.WALL_POLISHED_GRANITE_SIGN);
        addDrop(ModBlocks.HANGING_POLISHED_GRANITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_POLISHED_GRANITE_SIGN);

        addDrop(ModBlocks.DIORITE_SIGN);
        addDrop(ModBlocks.WALL_DIORITE_SIGN);
        addDrop(ModBlocks.HANGING_DIORITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_DIORITE_SIGN);

        addDrop(ModBlocks.POLISHED_DIORITE_SIGN);
        addDrop(ModBlocks.WALL_POLISHED_DIORITE_SIGN);
        addDrop(ModBlocks.HANGING_POLISHED_DIORITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_POLISHED_DIORITE_SIGN);

        addDrop(ModBlocks.ANDESITE_SIGN);
        addDrop(ModBlocks.WALL_ANDESITE_SIGN);
        addDrop(ModBlocks.HANGING_ANDESITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_ANDESITE_SIGN);

        addDrop(ModBlocks.POLISHED_ANDESITE_SIGN);
        addDrop(ModBlocks.WALL_POLISHED_ANDESITE_SIGN);
        addDrop(ModBlocks.HANGING_POLISHED_ANDESITE_SIGN);
        addDrop(ModBlocks.HANGING_WALL_POLISHED_ANDESITE_SIGN);
    }
}
