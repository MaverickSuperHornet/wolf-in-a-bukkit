package org.gplbukkit.event.hanging;

import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockFace;
import org.gplbukkit.entity.Hanging;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Triggered when a hanging entity is created in the world
 */
public class HangingPlaceEvent extends HangingEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Player player;
    private final Block block;
    private final BlockFace blockFace;

    public HangingPlaceEvent(final Hanging hanging, final Player player, final Block block, final BlockFace blockFace) {
        super(hanging);
        this.player = player;
        this.block = block;
        this.blockFace = blockFace;
    }

    /**
     * Returns the player placing the hanging entity
     *
     * @return the player placing the hanging entity
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns the block that the hanging entity was placed on
     *
     * @return the block that the hanging entity was placed on
     */
    public Block getBlock() {
        return block;
    }

    /**
     * Returns the face of the block that the hanging entity was placed on
     *
     * @return the face of the block that the hanging entity was placed on
     */
    public BlockFace getBlockFace() {
        return blockFace;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
