package me.ampayne2.randomevents;

import me.ampayne2.randomevents.commands.CommandController;
import me.ampayne2.randomevents.messaging.Messenger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main class of the RandomEvents plugin.
 */
public class RandomEvents extends JavaPlugin {
    private Messenger messenger = null;
    private EventManager eventManager = null;
    private CommandController commandController = null;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        messenger = new Messenger(this);
        eventManager = new EventManager(this);
        if (getConfig().getBoolean("StartOnStartup", true)) {
            eventManager.startEvents();
        }

        commandController = new CommandController(this);
        getCommand("randomevents").setExecutor(commandController);
    }

    @Override
    public void onDisable() {
        getCommand("randomevents").setExecutor(null);
        commandController = null;
        eventManager.destroy();
        eventManager = null;
        messenger.destroy();
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

    /**
     * Gets the {@link me.ampayne2.randomevents.commands.CommandController}.
     *
     * @return The {@link me.ampayne2.randomevents.commands.CommandController}.
     */
    public CommandController getCommandController() {
        return commandController;
    }
}
