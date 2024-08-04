package com.github.pheonixfirewingz.farmersdream.world.food;

import net.minecraft.item.FoodComponent;

public class FarmersDreamFood {
    //TODO: we need to set the correct values
    public static final FoodComponent COOKED_RICE = makeFood(1,0.1f);
    public static final FoodComponent LETTUCE = makeFood(1,0.1f);
    public static final FoodComponent TOMATO = makeFood(1,0.1f);
    public static final FoodComponent CUCUMBER = makeFood(1,0.1f);
    public static final FoodComponent CHEDDAR = makeFood(1,0.1f);
    public static final FoodComponent CABBAGE = makeFood(1,0.1f);
    public static final FoodComponent HOPS = makeFood(1,0.1f);
    public static final FoodComponent TARO = makeFood(1,0.1f);
    public static final FoodComponent KOKUMO = makeFood(1,0.1f);
    public static final FoodComponent KOHLRAABI = makeFood(1,0.1f);
    public static final FoodComponent KUMARA =makeFood(1,0.1f);
    public static final FoodComponent JICAMA = makeFood(1,0.1f);
    public static final FoodComponent DAIKON = makeFood(1,0.1f);
    public static final FoodComponent ARROWROOT = makeFood(1,0.1f);
    public static final FoodComponent SHALLOT = makeFood(1,0.1f);
    public static final FoodComponent PARSNIP = makeFood(1,0.1f);
    public static final FoodComponent RADISH = makeFood(1,0.1f);
    public static final FoodComponent RUTABAGA = makeFood(1,0.1f);
    public static final FoodComponent ONION = makeFood(1,0.1f);
    public static final FoodComponent GARLIC = makeFood(1,0.1f);
    public static final FoodComponent RICE = makeFood(1,0.1f);
    public static final FoodComponent SWEET_POTATO = makeFood(1,0.1f);
    public static final FoodComponent YAM = makeFood(1,0.1f);
    public static final FoodComponent TURNIP = makeFood(1,0.1f);
    public static final FoodComponent CASSAVA = makeFood(1,0.1f);
    public static final FoodComponent BAIL = makeFood(1,0.1f);
    public static final FoodComponent MINT = makeFood(1,0.1f);
    public static final FoodComponent OAT = makeFood(1,0.1f);
    public static final FoodComponent HORSE_RADISH = makeFood(1,0.1f);

    private static FoodComponent makeFood(int hunger, float saturation) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build();
    }
}
