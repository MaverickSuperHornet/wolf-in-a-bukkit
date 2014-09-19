package org.bukkit.event;

/**
 * Represents event priority.
 * Listeners are called in this order:
 * LOWEST
 * LOW
 * NORMAL
 * HIGH
 * HIGHEST
 * MONITOR*
 * 
 * * MONITOR priority is called the last because it's designed to be used by listeners, which
 * log, and <b>should not</b> be changing the event.
 *
 */
public enum EventPriority{
	
	/**
	 * The lowest priority
	 */
	LOWEST(0),
	/**
	 * Low priority
	 */
	LOW(1),
	/**
	 * Normal priority
	 */
	NORMAL(2),
	/**
	 * High priority
	 */
	HIGH(3),
	/**
	 * Highest priority
	 */
	HIGHEST(4),
	/**
	 * Monitor priority. Listeners with this priority are called last, and shouldn't change anything.
	 */
	MONITOR(5);
	
	private final int level;
	private EventPriority(int level){
		this.level = level;
	}
	
	public int getSlot(){
		return level;
	}
}
