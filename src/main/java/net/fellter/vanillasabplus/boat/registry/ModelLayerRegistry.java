package net.fellter.vanillasabplus.boat.registry;

import net.fellter.vanillasabplus.boat.client.ModBoatClient;

public class ModelLayerRegistry {

    public static void registerModModelLayers() {
        ModBoatClient.registerModelLayers(BoatTypes.CRIMSON_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.WARPED_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.STONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.COBBLESTONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.MOSSY_COBBLESTONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.SMOOTH_STONE_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.CRACKED_STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.MOSSY_STONE_BRICKS_ID, false);
        ModBoatClient.registerModelLayers(BoatTypes.GRANITE_ID, false);
    }
}
