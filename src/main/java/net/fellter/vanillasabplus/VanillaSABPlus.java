package net.fellter.vanillasabplus;

import net.fabricmc.api.ModInitializer;
import net.fellter.vanillasabplus.boat.ModEntityTypes;
import net.fellter.vanillasabplus.shared.ModBlocks;
import net.fellter.vanillasabplus.shared.ModItemGroups;
import net.fellter.vanillasabplus.shared.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaSABPlus implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Vanilla+ Signs & Boats");
	public static final String MOD_ID = "vanillasabplus";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModEntityTypes.registerEntityTypes();
	}
}