package me.ampayne2.randomevents;

import me.ampayne2.randomevents.api.RandomEvent;
import me.ampayne2.randomevents.events.DefaultEvent;
import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;

/**
 * Manages the {@link me.ampayne2.randomevents.api.RandomEvent} in the RandomEffects plugin.
 */
public class EventManager {
    private RandomEvents plugin;
    private EventList events = new EventList();
    private int eventTask = -1;

    public EventManager(RandomEvents plugin) {
        this.plugin = plugin;

        FileConfiguration config = plugin.getConfig();
        ConfigurationSection section = config.getConfigurationSection("Events");
        for (DefaultEvent event : DefaultEvent.class.getEnumConstants()) {
            if (section.getBoolean(event.getEvent().getName() + ".Enabled", true)) {
                event.getEvent().setProbability(section.getInt(event.getEvent().getName() + ".Probability", 1));
                addEvent(event.getEvent());
            }
        }
    }

    /**
     * Gets the {@link me.ampayne2.randomevents.api.RandomEvent}s currently loaded in the manager.
     *
     * @return The {@link me.ampayne2.randomevents.api.RandomEvent}s.
     */
    public EventList getEvents() {
        return events;
    }

    /**
     * Adds a {@link me.ampayne2.randomevents.api.RandomEvent} to the manager.
     *
     * @param event The {@link me.ampayne2.randomevents.api.RandomEvent} to add.
     */
    public void addEvent(RandomEvent event) {
        if (!events.contains(event)) {
            events.add(event);
            if (event instanceof Listener) {
                Bukkit.getPluginManager().registerEvents((Listener) event, plugin);
            }
        }
    }

    /**
     * Removes a {@link me.ampayne2.randomevents.api.RandomEvent} from the manager.
     *
     * @param event The {@link me.ampayne2.randomevents.api.RandomEvent} to remove.
     */
    public void removeEvent(RandomEvent event) {
        events.remove(event);
    }

    /**
     * Starts the task that triggers random events.
     */
    public void startEvents() {
        if (eventTask == -1) {
            long delay = plugin.getConfig().getLong("OccurenceDelay", 60) * 20;
            final int maxTries = plugin.getConfig().getInt("MaxTries", 10);
            eventTask = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                @Override
                @SuppressWarnings("unchecked")
                public void run() {
                    if (!events.isEmpty()) {
                        for (int i = 0; i < maxTries; i++) {
                            RandomEvent event = events.getRandomEvent();
                            if (event.getType().getHandler().triggerEvent(plugin, event)) {
                                break;
                            }
                        }
                    }
                }
            }, delay, delay);
        }
    }

    /**
     * Stops the task that triggers random events.
     */
    public void stopEvents() {
        if (eventTask != -1) {
            Bukkit.getScheduler().cancelTask(eventTask);
        }
    }

    /**
     * Destroys the event manager. Do not use after calling this method.
     */
    public void destroy() {
        Bukkit.getScheduler().cancelTask(eventTask);
        events = null;
        plugin = null;
    }
}
