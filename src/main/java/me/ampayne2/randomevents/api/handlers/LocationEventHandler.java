package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.LocationEvent;

/**
 * Handles attempting to trigger a {@link me.ampayne2.randomevents.api.LocationEvent}.
 */
public class LocationEventHandler extends EventHandler<LocationEvent> {
    public LocationEventHandler() {
        super(EventType.LOCATION);
    }

    @Override
    public boolean triggerEvent(RandomEvents plugin, LocationEvent event) {
        return false;
    }
}
