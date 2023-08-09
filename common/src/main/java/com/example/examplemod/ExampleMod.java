package com.example.examplemod;

import com.example.examplemod.item.RegisterItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! on platform: {}", NAME, ExampleModExpectPlatform.getPlatformName());

        // Registers
        LOGGER.info("Stage 1: Registering Items...");
        RegisterItems.register();
    }
}
