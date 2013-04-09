package mods.moreWeapons93.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorMoreWeapons93 implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 1:
			generateNether(world, random,  chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random,  chunkX * 16, chunkZ * 16);
		case -1:
			generateEnd(world, random,  chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 3; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(18);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreWeapons93.crystalOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 3; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(10);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreWeapons93.rubyOre.blockID, 1)).generate(world, random, xCoord, yCoord, zCoord);
		}
		for(int i = 0; i < 5; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(30);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreWeapons93.silverOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		
	}

}
