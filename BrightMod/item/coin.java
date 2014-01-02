package nwg.BrightMod.item;

import net.minecraft.item.Item;
import nwg.BrightMod.BaseMod;

public class coin extends Item {

	public coin(int id) {
		super(id);
		setMaxStackSize(32);
		setCreativeTab(BaseMod.tabBright);
	}

}
