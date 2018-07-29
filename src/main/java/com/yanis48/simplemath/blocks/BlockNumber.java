package com.yanis48.simplemath.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;

public class BlockNumber extends BlockBase
{
	public static final PropertyBool NEGATIVE = PropertyBool.create("negative");
	
	public BlockNumber(String name, Material material) {
		super(name, material);
		this.setDefaultState(this.blockState.getBaseState().withProperty(NEGATIVE, Boolean.valueOf(false)));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, NEGATIVE);
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(NEGATIVE, Boolean.valueOf((meta & 2) != 0));
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		if (((Boolean)state.getValue(NEGATIVE).booleanValue()))
		{
			i |= 2;
		}
		return i;
	}
}
