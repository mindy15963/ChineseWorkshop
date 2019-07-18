package cityofskytcd.chineseworkshop.tile;

import cityofskytcd.chineseworkshop.TextureModule;
import net.minecraft.nbt.CompoundNBT;
import snownee.kiwi.tile.TextureTile;

public class CWTextureTile extends TextureTile
{

    public CWTextureTile()
    {
        super(TextureModule.RETEXTURE, "main");
    }

    @Override
    public boolean isMark(String key)
    {
        return key.equals("main");
    }

    @Override
    public void read(CompoundNBT compound)
    {
        readPacketData(compound);
        super.read(compound);
    }

    @Override
    public CompoundNBT write(CompoundNBT compound)
    {
        writePacketData(compound);
        return super.write(compound);
    }

}