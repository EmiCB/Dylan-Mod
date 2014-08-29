package com.emicb.dylan;

import com.emicb.dylan.reference.Reference;
import com.emicb.dylan.item.init.ModItems;
import com.emicb.dylan.item.init.Recipes;
import com.emicb.dylan.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Dylan 
{
	@Mod.Instance("Dylan")
	public static Dylan instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)
	{
		Recipes.init();
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)
	{
		
	}
}
