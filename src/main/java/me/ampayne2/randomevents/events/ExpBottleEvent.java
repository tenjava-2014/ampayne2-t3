package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.LocationEvent;
import org.bukkit.Location;

/**
 * An event that drops exp bottles at a location.
 */
public class ExpBottleEvent extends LocationEvent {
    public ExpBottleEvent() {
        super("ExpBottle");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, Location location) {

    }
}
