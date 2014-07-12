package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes every player's compass go bonkers.
 */
public class GeomagneticReversalEvent extends WorldEvent {
    public GeomagneticReversalEvent() {
        super("Geomagnetic Reversal");
    }

    @Override
    public void occur(World world) {

    }
}
