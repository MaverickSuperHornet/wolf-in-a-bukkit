package org.gplbukkit.event.player;

import org.gplbukkit.entity.Player;
import org.gplbukkit.event.HandlerList;

/**
 * This event is called after a player registers or unregisters a new plugin
 * channel.
 */
public abstract class PlayerChannelEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final String channel;

    public PlayerChannelEvent(final Player player, final String channel) {
        super(player);
        this.channel = channel;
    }

    public final String getChannel() {
        return channel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
