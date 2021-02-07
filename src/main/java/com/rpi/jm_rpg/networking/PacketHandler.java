package com.rpi.jm_rpg.networking;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {
	private static int packetId = 0;
	
	public static SimpleNetworkWrapper INSTANCE = null;
	
	public PacketHandler() {}
	
	public static int nextID() {
		return packetId++;
	}
	
	public static void registerPacketTypes(String channelName) {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
		
		// register custom packets
		INSTANCE.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, nextID(), Side.SERVER);
	}
	
}