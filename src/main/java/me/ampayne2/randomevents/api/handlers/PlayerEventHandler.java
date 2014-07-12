package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles attempting to trigger a {@link me.ampayne2.randomevents.api.PlayerEvent}.
 */
public class PlayerEventHandler extends EventHandler<PlayerEvent> {

    @Override
    public boolean triggerEvent(RandomEvents plugin, PlayerEvent event) {
        List<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        while (!players.isEmpty()) {
            Player player = players.get(RANDOM.nextInt(players.size()));
            if (event.canOccur(player)) {
                event.trigger(plugin, player);
                return true;
            }
        }
        return false;
    }
}
