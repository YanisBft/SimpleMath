package com.yanis48.simplemath.items;

import java.util.List;

import com.yanis48.simplemath.init.ModBlocks;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemRadical extends ItemBase
{

	public ItemRadical(String name) {
		super(name);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		if (worldIn.getBlockState(new BlockPos(i, j, k)).getBlock() == ModBlocks.NUMBER_4)
		{
			worldIn.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
		}
		
		if (worldIn.getBlockState(new BlockPos(i, j, k)).getBlock() == ModBlocks.NUMBER_9)
		{
			worldIn.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
		}
		
		return EnumActionResult.PASS;
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("\u00A7e" + I18n.format("item.generic.operation") + " \u00A77" + I18n.format("tile.square_root.name"));
		tooltip.add("");
		tooltip.add("\u00A75" + I18n.format("item.generic.when_used"));
		tooltip.add("\u00A79 " + I18n.format("item.radical.use"));
	}

}
