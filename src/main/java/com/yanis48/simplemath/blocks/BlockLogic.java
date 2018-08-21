package com.yanis48.simplemath.blocks;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockLogic extends BlockBase
{
	public static final PropertyEnum<LogicDirection> DIRECTION = PropertyEnum.<LogicDirection>create("direction", LogicDirection.class);
	
	public BlockLogic(String name) {
		super(name);
		this.setDefaultState(this.blockState.getBaseState().withProperty(DIRECTION, LogicDirection.RIGHT));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, DIRECTION);
	}
	
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
		if (placer.getHorizontalFacing() == facing.SOUTH || placer.getHorizontalFacing() == facing.EAST)
		{
			return this.getDefaultState().withProperty(DIRECTION, LogicDirection.LEFT);
		}
		else
		{
			return this.getDefaultState().withProperty(DIRECTION, LogicDirection.RIGHT);
		}
    }
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(DIRECTION, (meta & 1) > 0 ? LogicDirection.LEFT : LogicDirection.RIGHT);
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		if (state.getValue(DIRECTION) == LogicDirection.LEFT)
        {
            i |= 1;
        }

        return i;
	}
	
	public static enum LogicDirection implements IStringSerializable
	{
		LEFT,
		RIGHT;
		
		public String toString()
        {
            return this.getName();
        }

        public String getName()
        {
            return this == LEFT ? "left" : "right";
        }
	}
}
