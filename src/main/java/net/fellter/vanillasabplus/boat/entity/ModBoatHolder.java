package net.fellter.vanillasabplus.boat.entity;

import net.fellter.vanillasabplus.boat.registry.ModBoatTypeRegistry;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

public interface ModBoatHolder {
    String BOAT_KEY = "ModBoat";

    ModBoatType getModBoat();

    void setModBoat(ModBoatType boat);

    default boolean hasValidModBoat() {
        return this.getModBoat() != null;
    }

    default void readModBoatFromNbt(NbtCompound nbt) {
        Identifier id = Identifier.tryParse(nbt.getString(BOAT_KEY));
        if (id != null) {
            ModBoatType boat = ModBoatTypeRegistry.INSTANCE.get(id);
            if (boat != null) {
                this.setModBoat(boat);
            }
        }
    }

    default void writeModBoatToNbt(NbtCompound nbt) {
        Identifier boatId = ModBoatTypeRegistry.INSTANCE.getId(this.getModBoat());
        if (boatId != null) {
            nbt.putString(BOAT_KEY, boatId.toString());
        }
    }

    default BoatEntity.Type getImpersonatedBoatType() {
        return this.getModBoat().isRaft() ? BoatEntity.Type.BAMBOO : BoatEntity.Type.OAK;
    }
}
