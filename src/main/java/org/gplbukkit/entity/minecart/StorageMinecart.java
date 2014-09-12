package org.gplbukkit.entity.minecart;

import org.gplbukkit.entity.Minecart;
import org.gplbukkit.inventory.InventoryHolder;

/**
 * Represents a minecart with a chest. These types of {@link Minecart
 * minecarts} have their own inventory that can be accessed using methods
 * from the {@link InventoryHolder} interface.
 */
public interface StorageMinecart extends Minecart, InventoryHolder {
}
