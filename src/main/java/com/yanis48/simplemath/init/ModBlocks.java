package com.yanis48.simplemath.init;

import java.util.ArrayList;
import java.util.List;

import com.yanis48.simplemath.blocks.BlockBase;
import com.yanis48.simplemath.blocks.BlockNumber;
import com.yanis48.simplemath.blocks.BlockOutputBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OUTPUT_BLOCK = new BlockOutputBlock("output_block", Material.ROCK);
	
	public static final Block NUMBER_0 = new BlockBase("number_0", Material.ROCK);
	public static final Block NUMBER_1 = new BlockNumber("number_1", Material.ROCK);
	public static final Block NUMBER_2 = new BlockNumber("number_2", Material.ROCK);
	public static final Block NUMBER_3 = new BlockNumber("number_3", Material.ROCK);
	public static final Block NUMBER_4 = new BlockNumber("number_4", Material.ROCK);
	public static final Block NUMBER_5 = new BlockNumber("number_5", Material.ROCK);
	public static final Block NUMBER_6 = new BlockNumber("number_6", Material.ROCK);
	public static final Block NUMBER_7 = new BlockNumber("number_7", Material.ROCK);
	public static final Block NUMBER_8 = new BlockNumber("number_8", Material.ROCK);
	public static final Block NUMBER_9 = new BlockNumber("number_9", Material.ROCK);
	
	public static final Block LETTER_X = new BlockBase("letter_x", Material.ROCK);
	public static final Block LETTER_Y = new BlockBase("letter_y", Material.ROCK);
	public static final Block LETTER_Z = new BlockBase("letter_z", Material.ROCK);
	public static final Block DELTA = new BlockBase("delta", Material.ROCK);
	public static final Block PI = new BlockBase("pi", Material.ROCK);
	
	public static final Block ADDITION = new BlockBase("addition", Material.ROCK);
	public static final Block SUBTRACTION = new BlockBase("subtraction", Material.ROCK);
	public static final Block MULTIPLICATION = new BlockBase("multiplication", Material.ROCK);
	public static final Block DIVISION = new BlockBase("division", Material.ROCK);
	public static final Block SQUARE_ROOT = new BlockBase("square_root", Material.ROCK);
	
	public static final Block EQUALITY = new BlockBase("equality", Material.ROCK);
	public static final Block INEQUALITY = new BlockBase("inequality", Material.ROCK);
	public static final Block GREATER = new BlockBase("greater", Material.ROCK);
	public static final Block GREATER_OR_EQUAL = new BlockBase("greater_or_equal", Material.ROCK);
	public static final Block LESS = new BlockBase("less", Material.ROCK);
	public static final Block LESS_OR_EQUAL = new BlockBase("less_or_equal", Material.ROCK);
	
	public static final Block NOT_BLOCK = new BlockBase("not_block", Material.ROCK);
	public static final Block AND_BLOCK = new BlockBase("and_block", Material.ROCK);
	public static final Block OR_BLOCK = new BlockBase("or_block", Material.ROCK);
	public static final Block XOR_BLOCK = new BlockBase("xor_block", Material.ROCK);
	public static final Block NAND_BLOCK = new BlockBase("nand_block", Material.ROCK);
	public static final Block NOR_BLOCK = new BlockBase("nor_block", Material.ROCK);
	public static final Block XNOR_BLOCK = new BlockBase("xnor_block", Material.ROCK);
	
}
