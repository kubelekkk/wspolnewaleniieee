
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.udskurczybyk.UdSkurczybykMod;

public class UdSkurczybykModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UdSkurczybykMod.MODID);
	public static final RegistryObject<CreativeModeTab> UN_DWORLD = REGISTRY.register("un_dworld",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ud_skurczybyk.un_dworld")).icon(() -> new ItemStack(UdSkurczybykModBlocks.UNDEADBICKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UdSkurczybykModItems.SKURCZYBYK_SPAWN_EGG.get());
				tabData.accept(UdSkurczybykModItems.THICKOFIT.get());
				tabData.accept(UdSkurczybykModItems.HAT_HELMET.get());
				tabData.accept(UdSkurczybykModItems.SPIDERCREAPER_SPAWN_EGG.get());
				tabData.accept(UdSkurczybykModBlocks.JAJKO.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.UNDEADBICKS.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.UNDEADBICKSSTAIRS.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.UNDEADBICKSSLAB.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.UNDEADBICKSWALL.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.DRIED_OUT_BLOOD.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.UNDEAD_STONEORE.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.MONSTERMUSCLEMASS.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.CHITINORE.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.CONCENTRATEDMONSTERMASS.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.OASIS_STONE_BLOCK.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.OREBLOCK_PHANTOMITE.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.DEAD_TREE.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.MINERALRICHSTONE.get().asItem());
				tabData.accept(UdSkurczybykModBlocks.BURNEDDYINGVEGETATIONBLOCK.get().asItem());
				tabData.accept(UdSkurczybykModItems.UNDEAD_HELMET.get());
				tabData.accept(UdSkurczybykModItems.UNDEAD_CHESTPLATE.get());
				tabData.accept(UdSkurczybykModBlocks.DYING_VEGETATION_BLOCK.get().asItem());
				tabData.accept(UdSkurczybykModItems.PHANTOMITE.get());
			})

					.build());
}
