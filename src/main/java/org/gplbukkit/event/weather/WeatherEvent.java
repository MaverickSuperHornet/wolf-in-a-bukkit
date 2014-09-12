package org.gplbukkit.event.weather;

import org.gplbukkit.World;
import org.gplbukkit.event.Event;

/**
 * Represents a Weather-related event
 */
public abstract class WeatherEvent extends Event {
    protected World world;

    public WeatherEvent(final World where) {
        world = where;
    }

    /**
     * Returns the World where this event is occurring
     *
     * @return World this event is occurring in
     */
    public final World getWorld() {
        return world;
    }
}
