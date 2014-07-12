package me.ampayne2.randomevents;

import me.ampayne2.randomevents.commands.CommandController;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of the RandomEvents plugin.
 */
public class RandomEvents extends JavaPlugin {
    private RandomEvents plugin = null;
    private EventManager eventManager = null;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        plugin = this;
        eventManager = new EventManager(this);
        eventManager.startEvents();
    }

    @Override
    public void onDisable() {
        eventManager.destroy();
        eventManager = null;
    }

    /**
     * Gets the EventManager.
     *
     * @return The EventManager.
     */
    public EventManager getEventManager() {
        return eventManager;
    }
}
