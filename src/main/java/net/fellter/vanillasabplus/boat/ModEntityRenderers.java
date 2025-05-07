package net.fellter.vanillasabplus.boat;

import net.fellter.vanillasabplus.VanillaSABPlus;

import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class ModEntityRenderers {
	public static void registerEntityModelLayers() {
		Registries.ENTITY_TYPE.forEach(type -> {
			Identifier identifier = Registries.ENTITY_TYPE.getId(type);

			if (identifier.getNamespace().equals(VanillaSABPlus.MOD_ID) && VanillaSABPlus.MOD_BOAT_SOURCE_MAP.containsKey(type)) {
				Entity entity = VanillaSABPlus.MOD_BOAT_SOURCE_MAP.get(type);

				if (entity instanceof ChestBoatEntity) {
					EntityModelLayerRegistry.registerModelLayer(registerChestBoatModelLayer(identifier.getPath().split("_chest_boat")[0]), BoatEntityModel::getChestTexturedModelData);
				} else if (entity instanceof BoatEntity) {
					EntityModelLayerRegistry.registerModelLayer(registerBoatModelLayer(identifier.getPath().split("_boat")[0]), BoatEntityModel::getTexturedModelData);
				}
			}
		});

		registerEntityRenderer(ModEntityTypes.CRIMSON_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("crimson")));
		registerEntityRenderer(ModEntityTypes.CRIMSON_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("crimson")));
		registerEntityRenderer(ModEntityTypes.WARPED_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("warped")));
		registerEntityRenderer(ModEntityTypes.WARPED_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("warped")));
		registerEntityRenderer(ModEntityTypes.STONE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("stone")));
		registerEntityRenderer(ModEntityTypes.STONE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("stone")));
		registerEntityRenderer(ModEntityTypes.COBBLESTONE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cobblestone")));
		registerEntityRenderer(ModEntityTypes.COBBLESTONE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cobblestone")));
		registerEntityRenderer(ModEntityTypes.MOSSY_COBBLESTONE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("mossy_cobblestone")));
		registerEntityRenderer(ModEntityTypes.MOSSY_COBBLESTONE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("mossy_cobblestone")));
		registerEntityRenderer(ModEntityTypes.SMOOTH_STONE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("smooth_stone")));
		registerEntityRenderer(ModEntityTypes.SMOOTH_STONE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("smooth_stone")));
		registerEntityRenderer(ModEntityTypes.STONE_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("stone_bricks")));
		registerEntityRenderer(ModEntityTypes.STONE_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("stone_bricks")));
		registerEntityRenderer(ModEntityTypes.CRACKED_STONE_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cracked_stone_bricks")));
		registerEntityRenderer(ModEntityTypes.CRACKED_STONE_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cracked_stone_bricks")));
		registerEntityRenderer(ModEntityTypes.MOSSY_STONE_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("mossy_stone_bricks")));
		registerEntityRenderer(ModEntityTypes.MOSSY_STONE_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("mossy_stone_bricks")));
		registerEntityRenderer(ModEntityTypes.GRANITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("granite")));
		registerEntityRenderer(ModEntityTypes.GRANITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("granite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_GRANITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_granite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_GRANITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_granite")));
		registerEntityRenderer(ModEntityTypes.DIORITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("diorite")));
		registerEntityRenderer(ModEntityTypes.DIORITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("diorite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_DIORITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_diorite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_DIORITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_diorite")));
		registerEntityRenderer(ModEntityTypes.ANDESITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("andesite")));
		registerEntityRenderer(ModEntityTypes.ANDESITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("andesite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_ANDESITE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_andesite")));
		registerEntityRenderer(ModEntityTypes.POLISHED_ANDESITE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_andesite")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("deepslate")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("deepslate")));
		registerEntityRenderer(ModEntityTypes.COBBLED_DEEPSLATE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cobbled_deepslate")));
		registerEntityRenderer(ModEntityTypes.COBBLED_DEEPSLATE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cobbled_deepslate")));
		registerEntityRenderer(ModEntityTypes.CHISELED_DEEPSLATE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("chiseled_deepslate")));
		registerEntityRenderer(ModEntityTypes.CHISELED_DEEPSLATE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("chiseled_deepslate")));
		registerEntityRenderer(ModEntityTypes.POLISHED_DEEPSLATE_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_deepslate")));
		registerEntityRenderer(ModEntityTypes.POLISHED_DEEPSLATE_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_deepslate")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("deepslate_bricks")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("deepslate_bricks")));
		registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cracked_deepslate_bricks")));
		registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cracked_deepslate_bricks")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_TILES_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("deepslate_tiles")));
		registerEntityRenderer(ModEntityTypes.DEEPSLATE_TILES_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("deepslate_tiles")));
		registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_TILES_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cracked_deepslate_tiles")));
		registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_TILES_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cracked_deepslate_tiles")));
		registerEntityRenderer(ModEntityTypes.TUFF_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("tuff")));
		registerEntityRenderer(ModEntityTypes.TUFF_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("tuff")));
		registerEntityRenderer(ModEntityTypes.CHISELED_TUFF_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("chiseled_tuff")));
		registerEntityRenderer(ModEntityTypes.CHISELED_TUFF_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("chiseled_tuff")));
		registerEntityRenderer(ModEntityTypes.POLISHED_TUFF_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_tuff")));
		registerEntityRenderer(ModEntityTypes.POLISHED_TUFF_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_tuff")));
		registerEntityRenderer(ModEntityTypes.TUFF_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("tuff_bricks")));
		registerEntityRenderer(ModEntityTypes.TUFF_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("tuff_bricks")));
		registerEntityRenderer(ModEntityTypes.CHISELED_TUFF_BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("chiseled_tuff_bricks")));
		registerEntityRenderer(ModEntityTypes.CHISELED_TUFF_BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("chiseled_tuff_bricks")));
		registerEntityRenderer(ModEntityTypes.BRICKS_BOAT, ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("bricks")));
		registerEntityRenderer(ModEntityTypes.BRICKS_CHEST_BOAT, ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("bricks")));
	}

	public static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> entityType, EntityRendererFactory<T> entityRendererFactory) {
		EntityRendererRegistry.register(entityType, entityRendererFactory);
	}

	static EntityModelLayer registerBoatModelLayer(String id) {
		return new EntityModelLayer(Identifier.of(VanillaSABPlus.MOD_ID, "boat/" + id), "main");
	}

	static EntityModelLayer registerChestBoatModelLayer(String id) {
		return new EntityModelLayer(Identifier.of(VanillaSABPlus.MOD_ID, "chest_boat/" + id), "main");
	}
}
