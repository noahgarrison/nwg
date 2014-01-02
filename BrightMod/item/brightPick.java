package nwg.BrightMod.item;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import nwg.BrightMod.ModInfo;

public class brightPick extends ItemPickaxe {

	public brightPick(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setTextureName(ModInfo.LOC + ":BrightPickaxe");
	}

}
