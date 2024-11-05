package net.fellter.vanillasabplus.sign.sign_blocks;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.util.ModHangingSign;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWallHangingSignBlock extends WallHangingSignBlock implements ModHangingSign {
    private final String texture;

    public ModWallHangingSignBlock(String texture, WoodType woodType, Settings settings) {
        super(woodType, settings);
        this.texture = texture;

    }

    @Override
    public Identifier getGUITexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/hanging/" + texture);
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "textures/gui/hanging_signs/" + texture);
    }
}
