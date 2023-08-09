package com.example.examplemod.mixin;

import com.example.examplemod.ExampleMod;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @Inject(
            at = @At("HEAD"),
            method = "runServer"
    )
    private void init(CallbackInfo info) {
        ExampleMod.LOGGER.info("Server Side {} is Loading!", ExampleMod.class.getName());
    }
}