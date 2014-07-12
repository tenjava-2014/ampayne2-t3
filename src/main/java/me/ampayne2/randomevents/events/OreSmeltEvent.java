package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * An event that smelts all the ore in a player's inventory.
 */
public class OreSmeltEvent extends PlayerEvent {
    public OreSmeltEvent() {
        super("Ore Smelt");
        setProbability(1);
    }

    @Override
    public void occur(Player player) {

    }
}
