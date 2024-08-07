package net.fellter.vanillasabplus;

import net.fabricmc.api.ModInitializer;
import net.fellter.vanillasabplus.boat.entity.ModBoatEntity;
import net.fellter.vanillasabplus.boat.entity.ModChestBoatEntity;
import net.fellter.vanillasabplus.boat.registry.BoatTypes;
import net.fellter.vanillasabplus.boat.util.ModBoatTrackedData;
import net.fellter.vanillasabplus.util.ModBlocks;
import net.fellter.vanillasabplus.util.ModItemGroups;
import net.fellter.vanillasabplus.util.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaSABPlus implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("vanillasabplus");
	public static final String MOD_ID = "vanillasabplus";


    private static final Identifier BOAT_ID = Identifier.of(VanillaSABPlus.MOD_ID, "boat");
	public static final EntityType<ModBoatEntity> BOAT = EntityType.Builder.<ModBoatEntity>create(ModBoatEntity::new, SpawnGroup.MISC)
			.dimensions(1.375f, 0.5625f)
			.build();

	private static final Identifier CHEST_BOAT_ID = Identifier.of(VanillaSABPlus.MOD_ID, "chest_boat");
	public static final EntityType<ModChestBoatEntity> CHEST_BOAT = EntityType.Builder.<ModChestBoatEntity>create(ModChestBoatEntity::new, SpawnGroup.MISC)
			.dimensions(1.375f, 0.5625f)
			.build();

	@Override
	public void onInitialize() {
		ModItems.registerVSABPItems();
		BoatTypes.registerBoatTypes();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerVSABPBlocks();

		ModBoatTrackedData.register();
		Registry.register(Registries.ENTITY_TYPE, BOAT_ID, BOAT);
		Registry.register(Registries.ENTITY_TYPE, CHEST_BOAT_ID, CHEST_BOAT);

	}
}