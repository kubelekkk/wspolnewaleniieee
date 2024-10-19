
package net.mcreator.udskurczybyk.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ThickofitItem extends RecordItem {
	public ThickofitItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ud_skurczybyk:thickofit")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 4080);
	}
}
