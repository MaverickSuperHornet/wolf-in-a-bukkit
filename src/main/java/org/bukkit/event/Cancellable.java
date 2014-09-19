package org.bukkit.event;

public interface Cancellable{
	
	/**
	 * Gets the state of the event.
	 * @return true if the event is cancelled
	 */
	public boolean isCancelled();
	
	/**
	 * Sets the state of the event
	 * @param state the state to be set
	 */
	public boolean setCancelled(boolean state);
}
