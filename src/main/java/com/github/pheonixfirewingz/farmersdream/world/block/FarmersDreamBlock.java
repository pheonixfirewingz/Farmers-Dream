package com.github.pheonixfirewingz.farmersdream.world.block;

import com.github.pheonixfirewingz.farmersdream.FarmersDream;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class FarmersDreamBlock {

    public static final Block CROP_CABBAGE = registerCropBlock(FarmersDreamItems.CABBAGE_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "cabbage");
    public static final Block CROP_TOMATO = registerCropBlock(FarmersDreamItems.TOMATO_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "tomato");
    public static final Block CROP_LETTUCE = registerCropBlock(FarmersDreamItems.LETTUCE_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "lettuce");
    public static final Block CROP_CUCUMBER = registerCropBlock(FarmersDreamItems.CUCUMBER_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "cucumber");
    public static final Block CROP_HOPS = registerCropBlock(FarmersDreamItems.HOPS_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "hops");
    public static final Block CROP_RICE = registerCropBlock(FarmersDreamItems.RICE, FabricBlockSettings.copyOf(Blocks.WHEAT), "rice");
    public static final Block CROP_ONION = registerCropBlock(FarmersDreamItems.ONION, FabricBlockSettings.copyOf(Blocks.WHEAT), "onion");
    public static final Block CROP_GARLIC = registerCropBlock(FarmersDreamItems.GARLIC, FabricBlockSettings.copyOf(Blocks.WHEAT), "garlic");
    public static final Block CROP_COTTON = registerCropBlock(FarmersDreamItems.COTTON_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "cotton");
    public static final Block CROP_TURNIP = registerCropBlock(FarmersDreamItems.TURNIP, FabricBlockSettings.copyOf(Blocks.WHEAT), "turnip");
    public static final Block CROP_TARO = registerCropBlock(FarmersDreamItems.TARO_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "taro");
    public static final Block CROP_KOKUMO = registerCropBlock(FarmersDreamItems.KOKUMO_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "kokumo");
    public static final Block CROP_KOHLRAABI = registerCropBlock(FarmersDreamItems.KOHLRAABI_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "kohlraabi");
    public static final Block CROP_KUMARA = registerCropBlock(FarmersDreamItems.KUMARA_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "kumara");
    public static final Block CROP_JICAMA = registerCropBlock(FarmersDreamItems.JICAMA_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "jicama");
    public static final Block CROP_DAIKON = registerCropBlock(FarmersDreamItems.DAIKON_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "daikon");
    public static final Block CROP_CASSAVA = registerCropBlock(FarmersDreamItems.CASSAVA, FabricBlockSettings.copyOf(Blocks.WHEAT), "cassava");
    public static final Block CROP_YAM = registerCropBlock(FarmersDreamItems.YAM, FabricBlockSettings.copyOf(Blocks.WHEAT), "yam");
    public static final Block CROP_ARROWROOT = registerCropBlock(FarmersDreamItems.ARROWROOT_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "arrowroot");
    public static final Block CROP_SHALLOT = registerCropBlock(FarmersDreamItems.SHALLOT_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "shallot");
    public static final Block CROP_HORSE_RADISH = registerCropBlock(FarmersDreamItems.HORSE_RADISH_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "horse_radish");
    public static final Block CROP_PARSNIP = registerCropBlock(FarmersDreamItems.PARSNIP_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "parsnip");
    public static final Block CROP_RADISH = registerCropBlock(FarmersDreamItems.RADISH_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "radish");
    public static final Block CROP_RUTABAGA = registerCropBlock(FarmersDreamItems.RUTABAGA_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "rutabaga");
    public static final Block CROP_SWEET_POTATO = registerCropBlock(FarmersDreamItems.SWEET_POTATO, FabricBlockSettings.copyOf(Blocks.WHEAT), "sweet_potato");
    public static final Block CROP_BAIL = registerCropBlock(FarmersDreamItems.BAIL_SEEDS, FabricBlockSettings.copyOf(Blocks.WHEAT), "bail");

    private static Block registerCropBlock(@NotNull Item seed,@NotNull FabricBlockSettings settings,@NotNull String name) {
        return Registry.register(Registries.BLOCK, new Identifier(FarmersDream.MOD_ID, "crop_" + name), new CommonCropBlock7(seed, settings));
    }
}
