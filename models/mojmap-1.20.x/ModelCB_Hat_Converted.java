// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCB_Hat_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cb_hat_converted"), "main");
	private final ModelPart hat;

	public ModelCB_Hat_Converted(ModelPart root) {
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-5.7F, -6.8698F, -6.5327F, 11.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(7, 15)
						.addBox(-6.5F, -7.2698F, -4.9327F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(3, 20)
						.addBox(-6.5F, -7.2698F, 5.0673F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(1, 14)
						.addBox(-6.5F, -7.2698F, -6.9327F, 13.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 14)
						.addBox(4.5F, -7.2698F, -4.9327F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-3.2F, -9.9698F, -3.5327F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -1.5708F, -1.5621F, 1.5708F));

		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(10, -1).addBox(-4.1F, 15.5F, -5.1F, 8.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -24.9698F, 0.0673F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.hat.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.hat.xRot = headPitch / (180F / (float) Math.PI);
	}
}