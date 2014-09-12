package org.gplbukkit.event.weather;

import org.gplbukkit.World;
import org.gplbukkit.entity.LightningStrike;
import org.gplbukkit.event.Cancellable;
import org.gplbukkit.event.HandlerList;

/**
 * Stores data for lightning striking
 */
public class LightningStrikeEvent extends WeatherEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean canceled;
    private final LightningStrike bolt;

    public LightningStrikeEvent(final World world, final LightningStrike bolt) {
        super(world);
        this.bolt = bolt;
    }

    public boolean isCancelled() {
        return canceled;
    }

    public void setCancelled(boolean cancel) {
        canceled = cancel;
    }

    /**
     * Gets the bolt which is striking the earth.
     *
     * @return lightning entity
     */
    public LightningStrike getLightning() {
        return bolt;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
