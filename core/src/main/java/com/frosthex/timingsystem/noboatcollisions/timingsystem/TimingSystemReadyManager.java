package com.frosthex.timingsystem.noboatcollisions.timingsystem;

import com.frosthex.timingsystem.noboatcollisions.BoatSpawnerExtension;
import com.frosthex.timingsystem.noboatcollisions.NMSHandler;
import com.frosthex.timingsystem.noboatcollisions.TimingSystemNoBoatCollisionsPlugin;
import me.makkuusen.timing.system.api.TimingSystemAPI;
import org.bukkit.Location;
import org.bukkit.entity.Boat;

public class TimingSystemReadyManager {

    /**
     * This method is called if everything appears to be working with the rest of the plugin.
     * This method creates the BoatSpawner expected by the TimingSystemAPI.
     */
    public static void setNMSBoatSpawner() {
        TimingSystemAPI.setBoatSpawner(new BoatSpawnerExtension() {
//            @Override
//            public Boat spawnBoat(Location location) {
//                return TimingSystemNoBoatCollisionsPlugin.getNmsHandler().spawnBoat(location);
//            }
//
//            @Override
//            public Boat spawnChestBoat(Location location) {
//                return TimingSystemNoBoatCollisionsPlugin.getNmsHandler().spawnChestBoat(location);
//            }

            // 1.21.4+
            @Override
            public Boat spawnBoat(Location location, String woodType, Boolean chestBoat) {
                NMSHandler nmsHandler = TimingSystemNoBoatCollisionsPlugin.getNmsHandler();

                switch (woodType) {
                    case "ACACIA" -> {
                        nmsHandler.setBoatType(chestBoat ? "ACACIA_CHEST_BOAT" : "ACACIA_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "BIRCH" -> {
                        nmsHandler.setBoatType(chestBoat ? "BIRCH_CHEST_BOAT" : "BIRCH_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "DARK_OAK" -> {
                        nmsHandler.setBoatType(chestBoat ? "DARK_OAK_CHEST_BOAT" : "DARK_OAK_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "SPRUCE" -> {
                        nmsHandler.setBoatType(chestBoat ? "SPRUCE_CHEST_BOAT" : "SPRUCE_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "JUNGLE" -> {
                        nmsHandler.setBoatType(chestBoat ? "JUNGLE_CHEST_BOAT" : "JUNGLE_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "MANGROVE" -> {
                        nmsHandler.setBoatType(chestBoat ? "MANGROVE_CHEST_BOAT" : "MANGROVE_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "CHERRY" -> {
                        nmsHandler.setBoatType(chestBoat ? "CHERRY_CHEST_BOAT" : "CHERRY_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                    case "BAMBOO" -> {
                        nmsHandler.setBoatType(chestBoat ? "BAMBOO_CHEST_RAFT" : "BAMBOO_RAFT");
                        return nmsHandler.spawnBoat(location);
                    }
                    default -> {
                        nmsHandler.setBoatType(chestBoat ? "OAK_CHEST_BOAT" : "OAK_BOAT");
                        return nmsHandler.spawnBoat(location);
                    }
                }
            }
        });

    }

}
