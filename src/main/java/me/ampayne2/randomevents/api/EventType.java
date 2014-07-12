package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.api.handlers.EventHandler;
import me.ampayne2.randomevents.api.handlers.LocationEventHandler;
import me.ampayne2.randomevents.api.handlers.MinigameEventHandler;
import me.ampayne2.randomevents.api.handlers.PlayerEventHandler;
import me.ampayne2.randomevents.api.handlers.WorldEventHandler;

/**
 * Types of random events.
 */
public enum EventType {
    LOCATION("Location", new LocationEventHandler()),
    PLAYER("Player", new PlayerEventHandler()),
    WORLD("World", new WorldEventHandler()),
    MINIGAME("Minigame", new MinigameEventHandler());

    private final String name;
    private final EventHandler eventHandler;

    private EventType(String name, EventHandler eventHandler) {
        this.name = name;
        this.eventHandler = eventHandler;
    }

    /**
     * Gets the EventType's display name.
     *
     * @return The EventType's display name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the EventType's {@link me.ampayne2.randomevents.api.handlers.EventHandler}.
     *
     * @return The EventType's {@link me.ampayne2.randomevents.api.handlers.EventHandler}.
     */
    public EventHandler getHandler() {
        return eventHandler;
    }
}
