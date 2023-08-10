package cn.tlscstudios.easiertravelcraft.fabric.datagen;

import cn.tlscstudios.easiertravelcraft.datagen.EasierTravelCraftModDataGenInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EasierTravelCraftModDataGenFabric implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        EasierTravelCraftModDataGenInit.initDataGen();
        TestDataGen.init();
    }
}
