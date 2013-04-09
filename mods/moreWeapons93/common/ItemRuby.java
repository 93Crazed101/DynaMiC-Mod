package mods.moreWeapons93.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRuby extends Item{

	public ItemRuby(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
}
