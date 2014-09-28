package org.bukkit.event;

/** 28/09/2014 Tschallacka
  * reconstructing this from http://jd.bukkit.org/rb/apidocs/org/bukkit/event/EventHandler.html 
  * and http://jd.bukkit.org/dev/doxygen/df/df5/interfaceorg_1_1bukkit_1_1event_1_1EventHandler.html
  */
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import org.bukkit.event.EventPriority;
// gained constructor from javadoc.
// method is an enum type ElementType according to http://docs.oracle.com/javase/6/docs/api/java/lang/annotation/ElementType.html?is-external=true#METHOD . 
// importing ElemenType
// Element Type has a enum type called METHOD, using that http://docs.oracle.com/javase/6/docs/api/java/lang/annotation/ElementType.html
// Runtime is a RetentionPolicy according to http://docs.oracle.com/javase/6/docs/api/java/lang/annotation/RetentionPolicy.html?is-external=true#RUNTIME 
// importing RetentionPolicy
// RetentionPolicy has an Enum type called RUNTIME, using that http://docs.oracle.com/javase/6/docs/api/java/lang/annotation/RetentionPolicy.html
@Target(value=ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface EventHandler {
    // http://jd.bukkit.org/rb/apidocs/org/bukkit/event/EventHandler.html#priority()
    // defaulting to org.bukkit.event.EventPriority.NORMAL
    // importing EventPriorities
    public abstract EventPriority priority() default org.bukkit.event.EventPriority.NORMAL;
    // http://jd.bukkit.org/rb/apidocs/org/bukkit/event/EventHandler.html#ignoreCancelled()
    // defaulting to boolean false according to docs.
    public abstract boolean ignoreCancelled() default false;
}
