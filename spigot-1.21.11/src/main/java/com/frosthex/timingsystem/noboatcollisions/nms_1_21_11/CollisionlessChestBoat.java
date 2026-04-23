package com.frosthex.timingsystem.noboatcollisions.nms_1_21_11;

import com.google.common.base.Supplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class CollisionlessChestBoat extends ChestBoat {

    public CollisionlessChestBoat(EntityType<? extends ChestBoat> entityType, Level level, Supplier<Item> dropSupplier) {
        super(entityType, level, dropSupplier);
    }

    @Override
    public boolean canCollideWith(Entity entity) {
        return false;
    }
}
