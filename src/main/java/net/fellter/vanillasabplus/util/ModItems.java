package net.fellter.vanillasabplus.util;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.item.ModBoatItem;
import net.fellter.vanillasabplus.boat.registry.BoatTypes;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import static net.fellter.vanillasabplus.boat.item.ModBoatItem.registerBoatDispenserBehavior;


public class ModItems {

    public static final Item VSABP_SIGN = registerItem("vsabp_sign", new Item(new Item.Settings().maxCount(1)));
    public static final Item VSABP_BOAT = registerItem("vsabp_boat", new Item(new Item.Settings().maxCount(1)));

    public static final Item CRIMSON_BOAT = registerBoatItem("crimson_boat", BoatTypes.CRIMSON, false, new Item.Settings().maxCount(1));
    public static final Item CRIMSON_CHEST_BOAT = registerBoatItem("crimson_chest_boat", BoatTypes.CRIMSON, true, new Item.Settings().maxCount(1));
    
    public static final Item WARPED_BOAT = registerBoatItem("warped_boat", BoatTypes.WARPED, false, new Item.Settings().maxCount(1));
    public static final Item WARPED_CHEST_BOAT = registerBoatItem("warped_chest_boat", BoatTypes.WARPED, true, new Item.Settings().maxCount(1));
    
