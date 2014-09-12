package org.gplbukkit.event.server;

import org.gplbukkit.plugin.RegisteredServiceProvider;

/**
 * An event relating to a registered service. This is called in a {@link
 * org.gplbukkit.plugin.ServicesManager}
 */
public abstract class ServiceEvent extends ServerEvent {
    private final RegisteredServiceProvider<?> provider;

    public ServiceEvent(final RegisteredServiceProvider<?> provider) {
        this.provider = provider;
    }

    public RegisteredServiceProvider<?> getProvider() {
        return provider;
    }
}