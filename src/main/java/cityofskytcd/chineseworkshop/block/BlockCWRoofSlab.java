package cityofskytcd.chineseworkshop.block;

import java.util.List;

import cityofskytcd.chineseworkshop.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 屋顶半砖类
 */

public class BlockCWRoofSlab extends Block {
	private static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);

	public BlockCWRoofSlab(String name, Material materialIn, float hardness, SoundType type) {
		super(materialIn);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(SHAPE,
				BlockCWRoofSlab.EnumShape.STRAIGHT));
		this.setHardness(hardness);
		this.setUnlocalizedName(name);
		this.setSoundType(type);
		this.setCreativeTab(CreativeTabsLoader.tabCWF);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		list.add(new ItemStack(itemIn, 1, 0));
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ,
			int meta, EntityLivingBase placer) {
		IBlockState iblockstate = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
		iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing()).withProperty(SHAPE,
				BlockCWRoofSlab.EnumShape.STRAIGHT);
		return iblockstate;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING, SHAPE });
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return state.withProperty(SHAPE, getStairsShape(state, worldIn, pos));
	}

	private static BlockCWRoofSlab.EnumShape getStairsShape(IBlockState p_185706_0_, IBlockAccess p_185706_1_,
			BlockPos p_185706_2_) {
		EnumFacing enumfacing = p_185706_0_.getValue(FACING);
		IBlockState iblockstate = p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing));

		if (isBlockStairs(iblockstate)) {
			EnumFacing enumfacing1 = iblockstate.getValue(FACING);

			if (enumfacing1.getAxis() != p_185706_0_.getValue(FACING).getAxis()) {
				if (enumfacing1 == enumfacing.rotateYCCW()) {
					return BlockCWRoofSlab.EnumShape.OUTER_LEFT;
				}

				return BlockCWRoofSlab.EnumShape.OUTER_RIGHT;
			}
		}

		IBlockState iblockstate1 = p_185706_1_.getBlockState(p_185706_2_.offset(enumfacing.getOpposite()));

		if (isBlockStairs(iblockstate1)) {
			EnumFacing enumfacing2 = iblockstate1.getValue(FACING);

			if (enumfacing2.getAxis() != p_185706_0_.getValue(FACING).getAxis()) {
				if (enumfacing2 == enumfacing.rotateYCCW()) {
					return BlockCWRoofSlab.EnumShape.INNER_LEFT;
				}

				return BlockCWRoofSlab.EnumShape.INNER_RIGHT;
			}
		}

		return BlockCWRoofSlab.EnumShape.STRAIGHT;
	}

	public static boolean isBlockStairs(IBlockState state) {
		return state.getBlock() instanceof BlockCWRoofSlab;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState iblockstate = this.getDefaultState().withProperty(FACING, EnumFacing.getFront(5 - (meta & 3)));
		return iblockstate;
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | 5 - state.getValue(FACING).getIndex();
		return i;
	}

	public static enum EnumShape implements IStringSerializable {
		STRAIGHT("straight"), INNER_LEFT("inner_left"), INNER_RIGHT("inner_right"), OUTER_LEFT(
				"outer_left"), OUTER_RIGHT("outer_right");

		private final String name;

		private EnumShape(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public static final PropertyEnum<BlockCWRoofSlab.EnumShape> SHAPE = PropertyEnum.<BlockCWRoofSlab.EnumShape>create(
			"shape", BlockCWRoofSlab.EnumShape.class);
}
