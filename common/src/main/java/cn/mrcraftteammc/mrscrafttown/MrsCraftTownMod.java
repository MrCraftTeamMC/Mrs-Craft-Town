package cn.mrcraftteammc.mrscrafttown;

import cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks;
import cn.mrcraftteammc.mrscrafttown.item.MrCTItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrsCraftTownMod {
    public static final String MOD_ID = "mrscrafttown";
    public static final String NAME = "Mr's Craft Town Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static Boolean Registed = false;

    public static void init() {
        LOGGER.info("{} initializing! on platform: {}", NAME, MrsCraftTownModExpectPlatform.getPlatformName());

        // Registers
        LOGGER.info("Stage 1: Resolving Register...");
        RegisterInit();
        Registed = true;

        LOGGER.info("Set up {} Completely!", NAME);
    }

    @Environment(EnvType.CLIENT)
    public static void initClient() {
        LOGGER.info("{} Client initializing! on platform: {}", NAME, MrsCraftTownModExpectPlatform.getPlatformName());
    }

    @Environment(EnvType.SERVER)
    public static void initServer() {
        LOGGER.info("{} Server initializing! on platform: {}", NAME, MrsCraftTownModExpectPlatform.getPlatformName());
    }

    public static void RegisterInit() {
        if (Registed) {
            throw new RuntimeException("All Things has been Registered!");
        }
        Registed = true;
        MrCTBlocks.register();
        MrCTItems.register();
    }
}
