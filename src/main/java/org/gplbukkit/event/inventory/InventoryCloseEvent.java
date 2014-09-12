
package org.gplbukkit.event.inventory;

import org.gplbukkit.entity.HumanEntity;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.inventory.InventoryView;

/**
 * Represents a player related inventory event
 */
public class InventoryCloseEvent extends InventoryEvent {
    private static final HandlerList handlers = new HandlerList();

    public InventoryCloseEvent(InventoryView transaction) {
        super(transaction);
    }

    /**
     * Returns the player involved in this event
     *
     * @return Player who is involved in this event
     */
    public final HumanEntity getPlayer() {
        return transaction.getPlayer();
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
