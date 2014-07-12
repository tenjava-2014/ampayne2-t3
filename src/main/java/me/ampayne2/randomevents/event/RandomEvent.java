package me.ampayne2.randomevents.event;

/**
 * The base class for a random event.
 */
public class RandomEvent {
    private final String name;
    private final EventType type;

    public RandomEvent(String name, EventType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public EventType getType() {
        return type;
    }
}
