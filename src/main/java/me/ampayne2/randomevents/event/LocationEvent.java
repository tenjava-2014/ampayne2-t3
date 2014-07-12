package me.ampayne2.randomevents.event;

import org.bukkit.Location;

/**
 * An event that can occur at a location.
 */
public abstract class LocationEvent extends RandomEvent {

    public LocationEvent(String name) {
        super(name, EventType.LOCATION);
    }

    public abstract void occur(Location location);

    public boolean canOccur(Location location) {
        return true;
    }
}
