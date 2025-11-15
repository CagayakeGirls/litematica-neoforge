package fi.dy.masa.litematica.compat.sodium;

import team.cagayakegirls.mafglib.utils.ModPlatform;

public class SodiumCompat
{
	public static final String SODIUM = "sodium";
    private static boolean hasSodium;
	private static String version = "";

    public static void checkForSodium()
    {
        hasSodium = ModPlatform.isModLoaded(SODIUM);

		if (ModPlatform.getModContainer(SODIUM).isPresent())
		{
			version = ModPlatform.getModContainer(SODIUM).get().getModInfo().getVersion().toString();
		}
    }

    public static boolean hasSodium() { return hasSodium; }

	public static String getVersion() { return version; }

    static
    {
        checkForSodium();
    }
}
