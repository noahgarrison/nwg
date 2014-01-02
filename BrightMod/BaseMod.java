package nwg.BrightMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import nwg.BrightMod.block.BrightOre;
import nwg.BrightMod.block.GlowRock;
import nwg.BrightMod.block.blockSlime;
import nwg.BrightMod.item.coin;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VER)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class BaseMod {

	@Instance(ModInfo.ID)
    public static BaseMod instance;
	
		// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide=ModInfo.CLIENTPROXY + "ClientProxy", serverSide=ModInfo.COMMONPROXY + "CommonProxy")
    public static CommonProxy proxy;
    
    public static int grinderID = 700;
    public static int grinderActiveID = 701;
    public static int NetherOreID = 702;
    public static int OreID = 703;
    public static int BlockCompressedID = 704;
    public static int StrongBoxID = 705;
    public static int grinderIdleID = 706;
    public static int flopperID = 707;
    public static int PickID = 708;
    public static int SpadeID = 709;
    public static int HoeID = 710;
    public static int AxeID = 711;
    public static int NuggetID = 712;
    public static int IngotID = 713;
    public static int StickID = 714;
    public static int SwordID = 715;
    public static int WandID = 716;
    public static int PowderID = 717;
    public static int HammerID = 718;
    public static int MeshID = 719;
    public static int CoinOneID = 720;
    public static int CoinOneHundredID = 721;
    public static int CoinTwentyFiveID = 723;
    public static int CoinTwoHundredID = 724;
    public static int FiveHundredID = 725;
    public static int OneThousandID = 726;
    public static int HelmetID = 727;
    public static int ChestplateID = 728;
    public static int LeggingID = 729;
    public static int BootID = 730;
    public static int sludgeID = 731;
    public static int fertID = 732;
    public static int fertBlockID = 733;
    public static int slimeBlockID = 734;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//Config Handlers, broken
    	/*Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	//Get BlockID's from CFG
    	NetherOreID = config.getBlock("NetherOre", 500).getInt();
		OreID = config.getBlock("SurfaceOre", 501).getInt();
		BlockCompressedID = config.getBlock("CompressedBlock", 502).getInt();
		grinderActiveID = config.getBlock("GrinderActive", 506).getInt();
    	grinderIdleID = config.getBlock("GrinderIdle", 507).getInt();
    	StrongBoxID = config.getBlock("StrongBox", 505).getInt();
    	
    	//Get ToolID's from CFG
    	PickID = config.getItem("PickAxe", 5000).getInt();
		SpadeID = config.getItem("Spade", 5001).getInt();
		HoeID = config.getItem("Hoe", 5002).getInt();
		AxeID = config.getItem("Axe", 5003).getInt();
		
		//Get ItemID's from CFG
		NuggetID = config.getItem("Nugget", 5004).getInt();
		IngotID = config.getItem("Ingot", 5005).getInt();
		StickID = config.getItem("Stick", 5006).getInt();
		SwordID = config.getItem("Sword", 5007).getInt();
		WandID = config.getItem("Wand", 5008).getInt();
		PowderID = config.getItem("AirPowder", 5009).getInt();
		HammerID = config.getItem("Hammer", 5010).getInt();
		MeshID = config.getItem("IronMesh", 5011).getInt();
		sludgeID = config.getItem("Sludge", 5022).getInt();
		
		//Get CoinID's from CFG
		CoinOneID = config.getItem("CoinOne", 5012).getInt();
		CoinOneHundredID = config.getItem("CoinOneHundred", 5013).getInt();
		CoinTwentyFiveID = config.getItem("CoinTwentyFive", 5014).getInt();
		CoinTwoHundredID = config.getItem("CoinTwoHundred", 5015).getInt();
		FiveHundredID = config.getItem("CoinFiveHundred", 5016).getInt();
		OneThousandID = config.getItem("CoinOneThousand", 5017).getInt();
		
		//Get ArmorID's from CFG
    	HelmetID = config.getItem("Helmet", 5018).getInt();
    	ChestplateID = config.getItem("Chestplate", 5019).getInt();
    	LeggingID = config.getItem("Leggings", 5020).getInt();
    	BootID = config.getItem("Boots", 5021).getInt();
    	
		config.save();*/
    }
    
    //CraftingHandler, Armor and Tool Types, WorldGen, CreativeTab, GUI Handler, 
	public static nwgCraftingHandler craftingHandler = new nwgCraftingHandler();
    EventManager oreManager = new EventManager();
     public static CreativeTabs tabBright = new CreativeTabs("tabBright") {
         public ItemStack getIconItemStack() {
                 return new ItemStack(BaseMod.BrightSteelIngot, 1, 0);
         }
 }; 
	public EnumToolMaterial bright = EnumHelper.addToolMaterial("Bright", 3, 2500, 12.0f, 10.0f, 25);
	//private GuiHandlerFurnace guiHandlerFurnace = new GuiHandlerFurnace();
	public static EnumArmorMaterial brightArmor = EnumHelper.addArmorMaterial("brightArmorMaterial", 2500, new int[] {3, 7, 6, 3}, 30);
	
	//Item Creation
	public final Item sludgeDirt = new nwg.BrightMod.block.sludgeDirt(sludgeID);
	public final Item powderAir = new nwg.BrightMod.item.powderAir(PowderID);
	public final Item brightSword = new nwg.BrightMod.item.brightSword(SwordID , bright).setCreativeTab(BaseMod.tabBright).setUnlocalizedName("swordBright").setTextureName(ModInfo.LOC + ":BrightSword");
	public final static Item toolHammer = new nwg.BrightMod.item.toolHammer(HammerID).setUnlocalizedName("toolHammer").setCreativeTab(tabBright).setMaxDamage(10).setTextureName(ModInfo.LOC + ":Hammer").setMaxStackSize(1);
	public final Item ironMesh = new nwg.BrightMod.item.ironMesh(MeshID).setCreativeTab(tabBright).setMaxStackSize(8).setTextureName(ModInfo.LOC + ":chainMail").setUnlocalizedName("meshIron");
	public final Item coinOne = new coin(CoinOneID).setUnlocalizedName("coinOne").setTextureName(ModInfo.LOC + ":unum");
	public final Item coinOnehundred = new coin(CoinOneHundredID).setUnlocalizedName("coinHundred").setTextureName(ModInfo.LOC + ":cent");
	public final Item coinTwentyfive = new coin(CoinTwentyFiveID).setUnlocalizedName("coinTwentyFive").setTextureName(ModInfo.LOC + ":viginti quinque");
	public final Item coinTwohundred = new coin(CoinTwoHundredID).setUnlocalizedName("coinTwoHundred") .setTextureName(ModInfo.LOC + ":ducenti");
	public final Item coinFivehundred = new coin(FiveHundredID).setUnlocalizedName("coinFiveHundred").setTextureName(ModInfo.LOC + ":quingenti");
	public final Item coinOnethousand = new coin(OneThousandID).setUnlocalizedName("coinThousand").setTextureName(ModInfo.LOC + ":millia");
	public final Item brightWand = new nwg.BrightMod.item.brightWand(WandID).setUnlocalizedName("wand").setTextureName(ModInfo.LOC + ":brightWand");
	public final Item brightStick = new nwg.BrightMod.item.brightStick(StickID);
	public final Item brightNugget = new nwg.BrightMod.item.brightNugget(NuggetID);
	public final Item brightAxe = new nwg.BrightMod.item.brightAxe(AxeID, bright).setCreativeTab(BaseMod.tabBright).setUnlocalizedName("axeBright").setTextureName(ModInfo.LOC + ":BrightAxe");
 	public final Item brightPick = new nwg.BrightMod.item.brightPick(PickID, bright).setCreativeTab(BaseMod.tabBright).setUnlocalizedName("pickBright").setTextureName(ModInfo.LOC + ":BrightPickaxe");
 	public final Item brightHoe = new nwg.BrightMod.item.brightHoe(HoeID, bright).setCreativeTab(BaseMod.tabBright).setUnlocalizedName("hoeBright").setTextureName(ModInfo.LOC + ":BrightHoe");
 	public final Item brightShovel = new nwg.BrightMod.item.brightShovel(SpadeID, bright).setCreativeTab(BaseMod.tabBright).setUnlocalizedName("shovelBright").setTextureName(ModInfo.LOC + ":BrightShovel");
 	public final static Item BrightSteelIngot = new nwg.BrightMod.item.BrightSteelIngot(IngotID);
 	
 	//Armor Creation
 	public static Item brightHelmet = new nwg.BrightMod.item.brightArmor(HelmetID, brightArmor, 5, 0).setUnlocalizedName("brightHelmet");
	public static Item brightChestplate = new nwg.BrightMod.item.brightArmor(ChestplateID, brightArmor, 5, 1).setUnlocalizedName("brightChestplate");
	public static Item brightLeggings = new nwg.BrightMod.item.brightArmor(LeggingID, brightArmor, 5, 2).setUnlocalizedName("brightLeggings");
	public static Item brightBoot = new nwg.BrightMod.item.brightArmor(BootID, brightArmor, 5, 3).setUnlocalizedName("brightBoots");
	
 	
 		//Block Declarations
	//public final static Block BrightGrinder;
	public final Block sludgeBlock = new nwg.BrightMod.block.sludgeBlock(fertBlockID, Material.ground).setCreativeTab(tabBright).setHardness(.5F).setTextureName(ModInfo.LOC + ":SludgeBlock");
	public final Block slimeBlock = new blockSlime(slimeBlockID, Material.clay).setTextureName(ModInfo.LOC + ":slimeBlock").setUnlocalizedName("blockSlime");
	public final Block strongBox = new nwg.BrightMod.block.strongBox(StrongBoxID, 1).setLightValue(10.0f).setCreativeTab(tabBright).setHardness(1.0f).setUnlocalizedName("strongBox").setLightOpacity(1).setStepSound(Block.soundClothFootstep);
	public final static Block netherBrightOre = new nwg.BrightMod.block.netherBrightOre(NetherOreID, Material.ground).setHardness(0.5f).setTextureName(ModInfo.LOC + ":NetherBrightOre").setStepSound(Block.soundStoneFootstep).setCreativeTab(BaseMod.tabBright).setLightValue(10.0f);
	public final static Block brightRock = new GlowRock(BlockCompressedID, Material.ground).setHardness(0.5f).setTextureName(ModInfo.LOC + ":BrightBlock").setStepSound(Block.soundStoneFootstep).setUnlocalizedName("brightRock").setCreativeTab(BaseMod.tabBright).setLightValue(10.0f); 	
	public final static Block brightOre = new BrightOre(OreID, Material.rock).setTextureName(ModInfo.LOC + ":BrightOre"); 
	public final static Block blockFlopper = new nwg.BrightMod.block.blockFlopper(flopperID, Material.iron);
	//public final static Block BrightGrinderActive;
    @EventHandler
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            GameRegistry.registerItem(brightNugget, "nuggetBright");
            GameRegistry.registerBlock(slimeBlock, "blockSlime");
            GameRegistry.registerBlock(sludgeBlock, "sludgeBlock");
            GameRegistry.registerItem(ironMesh, "meshIron");
            GameRegistry.registerItem(powderAir, "powderAir");
            GameRegistry.registerBlock(netherBrightOre, "oreNetherBright");
            GameRegistry.registerBlock(strongBox, "strongBox");
            GameRegistry.registerBlock(blockFlopper, "blockFlopper");
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
            LanguageRegistry.addName(slimeBlock, "Block of Slime");
            LanguageRegistry.addName(blockFlopper, "Flopper");
            LanguageRegistry.addName(toolHammer, "Iron Hammer");
            LanguageRegistry.addName(sludgeBlock, "Block of Sludge");
            LanguageRegistry.addName(powderAir, "Air Powder");
            LanguageRegistry.addName(netherBrightOre, "Nether Bright Ore");
            LanguageRegistry.addName(brightNugget, "Bright Nugget");
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
            LanguageRegistry.addName(brightBoot, "Bright Boots");
            LanguageRegistry.addName(brightHelmet, "Bright Helmet");
            LanguageRegistry.addName(brightChestplate, "Bright Chestplate");
            LanguageRegistry.addName(brightLeggings, "Bright Leggings");
            LanguageRegistry.addName(brightStick, "Bright Stick");
            LanguageRegistry.addName(sludgeDirt, "Sludge");
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
            ItemStack lapisIS = new ItemStack(Item.dyePowder, 1, 4);
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
            ItemStack SignIS = new ItemStack(Item.sign);
            ItemStack NameTagIS = new ItemStack(Item.nameTag);
            ItemStack NetherBrickIS = new ItemStack(Item.netherrackBrick);
            ItemStack StringIS = new ItemStack(Item.silk);
            ItemStack DiamondIS = new ItemStack(Item.diamond);
            ItemStack sludgeIS = new ItemStack(sludgeDirt);
            ItemStack PoisionPotatoIS = new ItemStack(Item.poisonousPotato);
            ItemStack SludgeBlockIS = new ItemStack(this.sludgeBlock);
            ItemStack MossyIS = new ItemStack(Block.cobblestoneMossy);
            ItemStack slimeOutIS = new ItemStack(Item.slimeBall, 4);
            ItemStack slimeIS = new ItemStack(Item.slimeBall);
            	//New Recipes
            GameRegistry.addRecipe(SludgeBlockIS, "XX", "XX", 'X', sludgeIS);
            GameRegistry.addRecipe(MossyIS, "XXX", "XZX", "XXX", 'X', Block.cobblestone, 'Z', this.sludgeBlock);
            GameRegistry.addRecipe(sludgeIS, "YXY", "XZX", "YXY", 'Y', Block.slowSand, 'X', Block.sand, 'Z', Item.poisonousPotato);
            GameRegistry.addRecipe(NameTagIS, "XXX", "XYX", " Z ", 'X', StringIS, 'Y', DiamondIS, 'Z', SignIS);
            GameRegistry.addRecipe(DiamondHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.diamond, 'Y', GoldHorseArmorIS);
            GameRegistry.addRecipe(GoldHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.ingotGold, 'Y', IronHorseArmorIS);
            GameRegistry.addRecipe(IronHorseArmorIS, "  X", "XYX", "XXX", 'X', Item.ingotIron, 'Y', chainChestIS);
            GameRegistry.addRecipe(saddleStack, "LLL", "LWL", 'L', leatherItemstack, 'W', brownWoolItemstack);
            GameRegistry.addRecipe(hammerIS, "   ", "  X", " Y ", 'X', ingotIronIS, 'Y', stickIS);
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
            GameRegistry.addRecipe(skullIS, "XXX", "XZX", "XXX", 'X', Block.blockDiamond, 'Z', Item.netherrackBrick);
            GameRegistry.addRecipe(skullISI, "X X", " Z ", "X X", 'X', Item.bone, 'Z', Item.diamond);
            	//Shapeless Recipes
            GameRegistry.addShapelessRecipe(StrongBoxIS, Block.chest, Block.obsidian);
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
            GameRegistry.addShapelessRecipe(brightStickIS, Item.stick, nuggetIS, Item.netherQuartz, lapisIS);
            	//Smelting Recipes
            GameRegistry.addSmelting(this.brightOre.blockID, BrightSteelItemStack, 1.0f);
            GameRegistry.addSmelting(BaseMod.netherBrightOre.blockID, BrightSteelOre, 10.0f);
            	//World Gen. Stuff
            MinecraftForge.setBlockHarvestLevel(brightOre, "Pickaxe", 3);
            GameRegistry.registerWorldGenerator(oreManager);
    }
           
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method, not usually used, only specific circumstances
            }
           
    }