
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.udskurczybyk.block.UndeadbickswallBlock;
import net.mcreator.udskurczybyk.block.UndeadbicksstairsBlock;
import net.mcreator.udskurczybyk.block.UndeadbicksslabBlock;
import net.mcreator.udskurczybyk.block.UndeadbicksBlock;
import net.mcreator.udskurczybyk.block.UndeadStoneoreBlock;
import net.mcreator.udskurczybyk.block.OreblockPhantomiteBlock;
import net.mcreator.udskurczybyk.block.OasisStoneBlockBlock;
import net.mcreator.udskurczybyk.block.MonstermusclemassBlock;
import net.mcreator.udskurczybyk.block.MineralrichstoneBlock;
import net.mcreator.udskurczybyk.block.JajkoBlock;
import net.mcreator.udskurczybyk.block.DriedOutBloodBlock;
import net.mcreator.udskurczybyk.block.DeadTreeBlock;
import net.mcreator.udskurczybyk.block.ConcentratedmonstermassBlock;
import net.mcreator.udskurczybyk.block.ChitinoreBlock;
import net.mcreator.udskurczybyk.block.BurneddyingvegetationblockBlock;
import net.mcreator.udskurczybyk.UdSkurczybykMod;

public class UdSkurczybykModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UdSkurczybykMod.MODID);
	public static final RegistryObject<Block> JAJKO = REGISTRY.register("jajko", () -> new JajkoBlock());
	public static final RegistryObject<Block> UNDEADBICKS = REGISTRY.register("undeadbicks", () -> new UndeadbicksBlock());
	public static final RegistryObject<Block> UNDEADBICKSSTAIRS = REGISTRY.register("undeadbicksstairs", () -> new UndeadbicksstairsBlock());
	public static final RegistryObject<Block> UNDEADBICKSSLAB = REGISTRY.register("undeadbicksslab", () -> new UndeadbicksslabBlock());
	public static final RegistryObject<Block> UNDEADBICKSWALL = REGISTRY.register("undeadbickswall", () -> new UndeadbickswallBlock());
	public static final RegistryObject<Block> DRIED_OUT_BLOOD = REGISTRY.register("dried_out_blood", () -> new DriedOutBloodBlock());
	public static final RegistryObject<Block> UNDEAD_STONEORE = REGISTRY.register("undead_stoneore", () -> new UndeadStoneoreBlock());
	public static final RegistryObject<Block> MONSTERMUSCLEMASS = REGISTRY.register("monstermusclemass", () -> new MonstermusclemassBlock());
	public static final RegistryObject<Block> CHITINORE = REGISTRY.register("chitinore", () -> new ChitinoreBlock());
	public static final RegistryObject<Block> CONCENTRATEDMONSTERMASS = REGISTRY.register("concentratedmonstermass", () -> new ConcentratedmonstermassBlock());
	public static final RegistryObject<Block> OASIS_STONE_BLOCK = REGISTRY.register("oasis_stone_block", () -> new OasisStoneBlockBlock());
	public static final RegistryObject<Block> OREBLOCK_PHANTOMITE = REGISTRY.register("oreblock_phantomite", () -> new OreblockPhantomiteBlock());
	public static final RegistryObject<Block> DEAD_TREE = REGISTRY.register("dead_tree", () -> new DeadTreeBlock());
	public static final RegistryObject<Block> MINERALRICHSTONE = REGISTRY.register("mineralrichstone", () -> new MineralrichstoneBlock());
	public static final RegistryObject<Block> BURNEDDYINGVEGETATIONBLOCK = REGISTRY.register("burneddyingvegetationblock", () -> new BurneddyingvegetationblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
