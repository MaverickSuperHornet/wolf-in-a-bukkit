package org.bukkit.event;

public class Event{
	private boolean isAsynchronous;
	private String eventName;
	
	
	/**
	 * Default constructor. Assumes that event is synchronous
	 */
	public Event(){
		this(false);
	}
	
	/**
	 * Creates a new Event instance
	 * @param isAsynchronous decides if the event is asynchronous
	 */
	public Event(boolean isAsynchronous) {
		this.isAsynchronous = isAsynchronous;
	}
	
	/**
	 * Gets event name. If name is null returns simple class name
	 * @return the event's name
	 */
	public String getEventName() {
		if(eventName == null) return getClass().getSimpleName();
		else return eventName;
	}
	
	//TODO public abstract HandlerList getHandlers();
	
	public enum Result{
		/**
		 * Event was cancelled. In some cases this may revert the event's action
		 */
		DENY,
		/**
		 * The event's state wasn't changed by any of the handlers
		 */
		DEFAULT,
		/**
		 * Event was not cancelled.
		 */
		ALLOW
	}
}
