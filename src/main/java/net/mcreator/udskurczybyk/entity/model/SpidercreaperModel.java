package net.mcreator.udskurczybyk.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.udskurczybyk.entity.SpidercreaperEntity;

public class SpidercreaperModel extends GeoModel<SpidercreaperEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpidercreaperEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "animations/cave_climber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpidercreaperEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "geo/cave_climber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpidercreaperEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "textures/entities/" + entity.getTexture() + ".png");
	}

}
