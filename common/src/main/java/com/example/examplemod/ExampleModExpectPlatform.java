package com.example.examplemod;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.nio.file.Path;

public class ExampleModExpectPlatform {
    /**
     * An example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: com.example.examplemod.ExampleModExpectPlatform#platformName()
     * Actual Fabric: com.example.examplemod.fabric.ExampleExpectPlatformImpl#platformName()
     * Actual Forge: com.example.examplemod.forge.ExampleExpectPlatformImpl#platformName()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static String getPlatformName() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Path getConfigFile() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
