package org.gplbukkit.event.player;

import org.gplbukkit.entity.Player;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.event.inventory.InventoryClickEvent;
import org.gplbukkit.event.inventory.InventoryOpenEvent;
import org.gplbukkit.inventory.Inventory;

/**
 * Represents a player related inventory event; note that this event never
 * actually did anything
 *
 * @deprecated Use {@link InventoryClickEvent} or {@link InventoryOpenEvent}
 *     instead, or one of the other inventory events in {@link
 *     org.gplbukkit.event.inventory}.
 */
@Deprecated
public class PlayerInventoryEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    protected Inventory inventory;

    public PlayerInventoryEvent(final Player player, final Inventory inventory) {
        super(player);
        this.inventory = inventory;
    }

    /**
     * Gets the Inventory involved in this event
     *
     * @return Inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
