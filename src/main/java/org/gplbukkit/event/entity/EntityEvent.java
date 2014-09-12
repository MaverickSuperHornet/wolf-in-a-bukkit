package org.gplbukkit.event.entity;

import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.EntityType;
import org.gplbukkit.event.Event;

/**
 * Represents an Entity-related event
 */
public abstract class EntityEvent extends Event {
    protected Entity entity;

    public EntityEvent(final Entity what) {
        entity = what;
    }

    /**
     * Returns the Entity involved in this event
     *
     * @return Entity who is involved in this event
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * Gets the EntityType of the Entity involved in this event.
     *
     * @return EntityType of the Entity involved in this event
     */
    public EntityType getEntityType() {
        return entity.getType();
    }
}
