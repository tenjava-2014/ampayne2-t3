package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.LocationEvent;
import org.bukkit.Location;

/**
 * An event that plays fireworks around a location.
 */
public class FireworkEvent extends LocationEvent {
    public FireworkEvent() {
        super("Firework");
    }

    @Override
    public void occur(Location location) {

    }
}
