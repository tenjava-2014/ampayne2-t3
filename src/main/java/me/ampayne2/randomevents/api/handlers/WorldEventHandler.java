package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.WorldEvent;

public class WorldEventHandler extends EventHandler<WorldEvent> {
    public WorldEventHandler() {
        super(EventType.WORLD);
    }

    @Override
    public boolean triggerEvent(WorldEvent event) {
        return false;
    }
}
