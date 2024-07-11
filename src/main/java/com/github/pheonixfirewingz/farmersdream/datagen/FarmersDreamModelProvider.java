package com.github.pheonixfirewingz.farmersdream.datagen;

import com.github.pheonixfirewingz.farmersdream.world.block.CommonCrop;
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
        blockStateModelGenerator.registerCrop(CROP_TOMATO, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_LETTUCE, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CUCUMBER, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_HOPS, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CABBAGE, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_COTTON, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_BAIL, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KOKUMO, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KOHLRAABI, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_KUMARA, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_PARSNIP, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RADISH, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RUTABAGA, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_SHALLOT, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_ARROWROOT, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_DAIKON, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_JICAMA, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_TARO, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_ONION, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_GARLIC, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_RICE, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_TURNIP, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_CASSAVA, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_YAM, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_HORSE_RADISH, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_SWEET_POTATO, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_MINT, CommonCrop.AGE,0,1,2,3,4,5,6,7);
        blockStateModelGenerator.registerCrop(CROP_OAT, CommonCrop.AGE,0,1,2,3,4,5,6,7);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(COOKED_RICE, Models.GENERATED);
        itemModelGenerator.register(CHEDDAR, Models.GENERATED);
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
        itemModelGenerator.register(MINT, Models.GENERATED);
        itemModelGenerator.register(OAT, Models.GENERATED);
    }
}
