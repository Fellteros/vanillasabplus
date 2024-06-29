package net.fellter.vanillasabplus.mixin;

import net.fellter.vanillasabplus.boat.entity.ModBoatHolder;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(BoatEntity.class)
public class BoatEntityMixin {
    @ModifyArg(method = "fall(DZLnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)V", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/vehicle/BoatEntity;dropItem(Lnet/minecraft/item/ItemConvertible;)Lnet/minecraft/entity/ItemEntity;", ordinal = 0))
    private ItemConvertible modWood$replacePlanksDropItem(ItemConvertible original) {
        if (this instanceof ModBoatHolder terraformBoatHolder) {
            return terraformBoatHolder.getModBoat().getPlanks();
        }

        return original;
    }

}
