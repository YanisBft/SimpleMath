package com.yanis48.simplemath;

import org.lwjgl.input.Keyboard;

import com.yanis48.simplemath.init.ModBlocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyInputHandler
{
	public static KeyBinding output_block = new KeyBinding("key.output_block", Keyboard.KEY_O, "key.categories.creative");
	
	public KeyInputHandler()
	{
		ClientRegistry.registerKeyBinding(output_block);
	}
	
    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {    	
        if (output_block.isPressed() && Minecraft.getMinecraft().player.capabilities.isCreativeMode)
        {
        	EntityPlayer player = Minecraft.getMinecraft().player;
        	EntityPlayer playerServer = null;
        	MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
        	PlayerList playerList = server.getPlayerList();
        	
			for (EntityPlayer playerMP : playerList.getPlayers()) {
				if (playerMP.getName().equals(player.getName()))
					playerServer = playerMP;
			}
			
			if ((!playerServer.inventory.hasItemStack(new ItemStack(ModBlocks.OUTPUT_BLOCK))))
			{
				playerServer.addItemStackToInventory(new ItemStack(ModBlocks.OUTPUT_BLOCK, 1));
			}
        }
    }
}
