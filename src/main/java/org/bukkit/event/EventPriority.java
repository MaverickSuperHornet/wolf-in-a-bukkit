package org.bukkit.event;

/*
 * 20/09/2014 TheKiwi5000
 * Based on documentation here: http://jd.bukkit.org/dev/apidocs/org/bukkit/event/EventPriority.html
 * Recreated EventPriority.java from public field and method list in JD linked above, and http://forums.bukkit.org/threads/getting-your-priorities-straight-the-plugin-version.788/ ,
 * where i deduced that there must be a value defining call order (called here 'level').
 */

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
 */
public enum EventPriority {

    //defined enums according to list in JD
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

    /*according to JD above, (getSlot()), the enums have a value which sorted them, 
    i called it 'level' because i didn't want to call it slot (i don't thinks this name is good for them)*/
    private final int level; 

    private EventPriority(int level) {
        this.level = level;
    }

    /**
     * Returns the level.
     * LOWEST = 0
     * LOW = 1
     * NORMAL = 2
     * HIGH = 3
     * HIGHEST = 4
     * MONITOR = 5
     * @return the importance level (place in calling order)
     */
    public int getSlot() {
        return level;
    }
}
