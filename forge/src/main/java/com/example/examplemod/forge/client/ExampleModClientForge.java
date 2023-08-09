package com.example.examplemod.forge.client;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.client.ExampleModClient;
import dev.architectury.platform.forge.EventBuses;
//import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// TODO: Fix Forge Client

@Deprecated
//@Mod(examplemod.MOD_ID)
public class ExampleModClientForge {
    public ExampleModClientForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleModClient.initClient();
    }
}
