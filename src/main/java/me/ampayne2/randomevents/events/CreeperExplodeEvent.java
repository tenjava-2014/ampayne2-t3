package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.WorldEvent;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.plugin.PluginManager;

/**
 * An event that makes all the creepers in the world explode.
 */
public class CreeperExplodeEvent extends WorldEvent {
    public CreeperExplodeEvent() {
        super("CreeperExplode");
        setProbability(1);
    }

    @Override
    public void trigger(RandomEvents plugin, World world) {
        PluginManager pluginManager = Bukkit.getPluginManager();
        for (LivingEntity entity : world.getLivingEntities()) {
            if (entity.getType() == EntityType.CREEPER) {
                Creeper creeper = (Creeper) entity;

                float power = creeper.isPowered() ? 6.0F : 3.0F;
                ExplosionPrimeEvent event = new ExplosionPrimeEvent(creeper, power, false);
                pluginManager.callEvent(event);
                if (!event.isCancelled()) {
                    world.createExplosion(creeper.getLocation(), power);
                }
            }
        }
    }
}
