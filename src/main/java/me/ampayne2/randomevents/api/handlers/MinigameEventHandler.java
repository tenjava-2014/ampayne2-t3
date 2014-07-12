package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.MinigameEvent;

public class MinigameEventHandler extends EventHandler<MinigameEvent> {
    public MinigameEventHandler() {
        super(EventType.MINIGAME);
    }

    @Override
    public boolean triggerEvent(MinigameEvent event) {
        return false;
    }
}
