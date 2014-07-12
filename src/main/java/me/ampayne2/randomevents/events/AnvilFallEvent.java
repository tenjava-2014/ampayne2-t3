package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * An event that drops an anvil onto a player.
 */
public class AnvilFallEvent extends PlayerEvent {
    public AnvilFallEvent() {
        super("AnvilFall");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, Player player) {

    }
}
