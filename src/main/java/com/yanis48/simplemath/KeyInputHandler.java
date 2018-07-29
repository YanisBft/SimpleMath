package com.yanis48.simplemath;

import com.yanis48.simplemath.init.ModBlocks;
import com.yanis48.simplemath.init.ModKeybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyInputHandler
{
    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {
        if (ModKeybinds.output_block.isPressed())
        {
        	if(Minecraft.getMinecraft().player.capabilities.isCreativeMode)
			{
				EntityPlayer player = Minecraft.getMinecraft().player;
				if ((!player.inventory.hasItemStack(new ItemStack(ModBlocks.OUTPUT_BLOCK))))
				{
					player.addItemStackToInventory(new ItemStack(ModBlocks.OUTPUT_BLOCK, 1));
				}
			}
        }
    }
}
