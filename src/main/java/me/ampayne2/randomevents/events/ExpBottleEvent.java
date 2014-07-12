package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.LocationEvent;
import org.bukkit.Location;

public class ExpBottleEvent extends LocationEvent {
    public ExpBottleEvent() {
        super("ExpBottle");
        setProbability(4);
        setDescription("Drops exp bottles at a random location.");
        setOccurMessage("A large amount of experience has been spotted at x:%s z:%s!");
    }

    @Override
    public void trigger(RandomEvents plugin, Location location) {
        // TODO: Drop exp bottles

        plugin.getMessenger().broadcastEventMessage(this, String.valueOf(location.getBlockX()), String.valueOf(location.getBlockZ()));
    }
}
