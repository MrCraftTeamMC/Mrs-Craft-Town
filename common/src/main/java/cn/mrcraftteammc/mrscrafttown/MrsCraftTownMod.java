package cn.mrcraftteammc.mrscrafttown;

import cn.mrcraftteammc.mrscrafttown.block.MrCTBlocks;
import cn.mrcraftteammc.mrscrafttown.block.blockentity.MrCTBlockEntitiesTypes;
import cn.mrcraftteammc.mrscrafttown.item.MrCTEnchantments;
import cn.mrcraftteammc.mrscrafttown.item.MrCTItemTags;
import cn.mrcraftteammc.mrscrafttown.item.creativetab.MrCTCreativeTabs;
import cn.mrcraftteammc.mrscrafttown.item.MrCTItems;
import cn.mrcraftteammc.mrscrafttown.item.material.MrCTTagKeys;
import cn.mrcraftteammc.mrscrafttown.util.annotations.Testing;
import cn.mrcraftteammc.mrscrafttown.util.annotations.WithoutInRelease;
import cn.mrcraftteammc.mrscrafttown.util.exceptions.AccessDeniedError;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import org.jetbrains.annotations.ApiStatus;
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
        Registers();
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

    public static void Registers() {
        if (Registed) {
            throw new AccessDeniedError("All Things has been Registered!");
        }
        Registed = true;

        MrCTTagKeys.register();
        MrCTItemTags.register();
        MrCTCreativeTabs.register();
        MrCTBlocks.register();
        MrCTBlockEntitiesTypes.register();
        MrCTEnchantments.register();
        MrCTItems.register();
    }

    @Testing
    @WithoutInRelease
    @ApiStatus.Experimental
    @Deprecated
    public static boolean isDevEnv() {
        return FabricLoaderImpl.INSTANCE.isDevelopmentEnvironment();
    }
}
