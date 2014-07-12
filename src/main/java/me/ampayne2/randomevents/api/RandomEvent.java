package me.ampayne2.randomevents.api;

/**
 * The base class for a random event.
 */
public class RandomEvent {
    private final String name;
    private final EventType type;
    private String description;
    private int probability = 0;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }
}
