package com.drizzs.grassworld.items.seed.fancy;

import com.drizzs.grassworld.init.ModBlocks;
import com.drizzs.grassworld.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class Fancy_CyanSeed extends Item {

	public Fancy_CyanSeed(String name, CreativeTabs tab)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(16);
        ModItems.ITEMS.add(this);;
    }

    @Override
    public int getMetadata(ItemStack stack) {
        return stack.hasTagCompound() ? 1 : 0;
    }

    @Override
    @Nonnull
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if (!(stack.getItem() instanceof Fancy_CyanSeed))
            return EnumActionResult.PASS;


        
        if (world.getBlockState(pos).getBlock() == Blocks.GRASS) 
        {
        	 	        		
        	world.setBlockState(pos, ModBlocks.FANCY_CYAN_GRASS.getDefaultState());
        		
        
        	
        }
        
        if (world.getBlockState(pos).getBlock() == Blocks.DIRT)  
        {
        	 	        		
        	world.setBlockState(pos, ModBlocks.FANCY_CYAN_GRASS.getDefaultState());
        		     	
        }
        return EnumActionResult.SUCCESS;
    }
   
        
}