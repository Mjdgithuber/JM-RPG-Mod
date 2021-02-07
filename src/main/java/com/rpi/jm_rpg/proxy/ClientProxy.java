package com.rpi.jm_rpg.proxy;

import org.lwjgl.input.Keyboard;

import com.rpi.jm_rpg.ModBlocks;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	public static KeyBinding[] keyBindings;
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) {
		keyBindings = new KeyBinding[1];
		
		keyBindings[0] = new KeyBinding("key.gui_stats.desc", Keyboard.KEY_P, "key.jm_rpg.category");
		
		for(KeyBinding kb : keyBindings)
			ClientRegistry.registerKeyBinding(kb);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModBlocks.initModels();
	}
}