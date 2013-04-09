package mods.moreWeapons93.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCrystal extends Item{

	public ItemCrystal(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
}
