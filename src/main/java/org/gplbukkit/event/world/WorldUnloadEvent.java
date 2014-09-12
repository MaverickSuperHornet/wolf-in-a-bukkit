package org.gplbukkit.event.world;

import org.gplbukkit.World;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a World is unloaded
 */
public class WorldUnloadEvent extends WorldEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean isCancelled;

    public WorldUnloadEvent(final World world) {
        super(world);
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
