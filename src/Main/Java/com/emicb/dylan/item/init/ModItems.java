package com.emicb.dylan.item.init;

import net.minecraft.client.renderer.texture.IIconRegister;

import com.emicb.dylan.item.ItemChocolateMilk;
import com.emicb.dylan.item.ItemDM;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModItems 
{
	public static final ItemChocolateMilk chocolateMilk = new ItemChocolateMilk();
	public static void init ()
	{
		GameRegistry.registerItem (chocolateMilk, "chocolateMilk");
	}
}
