package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.sign.util.BlockSettingsLock;
import net.fellter.vanillasabplus.sign.util.ModSign;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModSignBlock extends SignBlock implements ModSign {
    private final Identifier texture;

    public ModSignBlock(Identifier texture, WoodType woodType, Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
