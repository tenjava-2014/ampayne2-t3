package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.RandomEvents;
import org.bukkit.Location;

/**
 * An event that can occur at a location.
 */
public abstract class LocationEvent extends RandomEvent {

    public LocationEvent(String name) {
        super(name, EventType.LOCATION);
    }

    /**
     * Triggers the location event.
     *
     * @param plugin   The {@link me.ampayne2.randomevents.RandomEvents} instance.
     * @param location The location to trigger the event at.
     */
    public abstract void trigger(RandomEvents plugin, Location location);

    /**
     * Checks if the location event can occur at a location.
     *
     * @param location The location.
     * @return True if the location is suitable, else false.
     */
    public boolean canOccur(Location location) {
        return true;
    }
}
