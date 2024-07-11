package com.github.pheonixfirewingz.farmersdream.world.block;

import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.minecraft.item.ItemConvertible;

public class HorseRadishCrop extends CommonCrop {
    @Override
    protected ItemConvertible getModsSeedsItem() {
        return FarmersDreamItems.HORSE_RADISH_SEEDS;
    }
}
