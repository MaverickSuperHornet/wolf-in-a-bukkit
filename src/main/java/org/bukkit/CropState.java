package org.bukkit;

public enum CropState {
    SEEDED(org.gplbukkit.CropState.SEEDED),
    GERMINATED(org.gplbukkit.CropState.GERMINATED),
    VERY_SMALL(org.gplbukkit.CropState.VERY_SMALL),
    SMALL(org.gplbukkit.CropState.SMALL),
    MEDIUM(org.gplbukkit.CropState.MEDIUM),
    TALL(org.gplbukkit.CropState.TALL),
    VERY_TALL(org.gplbukkit.CropState.VERY_TALL),
    RIPE(org.gplbukkit.CropState.RIPE);
    private org.gplbukkit.CropState me;
    private CropState(org.gplbukkit.CropState whoAmI) {
        this.me = whoAmI;
    }
    @Deprecated
    public byte getData() {
        return this.me.getData();
    }
    @Deprecated
    public static CropState getByData(final byte crop) {
         CropState ret = null;
        org.gplbukkit.CropState real = org.gplbukkit.CropState.getByData(crop);
        for(CropState search : CropState.values()) {
            if(search.me.equals(real)) {
                ret = search;break;
            }        
        }
        return ret;
    }
}
