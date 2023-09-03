package cn.mrcraftteammc.mrscrafttown.mixin;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin {
    private @Unique static Boolean mrsCraftTown$isOnInitCalled = false;

    @Inject(
            at = @At("HEAD"),
            method = "init()V",
            cancellable = true
    )
    private void onInit(CallbackInfo callbackInfo) {
        if (mrsCraftTown$isOnInitCalled) {
            callbackInfo.cancel();
        }
        mrsCraftTown$isOnInitCalled = true;
        MrsCraftTownMod.LOGGER.info("Client Side {} is Loading!", MrsCraftTownMod.class.getName());
    }
}
