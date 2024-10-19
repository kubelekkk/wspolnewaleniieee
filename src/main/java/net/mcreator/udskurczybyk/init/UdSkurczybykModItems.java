
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

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
