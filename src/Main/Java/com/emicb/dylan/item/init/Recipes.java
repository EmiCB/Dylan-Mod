package com.emicb.dylan.item.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.emicb.dylan.item.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void init ()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.chocolateMilk),
		"gcg","sms","gcg",
		'g',new ItemStack(Items.golden_apple),
		'c',new ItemStack(Items.dye,1,3),
		's',new ItemStack(Items.sugar),
		'm',new ItemStack(Items.milk_bucket));
	}
}
