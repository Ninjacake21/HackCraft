package com.github.hackcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HackCraft.modId, name = HackCraft.name, version = HackCraft.version, acceptedMinecraftVersions = "[1.10.2]")
public class HackCraft {

	public static final String modId = "hackcraft";
	public static final String name = "Hack Craft";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static HackCraft instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}