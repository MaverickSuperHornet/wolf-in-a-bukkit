package org.bukkit;

/* 19/09/2014 Tschallacka
    recreating banentry.java from javadocs at http://jd.bukkit.org/rb/apidocs/org/bukkit/BanEntry.html
    since its an interface I only need to use the hooks.
    java.util.Date is used in this interface in the functions getCreated() and getExpiration()
    according to link in docs http://docs.oracle.com/javase/6/docs/api/java/util/Date.html?is-external=true
    therefore importing java util date.
 */
import java.util.Date;

public interface BanEntry {
    // created functions according to listed functions in javadocs
    public Date getCreated();
    public Date getExpiration(); 
    public String getReason(); 
    public String getSource() ;
    public String getTarget(); 
    public void save();
    public void setCreated(Date created); 
    public void setExpiration(Date expiration) ;
    public void setReason(String reason);
    public void setSource(String source);
    }
