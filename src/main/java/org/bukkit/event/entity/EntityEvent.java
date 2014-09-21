package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Event;

/**
 * The entity-related event class
 */
public abstract class EntityEvent extends Event {

    protected Entity what;

    /**
     * Constructs entity-related event
     */
    public EntityEvent(final Entity what) {
		this.what = what;
	}

    /**
     * Returns event's entity
     * @return The entity involved in the event
     */
    public Entity getEntity() {
		return what;
	}

    public EntityType getEntityType() {
		return what.getType();
	}
}
