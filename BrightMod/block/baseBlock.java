package nwg.BrightMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import nwg.BrightMod.ModInfo;

public class baseBlock extends Block {

	public baseBlock(int id, Material material) {
		super(id, material);
		setTextureName(ModInfo.LOC + ":baseBlock");
	}
	
	

	public class baseBlockEventHandler {

		public void handle(PlayerInteractEvent event){
			
		
			event.entityPlayer.addChatMessage(ModInfo.CONFIRM_MESSAGE);
			
		
	
		
		
		}
}
	
	}
	

