package nwg.BrightMod;

import net.minecraft.item.Item;

public class coin extends Item {

	public coin(int id) {
		super(id);
		setMaxStackSize(64);
		setCreativeTab(BaseMod.tabBright);
	}

}
