package org.gplbukkit.event.painting;

import org.gplbukkit.Warning;
import org.gplbukkit.entity.Painting;
import org.gplbukkit.event.Event;

/**
 * Represents a painting-related event.
 *
 * @deprecated Use {@link org.gplbukkit.event.hanging.HangingEvent} instead.
 */
@Deprecated
@Warning(reason="This event has been replaced by HangingEvent")
public abstract class PaintingEvent extends Event {
    protected Painting painting;

    protected PaintingEvent(final Painting painting) {
        this.painting = painting;
    }

    /**
     * Gets the painting involved in this event.
     *
     * @return the painting
     */
    public Painting getPainting() {
        return painting;
    }
}
