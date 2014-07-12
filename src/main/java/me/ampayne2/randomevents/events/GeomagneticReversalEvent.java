package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes every player's compass go bonkers.
 */
public class GeomagneticReversalEvent extends WorldEvent {
    public GeomagneticReversalEvent() {
        super("Geomagnetic Reversal");
        setProbability(1);
    }

    @Override
    public void occur(World world) {

    }
}
