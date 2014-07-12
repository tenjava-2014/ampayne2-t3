package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.api.handlers.EventHandler;
import me.ampayne2.randomevents.api.handlers.LocationEventHandler;
import me.ampayne2.randomevents.api.handlers.MinigameEventHandler;
import me.ampayne2.randomevents.api.handlers.PlayerEventHandler;
import me.ampayne2.randomevents.api.handlers.WorldEventHandler;

/**
 * Default event handlers.
 */
public enum DefaultEventHandler {
    LOCATION(new LocationEventHandler()),
    PLAYER(new PlayerEventHandler()),
    WORLD(new WorldEventHandler()),
    MINIGAME(new MinigameEventHandler());

    private final EventHandler eventHandler;

    private DefaultEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * Gets the {@link me.ampayne2.randomevents.api.handlers.EventHandler} instance.
     *
     * @return The {@link me.ampayne2.randomevents.api.handlers.EventHandler} instance.
     */
    public EventHandler getHandler() {
        return eventHandler;
    }
}
