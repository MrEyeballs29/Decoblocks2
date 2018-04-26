package mreyeballs29.decoblocks.proxy;

import mreyeballs29.decoblocks.init.D2Items;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		D2Items.registerRenders();
	}

}
