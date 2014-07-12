package me.ampayne2.randomevents.messaging;

/**
 * RandomEvents plugin messages.
 */
public enum Message {
    PREFIX("Prefix", "&9[&7RandomEvents&9]&7 "),
    RELOAD("Reload", "Reloaded RandomEvents."),

    COMMAND_USAGE("CommandUsage", "&4Usage: %s"),

    START_EVENTS("Start", "Events started."),
    ALREADY_RUNNING("AlreadyRunning", "Events already started."),
    STOP_EVENTS("Stop", "Events stopped."),
    ALREADY_STOPPED("AlreadyStopped", "Events already stopped."),

    EVENT_TRIGGER("Event.Trigger", "Triggered %s."),
    EVENT_NOT_FOUND("Event.NotFound", "Event not found.");

    private String message;
    private final String path;
    private final String defaultMessage;

    private Message(String path, String defaultMessage) {
        this.message = defaultMessage;
        this.path = path;
        this.defaultMessage = defaultMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public String getDefault() {
        return defaultMessage;
    }

    public String toString() {
        return message;
    }
}
