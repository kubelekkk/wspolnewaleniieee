
package net.mcreator.udskurczybyk.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BurneddyingvegetationblockBlock extends Block {
	public BurneddyingvegetationblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(4f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
