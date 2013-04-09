package mods.moreWeapons93.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemMoreWeapons93Sword extends ItemSword{

	public ItemMoreWeapons93Sword(int par1,
			EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
}
