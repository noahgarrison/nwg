package nwg.BrightMod;

import net.minecraft.item.Item;

public class powderAir extends Item {

	public powderAir(int id) {
		super(id);
		
		setUnlocalizedName("powderAir");
		setTextureName(ModInfo.LOC + ":AirPowder");
		setCreativeTab(BaseMod.tabBright);
	}

}
