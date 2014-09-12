package org.gplbukkit.event.player;

import org.gplbukkit.entity.Player;

/**
 * This is called immediately after a player registers for a plugin channel.
 */
public class PlayerRegisterChannelEvent extends PlayerChannelEvent {

    public PlayerRegisterChannelEvent(final Player player, final String channel) {
        super(player, channel);
    }
}
