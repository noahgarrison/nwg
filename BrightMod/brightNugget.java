package nwg.BrightMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class brightNugget extends Item {

	public brightNugget(int id) {
		super(id);
		
		setTextureName(ModInfo.LOC + ":BrightNugget");
		setUnlocalizedName("nuggetBright");
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
	}
	

}
