package me.ampayne2.randomevents.events;

import me.ampayne2.randomevents.RandomEvents;
import me.ampayne2.randomevents.api.MinigameEvent;

public class PvPEvent extends MinigameEvent {
    public PvPEvent() {
        super("PvP");
        setProbability(5);
        setDescription("Rewards the first player to kill another player.");
        setOccurMessage("The next person to kill another player will be rewarded!");
    }

    @Override
    public void trigger(RandomEvents plugin) {
        super.trigger(plugin);
        plugin.getMessenger().broadcastEventMessage(this);
    }
}
