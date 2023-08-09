package com.example.examplemod.client;

import com.example.examplemod.ExampleModExpectPlatform;

import static com.example.examplemod.ExampleMod.LOGGER;
import static com.example.examplemod.ExampleMod.NAME;

public class ExampleModClient {

    public static void initClient() {
        LOGGER.info("{} Client initializing! on platform: {}", NAME, ExampleModExpectPlatform.getPlatformName());
    }
}
