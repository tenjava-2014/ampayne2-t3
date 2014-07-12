package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.PlayerEvent;
import org.bukkit.entity.Player;

public class AnvilFallEvent extends PlayerEvent {
    public AnvilFallEvent() {
        super("Anvil Fall");
    }

    @Override
    public void occur(Player player) {

    }
}
