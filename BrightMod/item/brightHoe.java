package nwg.BrightMod.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import nwg.BrightMod.ModInfo;

public class brightHoe extends ItemHoe{

	public brightHoe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightHoe");
	}

}
