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

import static net.fellter.vanillasabplus.boat.item.ModBoatItem.registerBoatDispenserBehavior;


public class ModItems {

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

    public static final Item MOSSY_COBBLESTONE_BOAT = registerBoatItem("mossy_cobblestone_boat", BoatTypes.MOSSY_COBBLESTONE, false, new Item.Settings().maxCount(1));
    public static final Item MOSSY_COBBLESTONE_CHEST_BOAT = registerBoatItem("mossy_cobblestone_chest_boat", BoatTypes.MOSSY_COBBLESTONE, true, new Item.Settings().maxCount(1));



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
