package mods.moreWeapons93.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StringTranslate;

public class ItemBlazeWand extends ItemSword {

	public ItemBlazeWand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
	
	 public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
	 {
	 entityliving.knockBack(entityliving, 5, 5, 5);
	 entityliving.setFire(10);
	 return true;
	 }
	 public boolean hasEffect(ItemStack par1ItemStack){
		 return true;
	 }
	 public String getItemDisplayName(ItemStack par1ItemStack)
	 {
	 String var2 = ("\u00a7e" + StringTranslate.getInstance().translateNamedKey(this.getLocalizedName(par1ItemStack))).trim();
	 return var2;
	 }
}
