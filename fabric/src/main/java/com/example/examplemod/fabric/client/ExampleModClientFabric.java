package com.example.examplemod.fabric.client;

import com.example.examplemod.client.ExampleModClient;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModClientFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ExampleModClient.initClient();
    }
}
