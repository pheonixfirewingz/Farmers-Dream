package com.github.pheonixfirewingz.farmersdream.world.block;

import com.github.pheonixfirewingz.farmersdream.FarmersDream;
import com.github.pheonixfirewingz.farmersdream.world.item.FarmersDreamItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class FarmersDreamBlock {

    public static final Block CROP_CABBAGE = registerCropBlock(new CabbageCrop(), "cabbage");
    public static final Block CROP_TOMATO = registerCropBlock(new TomatoCrop(), "tomato");
    public static final Block CROP_LETTUCE = registerCropBlock(new LettuceCrop(), "lettuce");
    public static final Block CROP_CUCUMBER = registerCropBlock(new CucumberCrop(), "cucumber");
    public static final Block CROP_HOPS = registerCropBlock(new HopsCrop(), "hops");
    public static final Block CROP_RICE = registerCropBlock(new RiceCrop(), "rice");
    public static final Block CROP_ONION = registerCropBlock(new OnionCrop(), "onion");
    public static final Block CROP_GARLIC = registerCropBlock(new GarlicCrop(), "garlic");
    public static final Block CROP_COTTON = registerCropBlock(new CottonCrop() , "cotton");
    public static final Block CROP_TURNIP = registerCropBlock(new TurnipCrop(), "turnip");
    public static final Block CROP_TARO = registerCropBlock(new TaroCrop(), "taro");
    public static final Block CROP_KOKUMO = registerCropBlock(new KokumoCrop(), "kokumo");
    public static final Block CROP_KOHLRAABI = registerCropBlock(new KohlraabiCrop(), "kohlraabi");
    public static final Block CROP_KUMARA = registerCropBlock(new KumaraCrop(), "kumara");
    public static final Block CROP_JICAMA = registerCropBlock(new JicamaCrop(), "jicama");
    public static final Block CROP_DAIKON = registerCropBlock(new DaikonCrop(), "daikon");
    public static final Block CROP_CASSAVA = registerCropBlock(new CassavaCrop(), "cassava");
    public static final Block CROP_YAM = registerCropBlock(new YamCrop(), "yam");
    public static final Block CROP_ARROWROOT = registerCropBlock(new ArrowrootCrop(), "arrowroot");
    public static final Block CROP_SHALLOT = registerCropBlock(new ShallotCrop(), "shallot");
    public static final Block CROP_HORSE_RADISH = registerCropBlock(new HorseRadishCrop(), "horse_radish");
    public static final Block CROP_PARSNIP = registerCropBlock(new ParsnipCrop(), "parsnip");
    public static final Block CROP_RADISH = registerCropBlock(new RadishCrop(), "radish");
    public static final Block CROP_RUTABAGA = registerCropBlock(new RutabagaCrop(), "rutabaga");
    public static final Block CROP_SWEET_POTATO = registerCropBlock(new SweetPotatoCrop(), "sweet_potato");
    public static final Block CROP_BAIL = registerCropBlock(new BailCrop(), "bail");
    public static final Block CROP_MINT = registerCropBlock(new MintCrop(), "mint");
    public static final Block CROP_OAT = registerCropBlock(new OatCrop(), "oat");

    @Environment(EnvType.CLIENT)
    private static void renderRegisterLayers(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        renderRegisterLayers(CROP_COTTON);
        renderRegisterLayers(CROP_TURNIP);
        renderRegisterLayers(CROP_TARO);
        renderRegisterLayers(CROP_KOKUMO);
        renderRegisterLayers(CROP_KOHLRAABI);
        renderRegisterLayers(CROP_KUMARA);
        renderRegisterLayers(CROP_JICAMA);
        renderRegisterLayers(CROP_DAIKON);
        renderRegisterLayers(CROP_CASSAVA);
        renderRegisterLayers(CROP_YAM);
        renderRegisterLayers(CROP_ARROWROOT);
        renderRegisterLayers(CROP_SHALLOT);
        renderRegisterLayers(CROP_HORSE_RADISH);
        renderRegisterLayers(CROP_PARSNIP);
        renderRegisterLayers(CROP_RADISH);
        renderRegisterLayers(CROP_RUTABAGA);
        renderRegisterLayers(CROP_SWEET_POTATO);
        renderRegisterLayers(CROP_BAIL);
        renderRegisterLayers(CROP_MINT);
        renderRegisterLayers(CROP_OAT);
    }

    private static Block registerCropBlock(@NotNull CommonCrop crop, @NotNull String name) {
        return Registry.register(Registries.BLOCK, new Identifier(FarmersDream.MOD_ID, "crop_" + name), crop);
    }


}
