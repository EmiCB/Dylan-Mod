package com.emicb.dylan.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.emicb.dylan.creativetab.CreativeTabDM;
import com.emicb.dylan.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemChocolateMilk extends ItemBucketMilk
{
	private static final ItemBucketMilk itemBucketMilk = new ItemBucketMilk();

	public ItemChocolateMilk()
	{
		super ();
		this.setUnlocalizedName("chocolateMilk");
		this.setCreativeTab(CreativeTabDM.DM_tab);
	}
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName (super.getUnlocalizedName()));
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	}
	
	@Override
	 public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
	    {
	        if (!p_77654_3_.capabilities.isCreativeMode)
	        {
	            --p_77654_1_.stackSize;
	        }

	        if (!p_77654_2_.isRemote)
	        {
	        	 p_77654_3_.curePotionEffects(new ItemStack(Items.milk_bucket));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(8,4000,5));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(1,4000,5));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(10,4000,5));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(21,4000,5));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(22,4000,5));
	        	 p_77654_3_.addPotionEffect(new PotionEffect(23,4000,20));
	        }

	        return p_77654_1_.stackSize <= 0 ? new ItemStack(Items.bucket) : p_77654_1_;
	    }
}
