package net.fellter.vanillasabplus.boat.util;

import net.fellter.vanillasabplus.boat.registry.ModBoatTypeRegistry;
import net.minecraft.entity.data.TrackedDataHandler;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

import java.util.Optional;

public class ModBoatTrackedData {

    private ModBoatTrackedData() {

    }

    public static final PacketCodec<RegistryByteBuf, Optional<ModBoatType>> PACKET_CODEC = PacketCodecs
            .registryValue(ModBoatTypeRegistry.INSTANCE.getKey())
            .collect(PacketCodecs::optional);

    public static final TrackedDataHandler<Optional<ModBoatType>> HANDLER = TrackedDataHandler.create(PACKET_CODEC);

    public static void register() {
        TrackedDataHandlerRegistry.register(HANDLER);
    }
}
