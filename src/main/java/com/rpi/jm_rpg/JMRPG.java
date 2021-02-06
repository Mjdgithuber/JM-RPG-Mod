package com.rpi.jm_rpg;

import org.apache.logging.log4j.Logger;

import com.rpi.jm_rpg.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = JMRPG.MODID, name = JMRPG.MODNAME, version = JMRPG.MODVERSION)
public class JMRPG {

    public static final String MODID = "jm_rpg";
    public static final String MODNAME = "JM RPG Mod";
    public static final String MODVERSION= "0.0.0";

    @SidedProxy(clientSide = "com.rpi.jm_rpg.proxy.ClientProxy", serverSide = "com.rpi.jm_rpg.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JMRPG instance;
    
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}