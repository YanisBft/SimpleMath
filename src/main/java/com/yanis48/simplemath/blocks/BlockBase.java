package com.yanis48.simplemath.blocks;

import com.yanis48.simplemath.Main;
import com.yanis48.simplemath.init.ModBlocks;
import com.yanis48.simplemath.init.ModItems;
import com.yanis48.simplemath.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name)
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.SIMPLEMATH);
		
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
