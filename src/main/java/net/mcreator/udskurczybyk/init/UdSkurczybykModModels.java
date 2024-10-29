
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.udskurczybyk.client.model.Modeltffff;
import net.mcreator.udskurczybyk.client.model.Modelhellmet_negro_Converted_Converted;
import net.mcreator.udskurczybyk.client.model.ModelaHat_Converted_Converted;
import net.mcreator.udskurczybyk.client.model.ModelCB_Hat_Converted;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UdSkurczybykModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelaHat_Converted_Converted.LAYER_LOCATION, ModelaHat_Converted_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelhellmet_negro_Converted_Converted.LAYER_LOCATION, Modelhellmet_negro_Converted_Converted::createBodyLayer);
		event.registerLayerDefinition(Modeltffff.LAYER_LOCATION, Modeltffff::createBodyLayer);
		event.registerLayerDefinition(ModelCB_Hat_Converted.LAYER_LOCATION, ModelCB_Hat_Converted::createBodyLayer);
	}
}
