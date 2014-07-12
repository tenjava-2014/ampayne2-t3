package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.api.RandomEvent;

import java.util.HashMap;
import java.util.Map;

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
    DINNERBONE(new DinnerboneEvent()),
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

    /**
     * Gets the {@link me.ampayne2.randomevents.api.RandomEvent} instance of the DefaultEvent.
     *
     * @return The {@link me.ampayne2.randomevents.api.RandomEvent} instance.
     */
    public RandomEvent getEvent() {
        return event;
    }

    private static final Map<String, DefaultEvent> NAME_MAP = new HashMap<>();

    public static DefaultEvent byName(String name) {
        return NAME_MAP.get(name.toLowerCase());
    }

    static {
        for (DefaultEvent defaultEvent : DefaultEvent.class.getEnumConstants()) {
            NAME_MAP.put(defaultEvent.getEvent().getName().toLowerCase(), defaultEvent);
        }
    }
}
