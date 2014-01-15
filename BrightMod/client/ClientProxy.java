package nwg.BrightMod.client;

import nwg.BrightMod.CommonProxy;
import nwg.BrightMod.mobs.mobSoldier;
import nwg.BrightMod.mobs.renderMobSoldier;
import nwg.BrightMod.mobs.soldierMob;
import cpw.mods.fml.client.registry.RenderingRegistry;
//import nwg.BrightMod.mobs.renderMobSoldier;

public class ClientProxy extends CommonProxy {
	 @Override
     public void registerRenderers() {
		 RenderingRegistry.registerEntityRenderingHandler(soldierMob.class, new renderMobSoldier(new mobSoldier(), 1.5F));
             // This is for rendering entities and so forth later on
     }
}
