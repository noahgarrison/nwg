package nwg.BrightMod;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BrightSteelIngot extends Item {

	public BrightSteelIngot(int id) {
		super(id);
		
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
		setUnlocalizedName("ingotBrightSteel");
		setTextureName(ModInfo.LOC + ":BrightIngot");		
	}
}
