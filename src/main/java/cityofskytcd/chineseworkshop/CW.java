package cityofskytcd.chineseworkshop;

import org.apache.logging.log4j.Logger;

import cityofskytcd.chineseworkshop.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CW.MODID, name = CW.NAME, version = CW.VERSION, acceptedMinecraftVersions = "1.10.2")
public class CW {
	public static final String MODID = "chineseworkshop";
	public static final String NAME = "ChineseWorkshop";
	public static final String VERSION = "1.1.0.2";

	@Instance(CW.MODID)
	public static CW instance;

	public static Logger logger;

	@SidedProxy(clientSide = "cityofskytcd.chineseworkshop.proxy.ClientProxy", serverSide = "cityofskytcd.chineseworkshop.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}