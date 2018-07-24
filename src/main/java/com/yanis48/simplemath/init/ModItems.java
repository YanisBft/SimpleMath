package com.yanis48.simplemath.init;

import java.util.ArrayList;
import java.util.List;

import com.yanis48.simplemath.items.ItemBase;
import com.yanis48.simplemath.items.ItemDivided;
import com.yanis48.simplemath.items.ItemEqual;
import com.yanis48.simplemath.items.ItemLogic;
import com.yanis48.simplemath.items.ItemMinus;
import com.yanis48.simplemath.items.ItemPlus;
import com.yanis48.simplemath.items.ItemRadical;
import com.yanis48.simplemath.items.ItemTimes;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item PLUS = new ItemPlus("plus");
	public static final Item MINUS = new ItemMinus("minus");
	public static final Item TIMES = new ItemTimes("times");
	public static final Item DIVIDED = new ItemDivided("divided");
	public static final Item RADICAL = new ItemRadical("radical");
	
	public static final Item EQUAL = new ItemEqual("equal");
	
	public static final Item NOT = new ItemLogic("not");
	public static final Item AND = new ItemLogic("and");
	public static final Item OR = new ItemLogic("or");
	public static final Item XOR = new ItemLogic("xor");

}
