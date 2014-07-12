package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.LocationEvent;
import org.bukkit.Location;

/**
 * An event that spawns a horde of mobs at a location.
 */
public class MobHordeEvent extends LocationEvent {
    public MobHordeEvent() {
        super("MobHorde");
        setProbability(1);
    }

    @Override
    public void trigger(Location location) {

    }
}
