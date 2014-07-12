package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.MinigameEvent;

/**
 * An event that rewards the first player to kill another player.
 */
public class PvPEvent extends MinigameEvent {
    public PvPEvent() {
        super("PvP");
    }

    @Override
    public void trigger(RandomEvents plugin) {
        super.trigger(plugin);
    }
}
