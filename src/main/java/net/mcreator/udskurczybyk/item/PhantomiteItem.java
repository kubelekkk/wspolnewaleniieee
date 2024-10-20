
package net.mcreator.udskurczybyk.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PhantomiteItem extends Item {
	public PhantomiteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
