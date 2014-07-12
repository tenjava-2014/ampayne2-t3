package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.LocationEvent;
import org.bukkit.Location;

/**
 * An event that plays fireworks around a location.
 */
public class FireworksEvent extends LocationEvent {
    public FireworksEvent() {
        super("Fireworks");
        setProbability(1);
    }

    @Override
    public void occur(Location location) {

    }
}
