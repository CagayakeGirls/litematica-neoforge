package fi.dy.masa.litematica.compat.iris;

import fi.dy.masa.malilib.MaLiLibFabricData;
import fi.dy.masa.malilib.compat.ModIds;
import fi.dy.masa.litematica.Litematica;

// NeoForge: Iris API not on the compile classpath; shader-specific hooks are no-ops (same as the 26.2 port).
public class IrisCompat
{
	private static boolean isIrisLoaded = false;
	private static String irisVersion = "";

	public static void register()
	{
		if (MaLiLibFabricData.ALL_MOD_VERSIONS.containsKey(ModIds.iris))
		{
			irisVersion = MaLiLibFabricData.ALL_MOD_VERSIONS.get(ModIds.iris);
			isIrisLoaded = true;
		}

		Litematica.LOGGER.info("Iris: [{}]", isIrisLoaded ? irisVersion : "N/F");
	}

	public static boolean hasIris()
	{
		return isIrisLoaded;
	}

	public static boolean isShaderActive()
	{
		return false;
	}

	public static boolean isShadowPassActive()
	{
		return false;
	}

	public static void registerPipelines()
	{
	}
}