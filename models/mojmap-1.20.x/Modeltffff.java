// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltffff<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tffff"), "main");
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone2;

	public Modeltffff(ModelPart root) {
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-3.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 32)
						.addBox(-0.3381F, -1.8383F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 32)
						.addBox(0.0742F, -1.8314F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0192F, -1.8206F, 0.2F, 0.0F, 0.0F, -0.5323F));

		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(34, 32)
						.addBox(-0.5571F, -1.7935F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 28)
						.addBox(-0.1449F, -1.7865F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8192F, -1.9206F, 0.2F, 0.0F, 0.0F, -0.5323F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 17).addBox(-1.35F, -1.843F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0192F, -1.8206F, 0.2F, 3.1416F, 0.0F, 2.6093F));

		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 22).addBox(-0.2106F, -5.1814F, -0.7F, 1.5F, 4.0F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0192F, -1.8206F, 0.2F, 0.0F, 0.0F, -0.6632F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(16, 16)
				.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)).texOffs(24, 0)
						.addBox(-5.0F, 0.0F, -3.1F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 32)
						.addBox(-4.4F, 5.0F, -3.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
						.addBox(0.5F, 5.0F, -3.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}