package net.fellter.vanillasabplus.shared;

import java.util.function.Function;

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

@SuppressWarnings("unused")
public class ModItems {
	public static final Item VSABP_SIGN = registerItem("vsabp_sign", Item::new);
	public static final Item VSABP_BOAT = registerItem("vsabp_boat", Item::new);

	public static final Item CRIMSON_BOAT = registerItem("crimson_boat", settings -> new BoatItem(ModEntityTypes.CRIMSON_BOAT, settings));
	public static final Item CRIMSON_CHEST_BOAT = registerItem("crimson_chest_boat", settings -> new BoatItem(ModEntityTypes.CRIMSON_CHEST_BOAT, settings));

	public static final Item WARPED_BOAT = registerItem("warped_boat", settings -> new BoatItem(ModEntityTypes.WARPED_BOAT, settings));
	public static final Item WARPED_CHEST_BOAT = registerItem("warped_chest_boat", settings -> new BoatItem(ModEntityTypes.WARPED_CHEST_BOAT, settings));

	public static final Item STONE_BOAT = registerItem("stone_boat", settings -> new BoatItem(ModEntityTypes.STONE_BOAT, settings));
	public static final Item STONE_CHEST_BOAT = registerItem("stone_chest_boat", settings -> new BoatItem(ModEntityTypes.STONE_CHEST_BOAT, settings));
	public static final Item STONE_SIGN = registerBlockPrefixedItem("stone_sign", settings -> new SignItem(ModBlocks.STONE_SIGN,
			ModBlocks.STONE_WALL_SIGN, settings));
	public static final Item HANGING_STONE_SIGN = registerBlockPrefixedItem("stone_hanging_sign", settings -> new HangingSignItem(ModBlocks.STONE_HANGING_SIGN,
			ModBlocks.STONE_WALL_HANGING_SIGN, settings));

	public static final Item COBBLESTONE_BOAT = registerItem("cobblestone_boat", settings -> new BoatItem(ModEntityTypes.COBBLESTONE_BOAT, settings));
	public static final Item COBBLESTONE_CHEST_BOAT = registerItem("cobblestone_chest_boat", settings -> new BoatItem(ModEntityTypes.COBBLESTONE_CHEST_BOAT, settings));
	public static final Item COBBLESTONE_SIGN = registerBlockPrefixedItem("cobblestone_sign", settings -> new SignItem(ModBlocks.COBBLESTONE_SIGN,
			ModBlocks.COBBLESTONE_WALL_SIGN, settings));
	public static final Item COBBLESTONE_HANGING_SIGN = registerBlockPrefixedItem("cobblestone_hanging_sign", settings -> new HangingSignItem(ModBlocks.COBBLESTONE_HANGING_SIGN,
			ModBlocks.COBBLESTONE_WALL_HANGING_SIGN, settings));

