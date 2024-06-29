package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.sign.util.BlockSettingsLock;
import net.fellter.vanillasabplus.sign.util.ModHangingSign;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModHangingSignBlock extends HangingSignBlock implements ModHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;

    public ModHangingSignBlock(Identifier texture, Identifier guiTexture, WoodType woodType, AbstractBlock.Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
        this.guiTexture = guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }

    @Override
    public Identifier getGUITexture() {
        return guiTexture;
    }
}
