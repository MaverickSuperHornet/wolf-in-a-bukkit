package org.gplbukkit.entity;

import org.gplbukkit.util.Vector;

/**
 * Represents a vehicle entity.
 */
public interface Vehicle extends Entity {

    /**
     * Gets the vehicle's velocity.
     *
     * @return velocity vector
     */
    public Vector getVelocity();

    /**
     * Sets the vehicle's velocity.
     *
     * @param vel velocity vector
     */
    public void setVelocity(Vector vel);
}
