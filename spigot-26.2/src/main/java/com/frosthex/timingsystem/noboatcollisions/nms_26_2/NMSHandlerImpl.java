package com.frosthex.timingsystem.noboatcollisions.nms_26_2;

import com.frosthex.timingsystem.noboatcollisions.NMSHandler;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Items;
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.Location;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.entity.CraftBoat;
import org.bukkit.craftbukkit.entity.boat.*;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class NMSHandlerImpl implements NMSHandler {

    private String boatType = "OAK_BOAT"; // Default

    @Override
    public void setBoatType(String boatType) {
        this.boatType = boatType.toUpperCase();
    }

    @Override
    public org.bukkit.entity.Boat spawnBoat(Location location) {
        ServerLevel level = ((CraftWorld) location.getWorld()).getHandle();
        CraftBoat boat;
        float yaw = Location.normalizeYaw(location.getYaw());

        switch (boatType) {
            case "OAK_BOAT":
                CollisionlessBoat oakBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.OAK_BOAT, level, () -> Items.AIR);
                oakBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                oakBoat.setYRot(yaw);
                oakBoat.yRotO = yaw;
                oakBoat.setYHeadRot(yaw);
                level.addFreshEntity(oakBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakBoat(level.getCraftServer(), oakBoat);
                break;
            case "SPRUCE_BOAT":
                CollisionlessBoat spruceBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.SPRUCE_BOAT, level, () -> Items.AIR);
                spruceBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                spruceBoat.setYRot(yaw);
                spruceBoat.yRotO = yaw;
                spruceBoat.setYHeadRot(yaw);
                level.addFreshEntity(spruceBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftSpruceBoat(level.getCraftServer(), spruceBoat);
                break;
            case "BIRCH_BOAT":
                CollisionlessBoat birchBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.BIRCH_BOAT, level, () -> Items.AIR);
                birchBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                birchBoat.setYRot(yaw);
                birchBoat.yRotO = yaw;
                birchBoat.setYHeadRot(yaw);
                level.addFreshEntity(birchBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBirchBoat(level.getCraftServer(), birchBoat);
                break;
            case "JUNGLE_BOAT":
                CollisionlessBoat jungleBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.JUNGLE_BOAT, level, () -> Items.AIR);
                jungleBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                jungleBoat.setYRot(yaw);
                jungleBoat.yRotO = yaw;
                jungleBoat.setYHeadRot(yaw);
                level.addFreshEntity(jungleBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftJungleBoat(level.getCraftServer(), jungleBoat);
                break;
            case "ACACIA_BOAT":
                CollisionlessBoat acaciaBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.ACACIA_BOAT, level, () -> Items.AIR);
                acaciaBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                acaciaBoat.setYRot(yaw);
                acaciaBoat.yRotO = yaw;
                acaciaBoat.setYHeadRot(yaw);
                level.addFreshEntity(acaciaBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftAcaciaBoat(level.getCraftServer(), acaciaBoat);
                break;
            case "DARK_OAK_BOAT":
                CollisionlessBoat darkOakBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.DARK_OAK_BOAT, level, () -> Items.AIR);
                darkOakBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                darkOakBoat.setYRot(yaw);
                darkOakBoat.yRotO = yaw;
                darkOakBoat.setYHeadRot(yaw);
                level.addFreshEntity(darkOakBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftDarkOakBoat(level.getCraftServer(), darkOakBoat);
                break;
            case "MANGROVE_BOAT":
                CollisionlessBoat mangroveBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.MANGROVE_BOAT, level, () -> Items.AIR);
                mangroveBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                mangroveBoat.setYRot(yaw);
                mangroveBoat.yRotO = yaw;
                mangroveBoat.setYHeadRot(yaw);
                level.addFreshEntity(mangroveBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftMangroveBoat(level.getCraftServer(), mangroveBoat);
                break;
            case "CHERRY_BOAT":
                CollisionlessBoat cherryBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.CHERRY_BOAT, level, () -> Items.AIR);
                cherryBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                cherryBoat.setYRot(yaw);
                cherryBoat.yRotO = yaw;
                cherryBoat.setYHeadRot(yaw);
                level.addFreshEntity(cherryBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftCherryBoat(level.getCraftServer(), cherryBoat);
                break;
            case "BAMBOO_RAFT":
                CollisionlessRaft bambooRaft = new CollisionlessRaft(net.minecraft.world.entity.EntityTypes.BAMBOO_RAFT, level, () -> Items.AIR);
                bambooRaft.setInitialPos(location.getX(), location.getY(), location.getZ());
                bambooRaft.setYRot(yaw);
                bambooRaft.yRotO = yaw;
                bambooRaft.setYHeadRot(yaw);
                level.addFreshEntity(bambooRaft, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBambooRaft(level.getCraftServer(), bambooRaft);
                break;
            case "OAK_CHEST_BOAT":
                CollisionlessChestBoat oakChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.OAK_CHEST_BOAT, level, () -> Items.AIR);
                oakChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                oakChestBoat.setYRot(yaw);
                oakChestBoat.yRotO = yaw;
                oakChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(oakChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakChestBoat(level.getCraftServer(), oakChestBoat);
                break;
            case "SPRUCE_CHEST_BOAT":
                CollisionlessChestBoat spruceChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.SPRUCE_CHEST_BOAT, level, () -> Items.AIR);
                spruceChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                spruceChestBoat.setYRot(yaw);
                spruceChestBoat.yRotO = yaw;
                spruceChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(spruceChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftSpruceChestBoat(level.getCraftServer(), spruceChestBoat);
                break;
            case "BIRCH_CHEST_BOAT":
                CollisionlessChestBoat birchChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.BIRCH_CHEST_BOAT, level, () -> Items.AIR);
                birchChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                birchChestBoat.setYRot(yaw);
                birchChestBoat.yRotO = yaw;
                birchChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(birchChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBirchChestBoat(level.getCraftServer(), birchChestBoat);
                break;
            case "JUNGLE_CHEST_BOAT":
                CollisionlessChestBoat jungleChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.JUNGLE_CHEST_BOAT, level, () -> Items.AIR);
                jungleChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                jungleChestBoat.setYRot(yaw);
                jungleChestBoat.yRotO = yaw;
                jungleChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(jungleChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftJungleChestBoat(level.getCraftServer(), jungleChestBoat);
                break;
            case "ACACIA_CHEST_BOAT":
                CollisionlessChestBoat acaciaChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.ACACIA_CHEST_BOAT, level, () -> Items.AIR);
                acaciaChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                acaciaChestBoat.setYRot(yaw);
                acaciaChestBoat.yRotO = yaw;
                acaciaChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(acaciaChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftAcaciaChestBoat(level.getCraftServer(), acaciaChestBoat);
                break;
            case "DARK_OAK_CHEST_BOAT":
                CollisionlessChestBoat darkOakChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.DARK_OAK_CHEST_BOAT, level, () -> Items.AIR);
                darkOakChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                darkOakChestBoat.setYRot(yaw);
                darkOakChestBoat.yRotO = yaw;
                darkOakChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(darkOakChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftDarkOakChestBoat(level.getCraftServer(), darkOakChestBoat);
                break;
            case "MANGROVE_CHEST_BOAT":
                CollisionlessChestBoat mangroveChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.MANGROVE_CHEST_BOAT, level, () -> Items.AIR);
                mangroveChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                mangroveChestBoat.setYRot(yaw);
                mangroveChestBoat.yRotO = yaw;
                mangroveChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(mangroveChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftMangroveChestBoat(level.getCraftServer(), mangroveChestBoat);
                break;
            case "CHERRY_CHEST_BOAT":
                CollisionlessChestBoat cherryChestBoat = new CollisionlessChestBoat(net.minecraft.world.entity.EntityTypes.CHERRY_CHEST_BOAT, level, () -> Items.AIR);
                cherryChestBoat.setInitialPos(location.getX(), location.getY(), location.getZ());
                cherryChestBoat.setYRot(yaw);
                cherryChestBoat.yRotO = yaw;
                cherryChestBoat.setYHeadRot(yaw);
                level.addFreshEntity(cherryChestBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftCherryChestBoat(level.getCraftServer(), cherryChestBoat);
                break;
            case "BAMBOO_CHEST_RAFT":
                CollisionlessChestRaft bambooChestRaft = new CollisionlessChestRaft(net.minecraft.world.entity.EntityTypes.BAMBOO_CHEST_RAFT, level, () -> Items.AIR);
                bambooChestRaft.setInitialPos(location.getX(), location.getY(), location.getZ());
                bambooChestRaft.setYRot(yaw);
                bambooChestRaft.yRotO = yaw;
                bambooChestRaft.setYHeadRot(yaw);
                level.addFreshEntity(bambooChestRaft, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftBambooChestRaft(level.getCraftServer(), bambooChestRaft);
                break;

            default:
                // Fallback to oak boat
                CollisionlessBoat defaultColBoat = new CollisionlessBoat(net.minecraft.world.entity.EntityTypes.OAK_BOAT, level, () -> Items.AIR);
                level.addFreshEntity(defaultColBoat, CreatureSpawnEvent.SpawnReason.COMMAND);
                boat = new CraftOakBoat(level.getCraftServer(), defaultColBoat);
                break;
        }

        return boat;
    }

    @Override
    public org.bukkit.entity.ChestBoat spawnChestBoat(Location location) {
        throw new NotImplementedException();
    }
}
