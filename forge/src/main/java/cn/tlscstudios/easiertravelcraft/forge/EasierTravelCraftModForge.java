package cn.tlscstudios.easiertravelcraft.forge;

import cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EasierTravelCraftMod.MOD_ID)
public class EasierTravelCraftModForge {
    public EasierTravelCraftModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(EasierTravelCraftMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        EasierTravelCraftMod.init();
    }
}
