package me.ampayne2.randomevents.api;

/**
 * An event that rewards the first player to complete the minigame.
 */
public abstract class MinigameEvent extends RandomEvent {

    public MinigameEvent(String name) {
        super(name, EventType.MINIGAME);
    }

    public abstract void trigger();

    public boolean canOccur() {
        return true;
    }
}
