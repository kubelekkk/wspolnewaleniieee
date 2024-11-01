package net.mcreator.udskurczybyk.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelsAoulhunter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ud_skurczybyk", "models_aoulhunter"), "main");
	public final ModelPart bone;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart body;
	public final ModelPart headwear;
	public final ModelPart head;

	public ModelsAoulhunter(ModelPart root) {
		this.bone = root.getChild("bone");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_arm = this.bone.getChild("right_arm");
		this.left_arm = this.bone.getChild("left_arm");
		this.body = this.bone.getChild("body");
		this.headwear = this.bone.getChild("headwear");
		this.head = this.bone.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 16).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -12.0F, 0.1F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(32, 16).addBox(-1.0F, 0.0F, -1.1F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.1F));
		PartDefinition right_arm = bone.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 51).addBox(-1.5F, -2.1F, -1.1F, 2.7F, 10.8F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));
		PartDefinition left_arm = bone.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(26, 51).addBox(-1.3F, -2.1F, -1.1F, 2.7F, 10.8F, 2.2F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-4.2F, 0.0F, -2.2F, 8.4F, 15.9F, 4.4F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition headwear = bone.addOrReplaceChild("headwear", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 30).addBox(-5.5F, 17.8F, -6.3F, 11.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -24.064F, -0.5793F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(26, 32).addBox(-6.3F, 18.2F, -4.7F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -24.864F, -0.5863F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 41).addBox(-6.3F, 18.2F, 4.6F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -24.8701F, 0.1137F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 40).addBox(-6.3F, 19.0F, 3.6F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -25.5741F, -10.8929F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 34).addBox(12.7F, -5.3F, -12.6F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2F, -1.4338F, 7.5185F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 36).addBox(-4.1F, 15.5F, -5.1F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6F, -24.3684F, -0.0819F, 1.5708F, -1.5621F, -1.5708F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(36, 39).addBox(-3.1F, 18.1F, -3.1F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, -27.463F, -0.709F, 0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 36).addBox(-4.1F, 15.5F, -5.1F, 8.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6F, -24.3692F, 0.0181F, 1.5708F, -1.5621F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.zRot = netHeadYaw / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
