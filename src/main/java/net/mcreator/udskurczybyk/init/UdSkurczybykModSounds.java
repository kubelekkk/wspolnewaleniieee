
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.udskurczybyk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.udskurczybyk.UdSkurczybykMod;

public class UdSkurczybykModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UdSkurczybykMod.MODID);
	public static final RegistryObject<SoundEvent> THICKOFIT = REGISTRY.register("thickofit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ud_skurczybyk", "thickofit")));
	public static final RegistryObject<SoundEvent> OBRAZENIASKURCZYBYK = REGISTRY.register("obrazeniaskurczybyk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ud_skurczybyk", "obrazeniaskurczybyk")));
	public static final RegistryObject<SoundEvent> SMIERCSKURCZYBYK = REGISTRY.register("smiercskurczybyk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ud_skurczybyk", "smiercskurczybyk")));
	public static final RegistryObject<SoundEvent> DRAKEDRAKE = REGISTRY.register("drakedrake", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("ud_skurczybyk", "drakedrake")));
}
