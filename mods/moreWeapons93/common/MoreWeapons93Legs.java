package mods.moreWeapons93.common;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class MoreWeapons93Legs extends ItemArmor implements IArmorTextureProvider{

	public MoreWeapons93Legs(int par1,
			EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
	

	public String getArmorTextureFile(ItemStack itemstack) {
		if (itemstack.itemID == MoreWeapons93.crystalHelmet.itemID || itemstack.itemID == MoreWeapons93.crystalPlate.itemID ||
			itemstack.itemID == MoreWeapons93.crystalBoots.itemID){
			return "/moreWeapons93/Armor/crystal_1.png";}
		
		if (itemstack.itemID == MoreWeapons93.crystalLegs.itemID){
			return "/moreWeapons93/Armor/crystal_2.png";}
		
		else{
			return null;
		}
	}

}
