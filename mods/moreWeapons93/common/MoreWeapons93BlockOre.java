package mods.moreWeapons93.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MoreWeapons93BlockOre extends Block{

	public MoreWeapons93BlockOre(int id, int texture, Material mat) {
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	public String getTextureFile(){
		return "/moreWeapons93/Block.png";
	}
	public int idDropped(){
		return this.blockID;
	}
}
