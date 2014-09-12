package org.gplbukkit.event.player;

import org.gplbukkit.Material;
import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockFace;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.inventory.ItemStack;

/**
 * Called when a player empties a bucket
 */
public class PlayerBucketEmptyEvent extends PlayerBucketEvent {
    private static final HandlerList handlers = new HandlerList();

    public PlayerBucketEmptyEvent(final Player who, final Block blockClicked, final BlockFace blockFace, final Material bucket, final ItemStack itemInHand) {
        super(who, blockClicked, blockFace, bucket, itemInHand);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
