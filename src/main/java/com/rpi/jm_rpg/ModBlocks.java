package com.rpi.jm_rpg;

import com.rpi.jm_rpg.blocks.TestBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	@GameRegistry.ObjectHolder(JMRPG.MODID + ":" + TestBlock.L_NAME)
	public static TestBlock testBlock;
	
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		testBlock.initModel();
	}
}
