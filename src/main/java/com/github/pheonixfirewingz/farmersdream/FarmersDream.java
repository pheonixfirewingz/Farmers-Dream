package com.github.pheonixfirewingz.farmersdream;

import com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import com.github.pheonixfirewingz.farmersdream.world.loottable.MinecraftLootTableModifier;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;

public class FarmersDream implements ModInitializer {
    public static final String MOD_ID = "farmersdream";
    public static final Logger MOD_LOGGER = LogManager.getLogger(MOD_ID);
    public FarmersDreamItems items;
    public FarmersDreamBlock blocks;
    @Override
    public void onInitialize() {
        items = new FarmersDreamItems();
        blocks = new FarmersDreamBlock();
        MinecraftLootTableModifier.registerLootTableEvents();
    }
}
