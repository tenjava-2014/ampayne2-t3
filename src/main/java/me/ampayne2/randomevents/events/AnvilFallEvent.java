package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AnvilFallEvent extends PlayerEvent implements Listener {
    public AnvilFallEvent() {
        super("AnvilFall");
        setProbability(5);
        setDescription("Drops an anvil onto a random player.");
        setOccurMessage("&4Look out below!");
    }

    @Override
    @SuppressWarnings("deprecation")
    public void trigger(RandomEvents plugin, Player player) {
        // Drop the anvil as high above the player as possible up to the configured fall height
        int fallHeight = plugin.getConfig().getInt("Events.AnvilFall.FallHeight", 15);
        Location location = player.getLocation().getBlock().getLocation();
        for (int i = 0; i <= fallHeight; i++) {
            location.add(0, 1, 0);
            if (location.getBlock().getType() != Material.AIR || i == fallHeight) {
                location.subtract(0, 1, 0);
                location.getBlock().setType(Material.ANVIL);
                location.getBlock().setData((byte) 8);
                plugin.getMessenger().sendEventMessage(player, this);
                return;
            }
        }
    }

    @Override
    public boolean canOccur(Player player) {
        return super.canOccur(player) && player.getLocation().getBlock().getType() == Material.AIR && player.getEyeLocation().getBlock().getType() == Material.AIR;
    }
}
