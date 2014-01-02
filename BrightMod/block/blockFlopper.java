package nwg.BrightMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockFlopper extends Block {

	public blockFlopper(int id, Material material) {
		super(id, material);
		setHardness(5.0f);
		setResistance(10.0f);
		setCreativeTab(BaseMod.tabBright);
		setUnlocalizedName("blockFlopper");
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	@SideOnly(Side.CLIENT)
	public static Icon frontIcon;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
	topIcon = icon.registerIcon(ModInfo.LOC + ":" + "FlopperTop");
	sideIcon = icon.registerIcon(ModInfo.LOC + ":" + "FlopperSide");
	frontIcon = icon.registerIcon(ModInfo.LOC + ":" + "FlopperFront");
	}

	@Override
	public Icon getIcon(int side, int meta) {
	if(side == 0 || side == 1) {
	return topIcon;
	} else if(side == 2) {
	return frontIcon;
	} else {
	return sideIcon;
	}
	}
}
