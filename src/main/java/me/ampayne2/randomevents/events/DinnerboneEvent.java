package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

/**
 * An event that causes all skeletons in the world to turn upside down.
 */
public class DinnerboneEvent extends WorldEvent {
    public DinnerboneEvent() {
        super("Dinnerbone");
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        for (LivingEntity entity : world.getLivingEntities()) {
            if (entity.getType() == EntityType.SKELETON) {
                entity.setCustomName("Dinnerbone");
            }
        }
    }
}
