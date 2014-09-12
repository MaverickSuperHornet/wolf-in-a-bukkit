package org.gplbukkit.event.player;

import org.gplbukkit.block.Block;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.HandlerList;

/**
 * This event is fired when the player is leaving a bed.
 */
public class PlayerBedLeaveEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Block bed;

    public PlayerBedLeaveEvent(final Player who, final Block bed) {
        super(who);
        this.bed = bed;
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
