package net.fellter.vanillasabplus.shared;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.ModEntityTypes;
import net.minecraft.item.BoatItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;


public class ModItems {

    public static final Item VSABP_SIGN = registerItem("vsabp_sign", (settings -> new Item(settings.maxCount(1))));
    public static final Item VSABP_BOAT = registerItem("vsabp_boat", (settings -> new Item(settings.maxCount(1))));

    public static final Item CRIMSON_BOAT = registerItem("crimson_boat", (settings -> new BoatItem(ModEntityTypes.CRIMSON_BOAT, settings.maxCount(1))));
    public static final Item CRIMSON_CHEST_BOAT = registerItem("crimson_chest_boat", (settings -> new BoatItem(ModEntityTypes.CRIMSON_CHEST_BOAT, settings.maxCount(1))));
    
    public static final Item WARPED_BOAT = registerItem("warped_boat", (settings -> new BoatItem(ModEntityTypes.WARPED_BOAT, settings.maxCount(1))));
    public static final Item WARPED_CHEST_BOAT = registerItem("warped_chest_boat", (settings -> new BoatItem(ModEntityTypes.WARPED_CHEST_BOAT, settings.maxCount(1))));
    
    public static final Item STONE_BOAT = registerItem("stone_boat", settings -> new BoatItem(ModEntityTypes.STONE_BOAT, settings.maxCount(1)));
    public static final Item STONE_CHEST_BOAT = registerItem("stone_chest_boat", settings -> new BoatItem(ModEntityTypes.STONE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item STONE_SIGN = registerItem("stone_sign", settings ->  new SignItem(ModBlocks.STONE_SIGN, ModBlocks.WALL_STONE_SIGN, settings.maxCount(16)));
    public static final Item HANGING_STONE_SIGN = registerItem("stone_hanging_sign", settings ->  new HangingSignItem(ModBlocks.HANGING_STONE_SIGN, ModBlocks.HANGING_WALL_STONE_SIGN, settings.maxCount(16)));

    public static final Item COBBLESTONE_BOAT = registerItem("cobblestone_boat", settings -> new BoatItem(ModEntityTypes.COBBLESTONE_BOAT, settings.maxCount(1)));
    public static final Item COBBLESTONE_CHEST_BOAT = registerItem("cobblestone_chest_boat", settings -> new BoatItem(ModEntityTypes.COBBLESTONE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item COBBLESTONE_SIGN = registerItem("cobblestone_sign", settings ->  new SignItem(ModBlocks.COBBLESTONE_SIGN, ModBlocks.WALL_COBBLESTONE_SIGN, settings.maxCount(16)));
    public static final Item COBBLESTONE_HANGING_SIGN = registerItem("cobblestone_hanging_sign", settings ->  new HangingSignItem(ModBlocks.HANGING_COBBLESTONE_SIGN, ModBlocks.HANGING_WALL_COBBLESTONE_SIGN, settings.maxCount(16)));

    public static final Item MOSSY_COBBLESTONE_BOAT = registerItem("mossy_cobblestone_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_COBBLESTONE_BOAT, settings.maxCount(1)));
    public static final Item MOSSY_COBBLESTONE_CHEST_BOAT = registerItem("mossy_cobblestone_chest_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_COBBLESTONE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item MOSSY_COBBLESTONE_SIGN = registerItem("mossy_cobblestone_sign", settings ->  new SignItem(ModBlocks.MOSSY_COBBLESTONE_SIGN, ModBlocks.WALL_MOSSY_COBBLESTONE_SIGN, settings.maxCount(16)));
    public static final Item MOSSY_COBBLESTONE_HANGING_SIGN = registerItem("mossy_cobblestone_hanging_sign", settings ->  new HangingSignItem(ModBlocks.HANGING_MOSSY_COBBLESTONE_SIGN, ModBlocks.HANGING_WALL_MOSSY_COBBLESTONE_SIGN, settings.maxCount(16)));

    public static final Item SMOOTH_STONE_BOAT = registerItem("smooth_stone_boat", settings -> new BoatItem(ModEntityTypes.SMOOTH_STONE_BOAT, settings.maxCount(1)));
    public static final Item SMOOTH_STONE_CHEST_BOAT = registerItem("smooth_stone_chest_boat", settings -> new BoatItem(ModEntityTypes.SMOOTH_STONE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item SMOOTH_STONE_SIGN = registerItem("smooth_stone_sign", settings ->  new SignItem(ModBlocks.SMOOTH_STONE_SIGN, ModBlocks.WALL_SMOOTH_STONE_SIGN, settings.maxCount(16)));
    public static final Item SMOOTH_STONE_HANGING_SIGN = registerItem("smooth_stone_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_SMOOTH_STONE_SIGN, ModBlocks.HANGING_WALL_SMOOTH_STONE_SIGN, settings.maxCount(16)));

    public static final Item STONE_BRICKS_BOAT = registerItem("stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.STONE_BRICKS_BOAT, settings.maxCount(1)));
    public static final Item STONE_BRICKS_CHEST_BOAT = registerItem("stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.STONE_BRICKS_CHEST_BOAT, settings.maxCount(1)));
    public static final Item STONE_BRICKS_SIGN = registerItem("stone_bricks_sign", settings ->  new SignItem(ModBlocks.STONE_BRICKS_SIGN, ModBlocks.WALL_STONE_BRICKS_SIGN, settings.maxCount(16)));
    public static final Item STONE_BRICKS_HANGING_SIGN = registerItem("stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_STONE_BRICKS_SIGN, settings.maxCount(16)));

    public static final Item CRACKED_STONE_BRICKS_BOAT = registerItem("cracked_stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_STONE_BRICKS_BOAT, settings.maxCount(1)));
    public static final Item CRACKED_STONE_BRICKS_CHEST_BOAT = registerItem("cracked_stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_STONE_BRICKS_CHEST_BOAT, settings.maxCount(1)));
    public static final Item CRACKED_STONE_BRICKS_SIGN = registerItem("cracked_stone_bricks_sign", settings -> new SignItem(ModBlocks.CRACKED_STONE_BRICKS_SIGN, ModBlocks.WALL_CRACKED_STONE_BRICKS_SIGN, settings.maxCount(16)));
    public static final Item CRACKED_STONE_BRICKS_HANGING_SIGN = registerItem("cracked_stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_CRACKED_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_CRACKED_STONE_BRICKS_SIGN, settings.maxCount(16)));

    public static final Item MOSSY_STONE_BRICKS_BOAT = registerItem("mossy_stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_STONE_BRICKS_BOAT, settings.maxCount(1)));
    public static final Item MOSSY_STONE_BRICKS_CHEST_BOAT = registerItem("mossy_stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_STONE_BRICKS_CHEST_BOAT, settings.maxCount(1)));
    public static final Item MOSSY_STONE_BRICKS_SIGN = registerItem("mossy_stone_bricks_sign", settings -> new SignItem(ModBlocks.MOSSY_STONE_BRICKS_SIGN, ModBlocks.WALL_MOSSY_STONE_BRICKS_SIGN, settings.maxCount(16)));
    public static final Item MOSSY_STONE_BRICKS_HANGING_SIGN = registerItem("mossy_stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_MOSSY_STONE_BRICKS_SIGN, ModBlocks.HANGING_WALL_MOSSY_STONE_BRICKS_SIGN, settings.maxCount(16)));

    public static final Item GRANITE_BOAT = registerItem("granite_boat", settings -> new BoatItem(ModEntityTypes.GRANITE_BOAT, settings.maxCount(1)));
    public static final Item GRANITE_CHEST_BOAT = registerItem("granite_chest_boat", settings -> new BoatItem(ModEntityTypes.GRANITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item GRANITE_SIGN = registerItem("granite_sign", settings -> new SignItem(ModBlocks.GRANITE_SIGN, ModBlocks.WALL_GRANITE_SIGN, settings.maxCount(16)));
    public static final Item GRANITE_HANGING_SIGN = registerItem("granite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_GRANITE_SIGN, ModBlocks.HANGING_WALL_GRANITE_SIGN, settings.maxCount(16)));

    public static final Item POLISHED_GRANITE_BOAT = registerItem("polished_granite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_GRANITE_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_GRANITE_CHEST_BOAT = registerItem("polished_granite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_GRANITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_GRANITE_SIGN = registerItem("polished_granite_sign", settings -> new SignItem(ModBlocks.POLISHED_GRANITE_SIGN, ModBlocks.WALL_POLISHED_GRANITE_SIGN, settings.maxCount(16)));
    public static final Item POLISHED_GRANITE_HANGING_SIGN = registerItem("polished_granite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_POLISHED_GRANITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_GRANITE_SIGN, settings.maxCount(16)));

    public static final Item DIORITE_BOAT = registerItem("diorite_boat", settings -> new BoatItem(ModEntityTypes.DIORITE_BOAT, settings.maxCount(1)));
    public static final Item DIORITE_CHEST_BOAT = registerItem("diorite_chest_boat", settings -> new BoatItem(ModEntityTypes.DIORITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item DIORITE_SIGN = registerItem("diorite_sign", settings -> new SignItem(ModBlocks.DIORITE_SIGN, ModBlocks.WALL_DIORITE_SIGN, settings.maxCount(16)));
    public static final Item DIORITE_HANGING_SIGN = registerItem("diorite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_DIORITE_SIGN, ModBlocks.HANGING_WALL_DIORITE_SIGN, settings.maxCount(16)));

    public static final Item POLISHED_DIORITE_BOAT = registerItem("polished_diorite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DIORITE_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_DIORITE_CHEST_BOAT = registerItem("polished_diorite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DIORITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_DIORITE_SIGN = registerItem("polished_diorite_sign", settings -> new SignItem(ModBlocks.POLISHED_DIORITE_SIGN, ModBlocks.WALL_POLISHED_DIORITE_SIGN, settings.maxCount(16)));
    public static final Item POLISHED_DIORITE_HANGING_SIGN = registerItem("polished_diorite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_POLISHED_DIORITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_DIORITE_SIGN,
            settings.maxCount(16)));
    
    public static final Item ANDESITE_BOAT = registerItem("andesite_boat", settings -> new BoatItem(ModEntityTypes.ANDESITE_BOAT, settings.maxCount(1)));
    public static final Item ANDESITE_CHEST_BOAT = registerItem("andesite_chest_boat", settings -> new BoatItem(ModEntityTypes.ANDESITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item ANDESITE_SIGN = registerItem("andesite_sign", settings -> new SignItem(ModBlocks.ANDESITE_SIGN, ModBlocks.WALL_ANDESITE_SIGN, settings.maxCount(16)));
    public static final Item ANDESITE_HANGING_SIGN = registerItem("andesite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_ANDESITE_SIGN, ModBlocks.HANGING_WALL_ANDESITE_SIGN, settings.maxCount(16)));

    public static final Item POLISHED_ANDESITE_BOAT = registerItem("polished_andesite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_ANDESITE_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_ANDESITE_CHEST_BOAT = registerItem("polished_andesite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_ANDESITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_ANDESITE_SIGN = registerItem("polished_andesite_sign", settings -> new SignItem(ModBlocks.POLISHED_ANDESITE_SIGN, ModBlocks.WALL_POLISHED_ANDESITE_SIGN, settings.maxCount(16)));
    public static final Item POLISHED_ANDESITE_HANGING_SIGN = registerItem("polished_andesite_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_POLISHED_ANDESITE_SIGN, ModBlocks.HANGING_WALL_POLISHED_ANDESITE_SIGN, settings.maxCount(16)));

    public static final Item DEEPSLATE_BOAT = registerItem("deepslate_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BOAT, settings.maxCount(1)));
    public static final Item DEEPSLATE_CHEST_BOAT = registerItem("deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.DIORITE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item DEEPSLATE_SIGN = registerItem("deepslate_sign", settings -> new SignItem(ModBlocks.DEEPSLATE_SIGN, ModBlocks.WALL_DEEPSLATE_SIGN, settings.maxCount(16)));
    public static final Item DEEPSLATE_HANGING_SIGN = registerItem("deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_DEEPSLATE_SIGN,
            ModBlocks.HANGING_WALL_DEEPSLATE_SIGN, settings.maxCount(16)));

    public static final Item COBBLED_DEEPSLATE_BOAT = registerItem("cobbled_deepslate_boat", settings -> new BoatItem(ModEntityTypes.COBBLED_DEEPSLATE_BOAT, settings.maxCount(1)));
    public static final Item COBBLED_DEEPSLATE_CHEST_BOAT = registerItem("cobbled_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.COBBLED_DEEPSLATE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item COBBLED_DEEPSLATE_SIGN = registerItem("cobbled_deepslate_sign", settings -> new SignItem(ModBlocks.COBBLED_DEEPSLATE_SIGN, ModBlocks.WALL_COBBLED_DEEPSLATE_SIGN, settings.maxCount(16)));
    public static final Item COBBLED_DEEPSLATE_HANGING_SIGN = registerItem("cobbled_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_COBBLED_DEEPSLATE_SIGN,
            ModBlocks.HANGING_WALL_COBBLED_DEEPSLATE_SIGN, settings.maxCount(16)));

    public static final Item CHISELED_DEEPSLATE_BOAT = registerItem("chiseled_deepslate_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_DEEPSLATE_BOAT, settings.maxCount(1)));
    public static final Item CHISELED_DEEPSLATE_CHEST_BOAT = registerItem("chiseled_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_DEEPSLATE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item CHISELED_DEEPSLATE_SIGN = registerItem("chiseled_deepslate_sign", settings -> new SignItem(ModBlocks.CHISELED_DEEPSLATE_SIGN, ModBlocks.WALL_CHISELED_DEEPSLATE_SIGN, settings.maxCount(16)));
    public static final Item CHISELED_DEEPSLATE_HANGING_SIGN = registerItem("chiseled_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_CHISELED_DEEPSLATE_SIGN,
            ModBlocks.HANGING_WALL_CHISELED_DEEPSLATE_SIGN, settings.maxCount(16)));


    public static final Item POLISHED_DEEPSLATE_BOAT = registerItem("polished_deepslate_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DEEPSLATE_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_DEEPSLATE_CHEST_BOAT = registerItem("polished_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DEEPSLATE_CHEST_BOAT, settings.maxCount(1)));
    public static final Item POLISHED_DEEPSLATE_SIGN = registerItem("polished_deepslate_sign", settings -> new SignItem(ModBlocks.POLISHED_DEEPSLATE_SIGN, ModBlocks.WALL_POLISHED_DEEPSLATE_SIGN, settings.maxCount(16)));
    public static final Item POLISHED_DEEPSLATE_HANGING_SIGN = registerItem("polished_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_POLISHED_DEEPSLATE_SIGN,
            ModBlocks.HANGING_WALL_POLISHED_DEEPSLATE_SIGN, settings.maxCount(16)));

    public static final Item DEEPSLATE_BRICKS_BOAT = registerItem("deepslate_bricks_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BRICKS_BOAT, settings.maxCount(1)));
    public static final Item DEEPSLATE_BRICKS_CHEST_BOAT = registerItem("deepslate_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BRICKS_CHEST_BOAT, settings.maxCount(1)));
    public static final Item DEEPSLATE_BRICKS_SIGN = registerItem("deepslate_bricks_sign", settings -> new SignItem(ModBlocks.DEEPSLATE_BRICKS_SIGN, ModBlocks.WALL_DEEPSLATE_BRICKS_SIGN, settings.maxCount(16)));
    public static final Item DEEPSLATE_BRICKS_HANGING_SIGN = registerItem("deepslate_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_DEEPSLATE_BRICKS_SIGN,
            ModBlocks.HANGING_WALL_DEEPSLATE_BRICKS_SIGN, settings.maxCount(16)));

    public static final Item CRACKED_DEEPSLATE_BRICKS_BOAT = registerItem("cracked_deepslate_bricks_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_BOAT, settings.maxCount(1)));
    public static final Item CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT = registerItem("cracked_deepslate_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, settings.maxCount(1)));
    public static final Item CRACKED_DEEPSLATE_BRICKS_SIGN = registerItem("cracked_deepslate_bricks_sign", settings -> new SignItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SIGN, ModBlocks.WALL_CRACKED_DEEPSLATE_BRICKS_SIGN, settings.maxCount(16)));
    public static final Item CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN = registerItem("cracked_deepslate_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.HANGING_CRACKED_DEEPSLATE_BRICKS_SIGN,
            ModBlocks.HANGING_WALL_CRACKED_DEEPSLATE_BRICKS_SIGN, settings.maxCount(16)));



    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name))));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name));
    }

    public static void registerModItems() {
    }

}
