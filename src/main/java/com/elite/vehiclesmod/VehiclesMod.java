// VehiclesMod.java - Fixed mod initialization
package com.elite.vehiclesmod;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.bus.api.IEventBus;

@Mod(VehiclesMod.MODID)
public class VehiclesMod {
    public static final String MODID = "vehiclesmod";

    public VehiclesMod() {
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        // ✅ Register items before using them
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
        // Register entities & items
        ModEntities.register(modEventBus);

        // Register setup events
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Common setup logic (networking, capabilities, etc.)
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-side rendering and input handling
    }
}
