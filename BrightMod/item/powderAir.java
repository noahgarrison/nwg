package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;

public class powderAir extends Item {

	public powderAir(int id) {
		super(id);
		
		setUnlocalizedName("powderAir");
		setTextureName(ModInfo.LOC + ":AirPowder");
		setCreativeTab(BaseMod.tabBright);
	}

}
