package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.RandomEvent;

import java.util.Random;

/**
 * Handles attempting to trigger a type of {@link me.ampayne2.randomevents.api.RandomEvent}.
 */
public abstract class EventHandler<E extends RandomEvent> {
    private final EventType type;
    protected static final Random RANDOM = new Random();

    public EventHandler(EventType type) {
        this.type = type;
    }

    /**
     * Gets the {@link me.ampayne2.randomevents.api.EventType} handled by the event handler.
     *
     * @return The {@link me.ampayne2.randomevents.api.EventType}.
     */
    public EventType getType() {
        return type;
    }

    /**
     * Attempts to trigger a {@link me.ampayne2.randomevents.api.RandomEvent}.
     *
     * @param plugin The {@link me.ampayne2.randomevents.RandomEvents} instance.
     * @param event  The {@link me.ampayne2.randomevents.api.RandomEvent} to trigger.
     * @return True if the {@link me.ampayne2.randomevents.api.RandomEvent} was triggered, else false.
     */
    public abstract boolean triggerEvent(RandomEvents plugin, E event);
}
