package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.MinigameEvent;

/**
 * Handles attempting to trigger a {@link me.ampayne2.randomevents.api.MinigameEvent}.
 */
public class MinigameEventHandler extends EventHandler<MinigameEvent> {
    public MinigameEventHandler() {
        super(EventType.MINIGAME);
    }

    @Override
    public boolean triggerEvent(RandomEvents plugin, MinigameEvent event) {
        if (event.canOccur()) {
            event.trigger(plugin);
            return true;
        }
        return false;
    }
}
