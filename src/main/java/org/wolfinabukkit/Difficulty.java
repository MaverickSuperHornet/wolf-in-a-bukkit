package org.wolfinabukkit;

import java.util.Map;

import com.google.common.collect.Maps;

public enum Difficulty {
    PEACEFUL(0),
    EASY(1),
    NORMAL(2),
    HARD(3);
    private final int difficulty;
    private final static Map<Integer, Difficulty> DIFFICULTIES = Maps.newHashMap();
    private Difficulty(final int level) {
        this.difficulty = level;
    }
    static {
        for (Difficulty levels : values()) {
            DIFFICULTIES.put(levels.value, levels);
        }
    }
    // yea... don't use this.
    @Deprecated
    public int getValue() {
        return difficulty;
    }
    @Deprecated
    public static Difficulty getByValue(final int which) {
        return DIFFICULTIES.get(which);
    }
}
