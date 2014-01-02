package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;

public class BrightSteelIngot extends Item {

	public BrightSteelIngot(int id) {
		super(id);
		
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
		setUnlocalizedName("ingotBrightSteel");
		setTextureName(ModInfo.LOC + ":BrightIngot");		
	}
}
