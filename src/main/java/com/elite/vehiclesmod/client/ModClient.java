package com.elite.vehiclesmod.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.eventbus.api.SubscribeEvent;
import net.neoforged.eventbus.api.EventBusSubscriber;
import com.elite.vehiclesmod.VehiclesMod;
import com.elite.vehiclesmod.client.renderer.VehicleRenderer;
import com.elite.vehiclesmod.core.registry.ModEntities;

@EventBusSubscriber(modid = VehiclesMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClient {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.VEHICLE.get(), VehicleRenderer::new);
    }
}
