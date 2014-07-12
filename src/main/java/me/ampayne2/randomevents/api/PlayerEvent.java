package me.ampayne2.randomevents.api;

import org.bukkit.entity.Player;

/**
 * An event that can occur to a player.
 */
public abstract class PlayerEvent extends RandomEvent {

    public PlayerEvent(String name) {
        super(name, EventType.PLAYER);
    }

    public abstract void occur(Player player);

    public boolean canOccur(Player player) {
        return true;
    }
}
