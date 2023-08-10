package cn.tlscstudios.easiertravelcraft.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class EasierTravelCraftModExpectPlatformImpl {
	public static String getPlatformName() {
		return "Forge";
	}

    public static Path getConfigFile() {
		return FMLPaths.CONFIGDIR.get();
    }
}
