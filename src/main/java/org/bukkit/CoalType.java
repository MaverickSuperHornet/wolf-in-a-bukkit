package org.bukkit;

public enum CoalType
    {
    COAL(org.gplbukkit.CoalType.COAL),
    CHARCOAL(org.gplbukkit.CoalType.CHARCOAL);
    private org.gplbukkit.CoalType me;
    private CoalType(org.gplbukkit.CoalType whoAmI) {
        this.me = whoAmI;
    }
    @Deprecated
    public byte getData() {
        return this.me.getData();
    }
    @Deprecated
    public static CoalType getByData(final byte coal) {
        CoalType ret = null;
        org.gplbukkit.CoalType real = org.gplbukkit.CoalType.getByData(coal);
        for(CoalType search : CoalType.values()) {
            if(search.me.equals(real)) {
                ret = search;break;
            }        
        }
        return ret;
    }
}
