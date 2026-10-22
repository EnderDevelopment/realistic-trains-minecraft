package com.example.train_mod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.Level;

public class TrainEntity extends AbstractMinecart {
    public TrainEntity(EntityType<? extends AbstractMinecart> type, Level level) {
        super(type, level);
    }

    @Override
    public Type getMinecartType() {
        return Type.RIDEABLE;
    }
}