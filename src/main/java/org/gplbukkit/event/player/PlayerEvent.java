package org.gplbukkit.event.player;

import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Event;

/**
 * Represents a player related event
 */
public abstract class PlayerEvent extends Event {
    protected Player player;

    public PlayerEvent(final Player who) {
        player = who;
    }

    PlayerEvent(final Player who, boolean async) {
        super(async);
        player = who;

    }

    /**
     * Returns the player involved in this event
     *
     * @return Player who is involved in this event
     */
    public final Player getPlayer() {
        return player;
    }
}
