package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.WorldEvent;
import org.bukkit.World;

/**
 * An event that plays a random sound to all players.
 */
public class SoundEvent extends WorldEvent {
    public SoundEvent() {
        super("Sound");
    }

    @Override
    public void occur(World world) {

    }
}
