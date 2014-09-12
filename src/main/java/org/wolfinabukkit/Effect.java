package org.wolfinabukkit;

import java.util.Map;

import com.google.common.collect.Maps;

import org.wolfinabukkit.block.BlockFace;
import org.wolfinabukkit.potion.Potion;
import org.wolfinabukkit.Type;

public enum Effect {
    // need to find out witch magic effect...
    CLICK2(0x3e8, Type.SOUND),
    CLICK1(0x3e9, Type.SOUND),
    BOW_FIRE(0x3ea, Type.SOUND),
    DOOR_TOGGLE(0x3eb, Type.SOUND),
    EXTINGUISH(0x3ec, Type.SOUND),
    RECORD_PLAY(0x3ed, Type.SOUND, Material.class),
    GHAST_SHRIEK(0x3ef, Type.SOUND),
    GHAST_SHOOT(0x3f0, Type.SOUND),
    BLAZE_SHOOT(0x3f1, Type.SOUND),
    ZOMBIE_CHEW_WOODEN_DOOR(0x3f2, Type.SOUND),
    ZOMBIE_CHEW_IRON_DOOR(0x3f3, Type.SOUND),
    ZOMBIE_DESTROY_DOOR(0x3f4, Type.SOUND),
    SMOKE(0x7d0, Type.VISUAL, BlockFace.class),
    STEP_SOUND(0x7d1, Type.SOUND, Material.class),
    POTION_BREAK(0x7d2, Type.VISUAL, Potion.class),
    ENDER_SIGNAL(0x7d3, Type.VISUAL),
    MOBSPAWNER_FLAMES(0x7d4, Type.VISUAL);
    private final int type;
    private final Type effectType;
    private final Class<?> behaviour;
    private static final Map<Integer, Effect> TYPEMAP = Maps.newHashMap();
    static {
        for (Effect sparkly : values()) {
            TYPEMAP.put(sparkly.type, sparkly);
        }
    }
    Effect(int id, Type effect) {
        this(id,effect,null);
    }
    Effect(int id, Type effect, Class<?> behaviour) {
        this.type = id;
        this.behaviour = behaviour;
        this.effectType = effect;
    }
    public Type getType() {
        return this.effectType;
    }
    public int getId() {
        return this.type;
    }
    public Class<?> getData() {
        return this.behaviour;
    }
    // dont use this
     @Deprecated
    public static Effect getById(int id) {
        return TYPEMAP.get(id);
    }
}
    
