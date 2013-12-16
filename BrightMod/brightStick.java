package nwg.BrightMod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class brightStick extends Item {
	public brightStick(int id) {
		super(id);
		
		setMaxStackSize(16);
		setCreativeTab(BaseMod.tabBright);
		setUnlocalizedName("stickBright");
		setTextureName(ModInfo.LOC + ":BrightStick");
	}

}
