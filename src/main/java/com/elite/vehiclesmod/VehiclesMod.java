package com.elite.vehiclesmod;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.event.IModBusEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.bus.api.IEventBus;

@Mod(VehiclesMod.MODID)
public class VehiclesMod {
    public static final String MODID = "vehiclesmod";

    public VehiclesMod() {
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ModEntities.register();  // Register entities here
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Common setup code (can be empty if not needed)
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-side setup (could be rendering or input handling)
    }
}
