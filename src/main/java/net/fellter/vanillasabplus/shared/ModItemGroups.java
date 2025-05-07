package net.fellter.vanillasabplus.shared;

import java.util.ArrayList;
import java.util.List;

import net.fellter.vanillasabplus.VanillaSABPlus;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ModItemGroups {
	public static final List<Item> ITEM_GROUP_SOURCE_LIST = new ArrayList<>();

	public static final ItemGroup VSABP_BOAT_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VanillaSABPlus.MOD_ID, "vsabp_boat"),
			FabricItemGroup.builder().displayName(Text.translatable("itemGroup.vsabp_boat"))
					.icon(() -> new ItemStack(ModItems.VSABP_BOAT)).entries(((displayContext, entries) -> ITEM_GROUP_SOURCE_LIST.forEach(item -> {
						if (item instanceof BoatItem) {
							entries.add(item);
						}
					}))).build());

	public static final ItemGroup VSABP_SIGN_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(VanillaSABPlus.MOD_ID, "vsabp_sign"),
			FabricItemGroup.builder().displayName(Text.translatable("itemGroup.vsabp_sign"))
					.icon(() -> new ItemStack(ModItems.VSABP_SIGN)).entries(((displayContext, entries) -> ITEM_GROUP_SOURCE_LIST.forEach(item -> {
						if (item instanceof SignItem) {
							entries.add(item);
						}
					}))).build());

	public static void registerItemGroups() {
	}
}
