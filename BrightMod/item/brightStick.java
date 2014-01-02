package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;

public class brightStick extends Item {
	public brightStick(int id) {
		super(id);
		
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
		setUnlocalizedName("stickBright");
		setTextureName(ModInfo.LOC + ":BrightStick");
	}

}
