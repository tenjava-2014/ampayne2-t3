package me.ampayne2.randomevents.messaging;

/**
 * RandomEvents plugin messages.
 */
public enum Message {
    PREFIX("Prefix", "&9[&7RandomEvents&9]&7 "),
    RELOAD("Reload", "Reloaded RandomEvents.");

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
