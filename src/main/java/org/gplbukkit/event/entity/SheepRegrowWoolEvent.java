package org.gplbukkit.event.entity;

import org.gplbukkit.entity.Sheep;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a sheep regrows its wool
 */
public class SheepRegrowWoolEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;

    public SheepRegrowWoolEvent(final Sheep sheep) {
        super(sheep);
        this.cancel = false;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public Sheep getEntity() {
        return (Sheep) entity;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
