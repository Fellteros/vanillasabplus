package net.fellter.vanillasabplus.boat.registry;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoatTypeRegistry {
    private static final RegistryKey<Registry<ModBoatType>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.of(VanillaSABPlus.MOD_ID, "boat"));

    public static final Registry<ModBoatType> INSTANCE = FabricRegistryBuilder.createSimple(REGISTRY_KEY).buildAndRegister();

    public static RegistryKey<ModBoatType> createKey(Identifier id) {
        return RegistryKey.of(REGISTRY_KEY, id);
    }


}
