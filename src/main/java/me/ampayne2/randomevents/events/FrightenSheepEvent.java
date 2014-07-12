package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

public class FrightenSheepEvent extends WorldEvent {
    public FrightenSheepEvent() {
        super("FrightenSheep");
        setProbability(2);
        setDescription("Makes all the sheep in the world drop their wool.");
        setOccurMessage("Something must have spooked the sheep! They all jumped out of their skin.");
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        // TODO: Shear all sheep

        plugin.getMessenger().broadcastEventMessage(this);
    }
}
