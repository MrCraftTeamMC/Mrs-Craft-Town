package cn.mrcraftteammc.mrscrafttown.fabric;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import cn.mrcraftteammc.mrscrafttown.config.MrCTFabricConfigger;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.*;
import snownee.kiwi.Mod;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.LOGGER;
import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

@Mod(MOD_ID)
public class MrsCraftTownModFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    @Override
    public void onInitialize() {
        MrsCraftTownMod.init();
        LOGGER.info("Init Configger");
        MidnightConfig.init(MOD_ID, MrCTFabricConfigger.class);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        MrsCraftTownMod.initClient();
    }

    @Environment(EnvType.SERVER)
    @Override
    public void onInitializeServer() {
        MrsCraftTownMod.initServer();
    }
}
