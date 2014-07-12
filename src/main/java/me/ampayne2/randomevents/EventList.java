package me.ampayne2.randomevents;

import me.ampayne2.randomevents.api.RandomEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * A special ArrayList that allows you to get a random event by probability.
 */
public class EventList extends ArrayList<RandomEvent> {
    private int totalProbability = 0;
    private static final Random RANDOM = new Random();

    public EventList() {
        super();
    }

    public EventList(Collection<? extends RandomEvent> c) {
        super(c);
        for (RandomEvent event : c) {
            totalProbability += event.getProbability();
        }
    }

    @Override
    public boolean add(RandomEvent event) {
        if (super.add(event)) {
            totalProbability += event.getProbability();
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (super.remove(o)) {
            totalProbability -= ((RandomEvent) o).getProbability();
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        super.clear();
        totalProbability = 0;
    }

    /**
     * Gets a random event based on the event probabilities.
     *
     * @return The random event chosen.
     */
    public RandomEvent getRandomEvent() {
        if (isEmpty()) {
            return null;
        }

        int index = RANDOM.nextInt(totalProbability);
        int sum = 0;
        int i = 0;
        while (sum < index) {
            sum += get(i++).getProbability();
        }
        return get(i - 1);
    }
}
