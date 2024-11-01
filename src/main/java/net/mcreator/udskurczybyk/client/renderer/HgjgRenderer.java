
package net.mcreator.udskurczybyk.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.udskurczybyk.entity.HgjgEntity;
import net.mcreator.udskurczybyk.client.model.ModelsAoulhunter;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HgjgRenderer extends MobRenderer<HgjgEntity, ModelsAoulhunter<HgjgEntity>> {
	public HgjgRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelsAoulhunter(context.bakeLayer(ModelsAoulhunter.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<HgjgEntity, ModelsAoulhunter<HgjgEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("ud_skurczybyk:textures/entities/soulhunterglowing.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, HgjgEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new ModelsAoulhunter(Minecraft.getInstance().getEntityModels().bakeLayer(ModelsAoulhunter.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HgjgEntity entity) {
		return new ResourceLocation("ud_skurczybyk:textures/entities/shtxt.png");
	}
}
