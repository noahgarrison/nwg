package nwg.BrightMod.block;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nwg.BrightMod.ModInfo;

public class sludgeDirt extends Item {

	public sludgeDirt(int id) {
		super(id);
		setTextureName(ModInfo.LOC + ":Sludge");
		setUnlocalizedName("sludge");
		
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4){
		list.add("Used to Refine Some Materials");
	}
	
}
