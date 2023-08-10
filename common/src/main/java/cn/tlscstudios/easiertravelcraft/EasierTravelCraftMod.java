package cn.tlscstudios.easiertravelcraft;

import cn.tlscstudios.easiertravelcraft.block.RegisterBlocks;
import cn.tlscstudios.easiertravelcraft.item.RegisterItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static cn.tlscstudios.easiertravelcraft.util.Registers.REGISTRATE;

public class EasierTravelCraftMod {
    public static final String MOD_ID = "easiertravelcraft";
    public static final String NAME = "Easier Travel Craft Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());

        // Registers
        LOGGER.info("Stage 1: Registering Items...");
        RegisterItems.register();

        LOGGER.info("Stage 2: Registering Blocks...");
        RegisterBlocks.register();

        LOGGER.info("Stage 3: Resolving Registrate Register...");
        REGISTRATE.register();

        LOGGER.info("Stage 4: Loading Config File...");


        LOGGER.info("Stage 5: Setting Up Mod Resource and Data...");

        LOGGER.info("Set up {} Completely!", NAME);
    }

    public static void initClient() {
        LOGGER.info("{} Client initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());
    }

    public static void initServer() {
        LOGGER.info("{} Server initializing! on platform: {}", NAME, EasierTravelCraftModExpectPlatform.getPlatformName());
    }
}
