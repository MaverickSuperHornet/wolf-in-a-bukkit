package org.gplbukkit.event.hanging;

import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.Hanging;

/**
 * Triggered when a hanging entity is removed by an entity
 */
public class HangingBreakByEntityEvent extends HangingBreakEvent {
    private final Entity remover;

    public HangingBreakByEntityEvent(final Hanging hanging, final Entity remover) {
        super(hanging, HangingBreakEvent.RemoveCause.ENTITY);
        this.remover = remover;
    }

    /**
     * Gets the entity that removed the hanging entity
     *
     * @return the entity that removed the hanging entity
     */
    public Entity getRemover() {
        return remover;
    }
}
