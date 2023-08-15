package cn.mrcraftteammc.mrscrafttown.forge;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MrsCraftTownMod.MOD_ID)
public class MrsCraftTownModForge {
    public MrsCraftTownModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MrsCraftTownMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MrsCraftTownMod.init();

        MrsCraftModForgeClient();
        MrsCraftModForgeServer();
    }

    @OnlyIn(Dist.CLIENT)
    public static void MrsCraftModForgeClient() {
        MrsCraftTownMod.initClient();
    }

    @OnlyIn(Dist.DEDICATED_SERVER)
    public static void MrsCraftModForgeServer() {
        MrsCraftTownMod.initServer();
    }
}
