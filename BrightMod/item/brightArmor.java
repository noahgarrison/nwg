package nwg.BrightMod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import nwg.BrightMod.BaseMod;
import nwg.BrightMod.ModInfo;

public class brightArmor extends ItemArmor{

	
	public brightArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
			if (stack.itemID == BaseMod.brightHelmet.itemID
			|| stack.itemID == BaseMod.brightChestplate.itemID
			|| stack.itemID == BaseMod.brightBoot.itemID) {
			return ModInfo.LOC + ":brightArmor_1";
			}
			if (stack.itemID == BaseMod.brightLeggings.itemID) {
			return ModInfo.LOC + ":brightArmor_2";
			} else {
			return null;
			}
	}
	public void registerIcons(IconRegister reg) { // Make sure to import IconRegister!
	if (itemID == BaseMod.brightChestplate.itemID) {
	this.itemIcon = reg.registerIcon(ModInfo.LOC + ":brightChestPlate"); // You can also replace blockID and blockIcon with itemID and itemIcon
	}

	if (itemID == BaseMod.brightLeggings.itemID) {
	this.itemIcon = reg.registerIcon(ModInfo.LOC + ":brightLeggings"); // You can also replace blockID and blockIcon with itemID and itemIcon
	}

	if (itemID == BaseMod.brightBoot.itemID) {
	this.itemIcon = reg.registerIcon(ModInfo.LOC + ":brightBoots"); // You can also replace blockID and blockIcon with itemID and itemIcon
	}

	if (itemID == BaseMod.brightHelmet.itemID) {
	this.itemIcon = reg.registerIcon(ModInfo.LOC + ":brightHelmet"); // You can also replace blockID and blockIcon with itemID and itemIcon
	}

	
	//if(net.minecraft.inventory.ContainerPlayer.getSlot(1) == nwg.BrightMod.BaseMod.brightHelmet){
	//}
	}
}
