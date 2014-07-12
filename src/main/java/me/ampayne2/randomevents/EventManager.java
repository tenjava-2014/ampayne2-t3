package me.ampayne2.randomevents;

import me.ampayne2.randomevents.api.RandomEvent;
import me.ampayne2.randomevents.events.DefaultEvent;

/**
 * Manages the events in the RandomEffects plugin.
 */
public class EventManager {
    private final RandomEvents plugin;
    private final EventList events = new EventList();

    public EventManager(RandomEvents plugin) {
        this.plugin = plugin;

        for (DefaultEvent event : DefaultEvent.class.getEnumConstants()) {
            events.add(event.getEvent());
        }
    }

    /**
     * Gets the events currently loaded in the manager.
     *
     * @return The events.
     */
    public EventList getEvents() {
        return events;
    }

    /**
     * Adds an event to the manager.
     *
     * @param event The event to add.
     */
    public void addEvent(RandomEvent event) {
        if (!events.contains(event)) {
            events.add(event);
        }
    }

    /**
     * Removes an event from the manager.
     *
     * @param event The event to remove.
     */
    public void removeEvent(RandomEvent event) {
        events.remove(event);
    }
}
