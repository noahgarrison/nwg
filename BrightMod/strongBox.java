package nwg.BrightMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;

public class strongBox extends BlockChest {

	public strongBox(int id, int type) {
		super(id, type);
		setTextureName(ModInfo.LOC + ":StrongBox");
	}

}
