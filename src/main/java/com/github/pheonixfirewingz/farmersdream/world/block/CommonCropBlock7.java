package com.github.pheonixfirewingz.farmersdream.world.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

public class CommonCropBlock7 extends CropBlock {
    public final Item SEED;
    public CommonCropBlock7(Item seed, FabricBlockSettings settings) {
        super(settings);
        SEED = seed;
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return SEED;
    }

}