package org.bukkit;

import java.util.EnumSet;
import java.util.HashMap;

/* 27/09/2014 BWeschke
    recreating Art.java from javadocs at http://jd.bukkit.org/rb/apidocs/org/bukkit/Art.html and
    http://jd.bukkit.org/dev/doxygen/d2/d74/enumorg_1_1bukkit_1_1Art.html for id, width, height values
*/
public enum Art {

    ALBAN(2, 1, 1),

    AZTEC2(3, 1, 1),

    BOMB(4, 1, 1),

    BURNINGSKULL(23, 4, 4),

    BUST(15, 2, 2),

    COURBET(8, 2, 1),

    CREEBET(11, 2, 1),

    DONKEYKONG(25, 4, 3),

    FIGHTERS(20, 4, 2),

    GRAHAM(13, 1, 2),

    KEBAB(0, 1, 1),

    MATCH(14, 2, 2),

    PIGSCENE(22, 4, 4),

    PLANT(5, 1, 1),

    POINTER(21, 4, 4),

    POOL(7, 2, 1),

    SEA(9, 2, 1),

    SKELETON(24, 4, 3),

    SKULL_AND_ROSES(18, 2, 2),

    STAGE(16, 2, 2),

    SUNSET(10, 2, 1),

    VOID(17, 2, 2),

    WANDERER(12, 1, 2),

    WASTELAND(6, 1, 1),

    WITHER(19, 2, 2);

    private int id, width, height;
    
    private static HashMap<String, Art>  nameHash;
    private static HashMap<Integer, Art> idHash;

    private Art(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    
    public int getBlockHeight() {
        return height;
    }
    
    public int getBlockWidth() {
        return width;
    }

    public int getId() {
        return id;
    }

    public static Art getById(int id) {
        return idHash.get(id);
    }

    public static Art getByName(String name) {
        String idCompare = name.toLowerCase().replace("_", "");
        for (String key : nameHash.keySet()) {
            if (idCompare.equals(key.toLowerCase().replace("_", ""))) {
                return nameHash.get(key);
            }
        }
        return null;
    }

    static {
        nameHash = new HashMap<String, Art>();
        idHash = new HashMap<Integer, Art>();
        for (Art art : EnumSet.allOf(Art.class))
        {
            nameHash.put(art.name(), art);
            idHash.put(art.getId(), art);
        }
    }
}
