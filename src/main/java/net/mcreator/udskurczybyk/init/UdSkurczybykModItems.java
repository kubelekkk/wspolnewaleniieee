
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.udskurczybyk.item.ThickofitItem;
import net.mcreator.udskurczybyk.item.Testin1ArmorItem;
import net.mcreator.udskurczybyk.item.HatItem;
import net.mcreator.udskurczybyk.UdSkurczybykMod;

public class UdSkurczybykModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UdSkurczybykMod.MODID);
	public static final RegistryObject<Item> SKURCZYBYK_SPAWN_EGG = REGISTRY.register("skurczybyk_spawn_egg", () -> new ForgeSpawnEggItem(UdSkurczybykModEntities.SKURCZYBYK, -8406922, -1982026, new Item.Properties()));
	public static final RegistryObject<Item> THICKOFIT = REGISTRY.register("thickofit", () -> new ThickofitItem());
	public static final RegistryObject<Item> TESTIN_1_ARMOR_HELMET = REGISTRY.register("testin_1_armor_helmet", () -> new Testin1ArmorItem.Helmet());
	public static final RegistryObject<Item> TESTIN_1_ARMOR_CHESTPLATE = REGISTRY.register("testin_1_armor_chestplate", () -> new Testin1ArmorItem.Chestplate());
	public static final RegistryObject<Item> TESTIN_1_ARMOR_LEGGINGS = REGISTRY.register("testin_1_armor_leggings", () -> new Testin1ArmorItem.Leggings());
	public static final RegistryObject<Item> TESTIN_1_ARMOR_BOOTS = REGISTRY.register("testin_1_armor_boots", () -> new Testin1ArmorItem.Boots());
	public static final RegistryObject<Item> HAT_HELMET = REGISTRY.register("hat_helmet", () -> new HatItem.Helmet());
	public static final RegistryObject<Item> SPIDERCREAPER_SPAWN_EGG = REGISTRY.register("spidercreaper_spawn_egg", () -> new ForgeSpawnEggItem(UdSkurczybykModEntities.SPIDERCREAPER, -8895934, -11193549, new Item.Properties()));
	public static final RegistryObject<Item> JAJKO = block(UdSkurczybykModBlocks.JAJKO);
	public static final RegistryObject<Item> UNDEADBICKS = block(UdSkurczybykModBlocks.UNDEADBICKS);
	public static final RegistryObject<Item> UNDEADBICKSSTAIRS = block(UdSkurczybykModBlocks.UNDEADBICKSSTAIRS);
	public static final RegistryObject<Item> UNDEADBICKSSLAB = block(UdSkurczybykModBlocks.UNDEADBICKSSLAB);
	public static final RegistryObject<Item> UNDEADBICKSWALL = block(UdSkurczybykModBlocks.UNDEADBICKSWALL);
	public static final RegistryObject<Item> DRIED_OUT_BLOOD = block(UdSkurczybykModBlocks.DRIED_OUT_BLOOD);
	public static final RegistryObject<Item> UNDEAD_STONEORE = block(UdSkurczybykModBlocks.UNDEAD_STONEORE);
	public static final RegistryObject<Item> MONSTERMUSCLEMASS = block(UdSkurczybykModBlocks.MONSTERMUSCLEMASS);
	public static final RegistryObject<Item> CHITINORE = block(UdSkurczybykModBlocks.CHITINORE);
	public static final RegistryObject<Item> CONCENTRATEDMONSTERMASS = block(UdSkurczybykModBlocks.CONCENTRATEDMONSTERMASS);
	public static final RegistryObject<Item> OASIS_STONE_BLOCK = block(UdSkurczybykModBlocks.OASIS_STONE_BLOCK);
	public static final RegistryObject<Item> OREBLOCK_PHANTOMITE = block(UdSkurczybykModBlocks.OREBLOCK_PHANTOMITE);
	public static final RegistryObject<Item> DEAD_TREE = block(UdSkurczybykModBlocks.DEAD_TREE);
	public static final RegistryObject<Item> MINERALRICHSTONE = block(UdSkurczybykModBlocks.MINERALRICHSTONE);
	public static final RegistryObject<Item> BURNEDDYINGVEGETATIONBLOCK = block(UdSkurczybykModBlocks.BURNEDDYINGVEGETATIONBLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
