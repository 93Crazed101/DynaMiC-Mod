package mods.moreWeapons93.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemMoreWeapons93Spade extends ItemSpade{

	public ItemMoreWeapons93Spade(int par1,
			EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
}
