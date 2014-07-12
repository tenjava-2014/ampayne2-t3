package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * An event that drops an anvil onto a player.
 */
public class AnvilFallEvent extends PlayerEvent implements Listener {
    private List<Location> anvilLocations = new ArrayList<>();

    public AnvilFallEvent() {
        super("AnvilFall");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, Player player) {
        // Drop the anvil as high above the player as possible up to the configured fall height
        int fallHeight = plugin.getConfig().getInt("Events.AnvilFall.FallHeight", 15);
        Location location = player.getLocation();
        for (int i = 0; i < fallHeight; i++) {
            if (location.add(0, 1, 0).getBlock().getType() != Material.AIR) {
                location.getBlock().setType(Material.ANVIL);
                anvilLocations.add(location);
                break;
            }
        }
    }

    @EventHandler
    public void onAnvilLand(EntityChangeBlockEvent event) {
        if (event.getEntityType().equals(EntityType.FALLING_BLOCK)) {
            FallingBlock entity = (FallingBlock) event.getEntity();
            if (entity.getMaterial() == Material.ANVIL) {
                Location landLocation = event.getBlock().getLocation();
                for (Location location : new ArrayList<>(anvilLocations)) {
                    if (landLocation.getBlockX() == location.getBlockX() && landLocation.getBlockZ() == location.getBlockZ()) {
                        event.setCancelled(true);
                        anvilLocations.remove(location);
                        return;
                    }
                }
            }
        }
    }
}
