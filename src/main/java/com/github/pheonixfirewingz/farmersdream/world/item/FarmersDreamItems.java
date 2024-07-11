package com.github.pheonixfirewingz.farmersdream.world.item;

import com.github.pheonixfirewingz.farmersdream.FarmersDream;
import com.github.pheonixfirewingz.farmersdream.world.block.FarmersDreamBlock;
import com.github.pheonixfirewingz.farmersdream.world.food.FarmersDreamFood;
import com.google.common.base.CaseFormat;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.github.pheonixfirewingz.farmersdream.FarmersDream.MOD_LOGGER;

public class FarmersDreamItems {
    public static final Item CHEDDAR = registerFood(FarmersDreamFood.CHEDDAR,"cheddar");
    public static final Item COOKED_RICE = registerFood(FarmersDreamFood.COOKED_RICE,"cooked_rice");

    public static final Item LETTUCE = registerFood(FarmersDreamFood.LETTUCE,"lettuce");
    public static final Item TOMATO = registerFood(FarmersDreamFood.TOMATO,"tomato");
    public static final Item CUCUMBER = registerFood(FarmersDreamFood.CUCUMBER,"cucumber");
    public static final Item HOPS = registerFood(FarmersDreamFood.HOPS,"hops");
    public static final Item CABBAGE = registerFood(FarmersDreamFood.CABBAGE,"cabbage");
    public static final Item COTTON = registersNonFood("cotton");
    public static final Item TARO = registerFood(FarmersDreamFood.TARO,"taro");
    public static final Item KOKUMO = registerFood(FarmersDreamFood.KOKUMO,"kokumo");
    public static final Item KOHLRAABI = registerFood(FarmersDreamFood.KOHLRAABI,"kohlrabi");
    public static final Item KUMARA = registerFood(FarmersDreamFood.KUMARA,"kumara");
    public static final Item JICAMA = registerFood(FarmersDreamFood.JICAMA,"jicama");
    public static final Item DAIKON = registerFood(FarmersDreamFood.DAIKON,"daikon");
    public static final Item ARROWROOT = registerFood(FarmersDreamFood.ARROWROOT,"arrowroot");
    public static final Item SHALLOT = registerFood(FarmersDreamFood.SHALLOT,"shallot");
    public static final Item PARSNIP = registerFood(FarmersDreamFood.PARSNIP,"parsnip");
    public static final Item RADISH = registerFood(FarmersDreamFood.RADISH,"radish");
    public static final Item HORSE_RADISH = registerFood(FarmersDreamFood.HORSE_RADISH,"horse_radish");
    public static final Item RUTABAGA = registerFood(FarmersDreamFood.RUTABAGA,"rutabaga");
    public static final Item BAIL = registerFood(FarmersDreamFood.BAIL,"bail");
    public static final Item MINT = registerFood(FarmersDreamFood.MINT,"mint");
    public static final Item OAT = registerFood(FarmersDreamFood.OAT,"oat");

