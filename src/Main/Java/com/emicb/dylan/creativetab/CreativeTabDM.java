package com.emicb.dylan.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.emicb.dylan.item.init.ModItems;
import com.emicb.dylan.reference.Reference;

public class CreativeTabDM 
{
	public static final CreativeTabs DM_tab = new CreativeTabs (Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.chocolateMilk;
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "Dylan's Mod";
		}
	};
}
