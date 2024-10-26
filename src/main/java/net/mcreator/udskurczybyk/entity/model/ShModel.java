package net.mcreator.udskurczybyk.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.udskurczybyk.entity.ShEntity;

public class ShModel extends GeoModel<ShEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "animations/soulshunter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "geo/soulshunter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShEntity entity) {
		return new ResourceLocation("ud_skurczybyk", "textures/entities/" + entity.getTexture() + ".png");
	}

}
