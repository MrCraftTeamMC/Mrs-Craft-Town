package cn.tlscstudios.easiertravelcraft.datagen;

import cn.tlscstudios.easiertravelcraft.EasierTravelCraftModExpectPlatform;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.LOGGER;
import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.NAME;

public class EasierTravelCraftModDataGenInit {
    public static void initDataGen() {
        LOGGER.info("{} Data Generator initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());
    }
}
