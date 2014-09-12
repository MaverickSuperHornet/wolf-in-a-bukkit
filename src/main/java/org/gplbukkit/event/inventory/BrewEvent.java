package org.gplbukkit.event.inventory;

import org.gplbukkit.block.Block;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.event.block.BlockEvent;
import org.gplbukkit.inventory.BrewerInventory;

/**
 * Called when the brewing of the contents inside the Brewing Stand is
 * complete.
 */
public class BrewEvent extends BlockEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private BrewerInventory contents;
    private boolean cancelled;

    public BrewEvent(Block brewer, BrewerInventory contents) {
        super(brewer);
        this.contents = contents;
    }

    /**
     * Gets the contents of the Brewing Stand.
     *
     * @return the contents
     */
    public BrewerInventory getContents() {
        return contents;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
