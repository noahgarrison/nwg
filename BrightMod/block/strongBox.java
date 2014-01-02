package nwg.BrightMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import nwg.BrightMod.ModInfo;

public class strongBox extends BlockChest {

	public strongBox(int id, int type) {
		super(id, type);
		setTextureName(ModInfo.LOC + ":StrongBox");
	}

}
