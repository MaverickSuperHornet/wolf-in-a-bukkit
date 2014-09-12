package org.gplbukkit.event.block;

import org.gplbukkit.Location;
import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockFace;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a piston retracts
 */
public class BlockPistonRetractEvent extends BlockPistonEvent {
    private static final HandlerList handlers = new HandlerList();
    public BlockPistonRetractEvent(final Block block, final BlockFace direction) {
        super(block, direction);
    }

    /**
     * Gets the location where the possible moving block might be if the
     * retracting piston is sticky.
     *
     * @return The possible location of the possibly moving block.
     */
    public Location getRetractLocation() {
        return getBlock().getRelative(getDirection(), 2).getLocation();
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
