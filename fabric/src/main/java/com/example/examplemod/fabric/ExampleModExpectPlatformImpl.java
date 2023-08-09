package com.example.examplemod.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ExampleModExpectPlatformImpl {
	public static String getPlatformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}

	public static Path getConfigFile() {
		return FabricLoader.getInstance().getConfigDir();
	}
}
