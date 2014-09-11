package org.wolfinabukkit;

import java.util.Date;

// comments need still to be added. remember, the original comments
// also fall under gpl, we need new comments.
public interface BanEntry {

    public String getTarget();

    public Date getCreated();

    public void setCreated(Date createdOn);

    public String getReason();

    public void setReason(String whyIDidIt);

    public Date getExpiration();

    public void setExpiration(Date badMilk);

    public String getSource();

    public void setSource(String theSource);

    public void save();
}
