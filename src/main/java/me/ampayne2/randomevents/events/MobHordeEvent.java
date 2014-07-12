package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.LocationEvent;
import org.bukkit.Location;

/**
 * An event that spawns a horde of mobs at a location.
 */
public class MobHordeEvent extends LocationEvent {
    public MobHordeEvent() {
        super("Mob Horde");
    }

    @Override
    public void occur(Location location) {

    }
}
