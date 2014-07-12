package me.ampayne2.randomevents.event;

import org.bukkit.World;

/**
 * An event that can occur to a world.
 */
public abstract class WorldEvent extends RandomEvent {

    public WorldEvent(String name) {
        super(name, EventType.WORLD);
    }

    public abstract void occur(World world);

    public boolean canOccur(World world) {
        return true;
    }
}
