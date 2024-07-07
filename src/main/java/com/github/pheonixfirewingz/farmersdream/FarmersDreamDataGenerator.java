package com.github.pheonixfirewingz.farmersdream;

import com.github.pheonixfirewingz.farmersdream.datagen.FarmersDreamCropLootTableProvider;
import com.github.pheonixfirewingz.farmersdream.datagen.FarmersDreamModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FarmersDreamDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(FarmersDreamCropLootTableProvider::new);
        pack.addProvider(FarmersDreamModelProvider::new);
    }
}
