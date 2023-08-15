package cn.mrcraftteammc.mrscrafttown.fabric.datagen;

import cn.mrcraftteammc.mrscrafttown.datagen.MrsCraftTownModDataGenInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MrsCraftTownModDataGenFabric implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        MrsCraftTownModDataGenInit.initDataGen();
        TestDataGen.init();
    }
}
