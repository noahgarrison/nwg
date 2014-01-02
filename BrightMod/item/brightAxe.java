package nwg.BrightMod.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import nwg.BrightMod.ModInfo;

public class brightAxe extends ItemAxe {

	public brightAxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightAxe");
	}

}
