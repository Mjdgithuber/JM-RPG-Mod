package com.rpi.jm_rpg.networking;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketKeyPress implements IMessage {	
	private int keyCode;
	
	/* default constructor needed for reception  */
	public PacketKeyPress() {}
	
	public PacketKeyPress(int keyCode) {
		this.keyCode = keyCode;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		keyCode = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(keyCode);
	}
	
	public static class Handler implements IMessageHandler<PacketKeyPress, IMessage> {

		@Override
		public IMessage onMessage(PacketKeyPress message, MessageContext ctx) {
			FMLCommonHandler.instance().getWorldThread(ctx.netHandler)
				.addScheduledTask(() -> handle(message, ctx));
			return null;
		}
		
		private void handle(PacketKeyPress msg, MessageContext ctx) {
			EntityPlayerMP player = ctx.getServerHandler().player;
			World world = player.getEntityWorld();
			
			player.sendStatusMessage(new TextComponentString(TextFormatting.GREEN + "You pressed a good key + '" + msg.keyCode + "'"), false);
		}
		
	}
	
}
