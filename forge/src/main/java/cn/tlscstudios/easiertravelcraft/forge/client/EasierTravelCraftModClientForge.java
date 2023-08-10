package cn.tlscstudios.easiertravelcraft.forge.client;

import cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod;
import dev.architectury.platform.forge.EventBuses;
//import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// TODO: Fix Forge Client

@Deprecated
//@Mod(EasierTravelCraftMod.MOD_ID)
public class EasierTravelCraftModClientForge {
    public EasierTravelCraftModClientForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(EasierTravelCraftMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        EasierTravelCraftMod.initClient();
    }
}
