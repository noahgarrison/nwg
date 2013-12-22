package nwg.BrightMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.Configuration;
import net.minecraft.item.Item;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VER)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class BaseMod {
	
	private static final int NuggetID = 0;

	@Instance(ModInfo.ID)
    public static BaseMod instance;
	
		// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide=ModInfo.CLIENTPROXY + "ClientProxy", serverSide=ModInfo.COMMONPROXY + "CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	//Config Handlers
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	final int NetherOreID = config.getBlock("NetherOre", 500).getInt();
		final int OreID = config.getBlock("SurfaceOre", 501).getInt();
		final int BlockCompressedID = config.getBlock("CompressedBlock", 502).getInt();
		final int PickID = config.getItem("PickAxe", 5000).getInt();
		final int SpadeID = config.getItem("Spade", 5001).getInt();
		final int HoeID = config.getItem("Hoe", 5002).getInt();
		final int AxeID = config.getItem("Axe", 5003).getInt();
		final int NuggetID = config.getItem("Nugget", 5004).getInt();
		final int IngotID = config.getItem("Ingot", 5005).getInt();
		final int StickID = config.getItem("Stick", 5006).getInt();
		final int SwordID = config.getItem("Sword", 5007).getInt();
		final int WandID = config.getItem("Wand", 5008).getInt();
		final int PowderID = config.getItem("AirPowder", 5009).getInt();
		final int HammerID = config.getItem("Hammer", 5010).getInt();
		final int MeshID = config.getItem("IronMesh", 5011).getInt();
		final int CoinOneID = config.getItem("CoinOne", 5012).getInt();
		final int CoinOneHundredID = config.getItem("CoinOneHundred", 5013).getInt();
		final int CoinTwentyFiveID = config.getItem("CoinTwentyFive", 5014).getInt();
		final int CoinTwoHundredID = config.getItem("CoinTwoHundred", 5015).getInt();
		final int FiveHundredID = config.getItem("CoinFiveHundred", 5016).getInt();
		final int OneThousandID = config.getItem("CoinOneThousand", 5017).getInt();
		final int FurnaceIdleID = config.getItem("IdleFurnace", 503).getInt();
		final int FurnaceActiveID = config.getItem("ActiveFurnace", 504).getInt();
		final int StrongBoxID = config.getItem("StrongBox", 505).getInt();
    	config.save();
    }
    
    public static Item BrightHelmet;
	public static Item BrightChestplate;
	public static Item BrightLegs;
	public static Item BrightBoots;
    
     	//WorldGen Helper
	 EventManager oreManager = new EventManager();
	 
	 	//Creative Tab Creation & Icon Setting
	 public static CreativeTabs tabBright = new CreativeTabs("tabBright") {
         public ItemStack getIconItemStack() {
                 return new ItemStack(BaseMod.brightRock, 1, 0);
         }
 };
		//Bright Tool Mat. Declaration
	public EnumToolMaterial bright = EnumHelper.addToolMaterial("Bright", 3, 2500, 12.0f, 10.0f, 25);
	
		//Bright Armor Material Declaration
	public static EnumArmorMaterial brightArmor = EnumHelper.addArmorMaterial("brightArmorMaterial", 2500, new int[] {3, 7, 6, 3}, 30);
	public static Item brightChest;
	public static Item brightBoots;
	public static Item brightLegs;
	public static Item brightHelm;
	
		//Item Creation

	public final Item powderAir = new powderAir(2345);
	public final Item brightSword = new brightSword(864 , bright)
 		.setCreativeTab(BaseMod.tabBright)
 		.setUnlocalizedName("swordBright")
 		.setTextureName(ModInfo.LOC + ":BrightSword");
	public final static Item toolHammer = new toolHammer(12345)
	 	.setUnlocalizedName("toolHammer")
	 	.setCreativeTab(tabBright)
	 	.setMaxDamage(10)
	 	.setTextureName(ModInfo.LOC + ":Hammer")
	 	.setMaxStackSize(1);
	public final Item ironMesh = new ironMesh(12456)
	    .setCreativeTab(tabBright)
	    .setMaxStackSize(8)
	    .setTextureName(ModInfo.LOC + ":chainMail")
	    .setUnlocalizedName("meshIron");
	public final Item coinOne = new coin(1244)
	 .setUnlocalizedName("coinOne")
	 .setTextureName(ModInfo.LOC + ":unum");
	public final Item coinOnehundred = new coin(3647)
	 .setUnlocalizedName("coinHundred")
	 .setTextureName(ModInfo.LOC + ":cent");
	public final Item coinTwentyfive = new coin(2356)
	 .setUnlocalizedName("coinTwentyFive")
	 .setTextureName(ModInfo.LOC + ":viginti quinque");
	public final Item coinTwohundred = new coin(6753)	
	 .setUnlocalizedName("coinTwoHundred") 
	 .setTextureName(ModInfo.LOC + ":ducenti");
	public final Item coinFivehundred = new coin(5275)
	 .setUnlocalizedName("coinFiveHundred")
	 .setTextureName(ModInfo.LOC + ":quingenti");
	public final Item coinOnethousand = new coin(2758)
	 .setUnlocalizedName("coinThousand")
	 .setTextureName(ModInfo.LOC + ":millia");
	public final Item brightWand = new brightWand(598);
	public final Item brightStick = new brightStick(753);
	public final Item brightNugget = new brightNugget(NuggetID);
	public final Item brightAxe = new brightAxe(5023, bright)
 	 .setCreativeTab(BaseMod.tabBright)
 	 .setUnlocalizedName("axeBright")
 	 .setTextureName(ModInfo.LOC + ":BrightAxe");
 	public final Item brightPick = new brightPick(5002, bright)
 	.setCreativeTab(BaseMod.tabBright)
 	.setUnlocalizedName("pickBright")
 	.setTextureName(ModInfo.LOC + ":BrightPickaxe");
 	public final Item brightHoe = new brightHoe(5003, bright)
 	.setCreativeTab(BaseMod.tabBright)
 	.setUnlocalizedName("hoeBright")
 	.setTextureName(ModInfo.LOC + ":BrightHoe");
 	public final Item brightShovel = new brightShovel(5004, bright)
 	 .setCreativeTab(BaseMod.tabBright)
 	 .setUnlocalizedName("shovelBright")
 	 .setTextureName(ModInfo.LOC + ":BrightShovel");
 	public final static Item BrightSteelIngot = new BrightSteelIngot(5101); //Err: "Syntax error on token ";",{ expected after this token"
 	
 	//Gives same error on line preceding armor declaration, anywhere inside or outside preinit
 	
 	
 	public static Item brightHelmet = new brightArmor(2055, brightArmor, 5, 0).setUnlocalizedName("brightHelmet");
	public static Item brightChestplate = new brightArmor(2056, brightArmor, 5, 1).setUnlocalizedName("brightChestplate");
	public static Item brightLeggings = new brightArmor(2057, brightArmor, 5, 2).setUnlocalizedName("brightLeggings");
	public static Item brightBoot = new brightArmor(2058, brightArmor, 5, 3).setUnlocalizedName("brightBoots");
	
 	
 		//Block Declarations
 	public static Block BrightFurnaceIdle = new BrightFurnace(1256).setUnlocalizedName("brightFurnaceIdle").setLightValue(0.0f);
	public static Block BrightFurnaceActive = new BrightFurnace(1257).setUnlocalizedName("brightFurnaceActive").setLightValue(1.0f);
	public final Block strongBox = new strongBox(758, 1)
	 .setLightValue(10.0f)
	 .setCreativeTab(tabBright)
	 .setHardness(1.0f)
	 .setUnlocalizedName("strongBox")
	 .setLightOpacity(1)
	 .setStepSound(Block.soundClothFootstep);
	public final static Block netherBrightOre = new netherBrightOre(678, Material.ground)
	 .setHardness(0.5f)
	 .setTextureName(ModInfo.LOC + ":NetherBrightOre")
	 .setStepSound(Block.soundStoneFootstep)
	 .setCreativeTab(BaseMod.tabBright)
	 .setLightValue(10.0f);
	public final static Block brightRock = new GlowRock(545, Material.ground)
	 .setHardness(0.5f)
	 .setTextureName(ModInfo.LOC + ":BrightBlock")
	 .setStepSound(Block.soundStoneFootstep)
	 .setUnlocalizedName("brightRock")
	 .setCreativeTab(BaseMod.tabBright)
	 .setLightValue(10.0f); 	
	public final static Block brightOre = new BrightOre(510, Material.rock)
	 .setTextureName(ModInfo.LOC + ":BrightOre"); 
	
	
	
	public static nwgCraftingHandler craftingHandler = new nwgCraftingHandler();
	
    @EventHandler
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            
            	//Variables
            int BrightOreID = brightOre.blockID;
            
            	//GameRegistry Declarations
            GameRegistry.registerItem(brightNugget, "nuggetBright");
            GameRegistry.registerItem(ironMesh, "meshIron");
            GameRegistry.registerItem(powderAir, "powderAir");
            GameRegistry.registerBlock(netherBrightOre, "oreNetherBright");
            GameRegistry.registerBlock(BrightFurnaceIdle, "brightFurnaceIdle");
            GameRegistry.registerBlock(BrightFurnaceActive, "brightFurnaceActive");
            GameRegistry.registerBlock(strongBox, "strongBox");
            GameRegistry.registerBlock(brightRock, "brightRock");
            GameRegistry.registerBlock(brightOre, "oreBright");
            GameRegistry.registerItem(brightSword, "swordBright");
            GameRegistry.registerItem(brightAxe, "axeBright");
            GameRegistry.registerItem(brightPick, "pickBright");
            GameRegistry.registerItem(brightHoe, "hoeBright");
            GameRegistry.registerItem(brightShovel, "shovelBright");
            GameRegistry.registerItem(coinOne, "coinOne");
            GameRegistry.registerItem(coinFivehundred, "coinFiveHundred");
            GameRegistry.registerItem(coinTwentyfive, "coinTwentyfive");
            GameRegistry.registerItem(coinOnethousand, "coinOnethousand");
            GameRegistry.registerItem(coinOnehundred, "coinOneHundred");
            GameRegistry.registerItem(coinTwohundred, "coinTwoHundred");
            
            //Renderer
            RenderingRegistry.addNewArmourRendererPrefix("brightArmor");
            
            //LanguageRegistry Declarations- Adding Names
            LanguageRegistry.addName(ironMesh, "Iron Mesh");
            LanguageRegistry.addName(toolHammer, "Iron Hammer");
            LanguageRegistry.addName(powderAir, "Air Powder");
            LanguageRegistry.addName(netherBrightOre, "Nether Bright Ore");
            LanguageRegistry.addName(brightNugget, "Bright Nugget");
            LanguageRegistry.addName(BrightFurnaceIdle, "Bright Furnace");
            LanguageRegistry.addName(strongBox, "Strong Box");
            LanguageRegistry.addName(brightRock, "Block of Bright Steel");
            LanguageRegistry.addName(brightOre, "Bright Steel Ore");
            LanguageRegistry.addName(BrightSteelIngot, "Bright Steel Ingot");
            LanguageRegistry.addName(brightSword, "Bright Sword");
            LanguageRegistry.addName(brightAxe, "Bright Axe");
            LanguageRegistry.addName(brightPick, "Bright Pickaxe");
            LanguageRegistry.addName(brightHoe, "Bright Hoe");
            LanguageRegistry.addName(brightShovel, "Bright Shovel");
            LanguageRegistry.addName(coinOne, "One Cent Piece");
            LanguageRegistry.addName(coinFivehundred, "Five Hundred Cent Piece");
            LanguageRegistry.addName(coinTwentyfive, "Twenty Five Cent Piece");
            LanguageRegistry.addName(coinOnethousand, "One Thousand Cent Piece");
            LanguageRegistry.addName(coinTwohundred, "Two Hundred Cent Piece");
            LanguageRegistry.addName(coinOnehundred, "One Hundred Cent Piece");
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabBright", "en_US", "Bright Steel");
            
            //ItemStack Declarations
            ItemStack leatherItemstack = new ItemStack(Item.leather);
            ItemStack brownWoolItemstack = new ItemStack(Block.cloth, 1, 12);
            ItemStack saddleStack = new ItemStack(Item.saddle);
            
			ItemStack chainIS = new ItemStack(this.ironMesh);
            ItemStack ingotIronIS = new ItemStack(Item.ingotIron);
            
			ItemStack hammerIS = new ItemStack(this.toolHammer, 1, 0);
			ItemStack hammerIS1 = new ItemStack(this.toolHammer, 1, 1);
			ItemStack hammerIS2 = new ItemStack(this.toolHammer, 1, 2);
			ItemStack hammerIS3 = new ItemStack(this.toolHammer, 1, 3);
			ItemStack hammerIS4 = new ItemStack(this.toolHammer, 1, 4);
			ItemStack hammerIS5 = new ItemStack(this.toolHammer, 1, 5);
			ItemStack hammerIS6 = new ItemStack(this.toolHammer, 1, 6);
			ItemStack hammerIS7 = new ItemStack(this.toolHammer, 1, 7);
			ItemStack hammerIS8 = new ItemStack(this.toolHammer, 1, 8);
			ItemStack hammerIS9 = new ItemStack(this.toolHammer, 1, 9);
			ItemStack hammerIS10 = new ItemStack(this.toolHammer, 1, 10);
            ItemStack stickIS = new ItemStack(Item.stick);
            ItemStack chainBootsIS = new ItemStack(Item.bootsChain);
            ItemStack chainHelmIS = new ItemStack(Item.helmetChain);
            ItemStack chainChestIS = new ItemStack(Item.plateChain);
            ItemStack chainLegsIS = new ItemStack(Item.legsChain);
            ItemStack BrightSteelItemStack = new ItemStack(BrightSteelIngot);
            ItemStack brightRockStack = new ItemStack(brightRock);
            ItemStack ItemStackBrightSteelIngot = new ItemStack(BrightSteelIngot, 9);
            ItemStack axeIS = new ItemStack(brightAxe);
            ItemStack pickIS = new ItemStack(brightPick);
            ItemStack spadeIS = new ItemStack(brightShovel);
            ItemStack hoeIS = new ItemStack(brightHoe);
            ItemStack swordIS = new ItemStack(brightSword);
            ItemStack brightStickIS = new ItemStack(brightStick);
            ItemStack lapisIS = new ItemStack(Item.dyePowder, 1, 11);
            ItemStack BrightSteelblockIS = new ItemStack(BaseMod.brightRock);
            ItemStack nuggetIS = new ItemStack(this.brightNugget);
            ItemStack spongeIS = new ItemStack(Block.sponge);
            ItemStack woolIS = new ItemStack(Block.cloth);
            ItemStack enchantingIS = new ItemStack(Item.expBottle);
            ItemStack BrightSteelOre = new ItemStack(this.brightOre, 2);
            ItemStack skullIS = new ItemStack(Item.skull, 1, 1);
            ItemStack skullISI = new ItemStack(Item.skull, 1, 0);
            ItemStack skullISII = new ItemStack(Item.skull, 1, 2);
            ItemStack skullISIII = new ItemStack(Item.skull, 1, 3);
            ItemStack skullISIV = new ItemStack(Item.skull, 1, 4);
            ItemStack StrongBoxIS = new ItemStack(this.strongBox);
            ItemStack IronHorseArmorIS = new ItemStack(Item.horseArmorIron);
            ItemStack GoldHorseArmorIS = new ItemStack(Item.horseArmorGold);
            ItemStack DiamondHorseArmorIS = new ItemStack(Item.horseArmorDiamond);
            
            	//New Recipes
            GameRegistry.addShapelessRecipe(StrongBoxIS, Block.chest, Block.obsidian);
            GameRegistry.addRecipe(DiamondHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.diamond, 'Y', GoldHorseArmorIS);
            GameRegistry.addRecipe(GoldHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.ingotGold, 'Y', IronHorseArmorIS);
            GameRegistry.addRecipe(IronHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.ingotIron, 'Y', chainChestIS);
            GameRegistry.addRecipe(saddleStack, "LLL", "LWL", 'L', leatherItemstack, 'W', brownWoolItemstack);
            GameRegistry.addRecipe(hammerIS, "   ", "X  ", " Y ", 'X', ingotIronIS, 'Y', stickIS);
            GameRegistry.addRecipe(chainBootsIS, "X X", "X X", 'X', this.ironMesh);
            GameRegistry.addRecipe(chainHelmIS, "XXX", "X X", 'X', this.ironMesh);
            GameRegistry.addRecipe(chainChestIS, "X X", "XXX", "XXX", 'X', this.ironMesh);
            GameRegistry.addRecipe(chainLegsIS, "XXX", "X X", "X X", 'X', this.ironMesh);
            GameRegistry.addRecipe(brightRockStack, "XXX", "XXX", "XXX", 'X', BrightSteelItemStack);
            GameRegistry.addRecipe(axeIS, " XX", " YX", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(pickIS, "XXX", " Y ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(axeIS, "XX ", "XY ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(spadeIS, " X ", " Y ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(hoeIS, " XX", " Y ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(swordIS, " X ", " X ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(hoeIS, "XX ", " Y ", " Y ", 'X', BrightSteelItemStack, 'Y', brightStickIS);
            GameRegistry.addRecipe(BrightSteelItemStack, "XXX", "XXX", "XXX", 'X', brightNugget);
            GameRegistry.addRecipe(spongeIS, "XXX", "X X", "XXX", 'X', woolIS);
            GameRegistry.addRecipe(enchantingIS, "ABC", "ZYZ", "XZX", 'X', Item.diamond, 'Y', Item.swordIron, 'Z', Block.glass, 'A', Item.bone, 'B', Item.skull, 'C', Item.spiderEye);
            GameRegistry.addRecipe(skullIS, "XXX", "XZX", "XXX", 'X', Block.blockDiamond, 'Z', Block.slowSand);
            GameRegistry.addRecipe(skullISI, "X X", " Z ", "X X", 'X', Item.bone, 'Z', Item.diamond);
            
            	//Shapeless Recipes
            GameRegistry.addShapelessRecipe(chainIS, hammerIS, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS1, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS2, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS3, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS4, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS5, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS6, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS7, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS8, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS9, ingotIronIS);
            GameRegistry.addShapelessRecipe(chainIS, hammerIS10, ingotIronIS);
            GameRegistry.addShapelessRecipe(ItemStackBrightSteelIngot, brightRockStack);
            GameRegistry.addShapelessRecipe(nuggetIS, this.BrightSteelIngot);
            GameRegistry.addShapelessRecipe(skullISII, skullISI);
            GameRegistry.addShapelessRecipe(skullISIII, skullISII);
            GameRegistry.addShapelessRecipe(skullISIV, skullISIII);
            GameRegistry.addShapelessRecipe(skullISI, skullISIV);
            GameRegistry.addShapelessRecipe(brightStickIS, Item.stick, BaseMod.BrightSteelIngot, Item.netherQuartz);
            
            	//Smelting Recipes
            GameRegistry.addSmelting(BrightOreID, BrightSteelItemStack, 1.0f);
            GameRegistry.addSmelting(BaseMod.netherBrightOre.blockID, BrightSteelOre, 10.0f);
            
            	//World Gen. Stuff
            MinecraftForge.setBlockHarvestLevel(brightOre, "Pickaxe", 3);
            GameRegistry.registerWorldGenerator(oreManager);
    }
           
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
            }
           
    }