package cn.mrcraftteammc.mrscrafttown.datagen;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownModExpectPlatform;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.LOGGER;
import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.NAME;

public class MrsCraftTownModDataGenInit {
    public static void initDataGen() {
        LOGGER.info("{} Data Generator initializing! on platform: {}", NAME, MrsCraftTownModExpectPlatform.getPlatformName());
    }
}
