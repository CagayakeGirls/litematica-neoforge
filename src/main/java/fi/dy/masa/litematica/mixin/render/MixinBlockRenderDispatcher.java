package fi.dy.masa.litematica.mixin.render;

import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher;

// onResourceManagerReload no longer exists on BlockStateModelDispatcher in 26.1.x;
// FluidRenderer is now created on-demand from ModelManager.getFluidStateModelSet()
@Mixin(BlockStateModelDispatcher.class)
public class MixinBlockRenderDispatcher
{
}
