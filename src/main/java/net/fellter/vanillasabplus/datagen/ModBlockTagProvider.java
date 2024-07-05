package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillasabplus.util.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STONE_SIGN)
                .add(ModBlocks.WALL_STONE_SIGN)
                .add(ModBlocks.HANGING_STONE_SIGN)
                .add(ModBlocks.HANGING_WALL_STONE_SIGN)
                .add(ModBlocks.COBBLESTONE_SIGN)
                .add(ModBlocks.WALL_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_WALL_COBBLESTONE_SIGN)
                .add(ModBlocks.MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.WALL_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_WALL_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.SMOOTH_STONE_SIGN)
                .add(ModBlocks.WALL_SMOOTH_STONE_SIGN)
                .add(ModBlocks.HANGING_SMOOTH_STONE_SIGN)
                .add(ModBlocks.HANGING_WALL_SMOOTH_STONE_SIGN)
                .add(ModBlocks.STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_STONE_BRICKS_SIGN)
                .add(ModBlocks.CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.GRANITE_SIGN)
                .add(ModBlocks.WALL_GRANITE_SIGN)
                .add(ModBlocks.HANGING_GRANITE_SIGN)
                .add(ModBlocks.HANGING_WALL_GRANITE_SIGN);

        getOrCreateTagBuilder(BlockTags.SIGNS)
                .add(ModBlocks.STONE_SIGN)
                .add(ModBlocks.COBBLESTONE_SIGN)
                .add(ModBlocks.MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.SMOOTH_STONE_SIGN)
                .add(ModBlocks.STONE_BRICKS_SIGN)
                .add(ModBlocks.CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.GRANITE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.WALL_STONE_SIGN)
                .add(ModBlocks.WALL_COBBLESTONE_SIGN)
                .add(ModBlocks.WALL_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.WALL_SMOOTH_STONE_SIGN)
                .add(ModBlocks.WALL_STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.WALL_GRANITE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.HANGING_WALL_STONE_SIGN)
                .add(ModBlocks.HANGING_WALL_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_WALL_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_WALL_SMOOTH_STONE_SIGN)
                .add(ModBlocks.HANGING_WALL_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_WALL_GRANITE_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.HANGING_STONE_SIGN)
                .add(ModBlocks.HANGING_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_MOSSY_COBBLESTONE_SIGN)
                .add(ModBlocks.HANGING_SMOOTH_STONE_SIGN)
                .add(ModBlocks.HANGING_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_CRACKED_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN)
                .add(ModBlocks.HANGING_GRANITE_SIGN);
    }
}
