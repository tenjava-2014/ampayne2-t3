package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;

public class FireworksEvent extends WorldEvent {
    public FireworksEvent() {
        super("Fireworks");
        setProbability(3);
        setDescription("Shoots fireworks around every player.");
        setOccurMessage("It's like the 4th of July!");
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        // TODO: Shoot fireworks

        plugin.getMessenger().broadcastEventMessage(this);
    }
}
