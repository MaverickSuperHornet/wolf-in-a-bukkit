package org.bukkit.event;
/* 20/09/2014 TheKiwi5000
 * Based on: http://jd.bukkit.org/dev/apidocs/org/bukkit/event/Cancellable.html
 * Recreating Cancellable.java from JD linked above.
 */
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
