package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.PlayerEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * An event that smelts all the ore in a player's inventory.
 */
public class OreSmeltEvent extends PlayerEvent {
    public OreSmeltEvent() {
        super("OreSmelt");
        setProbability(1);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void trigger(RandomEvents plugin, Player player) {
        for (ItemStack itemStack : player.getInventory()) {
            if (isSmeltableOre(itemStack.getType())) {
                smelt(itemStack);
            }
        }
        player.updateInventory();
    }

    /**
     * Checks if a Material is a smeltable ore.
     *
     * @param material The Material.
     * @return True if the Material is a smeltable ore, else false.
     */
    private boolean isSmeltableOre(Material material) {
        switch (material) {
            case COAL_ORE:
            case IRON_ORE:
            case GOLD_ORE:
            case QUARTZ_ORE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Smelts an ItemStack.
     *
     * @param itemStack The ItemStack to smelt.
     */
    private void smelt(ItemStack itemStack) {
        switch (itemStack.getType()) {
            case COAL_ORE:
                itemStack.setType(Material.COAL);
                break;
            case IRON_ORE:
                itemStack.setType(Material.IRON_INGOT);
                break;
            case GOLD_ORE:
                itemStack.setType(Material.GOLD_INGOT);
                break;
            case QUARTZ_ORE:
                itemStack.setType(Material.QUARTZ);
                break;
        }
    }
}
