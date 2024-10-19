
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.udskurczybyk.client.renderer.SpidercreaperRenderer;
import net.mcreator.udskurczybyk.client.renderer.SkurczybykRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UdSkurczybykModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UdSkurczybykModEntities.SKURCZYBYK.get(), SkurczybykRenderer::new);
		event.registerEntityRenderer(UdSkurczybykModEntities.SPIDERCREAPER.get(), SpidercreaperRenderer::new);
	}
}
