package me.ampayne2.randomevents;

import me.ampayne2.randomevents.commands.CommandController;
import me.ampayne2.randomevents.messaging.Messenger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of the RandomEvents plugin.
 */
public class RandomEvents extends JavaPlugin {
    private RandomEvents plugin = null;
    private Messenger messenger = null;
    private EventManager eventManager = null;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        plugin = this;
        messenger = new Messenger(this);
        eventManager = new EventManager(this);
        eventManager.startEvents();
    }

    @Override
    public void onDisable() {
        eventManager.destroy();
        eventManager = null;
        messenger = null;
    }

    /**
     * Gets the {@link me.ampayne2.randomevents.messaging.Messenger}.
     *
     * @return The {@link me.ampayne2.randomevents.messaging.Messenger}.
     */
    public Messenger getMessenger() {
        return messenger;
    }

    /**
     * Gets the {@link me.ampayne2.randomevents.EventManager}.
     *
     * @return The {@link me.ampayne2.randomevents.EventManager}.
     */
    public EventManager getEventManager() {
        return eventManager;
    }
}
