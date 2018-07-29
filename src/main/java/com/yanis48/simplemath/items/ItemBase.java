package com.yanis48.simplemath.items;

import java.util.List;

import com.yanis48.simplemath.Main;
import com.yanis48.simplemath.SimpleMathTab;
import com.yanis48.simplemath.init.ModItems;
import com.yanis48.simplemath.util.IHasModel;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.SIMPLEMATH);
		
		maxStackSize = 1;
		
		ModItems.ITEMS.add(this);
	}

	private void setTranslationKey(String name) {

	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
