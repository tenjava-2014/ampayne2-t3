package me.ampayne2.randomevents.event;

public enum Event {
    ;

    private final RandomEvent event;

    private Event(RandomEvent event) {
        this.event = event;
    }

    public RandomEvent getEvent() {
        return event;
    }

    public EventType getType() {
        return event.getType();
    }

    @Override
    public String toString() {
        return event.getName();
    }
}
