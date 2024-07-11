package com.github.pheonixfirewingz.farmersdream;

import com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class FarmersDreamClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FarmersDreamBlock.registerRenderLayers();
    }
}