    public static final Item TOMATO_SEEDS = registerSeeds(FarmersDreamBlock.CROP_TOMATO,"tomato");
    public static final Item LETTUCE_SEEDS = registerSeeds(FarmersDreamBlock.CROP_LETTUCE,"lettuce");
    public static final Item CUCUMBER_SEEDS = registerSeeds(FarmersDreamBlock.CROP_CUCUMBER,"cucumber");
    public static final Item HOPS_SEEDS = registerSeeds(FarmersDreamBlock.CROP_HOPS,"hops");
    public static final Item CABBAGE_SEEDS = registerSeeds(FarmersDreamBlock.CROP_CABBAGE,"cabbage");
    public static final Item COTTON_SEEDS = registerSeeds(FarmersDreamBlock.CROP_COTTON,"cotton");
    public static final Item TARO_SEEDS = registerSeeds(FarmersDreamBlock.CROP_TARO,"taro");
    public static final Item KOKUMO_SEEDS = registerSeeds(FarmersDreamBlock.CROP_KOKUMO,"kokumo");
    public static final Item KOHLRAABI_SEEDS = registerSeeds(FarmersDreamBlock.CROP_KOHLRAABI,"kohlrabi");
    public static final Item KUMARA_SEEDS = registerSeeds(FarmersDreamBlock.CROP_KUMARA,"kumara");
    public static final Item JICAMA_SEEDS = registerSeeds(FarmersDreamBlock.CROP_JICAMA,"jicama");
    public static final Item DAIKON_SEEDS = registerSeeds(FarmersDreamBlock.CROP_DAIKON,"daikon");
    public static final Item ARROWROOT_SEEDS = registerSeeds(FarmersDreamBlock.CROP_ARROWROOT,"arrowroot");
    public static final Item SHALLOT_SEEDS = registerSeeds(FarmersDreamBlock.CROP_SHALLOT,"shallot");
    public static final Item HORSE_RADISH_SEEDS = registerSeeds(FarmersDreamBlock.CROP_HORSE_RADISH,"horse_radish");
    public static final Item PARSNIP_SEEDS = registerSeeds(FarmersDreamBlock.CROP_PARSNIP,"parsnip");
    public static final Item RADISH_SEEDS = registerSeeds(FarmersDreamBlock.CROP_RADISH,"radish");
    public static final Item RUTABAGA_SEEDS = registerSeeds(FarmersDreamBlock.CROP_RUTABAGA,"rutabaga");
    public static final Item BAIL_SEEDS = registerSeeds(FarmersDreamBlock.CROP_BAIL,"bail");
    public static final Item MINT_SEEDS = registerSeeds(FarmersDreamBlock.CROP_MINT,"mint");
    public static final Item OAT_SEEDS = registerSeeds(FarmersDreamBlock.CROP_OAT,"oat");

    public static final Item ONION = registerEdibleSeeds(FarmersDreamBlock.CROP_ONION,FarmersDreamFood.ONION,"onion");
    public static final Item GARLIC = registerEdibleSeeds(FarmersDreamBlock.CROP_GARLIC,FarmersDreamFood.GARLIC,"garlic");
    public static final Item RICE = registerEdibleSeeds(FarmersDreamBlock.CROP_RICE,FarmersDreamFood.RICE,"rice");
    public static final Item SWEET_POTATO = registerEdibleSeeds(FarmersDreamBlock.CROP_SWEET_POTATO,FarmersDreamFood.SWEET_POTATO,"sweet_potato");
    public static final Item YAM = registerEdibleSeeds(FarmersDreamBlock.CROP_YAM,FarmersDreamFood.YAM,"yam");
    public static final Item TURNIP = registerEdibleSeeds(FarmersDreamBlock.CROP_TURNIP,FarmersDreamFood.TURNIP,"turnip");
    public static final Item CASSAVA = registerEdibleSeeds(FarmersDreamBlock.CROP_CASSAVA,FarmersDreamFood.CASSAVA,"cassava");

    private static Item registerSeeds(Block block, @NotNull String name) {
        return register(new AliasedBlockItem(block,new FabricItemSettings()),"seeds_" + name,name + " seeds");
    }

    private static Item registerEdibleSeeds(Block block,FoodComponent component,@NotNull String name) {
        return register(new AliasedBlockItem(block,new FabricItemSettings().food(component)),"edible_seeds_" + name,name);
    }

    private static Item registerFood(FoodComponent component,@NotNull String name) {
        return register(new FarmersDreamFoodItem(component),"food_" + name,name);
    }

    private static Item registersNonFood(@NotNull String name) {
        return register(new Item(new FabricItemSettings()), name, name);
    }

    private static Item register(@NotNull Item item,@NotNull String name,@NotNull String normalizedName) {
        //MOD_LOGGER.info("\"item.farmersdream." + name + "\":\"" + CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, normalizedName) + "\"");
        //MOD_LOGGER.info(normalizedName.toUpperCase());
        return Registry.register(Registries.ITEM,new Identifier(FarmersDream.MOD_ID,name),item);
    }
}
