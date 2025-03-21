// ModEntities.java - Fixed entity registration & spawn egg
package com.elite.vehiclesmod;

import com.elite.vehiclesmod.entities.VehicleEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, VehiclesMod.MODID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, VehiclesMod.MODID);

    public static final Supplier<EntityType<VehicleEntity>> PORSCHE_911_GT3_RS =
            ENTITIES.register("porsche_911_gt3_rs",
                    () -> EntityType.Builder.<VehicleEntity>of(VehicleEntity::new, MobCategory.MISC)
                            .sized(3.0F, 2.0F)
                            .build("porsche_911_gt3_rs"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        ITEMS.register(eventBus);
    }
}
