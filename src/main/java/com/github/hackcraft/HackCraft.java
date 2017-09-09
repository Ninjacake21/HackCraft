package com.github.hackcraft;

import com.github.hackcraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HackCraft.modId, name = HackCraft.name, version = HackCraft.version, acceptedMinecraftVersions = "[1.10.2]")
public class HackCraft {

	public static final String modId = "hackcraft";
	public static final String name = "HackCraft";
	public static final String version = "1.0.0";

	@SidedProxy(serverSide = "com.github.hackcraft.proxy.CommonProxy", clientSide = "com.github.hackcraft.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(modId)
	public static HackCraft instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}