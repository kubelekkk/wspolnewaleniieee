package net.mcreator.udskurczybyk.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.udskurczybyk.entity.SkurczybykEntity;

public class SkurczybykModel extends GeoModel<SkurczybykEntity> {
	@Override
	public ResourceLocation getAnimationResource(SkurczybykEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "animations/ud_skurczybyk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkurczybykEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "geo/ud_skurczybyk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkurczybykEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "textures/entities/" + entity.getTexture() + ".png");
	}

}
