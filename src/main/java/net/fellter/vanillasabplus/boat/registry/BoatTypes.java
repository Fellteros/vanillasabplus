package net.fellter.vanillasabplus.boat.registry;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.client.ModBoatClient;
import net.fellter.vanillasabplus.util.ModItems;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BoatTypes {

    public static final Identifier CRIMSON_ID = createBoatIdentifier("crimson");
    public static final RegistryKey<ModBoatType> CRIMSON = registerBoatRegistryKey(CRIMSON_ID);
    
    public static final Identifier WARPED_ID = createBoatIdentifier("warped");
    public static final RegistryKey<ModBoatType> WARPED = registerBoatRegistryKey(WARPED_ID);
    
    public static final Identifier STONE_ID = createBoatIdentifier("stone");
    public static final RegistryKey<ModBoatType> STONE = registerBoatRegistryKey(STONE_ID);
    
    public static final Identifier COBBLESTONE_ID = createBoatIdentifier("cobblestone");
    public static final RegistryKey<ModBoatType> COBBLESTONE = registerBoatRegistryKey(COBBLESTONE_ID);
    
    public static final Identifier MOSSY_COBBLESTONE_ID = createBoatIdentifier("mossy_cobblestone");
    public static final RegistryKey<ModBoatType> MOSSY_COBBLESTONE = registerBoatRegistryKey(MOSSY_COBBLESTONE_ID);
    
    public static final Identifier SMOOTH_STONE_ID = createBoatIdentifier("smooth_stone");
    public static final RegistryKey<ModBoatType> SMOOTH_STONE = registerBoatRegistryKey(SMOOTH_STONE_ID);
    
    public static final Identifier STONE_BRICKS_ID = createBoatIdentifier("stone_bricks");
    public static final RegistryKey<ModBoatType> STONE_BRICKS = registerBoatRegistryKey(STONE_BRICKS_ID);
    
    public static final Identifier CRACKED_STONE_BRICKS_ID = createBoatIdentifier("cracked_stone_bricks");
    public static final RegistryKey<ModBoatType> CRACKED_STONE_BRICKS = registerBoatRegistryKey(CRACKED_STONE_BRICKS_ID);
    
    public static final Identifier MOSSY_STONE_BRICKS_ID = createBoatIdentifier("mossy_stone_bricks");
    public static final RegistryKey<ModBoatType> MOSSY_STONE_BRICKS = registerBoatRegistryKey(MOSSY_STONE_BRICKS_ID);
    
    public static final Identifier GRANITE_ID = createBoatIdentifier("granite");
    public static final RegistryKey<ModBoatType> GRANITE = registerBoatRegistryKey(GRANITE_ID);
    
    public static final Identifier POLISHED_GRANITE_ID = createBoatIdentifier("polished_granite");
    public static final RegistryKey<ModBoatType> POLISHED_GRANITE = registerBoatRegistryKey(POLISHED_GRANITE_ID);
    
    public static final Identifier DIORITE_ID = createBoatIdentifier("diorite");
    public static final RegistryKey<ModBoatType> DIORITE = registerBoatRegistryKey(DIORITE_ID);
    
    public static final Identifier POLISHED_DIORITE_ID = createBoatIdentifier("polished_diorite");
    public static final RegistryKey<ModBoatType> POLISHED_DIORITE = registerBoatRegistryKey(POLISHED_DIORITE_ID);
    
    public static final Identifier ANDESITE_ID = createBoatIdentifier("andesite");
    public static final RegistryKey<ModBoatType> ANDESITE = registerBoatRegistryKey(ANDESITE_ID);
    
    public static final Identifier POLISHED_ANDESITE_ID = createBoatIdentifier("polished_andesite");
    public static final RegistryKey<ModBoatType> POLISHED_ANDESITE = registerBoatRegistryKey(POLISHED_ANDESITE_ID);
    
    public static final Identifier DEEPSLATE_ID = createBoatIdentifier("deepslate");
    public static final RegistryKey<ModBoatType> DEEPSLATE = registerBoatRegistryKey(DEEPSLATE_ID);
    
    public static final Identifier COBBLED_DEEPSLATE_ID = createBoatIdentifier("cobbled_deepslate");
    public static final RegistryKey<ModBoatType> COBBLED_DEEPSLATE = registerBoatRegistryKey(COBBLED_DEEPSLATE_ID);
    
    public static final Identifier CHISELED_DEEPSLATE_ID = createBoatIdentifier("chiseled_deepslate");
    public static final RegistryKey<ModBoatType> CHISELED_DEEPSLATE = registerBoatRegistryKey(CHISELED_DEEPSLATE_ID);

    public static final Identifier POLISHED_DEEPSLATE_ID = createBoatIdentifier("polished_deepslate");
    public static final RegistryKey<ModBoatType> POLISHED_DEEPSLATE = registerBoatRegistryKey(POLISHED_DEEPSLATE_ID);

    public static final Identifier DEEPSLATE_BRICKS_ID = createBoatIdentifier("deepslate_bricks");
    public static final RegistryKey<ModBoatType> DEEPSLATE_BRICKS = registerBoatRegistryKey(DEEPSLATE_BRICKS_ID);

    public static final Identifier CRACKED_DEEPSLATE_BRICKS_ID = createBoatIdentifier("cracked_deepslate_bricks");
    public static final RegistryKey<ModBoatType> CRACKED_DEEPSLATE_BRICKS = registerBoatRegistryKey(CRACKED_DEEPSLATE_BRICKS_ID);


    public static void registerBoatTypes() {
        registerBoatType(CRIMSON_ID, ModItems.CRIMSON_BOAT, ModItems.CRIMSON_CHEST_BOAT, Blocks.CRIMSON_PLANKS.asItem());
        registerBoatType(WARPED_ID, ModItems.WARPED_BOAT, ModItems.WARPED_CHEST_BOAT, Blocks.WARPED_PLANKS.asItem());
        registerBoatType(STONE_ID, ModItems.STONE_BOAT, ModItems.STONE_CHEST_BOAT, Blocks.STONE.asItem());
        registerBoatType(COBBLESTONE_ID, ModItems.COBBLESTONE_BOAT, ModItems.COBBLESTONE_CHEST_BOAT, Blocks.COBBLESTONE.asItem());
        registerBoatType(MOSSY_COBBLESTONE_ID, ModItems.MOSSY_COBBLESTONE_BOAT, ModItems.MOSSY_COBBLESTONE_CHEST_BOAT, Blocks.MOSSY_COBBLESTONE.asItem());
        registerBoatType(SMOOTH_STONE_ID, ModItems.SMOOTH_STONE_BOAT, ModItems.SMOOTH_STONE_CHEST_BOAT, Blocks.SMOOTH_STONE.asItem());
        registerBoatType(STONE_BRICKS_ID, ModItems.STONE_BRICKS_BOAT, ModItems.STONE_BRICKS_CHEST_BOAT, Blocks.STONE_BRICKS.asItem());
        registerBoatType(CRACKED_STONE_BRICKS_ID, ModItems.CRACKED_STONE_BRICKS_BOAT, ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT, Blocks.CRACKED_STONE_BRICKS.asItem());
        registerBoatType(MOSSY_STONE_BRICKS_ID, ModItems.MOSSY_STONE_BRICKS_BOAT, ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT, Blocks.MOSSY_STONE_BRICKS.asItem());
        registerBoatType(GRANITE_ID, ModItems.GRANITE_BOAT, ModItems.GRANITE_CHEST_BOAT, Blocks.GRANITE.asItem());
        registerBoatType(POLISHED_GRANITE_ID, ModItems.POLISHED_GRANITE_BOAT, ModItems.POLISHED_GRANITE_CHEST_BOAT, Blocks.POLISHED_GRANITE.asItem());
        registerBoatType(DIORITE_ID, ModItems.DIORITE_BOAT, ModItems.DIORITE_CHEST_BOAT, Blocks.DIORITE.asItem());
        registerBoatType(POLISHED_DIORITE_ID, ModItems.POLISHED_DIORITE_BOAT, ModItems.POLISHED_DIORITE_CHEST_BOAT, Blocks.POLISHED_DIORITE.asItem());
        registerBoatType(ANDESITE_ID, ModItems.ANDESITE_BOAT, ModItems.ANDESITE_CHEST_BOAT, Blocks.ANDESITE.asItem());
        registerBoatType(POLISHED_ANDESITE_ID, ModItems.POLISHED_ANDESITE_BOAT, ModItems.POLISHED_ANDESITE_CHEST_BOAT, Blocks.POLISHED_ANDESITE.asItem());
        registerBoatType(DEEPSLATE_ID, ModItems.DEEPSLATE_BOAT, ModItems.DEEPSLATE_CHEST_BOAT, Blocks.DEEPSLATE.asItem());
        registerBoatType(COBBLED_DEEPSLATE_ID, ModItems.COBBLED_DEEPSLATE_BOAT, ModItems.COBBLED_DEEPSLATE_CHEST_BOAT, Blocks.COBBLED_DEEPSLATE.asItem());
        registerBoatType(CHISELED_DEEPSLATE_ID, ModItems.CHISELED_DEEPSLATE_BOAT, ModItems.CHISELED_DEEPSLATE_CHEST_BOAT, Blocks.CHISELED_DEEPSLATE.asItem());
        registerBoatType(POLISHED_DEEPSLATE_ID, ModItems.POLISHED_DEEPSLATE_BOAT, ModItems.POLISHED_DEEPSLATE_CHEST_BOAT, Blocks.POLISHED_DEEPSLATE.asItem());
        registerBoatType(DEEPSLATE_BRICKS_ID, ModItems.DEEPSLATE_BRICKS_BOAT, ModItems.DEEPSLATE_BRICKS_CHEST_BOAT, Blocks.DEEPSLATE_BRICKS.asItem());
        registerBoatType(CRACKED_DEEPSLATE_BRICKS_ID, ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT, ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, Blocks.CRACKED_DEEPSLATE_BRICKS.asItem());
    }


    public static void registerModModelLayers() {
        ModBoatClient.registerModelLayers(BoatTypes.CRIMSON_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.WARPED_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.STONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.COBBLESTONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.MOSSY_COBBLESTONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.SMOOTH_STONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.CRACKED_STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.MOSSY_STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.GRANITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.POLISHED_GRANITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.DIORITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.POLISHED_DIORITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.ANDESITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.POLISHED_ANDESITE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.DEEPSLATE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.COBBLED_DEEPSLATE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.CHISELED_DEEPSLATE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.POLISHED_DEEPSLATE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.DEEPSLATE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.CRACKED_DEEPSLATE_BRICKS_ID, false);
    }



    private static RegistryKey<ModBoatType> registerBoatRegistryKey(Identifier identifier) {
        return ModBoatTypeRegistry.createKey(identifier);
    }

    private static Identifier createBoatIdentifier(String name) {
        return Identifier.of(VanillaSABPlus.MOD_ID, name);
    }

    private static void registerBoatType(Identifier identifier, Item boatItem, Item chestBoatItem, Item baseBlock) {
        ModBoatType modBoatType = new ModBoatType.Builder().item(boatItem).chestItem(chestBoatItem).block(baseBlock).build();
        Registry.register(ModBoatTypeRegistry.INSTANCE, identifier, modBoatType);
    }


}
