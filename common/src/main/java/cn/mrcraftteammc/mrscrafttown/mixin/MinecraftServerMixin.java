package cn.mrcraftteammc.mrscrafttown.mixin;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Inject(
            at = @At("HEAD"),
            method = "runServer()V",
            cancellable = true
    )
    private void onRunServer(CallbackInfo info) {
        MrsCraftTownMod.LOGGER.info("Server Side {} is Loading!", MrsCraftTownMod.class.getName());
    }

    @Inject(
            at = @At("HEAD"),
            method = "loadLevel()V",
            cancellable = true
    )
    private void onLoadLevel(CallbackInfo callbackInfo) {
        MrsCraftTownMod.LOGGER.info("{} is Loading for World!", MrsCraftTownMod.class.getName());
    }
}