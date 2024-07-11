package com.github.pheonixfirewingz.farmersdream.world.loottable;

import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class MinecraftLootTableModifier {
    public static final Identifier GRASS_LOOT_TABLE_ID = Blocks.GRASS.getLootTableId();
    public static final Identifier FERN_LOOT_TABLE_ID = Blocks.FERN.getLootTableId();

    public static void registerLootTableEvents() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && GRASS_LOOT_TABLE_ID.equals(id)) {
                tableBuilder.pool(register());
            }
            if (source.isBuiltin() && FERN_LOOT_TABLE_ID.equals(id)) {
                tableBuilder.pool(register());
            }
        });
    }

    private static LootPool.Builder register() {
        LootPool.Builder poolBuilder = LootPool.builder();
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.LETTUCE));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.TOMATO));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.CUCUMBER));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.HOPS));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.CABBAGE));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.COTTON));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.TARO));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.KOKUMO));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.KOHLRAABI));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.KUMARA));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.JICAMA));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.DAIKON));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.ARROWROOT));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.SHALLOT));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.PARSNIP));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.RADISH));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.HORSE_RADISH));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.RUTABAGA));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.BAIL));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.MINT));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.OAT));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.ONION));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.GARLIC));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.RICE));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.SWEET_POTATO));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.YAM));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.TURNIP));
        poolBuilder.with(ItemEntry.builder(FarmersDreamItems.CASSAVA));
        return poolBuilder;
    }
}
