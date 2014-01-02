package nwg.BrightMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nwg.BrightMod.BaseMod;

public class BrightOre extends Block {

	public BrightOre(int id, Material material) {
		super(id, material);
		
		setHardness(5.0f);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("oreBright");
		setCreativeTab(BaseMod.tabBright);
		
	}

	
	
}
