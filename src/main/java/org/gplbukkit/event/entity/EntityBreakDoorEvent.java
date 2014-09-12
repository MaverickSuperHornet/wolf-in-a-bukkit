package org.gplbukkit.event.entity;

import org.gplbukkit.Material;
import org.gplbukkit.block.Block;
import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.LivingEntity;

/**
 * Called when an {@link Entity} breaks a door
 * <p>
 * Cancelling the event will cause the event to be delayed
 */
public class EntityBreakDoorEvent extends EntityChangeBlockEvent {
    public EntityBreakDoorEvent(final LivingEntity entity, final Block targetBlock) {
        super(entity, targetBlock, Material.AIR, (byte) 0);
    }

    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }
}
