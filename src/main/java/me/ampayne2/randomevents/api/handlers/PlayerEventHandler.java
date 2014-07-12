package me.ampayne2.randomevents.api.handlers;

import me.ampayne2.randomevents.api.EventType;
import me.ampayne2.randomevents.api.PlayerEvent;

public class PlayerEventHandler extends EventHandler<PlayerEvent> {
    public PlayerEventHandler() {
        super(EventType.PLAYER);
    }

    @Override
    public boolean triggerEvent(PlayerEvent event) {
        return false;
    }
}
