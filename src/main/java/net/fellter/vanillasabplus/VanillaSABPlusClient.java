package net.fellter.vanillasabplus;

import net.fellter.vanillasabplus.boat.ModEntityModelLayers;
import net.fellter.vanillasabplus.boat.ModHandledScreen;

import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ClientModInitializer;

public class VanillaSABPlusClient implements ClientModInitializer {

    public static ScreenHandlerType<GenericContainerScreenHandler> MOD_CHEST_BOAT_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(VanillaSABPlus.MOD_ID, "mod_chest_boat_screen_handler"),
                    new ScreenHandlerType<>(VanillaSABPlusClient::createModGeneric9x3, FeatureFlags.VANILLA_FEATURES));

    public static GenericContainerScreenHandler createModGeneric9x3(int syncId, PlayerInventory playerInventory) {
        return new GenericContainerScreenHandler(MOD_CHEST_BOAT_SCREEN_HANDLER, syncId, playerInventory, new SimpleInventory(27), 3);
    }

    public static GenericContainerScreenHandler createModGeneric9x3(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        return new GenericContainerScreenHandler(MOD_CHEST_BOAT_SCREEN_HANDLER, syncId, playerInventory, inventory, 3);
    }


    @Override
    public void onInitializeClient() {
        ModEntityModelLayers.registerEntityModelLayers();

        HandledScreens.register(MOD_CHEST_BOAT_SCREEN_HANDLER, ModHandledScreen::new);

    }
}
