package net.fellter.vanillasabplus.boat;

import java.util.function.Supplier;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.shared.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntityTypes {
	public static final EntityType<BoatEntity> CRIMSON_BOAT = register("crimson_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CRIMSON_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CRIMSON_CHEST_BOAT = register("crimson_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CRIMSON_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> WARPED_BOAT = register("warped_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.WARPED_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> WARPED_CHEST_BOAT = register("warped_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.WARPED_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> STONE_BOAT = register("stone_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.STONE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> STONE_CHEST_BOAT = register("stone_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.STONE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> COBBLESTONE_BOAT = register("cobblestone_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.COBBLESTONE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> COBBLESTONE_CHEST_BOAT = register("cobblestone_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.COBBLESTONE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> MOSSY_COBBLESTONE_BOAT = register("mossy_cobblestone_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.MOSSY_COBBLESTONE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> MOSSY_COBBLESTONE_CHEST_BOAT = register("mossy_cobblestone_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.MOSSY_COBBLESTONE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> SMOOTH_STONE_BOAT = register("smooth_stone_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.SMOOTH_STONE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> SMOOTH_STONE_CHEST_BOAT = register("smooth_stone_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.SMOOTH_STONE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> STONE_BRICKS_BOAT = register("stone_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.STONE_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> STONE_BRICKS_CHEST_BOAT = register("stone_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.STONE_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CRACKED_STONE_BRICKS_BOAT = register("cracked_stone_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CRACKED_STONE_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CRACKED_STONE_BRICKS_CHEST_BOAT = register("cracked_stone_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CRACKED_STONE_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> MOSSY_STONE_BRICKS_BOAT = register("mossy_stone_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.MOSSY_STONE_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> MOSSY_STONE_BRICKS_CHEST_BOAT = register("mossy_stone_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.MOSSY_STONE_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> GRANITE_BOAT = register("granite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.GRANITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> GRANITE_CHEST_BOAT = register("granite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.GRANITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> POLISHED_GRANITE_BOAT = register("polished_granite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.POLISHED_GRANITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> POLISHED_GRANITE_CHEST_BOAT = register("polished_granite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.POLISHED_GRANITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> DIORITE_BOAT = register("diorite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.DIORITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> DIORITE_CHEST_BOAT = register("diorite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.DIORITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> POLISHED_DIORITE_BOAT = register("polished_diorite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.POLISHED_DIORITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> POLISHED_DIORITE_CHEST_BOAT = register("polished_diorite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.POLISHED_DIORITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> ANDESITE_BOAT = register("andesite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.ANDESITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> ANDESITE_CHEST_BOAT = register("andesite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.ANDESITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> POLISHED_ANDESITE_BOAT = register("polished_andesite_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.POLISHED_ANDESITE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> POLISHED_ANDESITE_CHEST_BOAT = register("polished_andesite_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.POLISHED_ANDESITE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> DEEPSLATE_BOAT = register("deepslate_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.DEEPSLATE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> DEEPSLATE_CHEST_BOAT = register("deepslate_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.DEEPSLATE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> COBBLED_DEEPSLATE_BOAT = register("cobbled_deepslate_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.COBBLED_DEEPSLATE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> COBBLED_DEEPSLATE_CHEST_BOAT = register("cobbled_deepslate_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.COBBLED_DEEPSLATE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CHISELED_DEEPSLATE_BOAT = register("chiseled_deepslate_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CHISELED_DEEPSLATE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CHISELED_DEEPSLATE_CHEST_BOAT = register("chiseled_deepslate_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CHISELED_DEEPSLATE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> POLISHED_DEEPSLATE_BOAT = register("polished_deepslate_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.POLISHED_DEEPSLATE_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> POLISHED_DEEPSLATE_CHEST_BOAT = register("polished_deepslate_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.POLISHED_DEEPSLATE_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> DEEPSLATE_BRICKS_BOAT = register("deepslate_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.DEEPSLATE_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> DEEPSLATE_BRICKS_CHEST_BOAT = register("deepslate_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.DEEPSLATE_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CRACKED_DEEPSLATE_BRICKS_BOAT = register("cracked_deepslate_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CRACKED_DEEPSLATE_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT = register("cracked_deepslate_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> DEEPSLATE_TILES_BOAT = register("deepslate_tiles_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.DEEPSLATE_TILES_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> DEEPSLATE_TILES_CHEST_BOAT = register("deepslate_tiles_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.DEEPSLATE_TILES_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CRACKED_DEEPSLATE_TILES_BOAT = register("cracked_deepslate_tiles_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CRACKED_DEEPSLATE_TILES_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CRACKED_DEEPSLATE_TILES_CHEST_BOAT = register("cracked_deepslate_tiles_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CRACKED_DEEPSLATE_TILES_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> TUFF_BOAT = register("tuff_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.TUFF_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> TUFF_CHEST_BOAT = register("tuff_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.TUFF_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CHISELED_TUFF_BOAT = register("chiseled_tuff_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CHISELED_TUFF_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CHISELED_TUFF_CHEST_BOAT = register("chiseled_tuff_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CHISELED_TUFF_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> POLISHED_TUFF_BOAT = register("polished_tuff_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.POLISHED_TUFF_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> POLISHED_TUFF_CHEST_BOAT = register("polished_tuff_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.POLISHED_TUFF_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> TUFF_BRICKS_BOAT = register("tuff_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.TUFF_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> TUFF_BRICKS_CHEST_BOAT = register("tuff_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.TUFF_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> CHISELED_TUFF_BRICKS_BOAT = register("chiseled_tuff_bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.CHISELED_TUFF_BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> CHISELED_TUFF_BRICKS_CHEST_BOAT = register("chiseled_tuff_bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.CHISELED_TUFF_BRICKS_CHEST_BOAT), SpawnGroup.MISC));
	public static final EntityType<BoatEntity> BRICKS_BOAT = register("bricks_boat", EntityType.Builder.create(getBoatFactory(() -> ModItems.BRICKS_BOAT), SpawnGroup.MISC));
	public static final EntityType<ModChestBoatEntity> BRICKS_CHEST_BOAT = register("bricks_chest_boat", EntityType.Builder.create(getChestBoatFactory(() -> ModItems.BRICKS_CHEST_BOAT), SpawnGroup.MISC));

	private static EntityType.EntityFactory<BoatEntity> getBoatFactory(Supplier<Item> itemSupplier) {
		return (type, world) -> new BoatEntity(type, world, itemSupplier);
	}

	private static EntityType.EntityFactory<ModChestBoatEntity> getChestBoatFactory(Supplier<Item> itemSupplier) {
		return (type, world) -> new ModChestBoatEntity(type, world, itemSupplier);
	}

	private static RegistryKey<EntityType<?>> keyOf(String id) {
		return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(VanillaSABPlus.MOD_ID, id));
	}

	private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
		EntityType<T> entityType = Registry.register(Registries.ENTITY_TYPE, keyOf(id), builder.dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10).build(keyOf(id)));
		var entity = entityType.factory.create(entityType, null);
		VanillaSABPlus.MOD_BOAT_SOURCE_MAP.put(entityType, entity);
		return entityType;
	}

	public static void registerEntityTypes() {
	}
}
