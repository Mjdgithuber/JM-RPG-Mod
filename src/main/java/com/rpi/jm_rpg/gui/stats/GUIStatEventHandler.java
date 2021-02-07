package com.rpi.jm_rpg.gui.stats;

import com.rpi.jm_rpg.networking.PacketHandler;
import com.rpi.jm_rpg.networking.PacketKeyPress;
import com.rpi.jm_rpg.proxy.ClientProxy;

import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class GUIStatEventHandler {

	@SubscribeEvent
	public static void onKeyEvent(KeyInputEvent e) {
		if(ClientProxy.keyBindings[0].isPressed()) {
			System.out.println("Key binding ="+ClientProxy.keyBindings[0].getKeyDescription());
			PacketHandler.INSTANCE.sendToServer(new PacketKeyPress(ClientProxy.keyBindings[0].getKeyCode()));
		}
		
//		FMLClientHandler.instance().getClient().thePlayer.openGui(mod, modGuiId, world, x, y, z);
	}
	
}