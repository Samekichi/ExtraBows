package me.marnic.extrabows.common.items.bows;

import me.marnic.extrabows.common.config.ExtraBowsConfig;
import me.marnic.extrabows.common.items.BasicBow;
import me.marnic.extrabows.common.items.CustomBowSettings;

/**
 * Copyright (c) 24.05.2019
 * Developed by MrMarnic
 * GitHub: https://github.com/MrMarnic
 */
public class ItemDiamondBow extends BasicBow {
    public ItemDiamondBow() {
        super("diamond_bow");
    }

    @Override
    public void initConfigOptions() {
        setSettings(BowSettings.DIAMOND_BOW);
        super.initConfigOptions();
    }
}
