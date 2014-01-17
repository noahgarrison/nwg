package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.ModInfo;

public class freshWaterBottle extends Item {

	public freshWaterBottle(int id) {
		super(id);
		setTextureName(ModInfo.LOC + "freshWaterBottle");
		setUnlocalizedName("waterFresh");
		
	}

}
