package me.ampayne2.randomevents.util;

import java.util.Random;

/**
 * Utils for the RandomEvents plugin.
 */
public class Util {
    private static final Random RANDOM = new Random();

    /**
     * Gets a random enum value from an enum.
     *
     * @param clazz The enum's class.
     * @return The random enum value.
     */
    public static <T extends Enum> T randomEnum(Class<T> clazz) {
        return clazz.getEnumConstants()[RANDOM.nextInt(clazz.getEnumConstants().length)];
    }
}
