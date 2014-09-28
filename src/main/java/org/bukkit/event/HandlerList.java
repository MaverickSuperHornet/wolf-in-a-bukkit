package org.bukkit.event;

/*  28/09/2014 Tschallacka
 *  reconstructing from http://jd.bukkit.org/rb/apidocs/org/bukkit/event/HandlerList.html
 */
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;
import java.util.Collection;
import java.util.ArrayList;

// extends object.. yea...
public class HandlerList {
    
    public HandlerList(){}
    public static void bakeAll(){};
    public static void unregisterAll(){};
    // uses http://jd.bukkit.org/rb/apidocs/org/bukkit/plugin/Plugin.html
    // importing plugin
    // uses
    public static void unregisterAll(Plugin plugin){}
    // uses http://jd.bukkit.org/rb/apidocs/org/bukkit/event/Listener.html
    // no need for import
    public static void unregisterAll(Listener listener){}
    // uses http://jd.bukkit.org/rb/apidocs/org/bukkit/plugin/RegisteredListener.html
    // importing RegisteredListener
    public void register(RegisteredListener listener){}
    // uses http://docs.oracle.com/javase/6/docs/api/java/util/Collection.html?is-external=true
    // importing Collection
    public void registerAll(Collection<RegisteredListener> listeners){}
    // registeredlistener already imported
    public void unregister(RegisteredListener listener){}
    // plugin also
    public void unregister(Plugin plugin){}
    public void unregister(Listener listener){}
    public void bake(){}
    public RegisteredListener[] getRegisteredListeners(){}
    // uses http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html?is-external=true
    // importing ArrayList
    public static ArrayList<RegisteredListener> getRegisteredListeners(Plugin plugin){}
    public static ArrayList<HandlerList> getHandlerLists(){}


}
