package com.github.pheonixfirewingz.farmersdream.world.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class FarmersDreamFoodItem extends Item {
    public FarmersDreamFoodItem(FoodComponent component) {
        super(new FabricItemSettings().food(component).maxCount(64));
    }
}
