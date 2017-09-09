package com.github.hackcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBase ingotNetonite;
	
	public static void init(){
		ingotNetonite = register(new ItemBase("ingotNetonite").setCreativeTab(CreativeTabs.MATERIALS));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		
		return item;
	}
}
