package com.yanis48.simplemath.blocks;

import com.yanis48.simplemath.init.ModBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockOutputBlock extends BlockBase
{

	public BlockOutputBlock(String name, Material material) {
		super(name, material);
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state)
	{
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		if (world.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == ModBlocks.EQUALITY) {

			if (world.getBlockState(new BlockPos(i - 3, j, k)).getBlock() == ModBlocks.ADDITION) {

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}

			if (world.getBlockState(new BlockPos(i - 3, j, k)).getBlock() == ModBlocks.SUBTRACTION) {

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i - 3, j, k)).getBlock() == ModBlocks.MULTIPLICATION) {

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i - 3, j, k)).getBlock() == ModBlocks.DIVISION) {
				
				if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					Minecraft.getMinecraft().player.sendStatusMessage(new TextComponentString("\u00A7c" + I18n.format("message.error_0")), (true));
				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i - 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i - 3, j, k)).getBlock() == ModBlocks.SQUARE_ROOT) {
				
				if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i - 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
				}
				
			}
			
		}
		
		if (world.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == ModBlocks.EQUALITY) {

			if (world.getBlockState(new BlockPos(i, j, k - 3)).getBlock() == ModBlocks.ADDITION) {

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}

			if (world.getBlockState(new BlockPos(i, j, k - 3)).getBlock() == ModBlocks.SUBTRACTION) {

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 3)).getBlock() == ModBlocks.MULTIPLICATION) {

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 3)).getBlock() == ModBlocks.DIVISION) {
				
				if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					Minecraft.getMinecraft().player.sendStatusMessage(new TextComponentString("\u00A7c" + I18n.format("message.error_0")), (true));
				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_0) {
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_1) {
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k - 3)).getBlock() == ModBlocks.SQUARE_ROOT) {
				
				if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_4) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k - 2)).getBlock() == ModBlocks.NUMBER_9) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
				}
				
			}
			
		}
		
		if (world.getBlockState(new BlockPos(i + 1, j, k)).getBlock() == ModBlocks.EQUALITY) {

			if (world.getBlockState(new BlockPos(i + 3, j, k)).getBlock() == ModBlocks.ADDITION) {

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}

			if (world.getBlockState(new BlockPos(i + 3, j, k)).getBlock() == ModBlocks.SUBTRACTION) {

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i + 3, j, k)).getBlock() == ModBlocks.MULTIPLICATION) {

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i + 3, j, k)).getBlock() == ModBlocks.DIVISION) {
				
				if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					Minecraft.getMinecraft().player.sendStatusMessage(new TextComponentString("\u00A7c" + I18n.format("message.error_0")), (true));
				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_1) {
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i + 4, j, k)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i + 3, j, k)).getBlock() == ModBlocks.SQUARE_ROOT) {
				
				if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_4) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i + 2, j, k)).getBlock() == ModBlocks.NUMBER_9) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
				}
				
			}
			
		}
		
		if (world.getBlockState(new BlockPos(i, j, k + 1)).getBlock() == ModBlocks.EQUALITY) {

			if (world.getBlockState(new BlockPos(i, j, k + 3)).getBlock() == ModBlocks.ADDITION) {

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}

			if (world.getBlockState(new BlockPos(i, j, k + 3)).getBlock() == ModBlocks.SUBTRACTION) {

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k + 3)).getBlock() == ModBlocks.MULTIPLICATION) {

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_0) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_1) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k + 3)).getBlock() == ModBlocks.DIVISION) {
				
				if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
					Minecraft.getMinecraft().player.sendStatusMessage(new TextComponentString("\u00A7c" + I18n.format("message.error_0")), (true));
				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_0) {
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9 || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA || world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_1) {
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}

				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_2) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_3) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_4) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_5) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_5.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_5) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_6) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_6.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_6) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_7) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_7.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_7) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_8) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_8.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_2) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_4.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_8) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.NUMBER_9) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_9.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_3) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_3.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_X) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_X.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_X) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Y) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Y.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Y) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.LETTER_Z) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.LETTER_Z.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.LETTER_Z) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.DELTA) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.DELTA.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.DELTA) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 4)).getBlock() == ModBlocks.PI) {

					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.PI.getDefaultState());
					}
					
					if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.PI) {
						world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
					}

				}
				
			}
			
			if (world.getBlockState(new BlockPos(i, j, k + 3)).getBlock() == ModBlocks.SQUARE_ROOT) {
				
				if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_0) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_0.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_1) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_1.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_4) {
					world.setBlockState(new BlockPos(i, j, k), ModBlocks.NUMBER_2.getDefaultState());
				}
				
				if (world.getBlockState(new BlockPos(i, j, k + 2)).getBlock() == ModBlocks.NUMBER_9) {
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
