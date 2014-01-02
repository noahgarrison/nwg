package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;

public class brightNugget extends Item {

	public brightNugget(int id) {
		super(id);
		
		setTextureName(ModInfo.LOC + ":BrightNugget");
		setUnlocalizedName("nuggetBright");
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
	}
	

}
