package me.ampayne2.randomevents.api;

import me.ampayne2.randomevents.RandomEvents;
import org.bukkit.World;

/**
 * An event that can occur to a world.
 */
public abstract class WorldEvent extends RandomEvent {
    public WorldEvent(String name) {
        super(name, DefaultEventHandler.WORLD.getHandler());
    }

    /**
     * Triggers the world event.
     *
     * @param plugin The {@link me.ampayne2.randomevents.RandomEvents} instance.
     * @param world  The world to trigger the event at.
     */
    public abstract void trigger(RandomEvents plugin, World world);

    /**
     * Checks if the world event can occur at a world.
     *
     * @param world The world.
     * @return True if the world is enabled in the config and suitable, else false.
     */
    public boolean canOccur(World world) {
        return true;
    }
}
