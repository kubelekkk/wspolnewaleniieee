
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.udskurczybyk.block.JajkoBlock;
import net.mcreator.udskurczybyk.UdSkurczybykMod;

public class UdSkurczybykModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UdSkurczybykMod.MODID);
	public static final RegistryObject<Block> JAJKO = REGISTRY.register("jajko", () -> new JajkoBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
