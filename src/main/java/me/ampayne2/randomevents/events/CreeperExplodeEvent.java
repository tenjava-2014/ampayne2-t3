package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes all the creepers in the world explode.
 */
public class CreeperExplodeEvent extends WorldEvent {
    public CreeperExplodeEvent() {
        super("Creeper Explode");
        setProbability(1);
    }

    @Override
    public void occur(World world) {

    }
}
