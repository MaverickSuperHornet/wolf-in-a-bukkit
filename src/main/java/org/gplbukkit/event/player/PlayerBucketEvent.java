package org.gplbukkit.event.player;

import org.gplbukkit.Material;
import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockFace;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.inventory.ItemStack;

/**
 * Called when a player interacts with a Bucket
 */
public abstract class PlayerBucketEvent extends PlayerEvent implements Cancellable {
    private ItemStack itemStack;
    private boolean cancelled = false;
    private final Block blockClicked;
    private final BlockFace blockFace;
    private final Material bucket;

    public PlayerBucketEvent(final Player who, final Block blockClicked, final BlockFace blockFace, final Material bucket, final ItemStack itemInHand) {
        super(who);
        this.blockClicked = blockClicked;
        this.blockFace = blockFace;
        this.itemStack = itemInHand;
        this.bucket = bucket;
    }

    /**
     * Returns the bucket used in this event
     *
     * @return the used bucket
     */
    public Material getBucket() {
        return bucket;
    }

    /**
     * Get the resulting item in hand after the bucket event
     *
     * @return Itemstack hold in hand after the event.
     */
    public ItemStack getItemStack() {
        return itemStack;
    }

    /**
     * Set the item in hand after the event
     *
     * @param itemStack the new held itemstack after the bucket event.
     */
    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    /**
     * Return the block clicked
     *
     * @return the blicked block
     */
    public Block getBlockClicked() {
        return blockClicked;
    }

    /**
     * Get the face on the clicked block
     *
     * @return the clicked face
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
}