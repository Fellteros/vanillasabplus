package net.fellter.vanillasabplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillasabplus.shared.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static net.fellter.vanillasabplus.model.ModBlockStateModelGenerator.registerSign;
import static net.fellter.vanillasabplus.shared.ModBlocks.*;

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

        registerSign(bsmg, Blocks.POLISHED_GRANITE, POLISHED_GRANITE_SIGN, WALL_POLISHED_GRANITE_SIGN);
        bsmg.registerHangingSign(Blocks.POLISHED_GRANITE, HANGING_POLISHED_GRANITE_SIGN, HANGING_WALL_POLISHED_GRANITE_SIGN);

        registerSign(bsmg, Blocks.DIORITE, DIORITE_SIGN, WALL_DIORITE_SIGN);
        bsmg.registerHangingSign(Blocks.DIORITE, HANGING_DIORITE_SIGN, HANGING_WALL_DIORITE_SIGN);

        registerSign(bsmg, Blocks.POLISHED_DIORITE, POLISHED_DIORITE_SIGN, WALL_POLISHED_DIORITE_SIGN);
        bsmg.registerHangingSign(Blocks.POLISHED_DIORITE, HANGING_POLISHED_DIORITE_SIGN, HANGING_WALL_POLISHED_DIORITE_SIGN);

        registerSign(bsmg, Blocks.ANDESITE, ANDESITE_SIGN, WALL_ANDESITE_SIGN);
        bsmg.registerHangingSign(Blocks.ANDESITE, HANGING_ANDESITE_SIGN, HANGING_WALL_ANDESITE_SIGN);

        registerSign(bsmg, Blocks.POLISHED_ANDESITE, POLISHED_ANDESITE_SIGN, WALL_POLISHED_ANDESITE_SIGN);
        bsmg.registerHangingSign(Blocks.POLISHED_ANDESITE, HANGING_POLISHED_ANDESITE_SIGN, HANGING_WALL_POLISHED_ANDESITE_SIGN);

        registerSign(bsmg, Blocks.DEEPSLATE, DEEPSLATE_SIGN, WALL_DEEPSLATE_SIGN);
        bsmg.registerHangingSign(Blocks.DEEPSLATE, HANGING_DEEPSLATE_SIGN, HANGING_WALL_DEEPSLATE_SIGN);

        registerSign(bsmg, Blocks.COBBLED_DEEPSLATE, COBBLED_DEEPSLATE_SIGN, WALL_COBBLED_DEEPSLATE_SIGN);
        bsmg.registerHangingSign(Blocks.COBBLED_DEEPSLATE, HANGING_COBBLED_DEEPSLATE_SIGN, HANGING_WALL_COBBLED_DEEPSLATE_SIGN);

        registerSign(bsmg, Blocks.CHISELED_DEEPSLATE, CHISELED_DEEPSLATE_SIGN, WALL_CHISELED_DEEPSLATE_SIGN);
        bsmg.registerHangingSign(Blocks.CHISELED_DEEPSLATE, HANGING_CHISELED_DEEPSLATE_SIGN, HANGING_WALL_CHISELED_DEEPSLATE_SIGN);

        registerSign(bsmg, Blocks.POLISHED_DEEPSLATE, POLISHED_DEEPSLATE_SIGN, WALL_POLISHED_DEEPSLATE_SIGN);
        bsmg.registerHangingSign(Blocks.POLISHED_DEEPSLATE, HANGING_POLISHED_DEEPSLATE_SIGN, HANGING_WALL_POLISHED_DEEPSLATE_SIGN);

        registerSign(bsmg, Blocks.DEEPSLATE_BRICKS, DEEPSLATE_BRICKS_SIGN, WALL_DEEPSLATE_BRICKS_SIGN);
        bsmg.registerHangingSign(Blocks.DEEPSLATE_BRICKS, HANGING_DEEPSLATE_BRICKS_SIGN, HANGING_WALL_DEEPSLATE_BRICKS_SIGN);

        registerSign(bsmg, Blocks.CRACKED_DEEPSLATE_BRICKS, CRACKED_DEEPSLATE_BRICKS_SIGN, WALL_CRACKED_DEEPSLATE_BRICKS_SIGN);
        bsmg.registerHangingSign(Blocks.CRACKED_DEEPSLATE_BRICKS, HANGING_CRACKED_DEEPSLATE_BRICKS_SIGN, HANGING_WALL_CRACKED_DEEPSLATE_BRICKS_SIGN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.VSABP_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VSABP_SIGN, Models.GENERATED);


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
        
        itemModelGenerator.register(ModItems.POLISHED_GRANITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_GRANITE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.DIORITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIORITE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.POLISHED_DIORITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_DIORITE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.ANDESITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANDESITE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.POLISHED_ANDESITE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_ANDESITE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.DEEPSLATE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.COBBLED_DEEPSLATE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBBLED_DEEPSLATE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.CHISELED_DEEPSLATE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISELED_DEEPSLATE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.POLISHED_DEEPSLATE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POLISHED_DEEPSLATE_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.DEEPSLATE_BRICKS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPSLATE_BRICKS_CHEST_BOAT, Models.GENERATED);
        
        itemModelGenerator.register(ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, Models.GENERATED);

    }
}
