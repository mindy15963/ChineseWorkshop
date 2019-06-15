/**
 * This file is part of Chinese Workshop
 * (https://github.com/574448121/ChineseWorkshop)
 * 
 * Chinese Workshop is an Open-Source project under MIT License
 * (https://opensource.org/licenses/MIT)
 */

package cityofskytcd.chineseworkshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(CW.MODID)
public class CW
{
    public static final String MODID = "chineseworkshop";
    public static final String NAME = "ChineseWorkshop";

    public static Logger logger = LogManager.getLogger(CW.NAME);
}
