package net.fellter.vanillasabplus.boat;

import java.util.function.Supplier;

import org.jetbrains.annotations.Nullable;

import net.fellter.vanillasabplus.VanillaSABPlusClient;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ModChestBoatEntity extends ChestBoatEntity {
	public ModChestBoatEntity(EntityType<? extends ChestBoatEntity> entityType, World world, Supplier<Item> supplier) {
		super(entityType, world, supplier);
	}

	@Override
	public void openInventory(PlayerEntity playerEntity) {
		playerEntity.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, playerInventory, player) -> VanillaSABPlusClient.createModGeneric9x3(syncId, playerInventory, this), this.getDisplayName()));
		if (playerEntity.getWorld() instanceof ServerWorld serverWorld) {
			this.emitGameEvent(GameEvent.CONTAINER_OPEN, playerEntity);
			PiglinBrain.onGuardedBlockInteracted(serverWorld, playerEntity, true);
		}
	}

	@Override
	public void readInventoryFromNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
		super.readInventoryFromNbt(nbt, registries);
	}

	@Override
	public void writeInventoryToNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
		super.writeInventoryToNbt(nbt, registries);
	}

	@Override
	public @Nullable ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
		if (this.getLootTable() != null && playerEntity.isSpectator()) {
			return null;
		} else {
			this.generateLoot(playerInventory.player);
			return VanillaSABPlusClient.createModGeneric9x3(i, playerInventory, this);
		}
	}


}
