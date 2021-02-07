package com.rpi.jm_rpg.proxy;

import com.rpi.jm_rpg.JMRPG;
import com.rpi.jm_rpg.ModBlocks;
import com.rpi.jm_rpg.blocks.TestBlock;
import com.rpi.jm_rpg.networking.PacketHandler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		PacketHandler.registerPacketTypes(JMRPG.MODID);
	}
	
	public void init(FMLInitializationEvent e) {}
	
	public void postInit(FMLPostInitializationEvent e) {}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new TestBlock());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new ItemBlock(ModBlocks.testBlock)
				.setRegistryName(ModBlocks.testBlock.getRegistryName()));
	}
	
}
