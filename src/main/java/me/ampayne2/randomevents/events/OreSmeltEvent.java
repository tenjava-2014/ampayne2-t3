package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * An event that smelts all the ore in a player's inventory.
 */
public class OreSmeltEvent extends PlayerEvent {
    public OreSmeltEvent() {
        super("OreSmelt");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, Player player) {

    }
}
