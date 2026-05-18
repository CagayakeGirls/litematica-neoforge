package fi.dy.masa.litematica.mixin.render;

import net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockStateModelDispatcher.class)
public interface IMixinBlockRenderManager
{
    // liquidBlockRenderer no longer exists on BlockStateModelDispatcher in 26.1.x
}
