package org.gplbukkit.event.world;

import org.gplbukkit.Chunk;
import org.gplbukkit.event.HandlerList;
import org.gplbukkit.generator.BlockPopulator;

/**
 * Thrown when a new chunk has finished being populated.
 * <p>
 * If your intent is to populate the chunk using this event, please see {@link
 * BlockPopulator}
 */
public class ChunkPopulateEvent extends ChunkEvent {
    private static final HandlerList handlers = new HandlerList();

    public ChunkPopulateEvent(final Chunk chunk) {
        super(chunk);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
