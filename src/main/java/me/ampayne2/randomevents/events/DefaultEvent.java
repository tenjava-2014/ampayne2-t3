package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.RandomEvent;

/**
 * Default events that come with the RandomEvents plugin.
 */
public enum DefaultEvent {
    // Location Events
    EXP_BOTTLE(new ExpBottleEvent()),
    FIREWORKS(new FireworksEvent()),
    MOB_HORDE(new MobHordeEvent()),

    // Player Events
    ANVIL_FALL(new AnvilFallEvent()),
    FOOD_COOK(new FoodCookEvent()),
    ORE_SMELT(new OreSmeltEvent()),

    // World Events
    CREEPER_EXPLODE(new CreeperExplodeEvent()),
    FRIGHTEN_SHEEP(new FrightenSheepEvent()),
    GEOMAGNETIC_REVERSAL(new GeomagneticReversalEvent()),
    SOLAR_FLARE(new SolarFlareEvent()),
    SOUND(new SoundEvent()),

    // Minigame Events
    PVP(new PvPEvent());

    private final RandomEvent event;

    private DefaultEvent(RandomEvent event) {
        this.event = event;
    }

    public RandomEvent getEvent() {
        return event;
    }
}
