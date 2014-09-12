package org.wolfinabukkit;

import java.util.Map;

import com.google.common.collect.Maps;

public enum CropState {
    SEEDED(0x0),
    GERMINATED(0x1),
    VERY_SMALL(0x2), 
    SMALL(0x3),
    MEDIUM(0x4),
    TALL(0x5),
    VERY_TALL(0x6),
    RIPE(0x7);
    private final byte crop;
    private final static Map<Byte, CropState> CROP_MAP = Maps.newHashMap();

    private CropState(final int seed) {
        this.crop = (byte)seed;
    }
    @Deprecated
    public byte getData() {
        return this.crop;
    }
    @Deprecated
    public static CropState getByData(final byte whatIsThisSeed) {
        return CROP_MAP.get(whatIsThisSeed);
    }

    static {
        for (CropState growth : values()) {
            CROP_MAP.put(growth.getData(), growth);
        }
    }
}
