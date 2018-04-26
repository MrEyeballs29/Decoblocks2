package mreyeballs29.decoblocks;

import mreyeballs29.decoblocks.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.init.D2Items;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.version)
public class Decoblocks {
	
	@SidedProxy(clientSide="mreyeballs29.decoblocks.proxy.ClientProxy", serverSide="mreyeballs29.decoblocks.proxy.ServerProxy")
	public static CommonProxy proxy;
	
    @Instance
    public static Decoblocks instance = new Decoblocks();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		D2Items.Init();
		D2Items.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
