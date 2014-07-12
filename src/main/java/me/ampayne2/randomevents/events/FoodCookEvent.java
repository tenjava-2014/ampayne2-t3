package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.PlayerEvent;
import org.bukkit.entity.Player;

public class FoodCookEvent extends PlayerEvent {
    public FoodCookEvent() {
        super("Food Cook");
    }

    @Override
    public void occur(Player player) {

    }
}
