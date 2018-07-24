package com.yanis48.simplemath.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;

public class BlockNumber extends BlockBase
{
	public BlockNumber(String name, Material material) {
		super(name, material);
	}
	
	public static final PropertyBool NEGATIVE = PropertyBool.create("negative");
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {NEGATIVE});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(NEGATIVE, false);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		if (((boolean)state.getValue(NEGATIVE)))
		{
			i |= 2;
		}
		return i;
		
	}
}
