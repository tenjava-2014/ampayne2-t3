package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * An event that cooks all the food in a player's inventory.
 */
public class FoodCookEvent extends PlayerEvent {
    public FoodCookEvent() {
        super("FoodCook");
        setProbability(1);
    }

    @Override
    public void trigger(Player player) {

    }
}
