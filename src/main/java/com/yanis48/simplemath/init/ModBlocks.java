package com.yanis48.simplemath.init;

import java.util.ArrayList;
import java.util.List;

import com.yanis48.simplemath.blocks.BlockBase;
import com.yanis48.simplemath.blocks.BlockLogic;
import com.yanis48.simplemath.blocks.BlockNumber;
import com.yanis48.simplemath.blocks.BlockOutputBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OUTPUT_BLOCK = new BlockOutputBlock("output_block");
	
	public static final Block NUMBER_0 = new BlockBase("number_0");
	public static final Block NUMBER_1 = new BlockNumber("number_1");
	public static final Block NUMBER_2 = new BlockNumber("number_2");
	public static final Block NUMBER_3 = new BlockNumber("number_3");
	public static final Block NUMBER_4 = new BlockNumber("number_4");
	public static final Block NUMBER_5 = new BlockNumber("number_5");
	public static final Block NUMBER_6 = new BlockNumber("number_6");
	public static final Block NUMBER_7 = new BlockNumber("number_7");
	public static final Block NUMBER_8 = new BlockNumber("number_8");
	public static final Block NUMBER_9 = new BlockNumber("number_9");
	
	public static final Block LETTER_X = new BlockBase("letter_x");
	public static final Block LETTER_Y = new BlockBase("letter_y");
	public static final Block LETTER_Z = new BlockBase("letter_z");
	public static final Block DELTA = new BlockBase("delta");
	public static final Block PI = new BlockBase("pi");
	public static final Block SIGMA = new BlockBase("sigma");
	
	public static final Block ADDITION = new BlockBase("addition");
	public static final Block SUBTRACTION = new BlockBase("subtraction");
	public static final Block MULTIPLICATION = new BlockBase("multiplication");
	public static final Block DIVISION = new BlockBase("division");
	public static final Block SQUARE_ROOT = new BlockBase("square_root");
	
	public static final Block EQUALITY = new BlockBase("equality");
	public static final Block INEQUALITY = new BlockBase("inequality");
	public static final Block GREATER = new BlockBase("greater");
	public static final Block GREATER_OR_EQUAL = new BlockBase("greater_or_equal");
	public static final Block LESS = new BlockBase("less");
	public static final Block LESS_OR_EQUAL = new BlockBase("less_or_equal");
	
	public static final Block NOT_BLOCK = new BlockLogic("not_block");
	public static final Block AND_BLOCK = new BlockLogic("and_block");
	public static final Block OR_BLOCK = new BlockLogic("or_block");
	public static final Block XOR_BLOCK = new BlockLogic("xor_block");
	public static final Block NAND_BLOCK = new BlockLogic("nand_block");
	public static final Block NOR_BLOCK = new BlockLogic("nor_block");
	public static final Block XNOR_BLOCK = new BlockLogic("xnor_block");
	public static final Block IMPLY_BLOCK = new BlockLogic("imply_block");
	
}
