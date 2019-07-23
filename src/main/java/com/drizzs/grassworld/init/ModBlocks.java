package com.drizzs.grassworld.init;



import com.drizzs.grassworld.blocks.grass.ActualGrass_Black;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Blue;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Green;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Magenta;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Orange;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Pink;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Purple;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Red;
import com.drizzs.grassworld.blocks.grass.ActualGrass_White;
import com.drizzs.grassworld.blocks.grass.ActualGrass_Yellow;
import com.drizzs.grassworld.blocks.grassblock.BlackGrass;
import com.drizzs.grassworld.blocks.grassblock.BlueGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedBlackGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedBlueGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedGreenGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedMagentaGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedOrangeGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedPinkGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedPurpleGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedRedGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedWhiteGrass;
import com.drizzs.grassworld.blocks.grassblock.EnchantedYellowGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyBlackGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyBlueGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyGreenGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyMagentaGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyOrangeGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyPinkGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyPurpleGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyRedGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyWhiteGrass;
import com.drizzs.grassworld.blocks.grassblock.FancyYellowGrass;
import com.drizzs.grassworld.blocks.grassblock.GreenGrass;
import com.drizzs.grassworld.blocks.grassblock.MagentaGrass;
import com.drizzs.grassworld.blocks.grassblock.OrangeGrass;
import com.drizzs.grassworld.blocks.grassblock.PinkGrass;
import com.drizzs.grassworld.blocks.grassblock.PurpleGrass;
import com.drizzs.grassworld.blocks.grassblock.RedGrass;
import com.drizzs.grassworld.blocks.grassblock.WhiteGrass;
import com.drizzs.grassworld.blocks.grassblock.YellowGrass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();


    public static final Block ORANGE_GRASS = new OrangeGrass("orange_grass");
    public static final Block BLUE_GRASS = new BlueGrass("blue_grass");
    public static final Block GREEN_GRASS = new GreenGrass("green_grass");
    public static final Block YELLOW_GRASS = new YellowGrass("yellow_grass");
    public static final Block WHITE_GRASS = new WhiteGrass("white_grass");
    public static final Block RED_GRASS = new RedGrass("red_grass");
    public static final Block PINK_GRASS = new PinkGrass("pink_grass");
    public static final Block PURPLE_GRASS = new PurpleGrass("purple_grass");
    public static final Block BLACK_GRASS = new BlackGrass("black_grass");
    public static final Block MAGENTA_GRASS = new MagentaGrass("magenta_grass");

    public static final Block FANCY_ORANGE_GRASS = new FancyOrangeGrass("fancy_orange_grass");
    public static final Block FANCY_BLUE_GRASS = new FancyBlueGrass("fancy_blue_grass");
    public static final Block FANCY_GREEN_GRASS = new FancyGreenGrass("fancy_green_grass");
    public static final Block FANCY_YELLOW_GRASS = new FancyYellowGrass("fancy_yellow_grass");
    public static final Block FANCY_WHITE_GRASS = new FancyWhiteGrass("fancy_white_grass");
    public static final Block FANCY_RED_GRASS = new FancyRedGrass("fancy_red_grass");
    public static final Block FANCY_PINK_GRASS = new FancyPinkGrass("fancy_pink_grass");
    public static final Block FANCY_PURPLE_GRASS = new FancyPurpleGrass("fancy_purple_grass");
    public static final Block FANCY_BLACK_GRASS = new FancyBlackGrass("fancy_black_grass");
    public static final Block FANCY_MAGENTA_GRASS = new FancyMagentaGrass("fancy_magenta_grass");

    public static final Block ENCHANTED_ORANGE_GRASS = new EnchantedOrangeGrass("enchanted_orange_grass");
    public static final Block ENCHANTED_BLUE_GRASS = new EnchantedBlueGrass("enchanted_blue_grass");
    public static final Block ENCHANTED_GREEN_GRASS = new EnchantedGreenGrass("enchanted_green_grass");
    public static final Block ENCHANTED_YELLOW_GRASS = new EnchantedYellowGrass("enchanted_yellow_grass");
    public static final Block ENCHANTED_WHITE_GRASS = new EnchantedWhiteGrass("enchanted_white_grass");
    public static final Block ENCHANTED_RED_GRASS = new EnchantedRedGrass("enchanted_red_grass");
    public static final Block ENCHANTED_PINK_GRASS = new EnchantedPinkGrass("enchanted_pink_grass");
    public static final Block ENCHANTED_PURPLE_GRASS = new EnchantedPurpleGrass("enchanted_purple_grass");
    public static final Block ENCHANTED_BLACK_GRASS = new EnchantedBlackGrass("enchanted_black_grass");
    public static final Block ENCHANTED_MAGENTA_GRASS = new EnchantedMagentaGrass("enchanted_magenta_grass");
    
    public static final Block ACTUALGRASS_ORANGE = new ActualGrass_Orange("actualgrass_orange", Material.GRASS);
    public static final Block ACTUALGRASS_BLUE = new ActualGrass_Blue("actualgrass_blue", Material.GRASS);
    public static final Block ACTUALGRASS_YELLOW = new ActualGrass_Yellow("actualgrass_yellow", Material.GRASS);
    public static final Block ACTUALGRASS_GREEN = new ActualGrass_Green("actualgrass_green", Material.GRASS);
    public static final Block ACTUALGRASS_RED = new ActualGrass_Red("actualgrass_red", Material.GRASS);
    public static final Block ACTUALGRASS_WHITE = new ActualGrass_White("actualgrass_white", Material.GRASS);
    public static final Block ACTUALGRASS_PURPLE = new ActualGrass_Purple("actualgrass_purple", Material.GRASS);
    public static final Block ACTUALGRASS_PINK = new ActualGrass_Pink("actualgrass_pink", Material.GRASS);
    public static final Block ACTUALGRASS_BLACK = new ActualGrass_Black("actualgrass_black", Material.GRASS);
    public static final Block ACTUALGRASS_MAGENTA = new ActualGrass_Magenta("actualgrass_magenta", Material.GRASS);
    




}
