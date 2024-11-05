package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.util.BlockSettingsLock;
import net.fellter.vanillasabplus.sign.util.ModSign;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModSignBlock extends SignBlock implements ModSign {
    private final String texture;

    public ModSignBlock(String texture, WoodType woodType, Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/" + texture);
    }
}
