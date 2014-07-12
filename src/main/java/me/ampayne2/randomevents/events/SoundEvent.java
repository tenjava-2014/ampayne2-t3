package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import me.ampayne2.randomevents.util.Util;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * An event that plays random sounds to all players.
 */
public class SoundEvent extends WorldEvent {
    public SoundEvent() {
        super("Sound");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        int amount = plugin.getConfig().getInt("Events.Sound.Amount", 3);
        for (Player player : world.getPlayers()) {
            for (int i = 0; i < amount; i++) {
                player.playSound(player.getLocation(), Util.randomEnum(Sound.class), 10, 1);
            }
        }
    }
}
