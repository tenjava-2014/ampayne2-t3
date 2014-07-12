package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

/**
 * An event that makes all the sheep in the world jump out of their skin - literally.
 */
public class FrightenSheepEvent extends WorldEvent {
    public FrightenSheepEvent() {
        super("Frighten Sheep");
        setProbability(1);
    }

    @Override
    public void occur(World world) {

    }
}
