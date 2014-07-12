package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.RandomEvents;
import org.bukkit.entity.Player;

/**
 * An event that can occur to a player.
 */
public abstract class PlayerEvent extends RandomEvent {
    public PlayerEvent(String name) {
        super(name, EventType.PLAYER);
    }

    /**
     * Triggers the player event.
     *
     * @param plugin The {@link me.ampayne2.randomevents.RandomEvents} instance.
     * @param player The player to trigger the event for.
     */
    public abstract void trigger(RandomEvents plugin, Player player);

    /**
     * Checks if the player event can occur to a player.
     *
     * @param player The player.
     * @return True if the event can occur to the player.
     */
    public boolean canOccur(Player player) {
        return true;
    }
}
