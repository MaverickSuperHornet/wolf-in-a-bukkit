package org.gplbukkit.event.player;

import org.gplbukkit.Material;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.inventory.ItemStack;

/**
 * This event will fire when a player is finishing consuming an item (food,
 * potion, milk bucket).
 * <br>
 * If the ItemStack is modified the server will use the effects of the new
 * item and not remove the original one from the player's inventory.
 * <br>
 * If the event is cancelled the effect will not be applied and the item will
 * not be removed from the player's inventory.
 */
public class PlayerItemConsumeEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean isCancelled = false;
    private ItemStack item;

    /**
     * @param player the player consuming
     * @param item the ItemStack being consumed
     */
    public PlayerItemConsumeEvent(final Player player, final ItemStack item) {
        super(player);

        this.item = item;
    }

    /**
     * Gets the item that is being consumed. Modifying the returned item will
     * have no effect, you must use {@link
     * #setItem(org.gplbukkit.inventory.ItemStack)} instead.
     *
     * @return an ItemStack for the item being consumed
     */
    public ItemStack getItem() {
        return item.clone();
    }

    /**
     * Set the item being consumed
     *
     * @param item the item being consumed
     */
    public void setItem(ItemStack item) {
        if (item == null) {
            this.item = new ItemStack(Material.AIR);
        } else {
            this.item = item;
        }
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
