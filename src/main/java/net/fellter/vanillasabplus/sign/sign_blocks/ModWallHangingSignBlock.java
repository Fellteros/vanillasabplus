package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.sign.util.ModHangingSign;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWallHangingSignBlock extends WallHangingSignBlock implements ModHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;

    public ModWallHangingSignBlock(Identifier texture, Identifier guiTexture ,WoodType woodType, Settings settings) {
        super(woodType, settings);
        this.texture = texture;
        this.guiTexture = guiTexture;

    }

    @Override
    public Identifier getGUITexture() {
        return guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
