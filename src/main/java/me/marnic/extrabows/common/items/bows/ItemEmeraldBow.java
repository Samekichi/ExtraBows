package me.marnic.extrabows.common.items.bows;

import me.marnic.extrabows.common.config.ExtraBowsConfig;
import me.marnic.extrabows.common.items.BasicBow;
import me.marnic.extrabows.common.items.CustomBowSettings;

/**
 * Copyright (c) 24.05.2019
 * Developed by MrMarnic
 * GitHub: https://github.com/MrMarnic
 */
public class ItemEmeraldBow extends BasicBow {
    public ItemEmeraldBow() {
        super("emerald_bow");
    }

    @Override
    public void initConfigOptions() {
        setSettings(BowSettings.EMERALD_BOW);
        super.initConfigOptions();
    }
}
