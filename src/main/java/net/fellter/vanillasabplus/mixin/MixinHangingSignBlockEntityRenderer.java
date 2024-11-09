package net.fellter.vanillasabplus.mixin;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fellter.vanillasabplus.sign.util.ModHangingSign;
import net.fellter.vanillasabplus.sign.util.ModSign;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HangingSignBlockEntityRenderer.class)
@Environment(EnvType.CLIENT)
public abstract class MixinHangingSignBlockEntityRenderer extends MixinSignBlockEntityRenderer {
    @Inject(method = "getTextureId", at = @At("HEAD"), cancellable = true)
    private void modWood$getHangingSignTextureId(CallbackInfoReturnable<SpriteIdentifier> cir) {
        if (this.mod$renderedBlockEntity != null) {
            if (this.mod$renderedBlockEntity.getCachedState().getBlock() instanceof ModHangingSign signBlock) {
                cir.setReturnValue(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, signBlock.getTexture()));
            }
        }
    }

}
