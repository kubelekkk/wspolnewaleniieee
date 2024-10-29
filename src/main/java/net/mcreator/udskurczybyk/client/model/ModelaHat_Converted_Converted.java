package net.mcreator.udskurczybyk.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelaHat_Converted_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ud_skurczybyk", "modela_hat_converted_converted"), "main");
	public final ModelPart hat;

	public ModelaHat_Converted_Converted(ModelPart root) {
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(0, 14).addBox(-5.7F, -5.5664F, -6.4693F, 11.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(7, 15).addBox(-6.5F, -5.9664F, -4.8693F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(3, 20)
						.addBox(-6.5F, -5.9664F, 5.1307F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 19).addBox(-6.5F, -5.9664F, -6.8693F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 14)
						.addBox(4.5F, -5.9664F, -4.8693F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, -1).addBox(-4.1F, -7.6F, -4.4693F, 8.2F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.5F, -8.0F, -3.4693F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.6F, -0.2F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
