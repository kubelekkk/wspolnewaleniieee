
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.udskurczybyk.client.model.ModelCB_Hat_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UdSkurczybykModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCB_Hat_Converted.LAYER_LOCATION, ModelCB_Hat_Converted::createBodyLayer);
	}
}
