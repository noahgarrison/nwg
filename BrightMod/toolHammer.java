package nwg.BrightMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class toolHammer extends Item {

	public toolHammer(int id) {
		super(id);
		setContainerItem(this);
	}

	public boolean doesContainreItemLeaveCraftingGrid(ItemStack itemstack1)
	{
		return false;
	}
	
	public ItemStack getContainerItemStack(ItemStack itemstack)
	{
		ItemStack itemstack1 = new ItemStack(BaseMod.toolHammer, 1, (itemstack.getItemDamage() + 1));
		
		return itemstack1;
		
	}
	
}
