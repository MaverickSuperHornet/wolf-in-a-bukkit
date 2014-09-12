package org.gplbukkit.event.painting;

import org.gplbukkit.Warning;
import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.Painting;

/**
 * Triggered when a painting is removed by an entity
 *
 * @deprecated Use {@link org.gplbukkit.event.hanging.HangingBreakByEntityEvent}
 *     instead.
 */
@Deprecated
@Warning(reason="This event has been replaced by HangingBreakByEntityEvent")
public class PaintingBreakByEntityEvent extends PaintingBreakEvent {
    private final Entity remover;

    public PaintingBreakByEntityEvent(final Painting painting, final Entity remover) {
        super(painting, RemoveCause.ENTITY);
        this.remover = remover;
    }

    /**
     * Gets the entity that removed the painting
     *
     * @return the entity that removed the painting.
     */
    public Entity getRemover() {
        return remover;
    }
}
