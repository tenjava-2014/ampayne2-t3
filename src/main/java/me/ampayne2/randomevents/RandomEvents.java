package me.ampayne2.randomevents;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of the RandomEvents plugin.
 */
public class RandomEvents extends JavaPlugin {
    private EventManager eventManager = null;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        eventManager = new EventManager(this);
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
