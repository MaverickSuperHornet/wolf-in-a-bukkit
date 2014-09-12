package org.gplbukkit.event.entity;

import org.gplbukkit.entity.AnimalTamer;
import org.gplbukkit.entity.LivingEntity;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Thrown when a LivingEntity is tamed
 */
public class EntityTameEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final AnimalTamer owner;

    public EntityTameEvent(final LivingEntity entity, final AnimalTamer owner) {
        super(entity);
        this.owner = owner;
    }

    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    /**
     * Gets the owning AnimalTamer
     *
     * @return the owning AnimalTamer
     */
    public AnimalTamer getOwner() {
        return owner;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
