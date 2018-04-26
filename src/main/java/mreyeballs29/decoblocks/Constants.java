package mreyeballs29.decoblocks;

public class Constants {
	public static final String modID = "decoblock";
	public static final String version = "2.0.0";
	public static final String modName = "Decoblocks 2";
	public static final String ASSET_PREFIX = "decoblock";
	public static final String TEXTURE_PREFIX = ASSET_PREFIX + ":";
	public static final String PREFIX = modID + ".";
	
	public static enum Deco2Items {
		GEAR("gearIron", "iron_gear");
		
		private String unlocalizedName;
		private String registryName;
		
		Deco2Items(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getRegistryName() {
			return registryName;
		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
