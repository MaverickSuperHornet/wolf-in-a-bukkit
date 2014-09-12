package org.gplbukkit.event.block;

import org.gplbukkit.block.Block;
import org.gplbukkit.block.BlockState;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Called when a block is formed or spreads based on world conditions.
 * <p>
 * Use {@link BlockSpreadEvent} to catch blocks that actually spread and don't
 * just "randomly" form.
 * <p>
 * Examples:
 * <ul>
 * <li>Snow forming due to a snow storm.
 * <li>Ice forming in a snowy Biome like Taiga or Tundra.
 * </ul>
 * <p>
 * If a Block Form event is cancelled, the block will not be formed.
 *
 * @see BlockSpreadEvent
 */
public class BlockFormEvent extends BlockGrowEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    public BlockFormEvent(final Block block, final BlockState newState) {
        super(block, newState);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
