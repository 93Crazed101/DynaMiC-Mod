package mods.moreWeapons93.common;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeWasteland extends BiomeGenBase {

	public BiomeWasteland(int par1) {
		super(par1);
		 this.spawnableCreatureList.clear();
	        this.topBlock = (byte)Block.grass.blockID;
	        this.fillerBlock = (byte)Block.dirt.blockID;
	        this.theBiomeDecorator.treesPerChunk = -999;
	        this.theBiomeDecorator.deadBushPerChunk = 2;
	        this.theBiomeDecorator.reedsPerChunk = 50;
	        this.theBiomeDecorator.cactiPerChunk = 10;
	        this.setBiomeName("Wasteland");
	        this.spawnableMonsterList.add(new SpawnListEntry(EntitySlime.class, 1, 1, 1));
		
	}
    public int getBiomeGrassColor()
    {
        double var1 = (double)this.getFloatTemperature();
        double var3 = (double)this.getFloatRainfall();
        return ((ColorizerGrass.getGrassColor(var1, var3) & 16711422) + 5115470) / 2;
    }
}
