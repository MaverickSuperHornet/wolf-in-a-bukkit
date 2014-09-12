package org.gplbukkit.event.entity;

import java.util.List;
import org.gplbukkit.PortalType;
import org.gplbukkit.block.BlockState;
import org.gplbukkit.entity.LivingEntity;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Thrown when a Living Entity creates a portal in a world.
 */
public class EntityCreatePortalEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final List<BlockState> blocks;
    private boolean cancelled = false;
    private PortalType type = PortalType.CUSTOM;

    public EntityCreatePortalEvent(final LivingEntity what, final List<BlockState> blocks, final PortalType type) {
        super(what);

        this.blocks = blocks;
        this.type = type;
    }

    @Override
    public LivingEntity getEntity() {
        return (LivingEntity) entity;
    }

    /**
     * Gets a list of all blocks associated with the portal.
     *
     * @return List of blocks that will be changed.
     */
    public List<BlockState> getBlocks() {
        return blocks;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * Gets the type of portal that is trying to be created.
     *
     * @return Type of portal.
     */
    public PortalType getPortalType() {
        return type;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