	public static final Item MOSSY_COBBLESTONE_BOAT = registerItem("mossy_cobblestone_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_COBBLESTONE_BOAT, settings));
	public static final Item MOSSY_COBBLESTONE_CHEST_BOAT = registerItem("mossy_cobblestone_chest_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_COBBLESTONE_CHEST_BOAT, settings));
	public static final Item MOSSY_COBBLESTONE_SIGN = registerBlockPrefixedItem("mossy_cobblestone_sign", settings -> new SignItem(ModBlocks.MOSSY_COBBLESTONE_SIGN,
			ModBlocks.MOSSY_COBBLESTONE_WALL_SIGN, settings));
	public static final Item MOSSY_COBBLESTONE_HANGING_SIGN = registerBlockPrefixedItem("mossy_cobblestone_hanging_sign", settings -> new HangingSignItem(ModBlocks.MOSSY_COBBLESTONE_HANGING_SIGN,
			ModBlocks.MOSSY_COBBLESTONE_WALL_HANGING_SIGN, settings));

	public static final Item SMOOTH_STONE_BOAT = registerItem("smooth_stone_boat", settings -> new BoatItem(ModEntityTypes.SMOOTH_STONE_BOAT, settings));
	public static final Item SMOOTH_STONE_CHEST_BOAT = registerItem("smooth_stone_chest_boat", settings -> new BoatItem(ModEntityTypes.SMOOTH_STONE_CHEST_BOAT, settings));
	public static final Item SMOOTH_STONE_SIGN = registerBlockPrefixedItem("smooth_stone_sign", settings -> new SignItem(ModBlocks.SMOOTH_STONE_SIGN,
			ModBlocks.SMOOTH_STONE_WALL_SIGN, settings));
	public static final Item SMOOTH_STONE_HANGING_SIGN = registerBlockPrefixedItem("smooth_stone_hanging_sign", settings -> new HangingSignItem(ModBlocks.SMOOTH_STONE_HANGING_SIGN,
			ModBlocks.SMOOTH_STONE_WALL_HANGING_SIGN, settings));

	public static final Item STONE_BRICKS_BOAT = registerItem("stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.STONE_BRICKS_BOAT, settings));
	public static final Item STONE_BRICKS_CHEST_BOAT = registerItem("stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.STONE_BRICKS_CHEST_BOAT, settings));
	public static final Item STONE_BRICKS_SIGN = registerBlockPrefixedItem("stone_bricks_sign", settings -> new SignItem(ModBlocks.STONE_BRICKS_SIGN,
			ModBlocks.STONE_BRICKS_WALL_SIGN, settings));
	public static final Item STONE_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.STONE_BRICKS_HANGING_SIGN,
			ModBlocks.STONE_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item CRACKED_STONE_BRICKS_BOAT = registerItem("cracked_stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_STONE_BRICKS_BOAT, settings));
	public static final Item CRACKED_STONE_BRICKS_CHEST_BOAT = registerItem("cracked_stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_STONE_BRICKS_CHEST_BOAT, settings));
	public static final Item CRACKED_STONE_BRICKS_SIGN = registerBlockPrefixedItem("cracked_stone_bricks_sign", settings -> new SignItem(ModBlocks.CRACKED_STONE_BRICKS_SIGN,
			ModBlocks.CRACKED_STONE_BRICKS_WALL_SIGN, settings));
	public static final Item CRACKED_STONE_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("cracked_stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.CRACKED_STONE_BRICKS_HANGING_SIGN,
			ModBlocks.CRACKED_STONE_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item MOSSY_STONE_BRICKS_BOAT = registerItem("mossy_stone_bricks_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_STONE_BRICKS_BOAT, settings));
	public static final Item MOSSY_STONE_BRICKS_CHEST_BOAT = registerItem("mossy_stone_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.MOSSY_STONE_BRICKS_CHEST_BOAT, settings));
	public static final Item MOSSY_STONE_BRICKS_SIGN = registerBlockPrefixedItem("mossy_stone_bricks_sign", settings -> new SignItem(ModBlocks.MOSSY_STONE_BRICKS_SIGN,
			ModBlocks.MOSSY_STONE_BRICKS_WALL_SIGN, settings));
	public static final Item MOSSY_STONE_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("mossy_stone_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.MOSSY_STONE_BRICKS_HANGING_SIGN,
			ModBlocks.MOSSY_STONE_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item GRANITE_BOAT = registerItem("granite_boat", settings -> new BoatItem(ModEntityTypes.GRANITE_BOAT, settings));
	public static final Item GRANITE_CHEST_BOAT = registerItem("granite_chest_boat", settings -> new BoatItem(ModEntityTypes.GRANITE_CHEST_BOAT, settings));
	public static final Item GRANITE_SIGN = registerBlockPrefixedItem("granite_sign", settings -> new SignItem(ModBlocks.GRANITE_SIGN,
			ModBlocks.GRANITE_WALL_SIGN, settings));
	public static final Item GRANITE_HANGING_SIGN = registerBlockPrefixedItem("granite_hanging_sign", settings -> new HangingSignItem(ModBlocks.GRANITE_HANGING_SIGN,
			ModBlocks.GRANITE_WALL_HANGING_SIGN, settings));

	public static final Item POLISHED_GRANITE_BOAT = registerItem("polished_granite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_GRANITE_BOAT, settings));
	public static final Item POLISHED_GRANITE_CHEST_BOAT = registerItem("polished_granite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_GRANITE_CHEST_BOAT, settings));
	public static final Item POLISHED_GRANITE_SIGN = registerBlockPrefixedItem("polished_granite_sign", settings -> new SignItem(ModBlocks.POLISHED_GRANITE_SIGN,
			ModBlocks.POLISHED_GRANITE_WALL_SIGN, settings));
	public static final Item POLISHED_GRANITE_HANGING_SIGN = registerBlockPrefixedItem("polished_granite_hanging_sign", settings -> new HangingSignItem(ModBlocks.POLISHED_GRANITE_HANGING_SIGN,
			ModBlocks.POLISHED_GRANITE_WALL_HANGING_SIGN, settings));

	public static final Item DIORITE_BOAT = registerItem("diorite_boat", settings -> new BoatItem(ModEntityTypes.DIORITE_BOAT, settings));
	public static final Item DIORITE_CHEST_BOAT = registerItem("diorite_chest_boat", settings -> new BoatItem(ModEntityTypes.DIORITE_CHEST_BOAT, settings));
	public static final Item DIORITE_SIGN = registerBlockPrefixedItem("diorite_sign", settings -> new SignItem(ModBlocks.DIORITE_SIGN,
			ModBlocks.DIORITE_WALL_SIGN, settings));
	public static final Item DIORITE_HANGING_SIGN = registerBlockPrefixedItem("diorite_hanging_sign", settings -> new HangingSignItem(ModBlocks.DIORITE_HANGING_SIGN,
			ModBlocks.DIORITE_WALL_HANGING_SIGN, settings));

	public static final Item POLISHED_DIORITE_BOAT = registerItem("polished_diorite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DIORITE_BOAT, settings));
	public static final Item POLISHED_DIORITE_CHEST_BOAT = registerItem("polished_diorite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DIORITE_CHEST_BOAT, settings));
	public static final Item POLISHED_DIORITE_SIGN = registerBlockPrefixedItem("polished_diorite_sign", settings -> new SignItem(ModBlocks.POLISHED_DIORITE_SIGN,
			ModBlocks.POLISHED_DIORITE_WALL_SIGN, settings));
	public static final Item POLISHED_DIORITE_HANGING_SIGN = registerBlockPrefixedItem("polished_diorite_hanging_sign", settings -> new HangingSignItem(ModBlocks.POLISHED_DIORITE_HANGING_SIGN,
			ModBlocks.POLISHED_DIORITE_WALL_HANGING_SIGN,
			settings));

	public static final Item ANDESITE_BOAT = registerItem("andesite_boat", settings -> new BoatItem(ModEntityTypes.ANDESITE_BOAT, settings));
	public static final Item ANDESITE_CHEST_BOAT = registerItem("andesite_chest_boat", settings -> new BoatItem(ModEntityTypes.ANDESITE_CHEST_BOAT, settings));
	public static final Item ANDESITE_SIGN = registerBlockPrefixedItem("andesite_sign", settings -> new SignItem(ModBlocks.ANDESITE_SIGN,
			ModBlocks.ANDESITE_WALL_SIGN, settings));
	public static final Item ANDESITE_HANGING_SIGN = registerBlockPrefixedItem("andesite_hanging_sign", settings -> new HangingSignItem(ModBlocks.ANDESITE_HANGING_SIGN
			, ModBlocks.ANDESITE_WALL_HANGING_SIGN, settings));

	public static final Item POLISHED_ANDESITE_BOAT = registerItem("polished_andesite_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_ANDESITE_BOAT, settings));
	public static final Item POLISHED_ANDESITE_CHEST_BOAT = registerItem("polished_andesite_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_ANDESITE_CHEST_BOAT, settings));
	public static final Item POLISHED_ANDESITE_SIGN = registerBlockPrefixedItem("polished_andesite_sign", settings -> new SignItem(ModBlocks.POLISHED_ANDESITE_SIGN,
			ModBlocks.POLISHED_ANDESITE_WALL_SIGN, settings));
	public static final Item POLISHED_ANDESITE_HANGING_SIGN = registerBlockPrefixedItem("polished_andesite_hanging_sign", settings -> new HangingSignItem(ModBlocks.POLISHED_ANDESITE_HANGING_SIGN,
			ModBlocks.POLISHED_ANDESITE_WALL_HANGING_SIGN, settings));

	public static final Item DEEPSLATE_BOAT = registerItem("deepslate_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BOAT, settings));
	public static final Item DEEPSLATE_CHEST_BOAT = registerItem("deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_CHEST_BOAT, settings));
	public static final Item DEEPSLATE_SIGN = registerBlockPrefixedItem("deepslate_sign", settings -> new SignItem(ModBlocks.DEEPSLATE_SIGN,
			ModBlocks.DEEPSLATE_WALL_SIGN, settings));
	public static final Item DEEPSLATE_HANGING_SIGN = registerBlockPrefixedItem("deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.DEEPSLATE_HANGING_SIGN,
			ModBlocks.DEEPSLATE_WALL_HANGING_SIGN, settings));

	public static final Item COBBLED_DEEPSLATE_BOAT = registerItem("cobbled_deepslate_boat", settings -> new BoatItem(ModEntityTypes.COBBLED_DEEPSLATE_BOAT, settings));
	public static final Item COBBLED_DEEPSLATE_CHEST_BOAT = registerItem("cobbled_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.COBBLED_DEEPSLATE_CHEST_BOAT, settings));
	public static final Item COBBLED_DEEPSLATE_SIGN = registerBlockPrefixedItem("cobbled_deepslate_sign", settings -> new SignItem(ModBlocks.COBBLED_DEEPSLATE_SIGN,
			ModBlocks.COBBLED_DEEPSLATE_WALL_SIGN, settings));
	public static final Item COBBLED_DEEPSLATE_HANGING_SIGN = registerBlockPrefixedItem("cobbled_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.COBBLED_DEEPSLATE_HANGING_SIGN,
			ModBlocks.COBBLED_DEEPSLATE_WALL_HANGING_SIGN, settings));

	public static final Item CHISELED_DEEPSLATE_BOAT = registerItem("chiseled_deepslate_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_DEEPSLATE_BOAT, settings));
	public static final Item CHISELED_DEEPSLATE_CHEST_BOAT = registerItem("chiseled_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_DEEPSLATE_CHEST_BOAT, settings));
	public static final Item CHISELED_DEEPSLATE_SIGN = registerBlockPrefixedItem("chiseled_deepslate_sign", settings -> new SignItem(ModBlocks.CHISELED_DEEPSLATE_SIGN,
			ModBlocks.CHISELED_DEEPSLATE_WALL_SIGN, settings));
	public static final Item CHISELED_DEEPSLATE_HANGING_SIGN = registerBlockPrefixedItem("chiseled_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.CHISELED_DEEPSLATE_HANGING_SIGN,
			ModBlocks.CHISELED_DEEPSLATE_WALL_HANGING_SIGN, settings));

	public static final Item POLISHED_DEEPSLATE_BOAT = registerItem("polished_deepslate_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DEEPSLATE_BOAT, settings));
	public static final Item POLISHED_DEEPSLATE_CHEST_BOAT = registerItem("polished_deepslate_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_DEEPSLATE_CHEST_BOAT, settings));
	public static final Item POLISHED_DEEPSLATE_SIGN = registerBlockPrefixedItem("polished_deepslate_sign", settings -> new SignItem(ModBlocks.POLISHED_DEEPSLATE_SIGN,
			ModBlocks.POLISHED_DEEPSLATE_WALL_SIGN, settings));
	public static final Item POLISHED_DEEPSLATE_HANGING_SIGN = registerBlockPrefixedItem("polished_deepslate_hanging_sign", settings -> new HangingSignItem(ModBlocks.POLISHED_DEEPSLATE_HANGING_SIGN,
			ModBlocks.POLISHED_DEEPSLATE_WALL_HANGING_SIGN, settings));

	public static final Item DEEPSLATE_BRICKS_BOAT = registerItem("deepslate_bricks_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BRICKS_BOAT, settings));
	public static final Item DEEPSLATE_BRICKS_CHEST_BOAT = registerItem("deepslate_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_BRICKS_CHEST_BOAT, settings));
	public static final Item DEEPSLATE_BRICKS_SIGN = registerBlockPrefixedItem("deepslate_bricks_sign", settings -> new SignItem(ModBlocks.DEEPSLATE_BRICKS_SIGN,
			ModBlocks.DEEPSLATE_BRICKS_WALL_SIGN, settings));
	public static final Item DEEPSLATE_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("deepslate_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.DEEPSLATE_BRICKS_HANGING_SIGN,
			ModBlocks.DEEPSLATE_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item CRACKED_DEEPSLATE_BRICKS_BOAT = registerItem("cracked_deepslate_bricks_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_BOAT, settings));
	public static final Item CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT = registerItem("cracked_deepslate_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, settings));
	public static final Item CRACKED_DEEPSLATE_BRICKS_SIGN = registerBlockPrefixedItem("cracked_deepslate_bricks_sign", settings -> new SignItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_SIGN,
			ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL_SIGN, settings));
	public static final Item CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("cracked_deepslate_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.CRACKED_DEEPSLATE_BRICKS_HANGING_SIGN,
			ModBlocks.CRACKED_DEEPSLATE_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item DEEPSLATE_TILES_BOAT = registerItem("deepslate_tiles_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_TILES_BOAT, settings));
	public static final Item DEEPSLATE_TILES_CHEST_BOAT = registerItem("deepslate_tiles_chest_boat", settings -> new BoatItem(ModEntityTypes.DEEPSLATE_TILES_CHEST_BOAT, settings));
	public static final Item DEEPSLATE_TILES_SIGN = registerBlockPrefixedItem("deepslate_tiles_sign", settings -> new SignItem(ModBlocks.DEEPSLATE_TILES_SIGN,
			ModBlocks.DEEPSLATE_TILES_WALL_SIGN, settings));
	public static final Item DEEPSLATE_TILES_HANGING_SIGN = registerBlockPrefixedItem("deepslate_tiles_hanging_sign", settings -> new HangingSignItem(ModBlocks.DEEPSLATE_TILES_HANGING_SIGN,
			ModBlocks.DEEPSLATE_TILES_WALL_HANGING_SIGN, settings));

	public static final Item CRACKED_DEEPSLATE_TILES_BOAT = registerItem("cracked_deepslate_tiles_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_TILES_BOAT, settings));
	public static final Item CRACKED_DEEPSLATE_TILES_CHEST_BOAT = registerItem("cracked_deepslate_tiles_chest_boat", settings -> new BoatItem(ModEntityTypes.CRACKED_DEEPSLATE_TILES_CHEST_BOAT, settings));
	public static final Item CRACKED_DEEPSLATE_TILES_SIGN = registerBlockPrefixedItem("cracked_deepslate_tiles_sign", settings -> new SignItem(ModBlocks.CRACKED_DEEPSLATE_TILES_SIGN,
			ModBlocks.CRACKED_DEEPSLATE_TILES_WALL_SIGN, settings));
	public static final Item CRACKED_DEEPSLATE_TILES_HANGING_SIGN = registerBlockPrefixedItem("cracked_deepslate_tiles_hanging_sign", settings -> new HangingSignItem(ModBlocks.CRACKED_DEEPSLATE_TILES_HANGING_SIGN,
			ModBlocks.CRACKED_DEEPSLATE_TILES_WALL_HANGING_SIGN, settings));

	public static final Item TUFF_BOAT = registerItem("tuff_boat", settings -> new BoatItem(ModEntityTypes.TUFF_BOAT, settings));
	public static final Item TUFF_CHEST_BOAT = registerItem("tuff_chest_boat", settings -> new BoatItem(ModEntityTypes.TUFF_CHEST_BOAT, settings));
	public static final Item TUFF_SIGN = registerBlockPrefixedItem("tuff_sign", settings -> new SignItem(ModBlocks.TUFF_SIGN,
			ModBlocks.TUFF_WALL_SIGN, settings));
	public static final Item TUFF_HANGING_SIGN = registerBlockPrefixedItem("tuff_hanging_sign", settings -> new HangingSignItem(ModBlocks.TUFF_HANGING_SIGN,
			ModBlocks.TUFF_WALL_HANGING_SIGN, settings));

	public static final Item CHISELED_TUFF_BOAT = registerItem("chiseled_tuff_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_TUFF_BOAT, settings));
	public static final Item CHISELED_TUFF_CHEST_BOAT = registerItem("chiseled_tuff_chest_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_TUFF_CHEST_BOAT, settings));
	public static final Item CHISELED_TUFF_SIGN = registerBlockPrefixedItem("chiseled_tuff_sign", settings -> new SignItem(ModBlocks.CHISELED_TUFF_SIGN,
			ModBlocks.CHISELED_TUFF_WALL_SIGN, settings));
	public static final Item CHISELED_TUFF_HANGING_SIGN = registerBlockPrefixedItem("chiseled_tuff_hanging_sign", settings -> new HangingSignItem(ModBlocks.CHISELED_TUFF_HANGING_SIGN,
			ModBlocks.CHISELED_TUFF_WALL_HANGING_SIGN, settings));

	public static final Item POLISHED_TUFF_BOAT = registerItem("polished_tuff_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_TUFF_BOAT, settings));
	public static final Item POLISHED_TUFF_CHEST_BOAT = registerItem("polished_tuff_chest_boat", settings -> new BoatItem(ModEntityTypes.POLISHED_TUFF_CHEST_BOAT, settings));
	public static final Item POLISHED_TUFF_SIGN = registerBlockPrefixedItem("polished_tuff_sign", settings -> new SignItem(ModBlocks.POLISHED_TUFF_SIGN,
			ModBlocks.POLISHED_TUFF_WALL_SIGN, settings));
	public static final Item POLISHED_TUFF_HANGING_SIGN = registerBlockPrefixedItem("polished_tuff_hanging_sign", settings -> new HangingSignItem(ModBlocks.POLISHED_TUFF_HANGING_SIGN,
			ModBlocks.POLISHED_TUFF_WALL_HANGING_SIGN, settings));

	public static final Item TUFF_BRICKS_BOAT = registerItem("tuff_bricks_boat", settings -> new BoatItem(ModEntityTypes.TUFF_BRICKS_BOAT, settings));
	public static final Item TUFF_BRICKS_CHEST_BOAT = registerItem("tuff_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.TUFF_BRICKS_CHEST_BOAT, settings));
	public static final Item TUFF_BRICKS_SIGN = registerBlockPrefixedItem("tuff_bricks_sign", settings -> new SignItem(ModBlocks.TUFF_BRICKS_SIGN,
			ModBlocks.TUFF_BRICKS_WALL_SIGN, settings));
	public static final Item TUFF_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("tuff_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.TUFF_BRICKS_HANGING_SIGN,
			ModBlocks.TUFF_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item CHISELED_TUFF_BRICKS_BOAT = registerItem("chiseled_tuff_bricks_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_TUFF_BRICKS_BOAT, settings));
	public static final Item CHISELED_TUFF_BRICKS_CHEST_BOAT = registerItem("chiseled_tuff_bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.CHISELED_TUFF_BRICKS_CHEST_BOAT, settings));
	public static final Item CHISELED_TUFF_BRICKS_SIGN = registerBlockPrefixedItem("chiseled_tuff_bricks_sign", settings -> new SignItem(ModBlocks.CHISELED_TUFF_BRICKS_SIGN,
			ModBlocks.CHISELED_TUFF_BRICKS_WALL_SIGN, settings));
	public static final Item CHISELED_TUFF_BRICKS_HANGING_SIGN = registerBlockPrefixedItem("chiseled_tuff_bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.CHISELED_TUFF_BRICKS_HANGING_SIGN,
			ModBlocks.CHISELED_TUFF_BRICKS_WALL_HANGING_SIGN, settings));

	public static final Item BRICKS_BOAT = registerItem("bricks_boat", settings -> new BoatItem(ModEntityTypes.BRICKS_BOAT, settings));
	public static final Item BRICKS_CHEST_BOAT = registerItem("bricks_chest_boat", settings -> new BoatItem(ModEntityTypes.BRICKS_CHEST_BOAT, settings));
	public static final Item BRICKS_SIGN = registerBlockPrefixedItem("bricks_sign", settings -> new SignItem(ModBlocks.BRICKS_SIGN,
			ModBlocks.BRICKS_WALL_SIGN, settings));
	public static final Item BRICKS_HANGING_SIGN = registerBlockPrefixedItem("bricks_hanging_sign", settings -> new HangingSignItem(ModBlocks.BRICKS_HANGING_SIGN,
			ModBlocks.BRICKS_WALL_HANGING_SIGN, settings));

	private static Item registerItem(String name, Function<Item.Settings, Item> function) {
		Item item = Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name)).maxCount(1).useItemPrefixedTranslationKey()));
		ModItemGroups.ITEM_GROUP_SOURCE_LIST.add(item);
		return item;
	}

	private static Item registerBlockPrefixedItem(String name, Function<Item.Settings, Item> function) {
		Item item = Registry.register(Registries.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name)).maxCount(16).useBlockPrefixedTranslationKey()));
		ModItemGroups.ITEM_GROUP_SOURCE_LIST.add(item);
		return item;
	}

	private static RegistryKey<Item> keyOfItem(String name) {
		return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaSABPlus.MOD_ID, name));
	}

	public static void registerModItems() {
	}
}
