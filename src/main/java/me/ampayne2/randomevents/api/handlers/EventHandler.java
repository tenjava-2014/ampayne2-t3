package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.RandomEvent;

/**
 * Handles attempting to trigger a type of {@link me.ampayne2.randomevents.api.RandomEvent}.
 */
public abstract class EventHandler<E extends RandomEvent> {
    private final EventType type;

    public EventHandler(EventType type) {
        this.type = type;
    }

    public EventType getType() {
        return type;
    }

    /**
     * Attempts to trigger a {@link me.ampayne2.randomevents.api.RandomEvent}.
     *
     * @param event The {@link me.ampayne2.randomevents.api.RandomEvent} to trigger.
     * @return True if the {@link me.ampayne2.randomevents.api.RandomEvent} was triggered, else false.
     */
    public abstract boolean triggerEvent(E event);
}
