
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.udskurczybyk.UdSkurczybykMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UdSkurczybykModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UdSkurczybykMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(UdSkurczybykModItems.SKURCZYBYK_SPAWN_EGG.get());
			tabData.accept(UdSkurczybykModItems.THICKOFIT.get());
			tabData.accept(UdSkurczybykModItems.TESTIN_1_ARMOR_HELMET.get());
			tabData.accept(UdSkurczybykModItems.TESTIN_1_ARMOR_CHESTPLATE.get());
			tabData.accept(UdSkurczybykModItems.TESTIN_1_ARMOR_LEGGINGS.get());
			tabData.accept(UdSkurczybykModItems.TESTIN_1_ARMOR_BOOTS.get());
			tabData.accept(UdSkurczybykModItems.HAT_HELMET.get());
			tabData.accept(UdSkurczybykModItems.SPIDERCREAPER_SPAWN_EGG.get());
			tabData.accept(UdSkurczybykModBlocks.JAJKO.get().asItem());

		}
	}
}
