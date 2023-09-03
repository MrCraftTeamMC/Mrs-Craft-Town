package cn.mrcraftteammc.mrscrafttown.fabric;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import cn.mrcraftteammc.mrscrafttown.config.MrCTFabricConfigger;
import net.fabricmc.api.*;
import snownee.kiwi.Mod;

import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.LOGGER;
import static cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod.MOD_ID;

@Mod(MOD_ID)
public class MrsCraftTownModFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    @Override
    public void onInitialize() {
        MrsCraftTownMod.init();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void onInitializeClient() {
        LOGGER.info("Init i18n Translates");
        //CrowdinTranslate.downloadTranslations("Mrs-Craft-Town", "mrscrafttown");
        LOGGER.info("Init Configger");
        MrsCraftTownMod.initClient();
    }

    @Environment(EnvType.SERVER)
    @Override
    public void onInitializeServer() {
        MrsCraftTownMod.initServer();
    }
}
