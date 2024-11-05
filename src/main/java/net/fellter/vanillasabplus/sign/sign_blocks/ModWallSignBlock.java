package net.fellter.vanillasabplus.sign.sign_blocks;

import net.fellter.vanillasabplus.VanillaSABPlus;
import net.fellter.vanillasabplus.sign.util.ModSign;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWallSignBlock extends WallSignBlock implements ModSign {
    private final String texture;

    public ModWallSignBlock(String texture ,WoodType woodType, Settings settings) {
        super(woodType, settings);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(VanillaSABPlus.MOD_ID, "entity/signs/" + texture);
    }
}
