package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.util.BlockSettingsLock;
import net.fellter.vanillasabplus.sign.util.ModHangingSign;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModHangingSignBlock extends HangingSignBlock implements ModHangingSign {
    private final String texture;

    public ModHangingSignBlock(String texture, WoodType woodType, AbstractBlock.Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/hanging/" + texture);
    }

    @Override
    public Identifier getGUITexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "gui/hanging_signs/" + texture);
    }
}
