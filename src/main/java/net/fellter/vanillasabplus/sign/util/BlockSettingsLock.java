package net.fellter.vanillasabplus.sign.util;

import net.minecraft.block.AbstractBlock;

public interface BlockSettingsLock {

    void vanillasabplus$lock();

    static AbstractBlock.Settings lock(AbstractBlock.Settings settings) {
        ((BlockSettingsLock) settings).vanillasabplus$lock();
        return settings;
    }
}
