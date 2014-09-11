package org.wolfinabukkit;

import java.util.Map;

import com.google.common.collect.Maps;

public enum CoalType 
    {
    COAL(0x0),
    CHARCOAL(0x1);

    private final byte coal;
    private final static Map<Byte, CoalType> COALMAP_DATA = Maps.newHashMap();

    private CoalType(final int coal) 
        {
        this.coal = (byte)coal;
        }

    static 
        {
        for(CoalType chunkof : values()) 
            {
            COALMAP_DATA.put(chunkof.coal, type);
            }
        }
    @Deprecated
    public byte getData() 
        {
        return coal;
        }
    @Deprecated
    public static CoalType getByData(final byte coal) 
        {
        return COALMAP_DATA.get(coal);
        }
    }
