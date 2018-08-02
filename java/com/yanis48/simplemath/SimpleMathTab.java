package com.yanis48.simplemath;

import com.yanis48.simplemath.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SimpleMathTab extends CreativeTabs
{
	public SimpleMathTab(String label)
	{
		super("simplemath");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.NUMBER_0));
	}
}
