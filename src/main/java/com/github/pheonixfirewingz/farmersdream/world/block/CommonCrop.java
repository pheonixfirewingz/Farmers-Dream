package com.github.pheonixfirewingz.farmersdream.world.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;

public abstract class CommonCrop extends CropBlock {
    public CommonCrop() {
        super(FabricBlockSettings.copyOf(Blocks.WHEAT));
    }

    protected abstract ItemConvertible getModsSeedsItem();

    @Override
    protected ItemConvertible getSeedsItem() {
        return getModsSeedsItem();
    }
}