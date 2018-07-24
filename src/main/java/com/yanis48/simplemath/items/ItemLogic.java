package com.yanis48.simplemath.items;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLogic extends ItemBase
{

	public ItemLogic(String name)
	{
		super(name);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("\u00A7e" + I18n.format("item.generic.logic_gate") + " \u00A77" + I18n.format(getUnlocalizedName() + ".name"));
	}
	
}
