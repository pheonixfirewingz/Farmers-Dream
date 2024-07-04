package com.github.pheonixfirewingz.farmersdream.world.item;

import com.github.pheonixfirewingz.farmersdream.FarmersDream;
import com.github.pheonixfirewingz.farmersdream.block.FarmersDreamBlock;
import com.github.pheonixfirewingz.farmersdream.world.food.FarmersDreamFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FarmersDreamItems {
    public static final Item LETTUCE = registerFood(FarmersDreamFood.LETTUCE,"lettuce");
    public static final Item TOMATO = registerFood(FarmersDreamFood.TOMATO,"tomato");
    public static final Item CUCUMBER = registerFood(FarmersDreamFood.CUCUMBER,"cucumber");
    public static final Item CHEDDAR = registerFood(FarmersDreamFood.CHEDDAR,"cheddar");
    public static final Item HOPS = registerFood(FarmersDreamFood.HOPS,"hops");
    public static final Item CABBAGE = registerFood(FarmersDreamFood.CABBAGE,"cabbage");

    public static final Item ONION = registerSeeds(FarmersDreamBlock.CROP_ONION,"onion");
    public static final Item GARLIC = registerSeeds(FarmersDreamBlock.CROP_GARLIC,"garlic");
    public static final Item RICE = registerSeeds(FarmersDreamBlock.CROP_RICE,"rice");

    public static final Item TOMATO_SEEDS = registerSeeds(FarmersDreamBlock.CROP_TOMATO,"tomato");
    public static final Item LETTUCE_SEEDS = registerSeeds(FarmersDreamBlock.CROP_LETTUCE,"lettuce");
    public static final Item CUCUMBER_SEEDS = registerSeeds(FarmersDreamBlock.CROP_CUCUMBER,"cucumber");
    public static final Item HOPS_SEEDS = registerSeeds(FarmersDreamBlock.CROP_HOPS,"hops");
    public static final Item CABBAGE_SEEDS = registerSeeds(FarmersDreamBlock.CROP_CABBAGE,"cabbage");

    private static Item registerSeeds(Block block,String name) {
        return register(new AliasedBlockItem(block,new FabricItemSettings()),"seeds_" + name);
    }

    private static Item registerFood(FoodComponent component,String name) {
        return register(new FarmersDreamFoodItem(component),"food_" + name);
    }

    private static Item register(Item item,String name) {
        return Registry.register(Registries.ITEM,new Identifier(FarmersDream.MOD_ID,name),item);
    }
}
