package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.event.LocationEvent;
import org.bukkit.Location;

public class ExpBottleEvent extends LocationEvent {
    public ExpBottleEvent() {
        super("Exp Bottle");
    }

    @Override
    public void occur(Location location) {

    }
}
