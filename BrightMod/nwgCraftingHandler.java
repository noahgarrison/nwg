package nwg.BrightMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import net.minecraft.inventory.*;

public class nwgCraftingHandler implements ICraftingHandler{

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		/*for(int i=0; i < InventoryCrafting.getSizeInventory(); i++)
		{
			if(inv.getStackInSlot(i) != null)
			{
				ItemStack j = InventoryCrafting.getStackInSlot(i);
				if(j.getItem() != null && j.getItem() == BaseMod.toolHammer)
				{
					ItemStack k = new ItemStack(BaseMod.toolHammer, 2, (j.getItemDamage() + 1));
					inv.setInventoryContents(i, k);
				}
		}
		}
		*/
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}

}
