package org.bukkit.event;
/* 20/09/2014 TheKiwi5000
 * Based on: http://jd.bukkit.org/dev/apidocs/org/bukkit/event/Event.html
 * and http://jd.bukkit.org/dev/apidocs/org/bukkit/event/Event.Result.html
 * Recreating Event.java from JD linked above.
 */
public class Event{
	private boolean isAsynchronous; //Some events are asynchronous, so there had to be a boolean to store if they are async.
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
		if(eventName == null) return getClass().getSimpleName(); //make sure there won't be NPE's anywhere
		else return eventName;
	}
	
	//TODO public abstract HandlerList getHandlers(); - no idea how to make this.
	
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
