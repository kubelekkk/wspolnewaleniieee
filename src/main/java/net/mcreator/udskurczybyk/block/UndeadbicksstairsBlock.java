
package net.mcreator.udskurczybyk.block;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.udskurczybyk.init.UdSkurczybykModBlocks;

public class UndeadbicksstairsBlock extends StairBlock {
	public UndeadbicksstairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE_BRICKS).strength(10f, 40f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 40f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(UdSkurczybykModBlocks.UNDEADBICKSSTAIRS.get());
	}
}
