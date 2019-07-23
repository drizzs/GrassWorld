package com.drizzs.grassworld.creativetab;

import com.drizzs.grassworld.init.ModItems;
import com.drizzs.grassworld.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GrassWorldTab 

{
    public static final CreativeTabs GRASSWORLD = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.ORANGESEED);
        
    }
  };
}

