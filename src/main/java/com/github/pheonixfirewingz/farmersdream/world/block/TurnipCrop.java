package com.github.pheonixfirewingz.farmersdream.world.block;

import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.minecraft.item.ItemConvertible;

public class TurnipCrop extends CommonCrop {
    @Override
    protected ItemConvertible getModsSeedsItem() {
        return FarmersDreamItems.TURNIP;
    }
}
