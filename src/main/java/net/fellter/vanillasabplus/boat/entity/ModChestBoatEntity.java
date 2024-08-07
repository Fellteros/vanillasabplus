package net.fellter.vanillasabplus.boat.entity;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.boat.ModScreen;
import net.fellter.vanillasabplus.boat.util.ModBoatTrackedData;
import net.fellter.vanillasabplus.boat.util.ModBoatType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.Optional;

public class ModChestBoatEntity extends ChestBoatEntity implements ModBoatHolder {
    private static final TrackedData<Optional<ModBoatType>> MOD_BOAT = DataTracker.registerData(ModChestBoatEntity.class, ModBoatTrackedData.HANDLER);

    public ModChestBoatEntity(EntityType<? extends ModChestBoatEntity> type, World world) {
        super(type, world);
    }

    public ModChestBoatEntity(World world) {
        this(VanillaSABPlus.CHEST_BOAT, world);
    }

    public ModChestBoatEntity(World world, double x, double y, double z) {
        this(VanillaSABPlus.CHEST_BOAT, world);

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
            return EntityType.CHEST_BOAT.getName();
        }

        return super.getDefaultName();
    }

    @Override
    public Item asItem() {
        return this.getModBoat().getChestItem();
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
    public void openInventory(PlayerEntity player) {
        player.openHandledScreen(this);
        if (!player.getWorld().isClient) {
            this.emitGameEvent(GameEvent.CONTAINER_OPEN, player);
            PiglinBrain.onGuardedBlockInteracted(player, true);
        }
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
