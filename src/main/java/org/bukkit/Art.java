package org.bukkit;

public enum Art {
    KEBAB(org.gplbukkit.Art.KEBAB),
    AZTEC(org.gplbukkit.Art.AZTEC),
    ALBAN(org.gplbukkit.Art.ALBAN),
    AZTEC2(org.gplbukkit.Art.AZTEC2),
    BOMB(org.gplbukkit.Art.BOMB),
    PLANT(org.gplbukkit.Art.PLANT),
    WASTELAND(org.gplbukkit.Art.WASTELAND),
    POOL(org.gplbukkit.Art.POOL),
    COURBET(org.gplbukkit.Art.COURBET),
    SEA(org.gplbukkit.Art.SEA),
    SUNSET(org.gplbukkit.Art.SUNSET),
    CREEBET(org.gplbukkit.Art.CREEBET),
    WANDERER(org.gplbukkit.Art.WANDERER),
    GRAHAM(org.gplbukkit.Art.GRAHAM),
    MATCH(org.gplbukkit.Art.MATCH),
    BUST(org.gplbukkit.Art.BUST),
    STAGE(org.gplbukkit.Art.STAGE),
    VOID(org.gplbukkit.Art.VOID),
    SKULL_AND_ROSES(org.gplbukkit.Art.SKULL_AND_ROSES),
    WITHER(org.gplbukkit.Art.WITHER),
    FIGHTERS(org.gplbukkit.Art.FIGHTERS),
    POINTER(org.gplbukkit.Art.POINTER),
    PIGSCENE(org.gplbukkit.Art.PIGSCENE),
    BURNINGSKULL(org.gplbukkit.Art.BURNINGSKULL),
    SKELETON(org.gplbukkit.Art.SKELETON),
    DONKEYKONG(org.gplbukkit.Art.DONKEYKONG);
    private org.gplbukkit.Art me;
    private Art(org.gplbukkit.Art whoAmI) {
        this.me = whoAmI;
    }
    public int getBlockWidth() {
        return this.me.getBlockWidth();
    }
    public int getBlockHeight() {
        return this.me.getBlockHeight();
    }
    public static Art getByName(String name) {
        Art ret = null;
        org.gplbukkit.Art real = org.gplbukkit.Art.getByName(name);
        for(Art art : Art.values()) {
            if(art.me.equals(real)) {
                ret = art;break;
            }        
        }
        return ret;
    }
    // do not use this
    @Deprecated
    public int getId() {
        return this.me.getId();
    }       
    @Deprecated
    public static Art getById(int id) {
        Art ret = null;
        org.gplbukkit.Art real = org.gplbukkit.Art.getById(id);
        for(Art art : Art.values()) {
            if(art.me.equals(real)) {
                ret = art;break;
            }        
        }
        return ret;
    }
}
