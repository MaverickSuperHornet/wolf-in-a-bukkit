package org.bukkit.event;

/* 20/09/2014 TheKiwi5000
 * Based on http://jd.bukkit.org/dev/apidocs/org/bukkit/event/EventException.html
 * Recreated EventException.java from JD above
 */

/**
 * The class representing event exception
 * 
 */
public class EventException extends Exception {

    private final Throwable exceptionCause;

    /**
     * Constructs a new EventException
     */
    public EventException(){
		exceptionCause = null;
	}

    /**
     * Constructs a new EventException with given Throwable as cause
     * @param thr the cause
     */
    public EventException(Throwable thr){
		exceptionCause = thr;
	}

    /**
     * Constructs a new EventException with message
     * @param msg the message
     */
    public EventException(String msg) {
        super(msg);
        this.exceptionCause = null;
    }

    /**
     * Constructs a new EventException with cause and message
     * @param thr the cause
     * @param msg the message
     */
    public EventException(Throwable thr, String msg) {
        super(msg);
        this.exceptionCause = thr;
    }

    /**
     * Returns the cause
     * @return the cause
     */
    @Override
    public Throwable getCause(){
		return exceptionCause;
	}
}
