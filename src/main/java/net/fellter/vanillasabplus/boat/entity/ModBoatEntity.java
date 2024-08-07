package net.fellter.vanillasabplus.boat.entity;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.util.ModBoatTrackedData;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Optional;

public class ModBoatEntity extends BoatEntity implements ModBoatHolder {
    private static final TrackedData<Optional<ModBoatType>> MOD_BOAT = DataTracker.registerData(ModBoatEntity.class, ModBoatTrackedData.HANDLER);

    public ModBoatEntity(EntityType<? extends ModBoatEntity> type, World world) {
        super(type, world);
    }

    public ModBoatEntity(World world) {
        this(VanillaSABPlus.BOAT, world);
    }

    public ModBoatEntity(World world, double x, double y, double z) {
        this(VanillaSABPlus.BOAT, world);

        this.setPosition(x, y, z);
        this.prevX = x;
        this.prevY = y;
        this.prevZ = z;
    }

    @Override
    public ModBoatType getModBoat() {
        return this.dataTracker.get(MOD_BOAT).orElse(null);
    }

    @Override
    public void setModBoat(ModBoatType boat) {
        this.dataTracker.set(MOD_BOAT, Optional.of(boat));
    }

    @Override
    protected Text getDefaultName() {
        if (this.getModBoat() == null) {
            return EntityType.BOAT.getName();
        }

        return super.getDefaultName();
    }

    @Override
    public Item asItem() {
        return this.getModBoat().getItem();
    }

    @Override
    public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
        return this.hasValidModBoat() && super.shouldRender(cameraX, cameraY, cameraZ);
    }

    @Override
    public void tick() {
        if (this.hasValidModBoat()) {
            super.tick();
        } else {
            this.discard();
        }
    }

    @Override
    public void setVariant(BoatEntity.Type type) {
    }

    @Override
    public BoatEntity.Type getVariant() {
        return this.getImpersonatedBoatType();
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(MOD_BOAT, Optional.empty());
    }

    // Serialization
    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.readModBoatFromNbt(nbt);

        if (!this.hasValidModBoat()) {
            this.discard();
        }
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        this.writeModBoatToNbt(nbt);
    }
}
