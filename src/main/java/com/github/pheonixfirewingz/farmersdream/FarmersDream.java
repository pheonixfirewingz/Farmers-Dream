package com.github.pheonixfirewingz.farmersdream;

import com.github.pheonixfirewingz.farmersdream.block.FarmersDreamBlock;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.api.ModInitializer;

public class FarmersDream implements ModInitializer {
    public FarmersDreamItems items;
    public FarmersDreamBlock blocks;
    public static final String MOD_ID = "farmersdream";
    @Override
    public void onInitialize() {
        items = new FarmersDreamItems();
        blocks = new FarmersDreamBlock();
    }
}
