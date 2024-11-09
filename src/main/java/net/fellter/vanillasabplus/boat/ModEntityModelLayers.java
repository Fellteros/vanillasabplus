package net.fellter.vanillasabplus.boat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fellter.vanillasabplus.VanillaSABPlus;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModEntityModelLayers {

    public static void registerEntityModelLayers() {
        registerEntityRenderer(ModEntityTypes.CRIMSON_BOAT, registerBoatModelLayer("crimson"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("crimson")));
        registerEntityRenderer(ModEntityTypes.CRIMSON_CHEST_BOAT, registerChestBoatModelLayer("crimson"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("crimson")));
        registerEntityRenderer(ModEntityTypes.WARPED_BOAT, registerBoatModelLayer("warped"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("warped")));
        registerEntityRenderer(ModEntityTypes.WARPED_CHEST_BOAT, registerChestBoatModelLayer("warped"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("warped")));
        registerEntityRenderer(ModEntityTypes.STONE_BOAT, registerBoatModelLayer("stone"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("stone")));
        registerEntityRenderer(ModEntityTypes.STONE_CHEST_BOAT, registerChestBoatModelLayer("stone"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("stone")));
        registerEntityRenderer(ModEntityTypes.COBBLESTONE_BOAT, registerBoatModelLayer("cobblestone"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cobblestone")));
        registerEntityRenderer(ModEntityTypes.COBBLESTONE_CHEST_BOAT, registerChestBoatModelLayer("cobblestone"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cobblestone")));
        registerEntityRenderer(ModEntityTypes.MOSSY_COBBLESTONE_BOAT, registerBoatModelLayer("mossy_cobblestone"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("mossy_cobblestone")));
        registerEntityRenderer(ModEntityTypes.MOSSY_COBBLESTONE_CHEST_BOAT, registerChestBoatModelLayer("mossy_cobblestone"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("mossy_cobblestone")));
        registerEntityRenderer(ModEntityTypes.SMOOTH_STONE_BOAT, registerBoatModelLayer("smooth_stone"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("smooth_stone")));
        registerEntityRenderer(ModEntityTypes.SMOOTH_STONE_CHEST_BOAT, registerChestBoatModelLayer("smooth_stone"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("smooth_stone")));
        registerEntityRenderer(ModEntityTypes.STONE_BRICKS_BOAT, registerBoatModelLayer("stone_bricks"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("stone_bricks")));
        registerEntityRenderer(ModEntityTypes.STONE_BRICKS_CHEST_BOAT, registerChestBoatModelLayer("stone_bricks"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("stone_bricks")));
        registerEntityRenderer(ModEntityTypes.CRACKED_STONE_BRICKS_BOAT, registerBoatModelLayer("cracked_stone_bricks"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cracked_stone_bricks")));
        registerEntityRenderer(ModEntityTypes.CRACKED_STONE_BRICKS_CHEST_BOAT, registerChestBoatModelLayer("cracked_stone_bricks"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cracked_stone_bricks")));
        registerEntityRenderer(ModEntityTypes.MOSSY_STONE_BRICKS_BOAT, registerBoatModelLayer("mossy_stone_bricks"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("mossy_stone_bricks")));
        registerEntityRenderer(ModEntityTypes.MOSSY_STONE_BRICKS_CHEST_BOAT, registerChestBoatModelLayer("mossy_stone_bricks"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("mossy_stone_bricks")));
        registerEntityRenderer(ModEntityTypes.GRANITE_BOAT, registerBoatModelLayer("granite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("granite")));
        registerEntityRenderer(ModEntityTypes.GRANITE_CHEST_BOAT, registerChestBoatModelLayer("granite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("granite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_GRANITE_BOAT, registerBoatModelLayer("polished_granite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_granite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_GRANITE_CHEST_BOAT, registerChestBoatModelLayer("polished_granite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_granite")));
        registerEntityRenderer(ModEntityTypes.DIORITE_BOAT, registerBoatModelLayer("diorite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("diorite")));
        registerEntityRenderer(ModEntityTypes.DIORITE_CHEST_BOAT, registerChestBoatModelLayer("diorite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("diorite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_DIORITE_BOAT, registerBoatModelLayer("polished_diorite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_diorite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_DIORITE_CHEST_BOAT, registerChestBoatModelLayer("polished_diorite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_diorite")));
        registerEntityRenderer(ModEntityTypes.ANDESITE_BOAT, registerBoatModelLayer("andesite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("andesite")));
        registerEntityRenderer(ModEntityTypes.ANDESITE_CHEST_BOAT, registerChestBoatModelLayer("andesite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("andesite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_ANDESITE_BOAT, registerBoatModelLayer("polished_andesite"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_andesite")));
        registerEntityRenderer(ModEntityTypes.POLISHED_ANDESITE_CHEST_BOAT, registerChestBoatModelLayer("polished_andesite"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_andesite")));
        registerEntityRenderer(ModEntityTypes.DEEPSLATE_BOAT, registerBoatModelLayer("deepslate"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("deepslate")));
        registerEntityRenderer(ModEntityTypes.DEEPSLATE_CHEST_BOAT, registerChestBoatModelLayer("deepslate"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("deepslate")));
        registerEntityRenderer(ModEntityTypes.COBBLED_DEEPSLATE_BOAT, registerBoatModelLayer("cobbled_deepslate"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cobbled_deepslate")));
        registerEntityRenderer(ModEntityTypes.COBBLED_DEEPSLATE_CHEST_BOAT, registerChestBoatModelLayer("cobbled_deepslate"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cobbled_deepslate")));
        registerEntityRenderer(ModEntityTypes.CHISELED_DEEPSLATE_BOAT, registerBoatModelLayer("chiseled_deepslate"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("chiseled_deepslate")));
        registerEntityRenderer(ModEntityTypes.CHISELED_DEEPSLATE_CHEST_BOAT, registerChestBoatModelLayer("chiseled_deepslate"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("chiseled_deepslate")));
        registerEntityRenderer(ModEntityTypes.POLISHED_DEEPSLATE_BOAT, registerBoatModelLayer("polished_deepslate"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("polished_deepslate")));
        registerEntityRenderer(ModEntityTypes.POLISHED_DEEPSLATE_CHEST_BOAT, registerChestBoatModelLayer("polished_deepslate"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("polished_deepslate")));
        registerEntityRenderer(ModEntityTypes.DEEPSLATE_BRICKS_BOAT, registerBoatModelLayer("deepslate_bricks"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("deepslate_bricks")));
        registerEntityRenderer(ModEntityTypes.DEEPSLATE_BRICKS_CHEST_BOAT, registerChestBoatModelLayer("deepslate_bricks"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("deepslate_bricks")));
        registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_BOAT, registerBoatModelLayer("cracked_deepslate_bricks"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("cracked_deepslate_bricks")));
        registerEntityRenderer(ModEntityTypes.CRACKED_DEEPSLATE_BRICKS_CHEST_BOAT, registerChestBoatModelLayer("cracked_deepslate_bricks"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("cracked_deepslate_bricks")));
    }


    private static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> entityType, EntityModelLayer modelLayer, EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider, EntityRendererFactory<T> entityRendererFactory) {
        EntityModelLayerRegistry.registerModelLayer(modelLayer, texturedModelDataProvider);
        EntityRendererRegistry.register(entityType, entityRendererFactory);
    }

    private static EntityModelLayer registerBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(VanillaSABPlus.MOD_ID, "boat/" + id), "main");
    }

    private static EntityModelLayer registerChestBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(VanillaSABPlus.MOD_ID, "chest_boat/" + id), "main");
    }
}
