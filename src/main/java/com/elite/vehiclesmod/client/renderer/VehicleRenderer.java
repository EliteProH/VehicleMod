package com.elite.vehiclesmod.client.renderer;

import com.elite.vehiclesmod.VehiclesMod;
import com.elite.vehiclesmod.client.model.VehicleModel;
import com.elite.vehiclesmod.core.entities.VehicleEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import net.minecraft.resources.ResourceLocation;

public class VehicleRenderer extends GeoEntityRenderer<VehicleEntity> {

    public VehicleRenderer(EntityRendererProvider.Context context) {
        super(context, new VehicleModel());
    }

    @Override
    public ResourceLocation getTextureLocation(VehicleEntity entity) {
        return new ResourceLocation(VehiclesMod.MODID, "textures/entity/vehicle.png");
    }
}
