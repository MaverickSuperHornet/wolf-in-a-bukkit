package org.gplbukkit.event.hanging;

import org.gplbukkit.entity.Hanging;
import org.gplbukkit.event.Event;

/**
 * Represents a hanging entity-related event.
 */
public abstract class HangingEvent extends Event {
    protected Hanging hanging;

    protected HangingEvent(final Hanging painting) {
        this.hanging = painting;
    }

    /**
     * Gets the hanging entity involved in this event.
     *
     * @return the hanging entity
     */
    public Hanging getEntity() {
        return hanging;
    }
}
