package team.cagayakegirls.forgematica;

import fi.dy.masa.litematica.Litematica;
import fi.dy.masa.litematica.compat.modmenu.ModMenuImpl;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = Forgematica.MOD_ID, dist = Dist.CLIENT)
public class Forgematica {
    public static final String MOD_ID = "forgematica";

    public Forgematica(ModContainer modContainer) {
        if (FMLLoader.getCurrent().getDist().isClient()) {
            modContainer.registerExtensionPoint(IConfigScreenFactory.class, new ModMenuImpl().getModConfigScreenFactory());
            new Litematica().onInitialize();
        }
    }
}
