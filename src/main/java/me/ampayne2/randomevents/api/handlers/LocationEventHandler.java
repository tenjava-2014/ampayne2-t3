package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.LocationEvent;

public class LocationEventHandler extends EventHandler<LocationEvent> {
    public LocationEventHandler() {
        super(EventType.LOCATION);
    }

    @Override
    public boolean triggerEvent(LocationEvent event) {
        return false;
    }
}
