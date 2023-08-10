package cn.tlscstudios.easiertravelcraft.fabric;

import cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import snownee.kiwi.Mod;

import static cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod.MOD_ID;

@Mod(MOD_ID)
public class EasierTravelCraftModFabric implements ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    @Override
    public void onInitialize() {
        EasierTravelCraftMod.init();
    }

    @Override
    public void onInitializeClient() {
        EasierTravelCraftMod.initClient();
    }

    @Override
    public void onInitializeServer() {
        EasierTravelCraftMod.initServer();
    }
}
