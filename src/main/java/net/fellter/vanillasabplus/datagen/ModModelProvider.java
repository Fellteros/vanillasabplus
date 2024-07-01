package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillasabplus.util.ModItems;
import net.fellter.vanillasabplus.util.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE).family(ModBlocks.STONE_FAMILY);
        blockStateModelGenerator.registerHangingSign(Blocks.STONE, ModBlocks.HANGING_STONE_SIGN, ModBlocks.HANGING_WALL_STONE_SIGN);

        blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.COBBLESTONE).family(ModBlocks.COBBLESTONE_FAMILY);
        blockStateModelGenerator.registerHangingSign(Blocks.COBBLESTONE, ModBlocks.HANGING_COBBLESTONE_SIGN, ModBlocks.HANGING_WALL_COBBLESTONE_SIGN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CRIMSON_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRIMSON_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.WARPED_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.STONE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.COBBLESTONE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBBLESTONE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.MOSSY_COBBLESTONE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSSY_COBBLESTONE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.SMOOTH_STONE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMOOTH_STONE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.STONE_BRICKS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_BRICKS_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.CRACKED_STONE_BRICKS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.MOSSY_STONE_BRICKS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.GRANITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRANITE_CHEST_BOAT, Models.GENERATED);

    }
}
