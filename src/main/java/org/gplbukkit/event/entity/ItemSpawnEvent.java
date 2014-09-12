package org.gplbukkit.event.entity;

import org.gplbukkit.entity.Item;
import org.gplbukkit.Location;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when an item is spawned into a world
 */
public class ItemSpawnEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Location location;
    private boolean canceled;

    public ItemSpawnEvent(final Item spawnee, final Location loc) {
        super(spawnee);
        this.location = loc;
    }

    public boolean isCancelled() {
        return canceled;
    }

    public void setCancelled(boolean cancel) {
        canceled = cancel;
    }

    @Override
    public Item getEntity() {
        return (Item) entity;
    }

    /**
     * Gets the location at which the item is spawning.
     *
     * @return The location at which the item is spawning
     */
    public Location getLocation() {
        return location;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
