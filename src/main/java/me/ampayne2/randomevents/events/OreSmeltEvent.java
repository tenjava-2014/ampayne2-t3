package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.PlayerEvent;
import org.bukkit.entity.Player;

public class OreSmeltEvent extends PlayerEvent {
    public OreSmeltEvent() {
        super("Ore Smelt");
    }

    @Override
    public void occur(Player player) {

    }
}
