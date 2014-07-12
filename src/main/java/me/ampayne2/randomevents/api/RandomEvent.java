package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.api.handlers.EventHandler;

import java.util.Random;

/**
 * The base class for a random event.
 */
public class RandomEvent {
    private final String name;
    private final EventHandler eventHandler;
    private String description;
    private String occurMessage;
    private int probability = 0;
    protected static final Random RANDOM = new Random();

    public RandomEvent(String name, EventHandler eventHandler) {
        this.name = name;
        this.eventHandler = eventHandler;
    }

    /**
     * Gets the name of the random event.
     *
     * @return The random event's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the {@link DefaultEventHandler} of the random event.
     *
     * @return The random event's {@link DefaultEventHandler}.
     */
    public EventHandler getHandler() {
        return eventHandler;
    }

    /**
     * Gets the description of the random event.
     *
     * @return The random event's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the random event.
     *
     * @param description The description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the occur message of the random event.
     *
     * @return The random event's occur message.
     */
    public String getOccurMessage() {
        return occurMessage;
    }

    /**
     * Sets the occur message of the random event.
     *
     * @param occurMessage The occur message.
     */
    public void setOccurMessage(String occurMessage) {
        this.occurMessage = occurMessage;
    }

    /**
     * Gets the probability of the random event occuring.
     *
     * @return The random event's probability.
     */
    public int getProbability() {
        return probability;
    }

    /**
     * Sets the probability of the random event.
     *
     * @param probability The probability.
     */
    public void setProbability(int probability) {
        this.probability = probability;
    }
}
