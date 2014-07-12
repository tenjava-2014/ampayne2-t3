package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * An event that makes every player's compass go bonkers.
 */
public class GeomagneticReversalEvent extends WorldEvent {
    private final Map<UUID, Integer> eventTasks = new HashMap<>();

    public GeomagneticReversalEvent() {
        super("GeomagneticReversal");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        final UUID worldId = world.getUID();
        eventTasks.put(world.getUID(), Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getWorld(worldId).getPlayers()) {
                    double angle = RANDOM.nextInt((int) (2 * Math.PI));
                    player.setCompassTarget(player.getLocation().add(Math.sin(angle), 0, Math.cos(angle)));
                }
            }
        }, 0, 5));
        final Location spawnLocation = world.getSpawnLocation();
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                Bukkit.getScheduler().cancelTask(eventTasks.get(worldId));
                for (Player player : Bukkit.getWorld(worldId).getPlayers()) {
                    player.setCompassTarget(spawnLocation);
                }
                eventTasks.remove(worldId);
            }
        }, plugin.getConfig().getLong("Events.GeomagneticReversal.Duration", 15) * 20);
    }

    @Override
    public boolean canOccur(World world) {
        return super.canOccur(world) && !eventTasks.containsKey(world.getUID());
    }
}
