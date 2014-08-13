package com.emicb.dylan.item;

import com.emicb.dylan.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDM extends Item
{
	public ItemDM () 
	{
		super();
	}
	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) 
	{
		// TODO Auto-generated method stub
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
