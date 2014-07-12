package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * An event that sets all living entities in the world on fire.<br>
 * "It's so hot, the chickens are laying hard-boiled eggs..."
 */
public class SolarFlareEvent extends WorldEvent {
    public SolarFlareEvent() {
        super("SolarFlare");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        for (Player player : world.getPlayers()) {
            player.setFireTicks(plugin.getConfig().getInt("Events.SolarFlare.Duration", 5) * 20);
        }
    }
}
