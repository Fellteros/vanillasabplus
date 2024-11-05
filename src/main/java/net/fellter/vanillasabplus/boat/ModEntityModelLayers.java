package net.fellter.vanillasabplus.boat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fellter.vanillasabplus.VanillaSABPlus;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModEntityModelLayers {
    public static final EntityModelLayer CRIMSON_BOAT = registerMain("boat/crimson");
    public static final EntityModelLayer CRIMSON_CHEST_BOAT = registerMain("chest_boat/crimson");

    private static EntityModelLayer registerMain(String id) {
        return register(id, "main");
    }

    private static EntityModelLayer register(String id, String layer) {
        return create(id, layer);
    }

    private static EntityModelLayer create(String id, String layer) {
        return new EntityModelLayer(Identifier.of(VanillaSABPlus.MOD_ID, id), layer);
    }

    public static void registerEntityModelLayers() {
    }
}
