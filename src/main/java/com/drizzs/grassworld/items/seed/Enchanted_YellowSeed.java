package com.drizzs.grassworld.items.seed;

import javax.annotation.Nonnull;

import com.drizzs.grassworld.init.ModBlocks;
import com.drizzs.grassworld.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Enchanted_YellowSeed extends ItemBase {
	
	public Enchanted_YellowSeed(String name, CreativeTabs tab) {
        super(name, tab);
		setCreativeTab(tab);
        setUnlocalizedName(name);
        setMaxStackSize(16);
    }

    @Override
    public int getMetadata(ItemStack stack) {
        return stack.hasTagCompound() ? 1 : 0;
    }

    @Override
    @Nonnull
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if (!(stack.getItem() instanceof Enchanted_YellowSeed))
            return EnumActionResult.PASS;


        
        if (world.getBlockState(pos).getBlock() == Blocks.GRASS) 
        {
        	 	        		
        	world.setBlockState(pos, ModBlocks.ENCHANTED_YELLOW_GRASS.getDefaultState());
        		
        
        	
        }
        
        if (world.getBlockState(pos).getBlock() == Blocks.DIRT)  
        {
        	 	        		
        	world.setBlockState(pos, ModBlocks.ENCHANTED_YELLOW_GRASS.getDefaultState());
        		     	
        }
        return EnumActionResult.SUCCESS;
    }
   
        
}