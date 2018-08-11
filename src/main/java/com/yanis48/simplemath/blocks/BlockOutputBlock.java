package com.yanis48.simplemath.blocks;

import com.yanis48.simplemath.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockOutputBlock extends BlockBase
{

	public BlockOutputBlock(String name) {
		super(name);
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state)
	{
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		Block b1 = null;
		Block b2 = null;
		Block b3 = null;
		Block b4 = null;
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.EQUALITY)
		{
			b1 = world.getBlockState(new BlockPos(i - 1, j, k)).getBlock();
			b2 = world.getBlockState(new BlockPos(i - 2, j, k)).getBlock();
			b3 = world.getBlockState(new BlockPos(i - 3, j, k)).getBlock();
			b4 = world.getBlockState(new BlockPos(i - 4, j, k)).getBlock();
		}
		
		if (world.getBlockState(new BlockPos(i + 1, j, k)).getBlock() == ModBlocks.EQUALITY)
		{
			b1 = world.getBlockState(new BlockPos(i + 1, j, k)).getBlock();
			b2 = world.getBlockState(new BlockPos(i + 2, j, k)).getBlock();
			b3 = world.getBlockState(new BlockPos(i + 3, j, k)).getBlock();
			b4 = world.getBlockState(new BlockPos(i + 4, j, k)).getBlock();
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.EQUALITY)
		{
			b1 = world.getBlockState(new BlockPos(i, j, k - 1)).getBlock();
			b2 = world.getBlockState(new BlockPos(i, j, k - 2)).getBlock();
			b3 = world.getBlockState(new BlockPos(i, j, k - 3)).getBlock();
			b4 = world.getBlockState(new BlockPos(i, j, k - 4)).getBlock();
		}
		
		if (world.getBlockState(new BlockPos(i, j, k + 1)).getBlock() == ModBlocks.EQUALITY)
		{
			b1 = world.getBlockState(new BlockPos(i, j, k + 1)).getBlock();
			b2 = world.getBlockState(new BlockPos(i, j, k + 2)).getBlock();
			b3 = world.getBlockState(new BlockPos(i, j, k + 3)).getBlock();
			b4 = world.getBlockState(new BlockPos(i, j, k + 4)).getBlock();
		}
		
		if (b1 == ModBlocks.EQUALITY) {

			if (b3 == ModBlocks.ADDITION) {

				if (b4 == ModBlocks.NUMBER_0) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (b2 == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_1) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_2) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_3) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_4) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_5) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_6) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_7) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_8) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_9) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_X) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Y) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Z) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.DELTA) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.PI) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}

			if (b3 == ModBlocks.SUBTRACTION) {

				if (b4 == ModBlocks.NUMBER_0) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
				}

				if (b4 == ModBlocks.NUMBER_1) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}

				if (b4 == ModBlocks.NUMBER_2) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_3) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_4) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_5) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_6) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_7) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_8) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState().withProperty(BlockNumber.NEGATIVE, true));
					}

				}
				
				if (b4 == ModBlocks.NUMBER_9) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_X) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Y) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Z) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.DELTA) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (b2 == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.PI) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
			}
			
			if (b3 == ModBlocks.MULTIPLICATION) {

				if (b4 == ModBlocks.NUMBER_0) {

					if (b2 == ModBlocks.NUMBER_0 || b2 == ModBlocks.NUMBER_1 || b2 == ModBlocks.NUMBER_2 || b2 == ModBlocks.NUMBER_3 || b2 == ModBlocks.NUMBER_4 || b2 == ModBlocks.NUMBER_5 || b2 == ModBlocks.NUMBER_6 || b2 == ModBlocks.NUMBER_7 || b2 == ModBlocks.NUMBER_8 || b2 == ModBlocks.NUMBER_9 || b2 == ModBlocks.LETTER_X || b2 == ModBlocks.LETTER_Y || b2 == ModBlocks.LETTER_Z || b2 == ModBlocks.DELTA || b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_1) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (b2 == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_2) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_3) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_4) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_5) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_6) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_7) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_8) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_9) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_X) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Y) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Z) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.DELTA) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.PI) {

					if (b2 == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}
			
			if (b3 == ModBlocks.DIVISION) {
				
				if (b2 == ModBlocks.NUMBER_0) {
					Minecraft.getMinecraft().player.sendStatusMessage(new TextComponentString("\u00A7c" + I18n.format("message.error_0")), (true));
				}

				if (b4 == ModBlocks.NUMBER_0) {
					
					if (b2 == ModBlocks.NUMBER_1 || b2 == ModBlocks.NUMBER_2 || b2 == ModBlocks.NUMBER_3 || b2 == ModBlocks.NUMBER_4 || b2 == ModBlocks.NUMBER_5 || b2 == ModBlocks.NUMBER_6 || b2 == ModBlocks.NUMBER_7 || b2 == ModBlocks.NUMBER_8 || b2 == ModBlocks.NUMBER_9 || b2 == ModBlocks.LETTER_X || b2 == ModBlocks.LETTER_Y || b2 == ModBlocks.LETTER_Z || b2 == ModBlocks.DELTA || b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_1) {
					
					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}

				if (b4 == ModBlocks.NUMBER_2) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_3) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_4) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_5) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_6) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_7) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_8) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.NUMBER_9) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (b2 == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_X) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Y) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.LETTER_Z) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (b2 == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.DELTA) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (b2 == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (b4 == ModBlocks.PI) {

					if (b2 == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (b2 == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
			}
			
			if (b3 == ModBlocks.SQUARE_ROOT) {
				
				if (b2 == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (b2 == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (b2 == ModBlocks.NUMBER_4) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
				}
				
				if (b2 == ModBlocks.NUMBER_9) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
				}
				
			}
			
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.NOT_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
				world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
				world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
			}
		
		}			
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.AND_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.OR_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.XOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.NAND_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.NOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.XNOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.IMPLY_BLOCK) {

			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j + 1, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.NOT_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
				world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
				world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
			}
		
		}			
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.AND_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.OR_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.XOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.NAND_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.NOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.XNOR_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.IMPLY_BLOCK) {

			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
			
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {

				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j + 1, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
			
			}
		
		}
	}
	
}
