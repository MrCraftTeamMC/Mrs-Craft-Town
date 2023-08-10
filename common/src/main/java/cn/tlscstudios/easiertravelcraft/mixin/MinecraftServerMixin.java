package cn.tlscstudios.easiertravelcraft.mixin;

import cn.tlscstudios.easiertravelcraft.EasierTravelCraftMod;
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
        EasierTravelCraftMod.LOGGER.info("Server Side {} is Loading!", EasierTravelCraftMod.class.getName());
    }
}