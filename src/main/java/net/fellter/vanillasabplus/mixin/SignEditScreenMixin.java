package net.fellter.vanillasabplus.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fellter.vanillasabplus.sign.util.ModSign;
import net.minecraft.block.BlockState;
import net.minecraft.block.WoodType;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(SignEditScreen.class)
@Environment(EnvType.CLIENT)
public class SignEditScreenMixin {
    @WrapOperation(
            method = "renderSignBackground",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/TexturedRenderLayers;getSignTextureId(Lnet/minecraft/block/WoodType;)Lnet/minecraft/client/util/SpriteIdentifier;")
    )
    @SuppressWarnings("unused")
    private SpriteIdentifier modWood$editSignTextureId(WoodType type, Operation<SpriteIdentifier> original, DrawContext drawContext, BlockState state) {
        if (state.getBlock() instanceof ModSign signBlock) {
            return new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, signBlock.getTexture());
        }

        return original.call(type);
    }
}