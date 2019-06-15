/**
 * This file is part of Chinese Workshop
 * (https://github.com/574448121/ChineseWorkshop)
 * 
 * Chinese Workshop is an Open-Source project under MIT License
 * (https://opensource.org/licenses/MIT)
 */

package cityofskytcd.chineseworkshop.library;

import java.util.List;

import cityofskytcd.chineseworkshop.DecorationModule;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public interface ISeat
{
    default boolean hasSeat(BlockState state, IWorldReader world, BlockPos pos)
    {
        return world.getBlockState(pos.up()).isAir(world, pos);
    }

    Vec3d getSeat(BlockState state, IWorldReader world, BlockPos pos);

    public static class Seat extends Entity
    {

        public Seat(World world, Vec3d pos)
        {
            this(world);
            setPosition(pos.x, pos.y + 0.001, pos.z);
        }

        public Seat(World world)
        {
            super(DecorationModule.SEAT, world);
        }

        @Override
        public void tick()
        {
            if (this.posY < -64.0D)
            {
                this.outOfWorld();
            }

            this.firstUpdate = false;

            BlockPos pos = getPosition();
            if (pos == null || !(getEntityWorld().getBlockState(pos).getBlock() instanceof ISeat))
            {
                remove();
                return;
            }

            List<Entity> passangers = getPassengers();
            if (passangers.isEmpty())
                remove();
            for (Entity e : passangers)
                if (e.isSneaking())
                    remove();
        }

        @Override
        protected void registerData()
        {
        }

        @Override
        protected void readAdditional(CompoundNBT compound)
        {
        }

        @Override
        protected void writeAdditional(CompoundNBT p_213281_1_)
        {
        }

        @Override
        public IPacket<?> createSpawnPacket()
        {
            return NetworkHooks.getEntitySpawningPacket(this);
        }
    }
}
