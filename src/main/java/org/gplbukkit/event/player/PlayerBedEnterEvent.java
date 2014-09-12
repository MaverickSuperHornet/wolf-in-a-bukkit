package org.gplbukkit.event.player;

import org.gplbukkit.block.Block;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * This event is fired when the player is almost about to enter the bed.
 */
public class PlayerBedEnterEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private final Block bed;

    public PlayerBedEnterEvent(final Player who, final Block bed) {
        super(who);
        this.bed = bed;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Returns the bed block involved in this event.
     *
     * @return the bed block involved in this event
     */
    public Block getBed() {
        return bed;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
