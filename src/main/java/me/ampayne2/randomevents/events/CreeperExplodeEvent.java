package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes all the creepers in the world explode.
 */
public class CreeperExplodeEvent extends WorldEvent {
    public CreeperExplodeEvent() {
        super("Creeper Explode");
    }

    @Override
    public void occur(World world) {

    }
}
