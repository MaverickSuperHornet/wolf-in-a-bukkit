package org.gplbukkit.event.player;

import org.gplbukkit.Material;
import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockFace;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.inventory.ItemStack;

/**
 * Called when a player fills a bucket
 */
public class PlayerBucketFillEvent extends PlayerBucketEvent {
    private static final HandlerList handlers = new HandlerList();

    public PlayerBucketFillEvent(final Player who, final Block blockClicked, final BlockFace blockFace, final Material bucket, final ItemStack itemInHand) {
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
