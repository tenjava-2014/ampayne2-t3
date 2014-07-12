package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * An event that drops an anvil onto a player.
 */
public class AnvilFallEvent extends PlayerEvent {
    public AnvilFallEvent() {
        super("Anvil Fall");
    }

    @Override
    public void occur(Player player) {

    }
}
