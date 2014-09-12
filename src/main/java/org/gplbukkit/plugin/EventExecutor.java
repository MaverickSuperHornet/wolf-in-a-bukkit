package org.gplbukkit.plugin;

import org.gplbukkit.event.Event;
import org.gplbukkit.event.EventException;
import org.gplbukkit.event.Listener;

/**
 * Interface which defines the class for event call backs to plugins
 */
public interface EventExecutor {
    public void execute(Listener listener, Event event) throws EventException;
}