    public static final Item STONE_BOAT = registerBoatItem("stone_boat", BoatTypes.STONE, false, new Item.Settings().maxCount(1));
    public static final Item STONE_CHEST_BOAT = registerBoatItem("stone_chest_boat", BoatTypes.STONE, true, new Item.Settings().maxCount(1));
    public static final Item STONE_SIGN = registerItem("stone_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STONE_SIGN, ModBlocks.WALL_STONE_SIGN));
    public static final Item HANGING_STONE_SIGN = registerItem("stone_hanging_sign", new HangingSignItem(ModBlocks.HANGING_STONE_SIGN, ModBlocks.HANGING_WALL_STONE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item COBBLESTONE_BOAT = registerBoatItem("cobblestone_boat", BoatTypes.COBBLESTONE, false, new Item.Settings().maxCount(1));
    public static final Item COBBLESTONE_CHEST_BOAT = registerBoatItem("cobblestone_chest_boat", BoatTypes.COBBLESTONE, true, new Item.Settings().maxCount(1));
    public static final Item COBBLESTONE_SIGN = registerItem("cobblestone_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.COBBLESTONE_SIGN, ModBlocks.WALL_COBBLESTONE_SIGN));
    public static final Item COBBLESTONE_HANGING_SIGN = registerItem("cobblestone_hanging_sign", new HangingSignItem(ModBlocks.HANGING_COBBLESTONE_SIGN, ModBlocks.HANGING_WALL_COBBLESTONE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item MOSSY_COBBLESTONE_BOAT = registerBoatItem("mossy_cobblestone_boat", BoatTypes.MOSSY_COBBLESTONE, false, new Item.Settings().maxCount(1));
    public static final Item MOSSY_COBBLESTONE_CHEST_BOAT = registerBoatItem("mossy_cobblestone_chest_boat", BoatTypes.MOSSY_COBBLESTONE, true, new Item.Settings().maxCount(1));
    public static final Item MOSSY_COBBLESTONE_SIGN = registerItem("mossy_cobblestone_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.MOSSY_COBBLESTONE_SIGN, ModBlocks.WALL_MOSSY_COBBLESTONE_SIGN));
    public static final Item MOSSY_COBBLESTONE_HANGING_SIGN = registerItem("mossy_cobblestone_hanging_sign", new HangingSignItem(ModBlocks.HANGING_MOSSY_COBBLESTONE_SIGN, ModBlocks.HANGING_WALL_MOSSY_COBBLESTONE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item SMOOTH_STONE_BOAT = registerBoatItem("smooth_stone_boat", BoatTypes.SMOOTH_STONE, false, new Item.Settings().maxCount(1));
    public static final Item SMOOTH_STONE_CHEST_BOAT = registerBoatItem("smooth_stone_chest_boat", BoatTypes.SMOOTH_STONE, true, new Item.Settings().maxCount(1));
    public static final Item SMOOTH_STONE_SIGN = registerItem("smooth_stone_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.SMOOTH_STONE_SIGN, ModBlocks.WALL_SMOOTH_STONE_SIGN));
    public static final Item SMOOTH_STONE_HANGING_SIGN = registerItem("smooth_stone_hanging_sign", new HangingSignItem(ModBlocks.HANGING_SMOOTH_STONE_SIGN, ModBlocks.HANGING_WALL_SMOOTH_STONE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item STONE_BRICKS_BOAT = registerBoatItem("stone_bricks_boat", BoatTypes.STONE_BRICKS, false, new Item.Settings().maxCount(1));
    public static final Item STONE_BRICKS_CHEST_BOAT = registerBoatItem("stone_bricks_chest_boat", BoatTypes.STONE_BRICKS, true, new Item.Settings().maxCount(1));
    public static final Item STONE_BRICKS_SIGN = registerItem("stone_bricks_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STONE_BRICKS_SIGN, ModBlocks.WALL_STONE_BRICKS_SIGN));
    public static final Item STONE_BRICKS_HANGING_SIGN = registerItem("stone_bricks_hanging_sign", new HangingSignItem(ModBlocks.HANGING_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_STONE_BRICKS_SIGN, new Item.Settings().maxCount(16)));

    public static final Item CRACKED_STONE_BRICKS_BOAT = registerBoatItem("cracked_stone_bricks_boat", BoatTypes.CRACKED_STONE_BRICKS, false, new Item.Settings().maxCount(1));
    public static final Item CRACKED_STONE_BRICKS_CHEST_BOAT = registerBoatItem("cracked_stone_bricks_chest_boat", BoatTypes.CRACKED_STONE_BRICKS, true, new Item.Settings().maxCount(1));
    public static final Item CRACKED_STONE_BRICKS_SIGN = registerItem("cracked_stone_bricks_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.CRACKED_STONE_BRICKS_SIGN, ModBlocks.WALL_CRACKED_STONE_BRICKS_SIGN));
    public static final Item CRACKED_STONE_BRICKS_HANGING_SIGN = registerItem("cracked_stone_bricks_hanging_sign", new HangingSignItem(ModBlocks.HANGING_CRACKED_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_CRACKED_STONE_BRICKS_SIGN, new Item.Settings().maxCount(16)));

    public static final Item MOSSY_STONE_BRICKS_BOAT = registerBoatItem("mossy_stone_bricks_boat", BoatTypes.MOSSY_STONE_BRICKS, false, new Item.Settings().maxCount(1));
    public static final Item MOSSY_STONE_BRICKS_CHEST_BOAT = registerBoatItem("mossy_stone_bricks_chest_boat", BoatTypes.MOSSY_STONE_BRICKS, true, new Item.Settings().maxCount(1));
    public static final Item MOSSY_STONE_BRICKS_SIGN = registerItem("mossy_stone_bricks_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.MOSSY_STONE_BRICKS_SIGN, ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN));
    public static final Item MOSSY_STONE_BRICKS_HANGING_SIGN = registerItem("mossy_stone_bricks_hanging_sign", new HangingSignItem(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN, new Item.Settings().maxCount(16)));

    public static final Item GRANITE_BOAT = registerBoatItem("granite_boat", BoatTypes.GRANITE, false, new Item.Settings().maxCount(1));
    public static final Item GRANITE_CHEST_BOAT = registerBoatItem("granite_chest_boat", BoatTypes.GRANITE, true, new Item.Settings().maxCount(1));
    public static final Item GRANITE_SIGN = registerItem("granite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.GRANITE_SIGN, ModBlocks.WALL_GRANITE_SIGN));
    public static final Item GRANITE_HANGING_SIGN = registerItem("granite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_GRANITE_SIGN, ModBlocks.HANGING_WALL_GRANITE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item POLISHED_GRANITE_BOAT = registerBoatItem("polished_granite_boat", BoatTypes.POLISHED_GRANITE, false, new Item.Settings().maxCount(1));
    public static final Item POLISHED_GRANITE_CHEST_BOAT = registerBoatItem("polished_granite_chest_boat", BoatTypes.POLISHED_GRANITE, true, new Item.Settings().maxCount(1));
    public static final Item POLISHED_GRANITE_SIGN = registerItem("polished_granite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.POLISHED_GRANITE_SIGN, ModBlocks.WALL_POLISHED_GRANITE_SIGN));
    public static final Item POLISHED_GRANITE_HANGING_SIGN = registerItem("polished_granite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_POLISHED_GRANITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_GRANITE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item DIORITE_BOAT = registerBoatItem("diorite_boat", BoatTypes.DIORITE, false, new Item.Settings().maxCount(1));
    public static final Item DIORITE_CHEST_BOAT = registerBoatItem("diorite_chest_boat", BoatTypes.DIORITE, true, new Item.Settings().maxCount(1));
    public static final Item DIORITE_SIGN = registerItem("diorite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.DIORITE_SIGN, ModBlocks.WALL_DIORITE_SIGN));
    public static final Item DIORITE_HANGING_SIGN = registerItem("diorite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_DIORITE_SIGN, ModBlocks.HANGING_WALL_DIORITE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item POLISHED_DIORITE_BOAT = registerBoatItem("polished_diorite_boat", BoatTypes.POLISHED_DIORITE, false, new Item.Settings().maxCount(1));
    public static final Item POLISHED_DIORITE_CHEST_BOAT = registerBoatItem("polished_diorite_chest_boat", BoatTypes.POLISHED_DIORITE, true, new Item.Settings().maxCount(1));
    public static final Item POLISHED_DIORITE_SIGN = registerItem("polished_diorite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.POLISHED_DIORITE_SIGN, ModBlocks.WALL_POLISHED_DIORITE_SIGN));
    public static final Item POLISHED_DIORITE_HANGING_SIGN = registerItem("polished_diorite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_POLISHED_DIORITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_DIORITE_SIGN,
            new Item.Settings().maxCount(16)));
    
    public static final Item ANDESITE_BOAT = registerBoatItem("andesite_boat", BoatTypes.ANDESITE, false, new Item.Settings().maxCount(1));
    public static final Item ANDESITE_CHEST_BOAT = registerBoatItem("andesite_chest_boat", BoatTypes.ANDESITE, true, new Item.Settings().maxCount(1));
    public static final Item ANDESITE_SIGN = registerItem("andesite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.ANDESITE_SIGN, ModBlocks.WALL_ANDESITE_SIGN));
    public static final Item ANDESITE_HANGING_SIGN = registerItem("andesite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_ANDESITE_SIGN, ModBlocks.HANGING_WALL_ANDESITE_SIGN, new Item.Settings().maxCount(16)));

    public static final Item POLISHED_ANDESITE_BOAT = registerBoatItem("polished_andesite_boat", BoatTypes.POLISHED_ANDESITE, false, new Item.Settings().maxCount(1));
    public static final Item POLISHED_ANDESITE_CHEST_BOAT = registerBoatItem("polished_andesite_chest_boat", BoatTypes.POLISHED_ANDESITE, true, new Item.Settings().maxCount(1));
    public static final Item POLISHED_ANDESITE_SIGN = registerItem("polished_andesite_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.POLISHED_ANDESITE_SIGN, ModBlocks.WALL_POLISHED_ANDESITE_SIGN));
    public static final Item POLISHED_ANDESITE_HANGING_SIGN = registerItem("polished_andesite_hanging_sign", new HangingSignItem(ModBlocks.HANGING_POLISHED_ANDESITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_ANDESITE_SIGN, new Item.Settings().maxCount(16)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name), item);
    }

    private static Item registerBoatItem(String name, RegistryKey<ModBoatType> boatType, boolean chest, Item.Settings settings) {
        Item item = new ModBoatItem(chest, boatType, settings);
        Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name), item);
        registerBoatDispenserBehavior(item, boatType, chest);
        return item;
    }

    public static void registerVSABPItems() {
        VanillaSABPlus.LOGGER.info("Registering Mod Items for " + VanillaSABPlus.MOD_ID + ".");
    }
}
