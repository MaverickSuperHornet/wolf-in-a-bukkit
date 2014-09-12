package org.gplbukkit.event.player;

import org.gplbukkit.entity.Player;

/**
 * This is called immediately after a player unregisters for a plugin channel.
 */
public class PlayerUnregisterChannelEvent extends PlayerChannelEvent {

    public PlayerUnregisterChannelEvent(final Player player, final String channel) {
        super(player, channel);
    }
}
