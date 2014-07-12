package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles attempting to trigger a {@link me.ampayne2.randomevents.api.WorldEvent}.
 */
public class WorldEventHandler extends EventHandler<WorldEvent> {
    public WorldEventHandler() {
        super(EventType.WORLD);
    }

    @Override
    public boolean triggerEvent(RandomEvents plugin, WorldEvent event) {
        List<World> worlds = new ArrayList<>();
        for (String worldName : plugin.getConfig().getStringList("Worlds")) {
            World world = Bukkit.getWorld(worldName);
            if (world != null) {
                worlds.add(world);
            }
        }
        while (worlds.size() > 0) {
            World world = worlds.get(RANDOM.nextInt(worlds.size()));
            if (event.canOccur(world)) {
                event.trigger(plugin, world);
                return true;
            } else {
                worlds.remove(world);
            }
        }
        return false;
    }
}
