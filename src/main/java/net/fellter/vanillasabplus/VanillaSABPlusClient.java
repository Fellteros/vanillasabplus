package net.fellter.vanillasabplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillasabplus.boat.ModEntityModelLayers;


public class VanillaSABPlusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModEntityModelLayers.registerEntityModelLayers();
    }
}
