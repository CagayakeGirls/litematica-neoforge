package fi.dy.masa.litematica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fi.dy.masa.malilib.event.InitializationHandler;
import fi.dy.masa.litematica.compat.iris.IrisCompat;
import fi.dy.masa.litematica.compat.voxy.VoxyCompat;
import fi.dy.masa.litematica.config.Configs;

public class Litematica
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    public void onInitialize()
    {
        IrisCompat.register();
        VoxyCompat.register();
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());
    }

    public static void debugLog(String msg, Object... args)
    {
        if (Configs.Generic.DEBUG_LOGGING.getBooleanValue() || Reference.DEBUG_MODE)
        {
            String message = "[DEBUG] "+msg;
            Litematica.LOGGER.info(message, args);
        }
    }
}
