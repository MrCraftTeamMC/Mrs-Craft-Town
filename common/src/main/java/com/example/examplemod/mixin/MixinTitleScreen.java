package com.example.examplemod.mixin;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    @Inject(
            at = @At("HEAD"),
            method = "init()V"
    )
    private void init(CallbackInfo info) {
        ExampleMod.LOGGER.info("Client Side {} is Loading!", ExampleMod.class.getName());
    }
}