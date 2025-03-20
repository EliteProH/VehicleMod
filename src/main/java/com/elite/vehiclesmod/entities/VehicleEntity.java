package com.elite.vehiclesmod.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;

public class VehicleEntity extends Boat {
    // Constructor to define the entity type and the world
    public VehicleEntity(EntityType<? extends Boat> type, Level level) {
        super(type, level);
    }

    // Additional behavior (e.g., movement or controls) can be added here
    
}
