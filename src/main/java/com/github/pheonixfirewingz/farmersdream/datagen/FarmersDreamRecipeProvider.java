package com.github.pheonixfirewingz.farmersdream.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

import static com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock.*;
import static com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock.CROP_OAT;
import static com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems.*;

public class FarmersDreamRecipeProvider extends FabricRecipeProvider {
    private Consumer<RecipeJsonProvider> exporter;
    public FarmersDreamRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter_in) {
        exporter = exporter_in;
        addSeedCraft(TOMATO, TOMATO_SEEDS);
        addSeedCraft(CABBAGE, CABBAGE_SEEDS);
        addSeedCraft(CUCUMBER, CUCUMBER_SEEDS);
        addSeedCraft(LETTUCE, LETTUCE_SEEDS);
        addSeedCraft(COTTON, COTTON_SEEDS);
        addSeedCraft(TARO, TARO_SEEDS);
        addSeedCraft(KOKUMO, KOKUMO_SEEDS);
        addSeedCraft(KOHLRAABI, KOHLRAABI_SEEDS);
        addSeedCraft(KUMARA, KUMARA_SEEDS);
        addSeedCraft(JICAMA, JICAMA_SEEDS);
        addSeedCraft(DAIKON, DAIKON_SEEDS);
        addSeedCraft(ARROWROOT, ARROWROOT_SEEDS);
        addSeedCraft(SHALLOT, SHALLOT_SEEDS);
        addSeedCraft(HORSE_RADISH, HORSE_RADISH_SEEDS);
        addSeedCraft(PARSNIP, PARSNIP_SEEDS);
        addSeedCraft(RADISH, RADISH_SEEDS);
        addSeedCraft(RUTABAGA, RUTABAGA_SEEDS);
        addSeedCraft(BAIL, BAIL_SEEDS);
        addSeedCraft(MINT, MINT_SEEDS);
        addSeedCraft(OAT, OAT_SEEDS);

        addCookingRecipe(RICE,COOKED_RICE);
    }

    private void addSeedCraft(Item food, Item seed) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, seed,4).input(food).criterion(hasItem(food),conditionsFromItem(food)).offerTo(exporter);
    }

    private void addCookingRecipe(Item food, Item cooked_food) {
        offerSmelting(exporter, List.of(food),RecipeCategory.FOOD, cooked_food, 0.35F, 200, cooked_food.getTranslationKey());
    }
}
