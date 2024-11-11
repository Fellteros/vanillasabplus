package net.fellter.vanillasabplus;

import net.fabricmc.api.ClientModInitializer;
import net.fellter.vanillasabplus.boat.ModEntityModelLayers;
import net.minecraft.block.WoodType;
import net.minecraft.client.render.TexturedRenderLayers;


public class VanillaSABPlusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModEntityModelLayers.registerEntityModelLayers();

        VanillaSABPlus.LOGGER.info(TexturedRenderLayers.getHangingSignTextureId(WoodType.ACACIA).getTextureId().toString());
    }
}
