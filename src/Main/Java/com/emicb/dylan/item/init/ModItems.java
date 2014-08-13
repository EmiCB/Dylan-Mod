package com.emicb.dylan.item.init;

import com.emicb.dylan.item.ItemChocolateMilk;
import com.emicb.dylan.item.ItemDM;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemDM chocolateMilk = new ItemChocolateMilk();
	public static void init ()
	{
		GameRegistry.registerItem (chocolateMilk, "chocolateMilk");
	}
}
