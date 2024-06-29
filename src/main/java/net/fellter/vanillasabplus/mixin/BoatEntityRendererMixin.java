package net.fellter.vanillasabplus.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fellter.vanillasabplus.boat.entity.ModBoatEntityRenderer;
import net.fellter.vanillasabplus.boat.entity.ModBoatHolder;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;

@Mixin(BoatEntityRenderer.class)
@Environment(EnvType.CLIENT)
public class BoatEntityRendererMixin {

    @WrapOperation(method = "render*", at = @At(value = "INVOKE", target = "Ljava/util/Map;get(Ljava/lang/Object;)Ljava/lang/Object;"))
    @SuppressWarnings("unused")
    private Object modWood$getBoatTextureAndModel(Map<BoatEntity.Type, Pair<Identifier, BoatEntityModel>> instance, Object type, Operation<Object> original, BoatEntity entity) {
        //noinspection ConstantConditions
        if (entity instanceof ModBoatHolder terraformEntity &&
                (Object) this instanceof ModBoatEntityRenderer terraformRenderer) {
            return terraformRenderer.getTextureAndModel(terraformEntity);
        }

        return original.call(instance, type);
    }
}
