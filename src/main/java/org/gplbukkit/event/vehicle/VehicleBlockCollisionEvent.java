package org.gplbukkit.event.vehicle;

import org.gplbukkit.block.Block;
import org.gplbukkit.entity.Vehicle;
import org.gplbukkit.event.HandlerList;

/**
 * Raised when a vehicle collides with a block.
 */
public class VehicleBlockCollisionEvent extends VehicleCollisionEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Block block;

    public VehicleBlockCollisionEvent(final Vehicle vehicle, final Block block) {
        super(vehicle);
        this.block = block;
    }

    /**
     * Gets the block the vehicle collided with
     *
     * @return the block the vehicle collided with
     */
    public Block getBlock() {
        return block;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
