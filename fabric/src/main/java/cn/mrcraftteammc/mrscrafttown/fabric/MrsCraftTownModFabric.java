package cn.mrcraftteammc.mrscrafttown.fabric;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import net.fabricmc.api.*;
import snownee.kiwi.Mod;

@Mod(MrsCraftTownMod.MOD_ID)
public class MrsCraftTownModFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    @Override
    public void onInitialize() {
        MrsCraftTownMod.init();
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
