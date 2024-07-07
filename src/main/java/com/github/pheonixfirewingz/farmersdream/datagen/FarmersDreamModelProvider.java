package com.github.pheonixfirewingz.farmersdream.datagen;

import com.github.pheonixfirewingz.farmersdream.world.block.CommonCropBlock7;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import static com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock.*;
import static com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems.*;

public class FarmersDreamModelProvider extends FabricModelProvider {

    public FarmersDreamModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(CROP_TOMATO, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_LETTUCE, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CUCUMBER, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_HOPS, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CABBAGE, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_COTTON, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_BAIL, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KOKUMO, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KOHLRAABI, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KUMARA, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_PARSNIP, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RADISH, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RUTABAGA, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_SHALLOT, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_ARROWROOT, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_DAIKON, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_JICAMA, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_TARO, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_ONION, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_GARLIC, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RICE, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_TURNIP, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CASSAVA, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_YAM, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_HORSE_RADISH, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_SWEET_POTATO, CommonCropBlock7.AGE,0,1,2,3,4,5,6,7);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TOMATO, Models.GENERATED);
        itemModelGenerator.register(LETTUCE, Models.GENERATED);
        itemModelGenerator.register(CUCUMBER, Models.GENERATED);
        itemModelGenerator.register(HOPS, Models.GENERATED);
        itemModelGenerator.register(CABBAGE, Models.GENERATED);
        itemModelGenerator.register(COTTON, Models.GENERATED);
        itemModelGenerator.register(BAIL, Models.GENERATED);
        itemModelGenerator.register(KOKUMO, Models.GENERATED);
        itemModelGenerator.register(KOHLRAABI, Models.GENERATED);
        itemModelGenerator.register(KUMARA, Models.GENERATED);
        itemModelGenerator.register(PARSNIP, Models.GENERATED);
        itemModelGenerator.register(RADISH, Models.GENERATED);
        itemModelGenerator.register(RUTABAGA, Models.GENERATED);
        itemModelGenerator.register(SHALLOT, Models.GENERATED);
        itemModelGenerator.register(ARROWROOT, Models.GENERATED);
        itemModelGenerator.register(DAIKON, Models.GENERATED);
        itemModelGenerator.register(JICAMA, Models.GENERATED);
        itemModelGenerator.register(TARO, Models.GENERATED);
        //Seeds
        /*itemModelGenerator.register(TOMATO_SEEDS,Models.GENERATED);
        itemModelGenerator.register(LETTUCE_SEEDS,Models.GENERATED);
        itemModelGenerator.register(CUCUMBER_SEEDS,Models.GENERATED);
        itemModelGenerator.register(HOPS_SEEDS,Models.GENERATED);
        itemModelGenerator.register(CABBAGE_SEEDS,Models.GENERATED);
        itemModelGenerator.register(COTTON_SEEDS,Models.GENERATED);
        itemModelGenerator.register(BAIL_SEEDS,Models.GENERATED);
        itemModelGenerator.register(KOKUMO_SEEDS,Models.GENERATED);
        itemModelGenerator.register(KOHLRAABI_SEEDS,Models.GENERATED);
        itemModelGenerator.register(KUMARA_SEEDS,Models.GENERATED);
        itemModelGenerator.register(PARSNIP_SEEDS,Models.GENERATED);
        itemModelGenerator.register(RADISH_SEEDS,Models.GENERATED);
        itemModelGenerator.register(RUTABAGA_SEEDS,Models.GENERATED);
        itemModelGenerator.register(SHALLOT_SEEDS,Models.GENERATED);
        itemModelGenerator.register(ARROWROOT_SEEDS,Models.GENERATED);
        itemModelGenerator.register(DAIKON_SEEDS,Models.GENERATED);
        itemModelGenerator.register(JICAMA_SEEDS,Models.GENERATED);
        itemModelGenerator.register(TARO_SEEDS,Models.GENERATED);*/
    }
}
