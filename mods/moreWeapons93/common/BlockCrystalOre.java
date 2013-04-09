package mods.moreWeapons93.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;



public class BlockCrystalOre extends Block{

	public BlockCrystalOre(int id, Material mat) {
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
public String getTextureFile(){
	return "/moreWeapons93/Block.png";
	
	}
	public int idDropped(int par1, Random rand, int par2){
		return MoreWeapons93.crystal.itemID;
		

}


	public void dropBlockAsItemWithChance(World par1, int par2, int par3, int par4, int par5, float par6, int par7){
        super.dropBlockAsItemWithChance(par1, par2, par3, par4, par5, par6, par7);
        int var8=0;
        if(this.blockID==MoreWeapons93.crystalOre.blockID){
                var8= MathHelper.getRandomIntegerInRange(par1.rand, 3, 7);
        }
        this.dropXpOnBlockBreak(par1, par2, par3, par4, var8);
}


	  public int quantityDroppedWithBonus(int par1, Random par2Random)
	    {
	        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
	        {
	            int var3 = par2Random.nextInt(par1 + 2) - 1;

	            if (var3 < 0)
	            {
	                var3 = 0;
	            }

	            return this.quantityDropped(par2Random) * (var3 + 1);
	        }
	        else
	        {
	            return this.quantityDropped(par2Random);
}

	
	    }	
}
