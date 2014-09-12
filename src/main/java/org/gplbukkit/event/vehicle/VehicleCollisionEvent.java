package org.gplbukkit.event.vehicle;

import org.gplbukkit.entity.Vehicle;

/**
 * Raised when a vehicle collides.
 */
public abstract class VehicleCollisionEvent extends VehicleEvent {
    public VehicleCollisionEvent(final Vehicle vehicle) {
        super(vehicle);
    }
}
