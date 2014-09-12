package org.gplbukkit.event.player;

import org.gplbukkit.entity.Entity;
import org.gplbukkit.entity.Player;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.entity.EntityUnleashEvent;

/**
 * Called prior to an entity being unleashed due to a player's action.
 */
public class PlayerUnleashEntityEvent extends EntityUnleashEvent implements Cancellable {
    private final Player player;
    private boolean cancelled = false;

    public PlayerUnleashEntityEvent(Entity entity, Player player) {
        super(entity, UnleashReason.PLAYER_UNLEASH);
        this.player = player;
    }

    /**
     * Returns the player who is unleashing the entity.
     *
     * @return The player
     */
    public Player getPlayer() {
        return player;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
