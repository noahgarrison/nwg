package nwg.BrightMod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class brightHoe extends ItemHoe{

	public brightHoe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightHoe");
	}

}
