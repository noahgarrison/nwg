package nwg.BrightMod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class brightSword extends ItemSword {

	public brightSword(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightSword");
	}

}
