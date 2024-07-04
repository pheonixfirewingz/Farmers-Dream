package com.github.pheonixfirewingz.farmersdream.block;

import com.github.pheonixfirewingz.farmersdream.FarmersDream;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FarmersDreamBlock {

    public static final Block CROP_CABBAGE = registerCropBlock(FarmersDreamItems.CABBAGE_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "cabbage");
    public static final Block CROP_TOMATO = registerCropBlock(FarmersDreamItems.TOMATO_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "tomato");
    public static final Block CROP_LETTUCE = registerCropBlock(FarmersDreamItems.LETTUCE_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "lettuce");
    public static final Block CROP_CUCUMBER = registerCropBlock(FarmersDreamItems.CUCUMBER_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "cucumber");
    public static final Block CROP_HOPS = registerCropBlock(FarmersDreamItems.HOPS_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "hops");
    public static final Block CROP_RICE = registerCropBlock(FarmersDreamItems.RICE, FabricBlockSettings.copyOf(Blocks.WHEAT), "rice");
    public static final Block CROP_ONION = registerCropBlock(FarmersDreamItems.ONION, FabricBlockSettings.copyOf(Blocks.WHEAT), "onion");
    public static final Block CROP_GARLIC = registerCropBlock(FarmersDreamItems.GARLIC, FabricBlockSettings.copyOf(Blocks.WHEAT), "garlic");


    private static Block registerCropBlock(Item seed, FabricBlockSettings settings, String name) {
        return Registry.register(Registries.BLOCK, new Identifier(FarmersDream.MOD_ID, "crop_" + name), new CommonCropBlock7(seed, settings));
    }

    private static Block registerNormalBlock(Block block,String name) {
        Registry.register(Registries.ITEM, new Identifier(FarmersDream.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier(FarmersDream.MOD_ID, name), block);
    }

}
