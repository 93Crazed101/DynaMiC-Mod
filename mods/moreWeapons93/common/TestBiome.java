package mods.moreWeapons93.common;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class TestBiome extends BiomeGenBase {

	public TestBiome(int par1) {
		super(par1);
		this.topBlock = (byte) Block.grass.blockID;
		this.fillerBlock = (byte) Block.dirt.blockID;
		this.setBiomeName("Small Hills");
		this.maxHeight = 0.7F;
		this.minHeight = 0;
		this.theBiomeDecorator.treesPerChunk = 1;
	    this.theBiomeDecorator.grassPerChunk = 4;
	    this.theBiomeDecorator.mushroomsPerChunk = 1;
	    this.theBiomeDecorator.reedsPerChunk = 1;
		this.theBiomeDecorator.clayPerChunk = 3;
	}

}
