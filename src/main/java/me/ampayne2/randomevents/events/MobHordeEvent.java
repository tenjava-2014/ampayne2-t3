package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.LocationEvent;
import org.bukkit.Location;

public class MobHordeEvent extends LocationEvent {
    public MobHordeEvent() {
        super("MobHorde");
        setProbability(4);
        setDescription("Spawns a horde of mobs at a random location.");
        setOccurMessage("A horde of mobs was spotted at x:%s z:%s!");
    }

    @Override
    public void trigger(RandomEvents plugin, Location location) {
        // TODO: Spawn mob horde

        plugin.getMessenger().broadcastEventMessage(this, String.valueOf(location.getBlockX()), String.valueOf(location.getBlockZ()));
    }
}
