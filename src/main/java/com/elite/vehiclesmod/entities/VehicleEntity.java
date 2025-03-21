package com.elite.vehiclesmod.entities;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class VehicleEntity extends Entity {
    private static final EntityDataAccessor<Integer> DATA_ID = SynchedEntityData.defineId(VehicleEntity.class, EntityDataSerializers.INT);

    public VehicleEntity(EntityType<? extends VehicleEntity> type, Level level) {
        super(type, level);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(DATA_ID, 0); // Example: store an integer, can be modified later
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        if (tag.contains("CustomData")) {
            this.entityData.set(DATA_ID, tag.getInt("CustomData"));
        }
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        tag.putInt("CustomData", this.entityData.get(DATA_ID));
    }
}
