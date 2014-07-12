package me.ampayne2.randomevents.api;

import org.bukkit.Location;

/**
 * An event that can occur at a location.
 */
public abstract class LocationEvent extends RandomEvent {

    public LocationEvent(String name) {
        super(name, EventType.LOCATION);
    }

    public abstract void trigger(Location location);

    public boolean canOccur(Location location) {
        return true;
    }
}
