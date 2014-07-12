package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

public class SolarFlareEvent extends WorldEvent {
    public SolarFlareEvent() {
        super("SolarFlare");
        setProbability(3);
        setDescription("Sets all mobs in the world on fire.");
        setOccurMessage("It's so hot the chickens are laying hard-boiled eggs...");
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        for (LivingEntity entity : world.getLivingEntities()) {
            entity.setFireTicks(plugin.getConfig().getInt("Events.SolarFlare.Duration", 5) * 20);
        }
        plugin.getMessenger().broadcastEventMessage(this);
    }

    @Override
    public boolean canOccur(World world) {
        long time = world.getTime();
        return super.canOccur(world) && time < 12300 || time > 23850;
    }
}
