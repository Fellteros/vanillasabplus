package net.fellter.vanillasabplus.boat.registry;

import net.fellter.vanillasabplus.VanillaSABPlus;
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
