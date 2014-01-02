package nwg.BrightMod.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;
import nwg.BrightMod.ModInfo;

public class brightShovel extends ItemSpade {

	public brightShovel(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightShovel");
	}

}
