package com.frosthex.timingsystem.noboatcollisions.nms_1_21_11;

import com.google.common.base.Supplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class CollisionlessBoat extends Boat {

    public CollisionlessBoat(EntityType<? extends Boat> entityType, Level level, Supplier<Item> dropSupplier) {
        super(entityType, level, dropSupplier);
    }

    @Override
    public boolean canCollideWith(Entity entity) {
        return false;
    }
}
