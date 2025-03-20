package com.elite.vehiclesmod;

import com.elite.vehiclesmod.entities.VehicleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegistryObject;

public class ModEntities {
    // Deferred register for entities
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, VehiclesMod.MODID);

    // Register the Porsche entity
    public static final RegistryObject<EntityType<VehicleEntity>> PORSCHE_911_GT3_RS =
            ENTITIES.register("porsche_911_gt3_rs", 
                () -> EntityType.Builder.of(VehicleEntity::new, MobCategory.MISC)
                    .sized(1.5F, 0.6F)
                    .build("porsche_911_gt3_rs"));

    // Register entities method
    public static void register() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
