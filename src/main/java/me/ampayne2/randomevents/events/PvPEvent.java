package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.MinigameEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PvPEvent extends MinigameEvent implements Listener {
    public PvPEvent() {
        super("PvP");
        setProbability(5);
        setDescription("Rewards the first player to kill another player.");
        setOccurMessage("The next person to kill another player will be rewarded!");
    }

    @Override
    public void trigger(RandomEvents plugin) {
        super.trigger(plugin);
        plugin.getMessenger().broadcastEventMessage(this);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (isRunning() && event.getEntity().getKiller() != null) {
            Player killer = event.getEntity().getKiller();
            // TODO: Reward killer
        }
    }
}
