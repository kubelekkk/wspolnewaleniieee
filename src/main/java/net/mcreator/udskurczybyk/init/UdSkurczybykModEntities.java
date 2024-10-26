
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.udskurczybyk.entity.SpidercreaperEntity;
import net.mcreator.udskurczybyk.entity.SkurczybykEntity;
import net.mcreator.udskurczybyk.entity.ShEntity;
import net.mcreator.udskurczybyk.UdSkurczybykMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UdSkurczybykModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UdSkurczybykMod.MODID);
	public static final RegistryObject<EntityType<SkurczybykEntity>> SKURCZYBYK = register("skurczybyk",
			EntityType.Builder.<SkurczybykEntity>of(SkurczybykEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkurczybykEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpidercreaperEntity>> SPIDERCREAPER = register("spidercreaper",
			EntityType.Builder.<SpidercreaperEntity>of(SpidercreaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpidercreaperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShEntity>> SH = register("sh",
			EntityType.Builder.<ShEntity>of(ShEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkurczybykEntity.init();
			SpidercreaperEntity.init();
			ShEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKURCZYBYK.get(), SkurczybykEntity.createAttributes().build());
		event.put(SPIDERCREAPER.get(), SpidercreaperEntity.createAttributes().build());
		event.put(SH.get(), ShEntity.createAttributes().build());
	}
}
