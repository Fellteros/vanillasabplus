package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillasabplus.util.ModItems;
import net.fellter.vanillasabplus.util.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static net.fellter.vanillasabplus.model.ModBlockStateModelGenerator.*;
import static net.fellter.vanillasabplus.util.ModBlocks.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator bsmg) {

        registerSign(bsmg, Blocks.STONE, STONE_SIGN, WALL_STONE_SIGN);
        bsmg.registerHangingSign(Blocks.STONE, HANGING_STONE_SIGN, HANGING_WALL_STONE_SIGN);

        registerSign(bsmg, Blocks.COBBLESTONE, COBBLESTONE_SIGN, WALL_COBBLESTONE_SIGN);
        bsmg.registerHangingSign(Blocks.COBBLESTONE, HANGING_COBBLESTONE_SIGN, HANGING_WALL_COBBLESTONE_SIGN);

        registerSign(bsmg, Blocks.MOSSY_COBBLESTONE, MOSSY_COBBLESTONE_SIGN, WALL_MOSSY_COBBLESTONE_SIGN);
        bsmg.registerHangingSign(Blocks.MOSSY_COBBLESTONE, HANGING_MOSSY_COBBLESTONE_SIGN, HANGING_WALL_MOSSY_COBBLESTONE_SIGN);

        registerSign(bsmg, Blocks.SMOOTH_STONE, SMOOTH_STONE_SIGN, WALL_SMOOTH_STONE_SIGN);
        bsmg.registerHangingSign(Blocks.SMOOTH_STONE, HANGING_SMOOTH_STONE_SIGN, HANGING_WALL_SMOOTH_STONE_SIGN);

        registerSign(bsmg, Blocks.STONE_BRICKS, STONE_BRICKS_SIGN, WALL_STONE_BRICKS_SIGN);
        bsmg.registerHangingSign(Blocks.STONE_BRICKS, HANGING_STONE_BRICKS_SIGN, HANGING_WALL_STONE_BRICKS_SIGN);

        registerSign(bsmg, Blocks.CRACKED_STONE_BRICKS, CRACKED_STONE_BRICKS_SIGN, WALL_CRACKED_STONE_BRICKS_SIGN);
        bsmg.registerHangingSign(Blocks.CRACKED_STONE_BRICKS, HANGING_CRACKED_STONE_BRICKS_SIGN, HANGING_WALL_CRACKED_STONE_BRICKS_SIGN);

        registerSign(bsmg, Blocks.MOSSY_STONE_BRICKS, MOSSY_STONE_BRICKS_SIGN, WALL_MOSSY_STONE_BRICKS_SIGN);
        bsmg.registerHangingSign(Blocks.MOSSY_STONE_BRICKS, HANGING_MOSSY_STONE_BRICKS_SIGN, HANGING_WALL_MOSSY_STONE_BRICKS_SIGN);

        registerSign(bsmg, Blocks.GRANITE, GRANITE_SIGN, WALL_GRANITE_SIGN);
        bsmg.registerHangingSign(Blocks.GRANITE, HANGING_GRANITE_SIGN, HANGING_WALL_GRANITE_SIGN);
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
