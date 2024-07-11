package com.github.pheonixfirewingz.farmersdream.datagen;

import com.github.pheonixfirewingz.farmersdream.world.block.CommonCrop;
import com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

import static com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock.*;
import static com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems.*;

public class FarmersDreamCropLootTableProvider extends FabricBlockLootTableProvider {
    public FarmersDreamCropLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addCropDropAge7(CROP_TOMATO, TOMATO, TOMATO_SEEDS);
        addCropDropAge7(CROP_CABBAGE, CABBAGE, CABBAGE_SEEDS);
        addCropDropAge7(CROP_ONION, ONION, ONION);
        addCropDropAge7(CROP_CUCUMBER, CUCUMBER, CUCUMBER_SEEDS);
        addCropDropAge7(CROP_LETTUCE, LETTUCE, LETTUCE_SEEDS);
        addCropDropAge7(CROP_COTTON, COTTON, COTTON_SEEDS);
        addCropDropAge7(CROP_TURNIP, TURNIP, TURNIP);
        addCropDropAge7(CROP_TARO, TARO, TARO_SEEDS);
        addCropDropAge7(CROP_KOKUMO, KOKUMO, KOKUMO_SEEDS);
        addCropDropAge7(CROP_KOHLRAABI, KOHLRAABI, KOHLRAABI_SEEDS);
        addCropDropAge7(CROP_KUMARA, KUMARA, KUMARA_SEEDS);
        addCropDropAge7(CROP_JICAMA, JICAMA, JICAMA_SEEDS);
        addCropDropAge7(CROP_DAIKON, DAIKON, DAIKON_SEEDS);
        addCropDropAge7(CROP_CASSAVA, CASSAVA, CASSAVA);
        addCropDropAge7(CROP_YAM, YAM, YAM);
        addCropDropAge7(CROP_ARROWROOT, ARROWROOT, ARROWROOT_SEEDS);
        addCropDropAge7(CROP_SHALLOT, SHALLOT, SHALLOT_SEEDS);
        addCropDropAge7(CROP_HORSE_RADISH, HORSE_RADISH, HORSE_RADISH_SEEDS);
        addCropDropAge7(CROP_PARSNIP, PARSNIP, PARSNIP_SEEDS);
        addCropDropAge7(CROP_RADISH, RADISH, RADISH_SEEDS);
        addCropDropAge7(CROP_RUTABAGA, RUTABAGA, RUTABAGA_SEEDS);
        addCropDropAge7(CROP_SWEET_POTATO, SWEET_POTATO, SWEET_POTATO);
        addCropDropAge7(CROP_BAIL, BAIL, BAIL_SEEDS);
        addCropDropAge7(CROP_MINT, MINT, MINT_SEEDS);
        addCropDropAge7(CROP_OAT, OAT, OAT_SEEDS);
    }

    private void addCropDropAge7(Block crop_block, Item crop_item, Item crop_seed) {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(crop_block).properties(StatePredicate.Builder.create()
                .exactMatch(CommonCrop.AGE, 7));
        addDrop(crop_block, cropDrops(crop_block, crop_item, crop_seed, builder));
    }
}
