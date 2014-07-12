package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

import java.util.UUID;

public class DinnerboneEvent extends WorldEvent {
    public DinnerboneEvent() {
        super("Dinnerbone");
        setProbability(2);
        setDescription("Causes all skeletons in the world to turn upside down.");
        setOccurMessage("We've been receiving sightings of upside down skeletons.");
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        for (LivingEntity entity : world.getLivingEntities()) {
            if (entity.getType() == EntityType.SKELETON && entity.getCustomName() == null) {
                entity.setCustomName("Dinnerbone");
            }
        }
        plugin.getMessenger().broadcastEventMessage(this);
        final UUID worldId = world.getUID();
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
                World world = Bukkit.getWorld(worldId);
                if (world != null) {
                    for (LivingEntity entity : world.getLivingEntities()) {
                        if (entity.getType() == EntityType.SKELETON && entity.getCustomName() != null && entity.getCustomName().equals("Dinnerbone")) {
                            entity.setCustomName(null);
                        }
                    }
                }
            }
        }, plugin.getConfig().getLong("Events.Dinnerbone.Duration", 15) * 20);
    }
}
