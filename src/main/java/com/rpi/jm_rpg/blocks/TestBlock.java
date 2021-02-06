package com.rpi.jm_rpg.blocks;

import com.rpi.jm_rpg.JMRPG;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TestBlock extends Block {

	public TestBlock() {
		super(Material.GLASS);
		
		this.setUnlocalizedName(JMRPG.MODID + '.' + L_NAME);
		this.setRegistryName(L_NAME);
		this.setCreativeTab(CreativeTabs.MISC);
	}
	
	public static final String L_NAME = "testblock";
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
}
