package cn.mrcraftteammc.mrscrafttown.mixin;

import cn.mrcraftteammc.mrscrafttown.MrsCraftTownMod;
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
        MrsCraftTownMod.LOGGER.info("Server Side {} is Loading!", MrsCraftTownMod.class.getName());
    }
}