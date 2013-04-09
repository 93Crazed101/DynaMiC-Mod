package mods.moreWeapons93.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilverSilk extends Item {

	public ItemSilverSilk(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
	public String getTextureFile(){
		return "/moreWeapons93/Item.png";
	}
}
