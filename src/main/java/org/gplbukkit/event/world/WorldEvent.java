package org.gplbukkit.event.world;

import org.gplbukkit.World;
import org.gplbukkit.event.Event;

/**
 * Represents events within a world
 */
public abstract class WorldEvent extends Event {
    private final World world;

    public WorldEvent(final World world) {
        this.world = world;
    }

    /**
     * Gets the world primarily involved with this event
     *
     * @return World which caused this event
     */
    public World getWorld() {
        return world;
    }
}
