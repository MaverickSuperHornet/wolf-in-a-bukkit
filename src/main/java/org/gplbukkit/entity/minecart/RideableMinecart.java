package org.gplbukkit.entity.minecart;

import org.gplbukkit.entity.Minecart;

/**
 * Represents a minecart that can have certain {@link
 * org.gplbukkit.entity.Entity entities} as passengers. Normal passengers
 * include all {@link org.gplbukkit.entity.LivingEntity living entities} with
 * the exception of {@link org.gplbukkit.entity.IronGolem iron golems}.
 * Non-player entities that meet normal passenger criteria automatically
 * mount these minecarts when close enough.
 */
public interface RideableMinecart extends Minecart {
}
