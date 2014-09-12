package org.gplbukkit.event.block;

import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockState;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a block grows naturally in the world.
 * <p>
 * Examples:
 * <ul>
 * <li>Wheat
 * <li>Sugar Cane
 * <li>Cactus
 * <li>Watermelon
 * <li>Pumpkin
 * </ul>
 * <p>
 * If a Block Grow event is cancelled, the block will not grow.
 */
public class BlockGrowEvent extends BlockEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final BlockState newState;
    private boolean cancelled = false;

    public BlockGrowEvent(final Block block, final BlockState newState) {
        super(block);
        this.newState = newState;
    }

    /**
     * Gets the state of the block where it will form or spread to.
     *
     * @return The block state for this events block
     */
    public BlockState getNewState() {
        return newState;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
