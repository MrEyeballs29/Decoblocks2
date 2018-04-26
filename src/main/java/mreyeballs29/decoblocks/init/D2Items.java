package mreyeballs29.decoblocks.init;

import mreyeballs29.decoblocks.item.ItemGear;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class D2Items {
	public static Item gear;
	
	public static void Init() {
		gear = new ItemGear();
	}
	
	public static void register() {
		GameRegistry.register(gear);
	}
	
	public static void registerRenders() {
		registerRender(gear);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));;
	}
}
