package org.gplbukkit.event.entity;

import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.Projectile;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a projectile is launched.
 */
public class ProjectileLaunchEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

    public ProjectileLaunchEvent(Entity what) {
        super(what);
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    public Projectile getEntity() {
        return (Projectile) entity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
