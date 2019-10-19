package de.ellpeck.nyx.entities;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

public class CauldronTrackerRenderer extends Render<CauldronTracker> {

    public CauldronTrackerRenderer(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected ResourceLocation getEntityTexture(CauldronTracker entity) {
        return TextureMap.LOCATION_BLOCKS_TEXTURE;
    }

    @Override
    public void doRender(CauldronTracker entity, double x, double y, double z, float entityYaw, float partialTicks) {

    }
}