package com.github.pheonixfirewingz.farmersdream.datagen;

import com.github.pheonixfirewingz.farmersdream.world.block.CommonCropBlock7;
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
    }

    private void addCropDropAge7(Block crop_block, Item crop_item, Item crop_seed) {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(crop_block).properties(StatePredicate.Builder.create()
                .exactMatch(CommonCropBlock7.AGE, 7));
        addDrop(crop_block, cropDrops(crop_block, crop_item, crop_seed, builder));
    }
}
