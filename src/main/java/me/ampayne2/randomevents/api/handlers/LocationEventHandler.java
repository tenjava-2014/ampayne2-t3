package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.LocationEvent;

/**
 * Handles attempting to trigger a {@link me.ampayne2.randomevents.api.LocationEvent}.
 */
public class LocationEventHandler extends EventHandler<LocationEvent> {

    @Override
    public boolean triggerEvent(RandomEvents plugin, LocationEvent event) {
        return false;
    }
}
