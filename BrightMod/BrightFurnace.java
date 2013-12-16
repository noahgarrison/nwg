package nwg.BrightMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BrightFurnace extends BlockContainer {

	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private Icon iconFront;
	
	public BrightFurnace(int id, boolean isActive) {
		super(id, Material.rock);
		setCreativeTab(BaseMod.tabBright);
		
		this.isActive = isActive;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(ModInfo.LOC + ":BrightFurnaceSide");
		this.iconFront = iconRegister.registerIcon(ModInfo.LOC + ":" + (this.isActive ? "BrightFurnaceFrontActive" : "BrightFurnaceIdleFront"));
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata){
		return side == 1 ? this.blockIcon : (side == 0 ? this.blockIcon : side != metadata ? this.blockIcon : this.iconFront);
		//return side == metadata ? this.iconFront : this.blockIcon;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	
}


