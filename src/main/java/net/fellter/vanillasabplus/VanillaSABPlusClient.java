package net.fellter.vanillasabplus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fellter.vanillasabplus.boat.entity.ModBoatEntityRenderer;

import static net.fellter.vanillasabplus.boat.registry.ModelLayerRegistry.registerModModelLayers;

public class VanillaSABPlusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(VanillaSABPlus.BOAT, context -> new ModBoatEntityRenderer(context, false));
        EntityRendererRegistry.register(VanillaSABPlus.CHEST_BOAT, context -> new ModBoatEntityRenderer(context, true));

        registerModModelLayers();
    }
}
