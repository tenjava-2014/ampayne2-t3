package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes all the creepers in the world explode.
 */
public class CreeperExplodeEvent extends WorldEvent {
    public CreeperExplodeEvent() {
        super("CreeperExplode");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {

    }
}
