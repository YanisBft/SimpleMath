package com.yanis48.simplemath.items;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEqual extends ItemBase
{

	public ItemEqual(String name)
	{
		super(name);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("\u00A7e" + I18n.format("item.generic.operation") + " \u00A77" + I18n.format("tile.equality.name"));
		tooltip.add("");
		tooltip.add("\u00A75" + I18n.format("item.generic.when_used"));
		tooltip.add("\u00A79 " + I18n.format("item.equal.use"));
	}
	
}
