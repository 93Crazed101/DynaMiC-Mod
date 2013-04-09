package mods.moreWeapons93.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mods.moreWeapons93.client.ClientProxyMoreWeapons93;

@Mod(modid = "93Crazed101_Mod Name Needed", name = "Mod Name Needed", version = "0.0.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MoreWeapons93{
	@SidedProxy(clientSide = "mods.moreWeapons93.client.ClientProxyMoreWeapons93",
				serverSide = "mods.moreWeapons93.common.CommonProxyMoreWeapons93")
	
public static ClientProxyMoreWeapons93 proxy = new ClientProxyMoreWeapons93();
	
	public static BiomeGenBase testBiome;
	public static BiomeGenBase wastelandBiome;
	
	public static EnumArmorMaterial CRYSTAL1 = EnumHelper.addArmorMaterial("Crystal",33, new int[]{4, 9, 7, 4}, 25);
	public static EnumToolMaterial CRYSTAL = EnumHelper.addToolMaterial("CRYSTAL", 3, 1500, 9.0F, 6, 25);
	public static EnumToolMaterial LAPIS = EnumHelper.addToolMaterial("LAPIS", 0, 1000, 1F, 5, 30);
	public static EnumToolMaterial BLAZEWAND = EnumHelper.addToolMaterial("BLAZEWAND", 0, 500, 0, 5, 0);
			
//Crystal
public static Block crystalOre;
public static Block crystalBlock;

public static Item crystal;

public static Item crystalPick;
public static Item crystalAxe;
public static Item crystalSpade;
public static Item crystalSword;
public static Item crystalHoe;

public static Item crystalHelmet;
public static Item crystalPlate;
public static Item crystalLegs;
public static Item crystalBoots;


public static Item lapisSword;

//Ruby
public static Item ruby;

public static Block rubyOre;
public static Block rubyBlock;
	
//Chain
public static Item chain;

//Silver
public static Item silverIngot;

public static Block silverOre;
//Other
public static Item blazeWand;
public static Item silverSilk;

//Glass
public static Block stainedGlassRed;

//Wasteland
public static Block wasteland;

	

//Crystal IDs 
	int crystalOreID;
	int crystalBlockID;
	
	int crystalID;
	
	int crystalPickID;
	int crystalAxeID;
	int crystalSpadeID;
	int crystalSwordID;
	int crystalHoeID;
	
	int crystalHelmetID;
	int crystalPlateID;
	int crystalLegsID;
	int crystalBootsID;
	
//LapisLazuli
	int lapisSwordID;
	
//Ruby IDs	
	int rubyBlockID;
	int rubyOreID;
	
	int rubyID;

//Chain ID
	int chainID;

//Silver ID's
	int silverIngotID;
	
	int silverOreID;
//Glass
	int stainedGlassRedID;
	
//Other
	int blazeWandID;
	int silverSilkID;

//Wasteland
	int wastelandID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		//Crystal
		crystalOreID = config.get("Block ID's", "Crystal Ore ID", 500).getInt();
		crystalBlockID = config.get("Block ID's", "Crystal Block ID", 502).getInt();
		
		crystalID = config.get("Item ID's", "Crystal ID", 501).getInt();
		
		crystalPickID = config.get("Tool ID's", "Crystal Pick ID", 503).getInt();
		crystalAxeID = config.get("Tool ID's", "Crystal Axe ID", 504).getInt();
		crystalSpadeID = config.get("Tool ID's", "Crystal Shovel ID", 505).getInt();
		crystalSwordID = config.get("Tool ID's", "Crystal Sword ID", 506).getInt();
		crystalHoeID = config.get("Tool ID's", "Crystal Hoe ID", 507).getInt();
		
		crystalHelmetID = config.get("Armor ID's", "Crystal Helmet ID", 508).getInt();
		crystalPlateID = config.get("Armor ID's", "Crystal Chestplate ID", 509).getInt();
		crystalLegsID = config.get("Armor ID's", "Crystal Legs ID", 510).getInt();
		crystalBootsID = config.get("Armor ID's", "Crystal Boots ID", 511).getInt();
		
		//LapisLazuli
		lapisSwordID = config.get("Tool ID's", "Lapis Lazuli Sword ID", 512).getInt();
		
		//Ruby
		rubyID = config.get("Item ID's", "Ruby ID", 513).getInt();
		
		rubyOreID = config.get("Block ID's", "Ruby Ore ID", 514).getInt();
		rubyBlockID = config.get("Block ID's", "Ruby Block ID", 515).getInt();
		
		//Chain
		chainID = config.get("Item ID's", "Chain ID", 516).getInt();
		
		//Silver
		silverIngotID = config.get("Item ID's", "Silver Ingot ID", 517).getInt();
		
		silverOreID = config.get("Block ID's", "Silver Ore ID", 518).getInt();
		
		//Other
		blazeWandID = config.get("Item ID's", "Blaze Wand ID", 519).getInt();
		silverSilkID = config.get("Item ID's", "Silver Silk ID", 521).getInt();
		
		//Glass
		stainedGlassRedID = config.get("Block ID's", "Red Stained Glass ID", 521).getInt();
		
		//Wasteland
		wastelandID = config.get("Block ID's", "Wasteland Block ID", 520).getInt();
		
		config.load();
		config.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		
	//Crystal
	crystal = new ItemCrystal(crystalID).setUnlocalizedName("Crystal");
			
	crystalOre = new BlockCrystalOre(crystalOreID, Material.rock).setUnlocalizedName("Crystal Ore").setHardness(6F).setResistance(15).setStepSound(Block.soundStoneFootstep);		
	crystalBlock = new BlockSolidBlock(crystalBlockID, Material.iron).setHardness(3F).setResistance(15).setStepSound(Block.soundMetalFootstep);
		
	crystalPick = new ItemMoreWeapons93Pickaxe(crystalPickID, CRYSTAL).setUnlocalizedName("Crystal Pick");
	crystalAxe = new ItemMoreWeapons93Axe(crystalAxeID, CRYSTAL).setUnlocalizedName("Crystal Axe");
	crystalSpade = new ItemMoreWeapons93Spade(crystalSpadeID, CRYSTAL).setUnlocalizedName("Crystal Shovel");
	crystalSword = new ItemMoreWeapons93Sword(crystalSwordID, CRYSTAL).setUnlocalizedName("Crystal Sword");
	crystalHoe = new ItemMoreWeapons93Hoe(crystalHoeID, CRYSTAL).setUnlocalizedName("Crystal Hoe");
	
	crystalHelmet = new MoreWeapons93Helmet(crystalHelmetID, CRYSTAL1, ModLoader.addArmor("Crystal Helmet"), 0).setUnlocalizedName("asdf");
	crystalPlate = new MoreWeapons93Chestplate(crystalPlateID, CRYSTAL1, ModLoader.addArmor("Crystal Plate"), 1).setUnlocalizedName("asdf312");
	crystalLegs = new MoreWeapons93Legs(crystalLegsID, CRYSTAL1, ModLoader.addArmor("Crystal Legs"), 2).setUnlocalizedName("asdf234");
	crystalBoots = new MoreWeapons93Boots(crystalBootsID, CRYSTAL1, ModLoader.addArmor("Crystal Boots"), 3).setUnlocalizedName("asdffd");
	
	
	//LapisLazuli Sword
	lapisSword = new ItemMoreWeapons93Sword(lapisSwordID, LAPIS).setUnlocalizedName("Lapis Sword");
	
	//Ruby
		
	rubyBlock = new BlockRubyBlock(rubyBlockID, Material.iron).setUnlocalizedName("Ruby Block").setResistance(15F).setHardness(3F).setStepSound(Block.soundMetalFootstep);
	rubyOre = new BlockRubyOre(rubyOreID, Material.rock).setUnlocalizedName("Ruby Ore").setHardness(6F).setResistance(15F).setStepSound(Block.soundStoneFootstep);
		
	ruby = new ItemRuby(rubyID).setUnlocalizedName("Ruby");
		
	//Chain
	chain = new ItemCrystal(chainID).setUnlocalizedName("Chain");
	
	//Silver
	silverIngot = new ItemCrystal(silverIngotID).setUnlocalizedName("Silver Ingot");
	
	silverOre = new MoreWeapons93BlockOre(silverOreID, 2, Material.rock).setUnlocalizedName("Silver Ore").setHardness(6F).setResistance(25F).setStepSound(Block.soundStoneFootstep);
	//Other
	blazeWand = new ItemBlazeWand(blazeWandID, BLAZEWAND).setUnlocalizedName("asdfasdf");
	silverSilk = new ItemSilverSilk(silverSilkID).setUnlocalizedName("Silver Silk");
	
	
	
	
	
	gameRegisters();
	languageRegisters();
	craftingRecipes();
	smeltingRecipes();
	blockHarvest();
	toolStuff();
	biomeStuff();
	
	proxy.registerRenderers();
		
	GameRegistry.registerWorldGenerator(new WorldGeneratorMoreWeapons93());

	}

	private void biomeStuff() {
		//Small Hills
		testBiome = new TestBiome(40);
		GameRegistry.addBiome(testBiome);
		
		wastelandBiome = new BiomeWasteland(41);
		GameRegistry.addBiome(wastelandBiome);
		
		
	}

	private void toolStuff(){
		MinecraftForge.setToolClass(crystalPick, "pickaxe", 3);
		MinecraftForge.setToolClass(crystalPick, "shovel", 3);
		MinecraftForge.setToolClass(crystalPick, "axe", 3);
		
		MinecraftForge.setToolClass(crystalAxe, "axe", 0);
		MinecraftForge.setToolClass(crystalSpade, "shovel", 0);
		MinecraftForge.setToolClass(crystalSword, "sword", 0);
		MinecraftForge.setToolClass(crystalHoe, "hoe", 0);

		
		//Lapis
		MinecraftForge.setToolClass(lapisSword, "sword", 0);
		
	}

	private void blockHarvest(){
		MinecraftForge.setBlockHarvestLevel(crystalOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(rubyOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(rubyBlock, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(crystalBlock, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(wasteland, "shovel", 0);
		}

	
	public void languageRegisters(){
		
		//Crystal
		LanguageRegistry.addName(crystalOre, "Crystal Ore");
		LanguageRegistry.addName(crystalBlock, "Crystal Block");
		
		LanguageRegistry.addName(crystalPick, "Crystal Pickaxe");
		LanguageRegistry.addName(crystalAxe, "Crystal Axe");
		LanguageRegistry.addName(crystalSpade, "Crystal Shovel");
		LanguageRegistry.addName(crystalSword, "Crystal Sword");
		LanguageRegistry.addName(crystalHoe, "Crystal Hoe");
		
		LanguageRegistry.addName(crystal, "Crystal");
		
		LanguageRegistry.addName(crystalHelmet, "Crystal Helmet");
		LanguageRegistry.addName(crystalPlate, "Crystal Chestplate");
		LanguageRegistry.addName(crystalLegs, "Crystal Leggings");
		LanguageRegistry.addName(crystalBoots, "Crystal Boots");
		
		//Lapis
		LanguageRegistry.addName(lapisSword, "Lapis Lazuli Sword");
		
		//Ruby
		LanguageRegistry.addName(rubyBlock, "Ruby Block");
		LanguageRegistry.addName(rubyOre, "Ruby Ore");
		
		LanguageRegistry.addName(ruby, "Ruby");
		
		//Chain
		LanguageRegistry.addName(chain, "Chain Link");
		
		//Silver
		LanguageRegistry.addName(silverIngot, "Silver Ingot");
		
		LanguageRegistry.addName(silverOre, "Silver Ore");
		
		
		//Glass
		LanguageRegistry.addName(stainedGlassRed, "Red Stained Glass");
		
		//Other
		LanguageRegistry.addName(blazeWand, "Blaze Wand");
		LanguageRegistry.addName(silverSilk, "Silver Silk");
		
		//Wasteland
		LanguageRegistry.addName(wasteland, "Dead Grass");
		
	}
public void gameRegisters(){
		
		//Crystal
		GameRegistry.registerBlock(crystalOre, "Crystal Ore");
		GameRegistry.registerBlock(crystalBlock, "Crystal Block");
		
		GameRegistry.registerItem(crystalPick, "Crystal Pick");
		GameRegistry.registerItem(crystalAxe, "Crystal Axe");
		GameRegistry.registerItem(crystalSpade, "Crystal Spade");
		GameRegistry.registerItem(crystalSword, "Crystal Sword");
		GameRegistry.registerItem(crystalHoe, "Crystal Hoe");
		
		GameRegistry.registerItem(crystal, "Crystal");
		
		GameRegistry.registerItem(crystalHelmet, "Crystal Helmet");
		GameRegistry.registerItem(crystalPlate, "Crystal Chestplate");
		GameRegistry.registerItem(crystalLegs, "Crystal Legs");
		GameRegistry.registerItem(crystalBoots, "Crystal Boots");
		
		//Lapis
		GameRegistry.registerItem(lapisSword, "Lapis Sword");
		
		//Ruby
		GameRegistry.registerBlock(rubyBlock, "Ruby Block");
		GameRegistry.registerBlock(rubyOre, "Ruby Ore");
		
		GameRegistry.registerItem(ruby, "ruby");
		
		//Chain
		
		GameRegistry.registerItem(chain, "Chain");
		
		//Silver
		GameRegistry.registerBlock(silverOre, "Silver Ore");
		
		GameRegistry.registerItem(silverIngot, "Silver Ingot");
		
		//Glass
		GameRegistry.registerBlock(stainedGlassRed, "Red Stained Glass");
		
		//Other
		GameRegistry.registerItem(blazeWand, "Blaze Wand");
		GameRegistry.registerItem(silverSilk, "Silver Silk");
		
		
		//Wasteland
		GameRegistry.registerBlock(wasteland, "Wasteland");
	}
	public void craftingRecipes(){
		
		//Chain
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain), new Object[]{
			"CCC", "C C", 'C', chain,});
		
		GameRegistry.addRecipe(new ItemStack(Item.plateChain), new Object[]{
			"C C", "CCC","CCC", 'C', chain,});
		
		GameRegistry.addRecipe(new ItemStack(Item.legsChain), new Object[]{
			"CCC", "C C","C C", 'C', chain,});
		
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain), new Object[]{
			"C C", "C C", 'C', chain,});
		
		GameRegistry.addRecipe(new ItemStack(chain, 16), new Object[]{
			" C ", "C C", " C ", 'C', Item.ingotIron,});
	
		
		//Crystal
		GameRegistry.addRecipe(new ItemStack(crystalBlock), new Object[]{
			"CCC", "CCC","CCC", 'C', crystal,});
		
		GameRegistry.addRecipe(new ItemStack(crystal, 9), new Object[]{
			"C", 'C', crystalBlock,});
		
		GameRegistry.addRecipe(new ItemStack(crystalPick), new Object[]{
			"CCC", " S "," S ", 'C', crystal, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(crystalAxe), new Object[]{
			"CC ", "CS "," S ", 'C', crystal, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(crystalSpade), new Object[]{
			"C", "S","S", 'C', crystal, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(crystalSword), new Object[]{
			"C", "C","S", 'C', crystal, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(crystalHoe), new Object[]{
			"CC ", " S "," S ", 'C', crystal, 'S', Item.stick});
		
		GameRegistry.addRecipe(new ItemStack(crystalHelmet), new Object[]{
			"CCC", "C C", 'C', crystal,});
		
		GameRegistry.addRecipe(new ItemStack(crystalPlate), new Object[]{
			"C C", "CCC","CCC", 'C', crystal,});
		
		GameRegistry.addRecipe(new ItemStack(crystalLegs), new Object[]{
			"CCC", "C C","C C", 'C', crystal,});
		
		GameRegistry.addRecipe(new ItemStack(crystalBoots), new Object[]{
			"C C", "C C", 'C', crystal,});
		
		
		//Lapis
		GameRegistry.addRecipe(new ItemStack(lapisSword), new Object[]{
			"L", "L","S", 'L', Block.blockLapis, 'S', Item.stick});
		
		
		//Ruby
		GameRegistry.addRecipe(new ItemStack(rubyBlock), new Object[]{
			"CCC", "CCC","CCC", 'C', ruby,});
		
		GameRegistry.addRecipe(new ItemStack(ruby, 9), new Object[]{
			"C", 'C', rubyBlock,});
		
		//Other
		GameRegistry.addRecipe(new ItemStack(silverSilk), new Object[]{
			"ACA", "CAC", "ACA", 'A', Item.silk, 'C', silverIngot});
		
	}
	public void smeltingRecipes(){
		GameRegistry.addSmelting(crystalOreID, new ItemStack(crystal, 1), 1F);
		
		GameRegistry.addSmelting(silverOreID, new ItemStack(silverIngot), 1F);
		
		GameRegistry.addSmelting(rubyOreID, new ItemStack(ruby, 1), 1F);

		
	}
}
