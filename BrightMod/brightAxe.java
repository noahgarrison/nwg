package nwg.BrightMod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class brightAxe extends ItemAxe {

	public brightAxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightAxe");
	}

}
