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
public class Modelhellmet_negro_Converted_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ud_skurczybyk", "modelhellmet_negro_converted_converted"), "main");
	public final ModelPart bone;
	public final ModelPart rogi;
	public final ModelPart bone3;
	public final ModelPart rogi5;
	public final ModelPart bone2;
	public final ModelPart bone4;
	public final ModelPart bone13;
	public final ModelPart rogi15;
	public final ModelPart bone12;
	public final ModelPart rogi14;
	public final ModelPart bone11;
	public final ModelPart rogi13;
	public final ModelPart bone10;
	public final ModelPart rogi12;
	public final ModelPart bone8;
	public final ModelPart rogi10;
	public final ModelPart bone9;
	public final ModelPart rogi11;
	public final ModelPart bone7;
	public final ModelPart rogi9;
	public final ModelPart bone6;
	public final ModelPart rogi8;
	public final ModelPart bone5;
	public final ModelPart rogi7;
	public final ModelPart rogi6;

	public Modelhellmet_negro_Converted_Converted(ModelPart root) {
		this.bone = root.getChild("bone");
		this.rogi = this.bone.getChild("rogi");
		this.bone3 = this.rogi.getChild("bone3");
		this.rogi5 = this.bone3.getChild("rogi5");
		this.bone2 = this.bone.getChild("bone2");
		this.bone4 = this.bone2.getChild("bone4");
		this.bone13 = this.bone4.getChild("bone13");
		this.rogi15 = this.bone13.getChild("rogi15");
		this.bone12 = this.bone4.getChild("bone12");
		this.rogi14 = this.bone12.getChild("rogi14");
		this.bone11 = this.bone4.getChild("bone11");
		this.rogi13 = this.bone11.getChild("rogi13");
		this.bone10 = this.bone4.getChild("bone10");
		this.rogi12 = this.bone10.getChild("rogi12");
		this.bone8 = this.bone4.getChild("bone8");
		this.rogi10 = this.bone8.getChild("rogi10");
		this.bone9 = this.bone8.getChild("bone9");
		this.rogi11 = this.bone9.getChild("rogi11");
		this.bone7 = this.bone4.getChild("bone7");
		this.rogi9 = this.bone7.getChild("rogi9");
		this.bone6 = this.bone4.getChild("bone6");
		this.rogi8 = this.bone6.getChild("rogi8");
		this.bone5 = this.bone4.getChild("bone5");
		this.rogi7 = this.bone5.getChild("rogi7");
		this.rogi6 = this.bone4.getChild("rogi6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi = bone.addOrReplaceChild("rogi", CubeListBuilder.create().texOffs(97, 30).addBox(-65.85F, -35.75F, -1.75F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(67.6F, 27.0F, 0.0F));
		PartDefinition cube_r1 = rogi.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(192, 89).addBox(-0.2106F, -5.1814F, -0.7F, 1.5F, 4.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-64.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r2 = rogi.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(141, 160).mirror().addBox(-0.7308F, 0.6706F, 0.15F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-64.2192F, -38.8206F, 0.2F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r3 = rogi.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(141, 160).mirror().addBox(-0.4308F, 0.7706F, -1.15F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(141, 159).mirror()
						.addBox(-0.2808F, 0.7706F, -1.0F, 2.0F, 4.75F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(142, 159).mirror().addBox(-0.5808F, 0.7706F, -1.0F, 1.0F, 4.75F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-64.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r4 = rogi.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 83).mirror().addBox(-1.35F, -1.843F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-64.5192F, -38.9206F, 0.2F, 3.1416F, 0.0F, 2.9234F));
		PartDefinition cube_r5 = rogi.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(-0.5571F, -1.7935F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 84).mirror()
				.addBox(-0.1449F, -1.7865F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-64.3192F, -39.0206F, 0.2F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r6 = rogi.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 84).mirror().addBox(0.0742F, -1.8314F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(48, 84).mirror()
				.addBox(-0.3381F, -1.8383F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-64.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bone3 = rogi.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-59.6F, -3.4F, -8.0F));
		PartDefinition rogi5 = bone3.addOrReplaceChild("rogi5", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r7 = rogi5.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 84).addBox(-0.8551F, -1.7865F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.3192F, -39.0206F, 0.2F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(55, 105).addBox(-28.5F, -32.0F, 3.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(24.0F, 23.6F, -8.0F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-16.0F, 0.0F, 0.0F));
		PartDefinition bone13 = bone4.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi15 = bone13.addOrReplaceChild("rogi15", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r8 = rogi15.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(192, 89).mirror().addBox(-1.2894F, -5.1814F, -0.7F, 1.5F, 4.0F, 1.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone12 = bone4.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi14 = bone12.addOrReplaceChild("rogi14", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(30.85F, -35.75F, -1.75F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition bone11 = bone4.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi13 = bone11.addOrReplaceChild("rogi13", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r9 = rogi13.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(141, 160).addBox(-1.2692F, 0.6706F, 0.15F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.2192F, -38.8206F, 0.2F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone10 = bone4.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi12 = bone10.addOrReplaceChild("rogi12", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r10 = rogi12.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(141, 160).addBox(-1.5692F, 0.7706F, -1.15F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone8 = bone4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi10 = bone8.addOrReplaceChild("rogi10", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r11 = rogi10.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(142, 159).addBox(-0.4192F, 0.7706F, -1.0F, 1.0F, 4.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi11 = bone9.addOrReplaceChild("rogi11", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r12 = rogi11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(141, 159).addBox(-1.7192F, 0.7706F, -1.0F, 2.0F, 4.75F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, -0.0436F));
		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi9 = bone7.addOrReplaceChild("rogi9", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r13 = rogi9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 83).addBox(-0.65F, -1.843F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 3.1416F, 0.0F, -2.9234F));
		PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi8 = bone6.addOrReplaceChild("rogi8", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r14 = rogi8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 84).addBox(-0.4429F, -1.7935F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.3192F, -39.0206F, 0.2F, 0.0F, 0.0F, 0.2182F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rogi7 = bone5.addOrReplaceChild("rogi7", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r15 = rogi7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 84).addBox(-1.0742F, -1.8314F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, 0.2182F));
		PartDefinition rogi6 = bone4.addOrReplaceChild("rogi6", CubeListBuilder.create(), PartPose.offset(-43.6F, 3.4F, 8.0F));
		PartDefinition cube_r16 = rogi6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(48, 84).addBox(-0.6619F, -1.8383F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.5192F, -38.9206F, 0.2F, 0.0F, 0.0F, 0.2182F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
