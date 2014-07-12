package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.RandomEvents;

/**
 * An event that rewards the first player to complete the minigame.
 */
public abstract class MinigameEvent extends RandomEvent {
    private boolean isRunning = false;

    public MinigameEvent(String name) {
        super(name, DefaultEventHandler.MINIGAME.getHandler());
    }

    /**
     * Triggers the minigame event.
     *
     * @param plugin The {@link me.ampayne2.randomevents.RandomEvents} instance.
     */
    public void trigger(RandomEvents plugin) {
        isRunning = true;
    }

    /**
     * Checks if the minigame event can occur.
     *
     * @return True if the minigame event isn't already running.
     */
    public boolean canOccur() {
        return !isRunning;
    }

    /**
     * Checks if the minigame event is running.
     *
     * @return True if the minigame event is running, else false.
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Lets the minigame event be triggered again.
     */
    public void reset() {
        isRunning = false;
    }
}
