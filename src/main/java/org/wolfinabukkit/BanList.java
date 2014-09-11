package org.wolfinabukkit;

import java.util.Date;
import java.util.Set;

// we need freshly drawn up comments here also
public interface BanList {
    public enum Type {
        NAME, IP;
    }

    public Set<BanEntry> getBanEntries();

    public BanEntry getBanEntry(String whichOne);

    public BanEntry addBan(String who, String why, String expirationDate, String sourceOfBan);

    // could have called it unban...
    public void pardon(String who);

    // check if a player is banned
    public boolean isBanned(String who);
}
