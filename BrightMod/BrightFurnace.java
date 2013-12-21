package nwg.BrightMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BrightFurnace extends Block{

	public BrightFurnace(int id) {
		super(id, Material.ground);
		setHardness(2f);
		setResistance(2f);
		setLightOpacity(1);
		setStepSound(soundMetalFootstep);
		
		
	}

	//Setting Texture For Block
	//@SideOnly(Side.CLIENT)
	//Add Code Here
	
}
