package org.bukkit;

public enum Difficulty {
    PEACEFUL(org.gplbukkit.Difficulty.PEACEFUL),
    EASY(org.gplbukkit.Difficulty.EASY),
    NORMAL(org.gplbukkit.Difficulty.NORMAL),
    HARD(org.gplbukkit.Difficulty.HARD);
    private org.gplbukkit.Difficulty me;
    private Difficulty(org.gplbukkit.Difficulty whoAmI) {
        this.me = whoAmI;
    }
     @Deprecated
    public int getValue() {
        return this.me.getValue();
    }
    @Deprecated
    public static Difficulty getByValue(final int level) {
        Difficulty ret = null;
        org.gplbukkit.Difficulty real = org.gplbukkit.Difficulty.getByValue(level);
        for(Difficulty search : Difficulty.values()) {
            if(search.me.equals(real)) {
                ret = search;break;
            }        
        }
        return ret;
    }
}
