package com.elite.vehiclesmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item.Properties;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, VehiclesMod.MODID);

    // Register a custom spawn item
    public static final Supplier<Item> VEHICLE_SPAWN_ITEM = ITEMS.register("vehicle_spawn_item",
            () -> new Item(new Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
