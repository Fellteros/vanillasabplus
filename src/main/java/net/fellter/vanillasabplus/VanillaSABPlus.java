package net.fellter.vanillasabplus;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fellter.vanillasabplus.boat.ModEntityTypes;
import net.fellter.vanillasabplus.shared.ModBlocks;
import net.fellter.vanillasabplus.shared.ModItemGroups;
import net.fellter.vanillasabplus.shared.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

import net.fabricmc.api.ModInitializer;

public class VanillaSABPlus implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Signs & Boats");
	public static final String MOD_ID = "vanillasabplus";
	public static final Map<EntityType<?>, Entity> MOD_BOAT_SOURCE_MAP = new HashMap<>();

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModEntityTypes.registerEntityTypes();
	}
}
