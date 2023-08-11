package cn.tlscstudios.easiertravelcraft;

import cn.tlscstudios.easiertravelcraft.block.RegisterBlocks;
import cn.tlscstudios.easiertravelcraft.item.RegisterItems;
import cn.tlscstudios.easiertravelcraft.util.Registers;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EasierTravelCraftMod {
    public static final String MOD_ID = "easiertravelcraft";
    public static final String NAME = "Easier Travel Craft Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());

        // Registers
        LOGGER.info("Stage 1: Resolving Register...");
        Registers.register();

        LOGGER.info("Set up {} Completely!", NAME);
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        LOGGER.info("{} Client initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());
    }

    @Environment(EnvType.SERVER)
    public static void initServer() {
        LOGGER.info("{} Server initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());
    }
}
