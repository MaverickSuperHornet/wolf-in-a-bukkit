package org.bukkit;

public enum Achievement {
    OPEN_INVENTORY (org.gplbukkit.Achievement.OPEN_INVENTORY),
    MINE_WOOD (org.gplbukkit.Achievement.MINE_WOOD),
    BUILD_WORKBENCH (org.gplbukkit.Achievement.BUILD_WORKBENCH),
    BUILD_PICKAXE (org.gplbukkit.Achievement.BUILD_PICKAXE),
    BUILD_FURNACE (org.gplbukkit.Achievement.BUILD_FURNACE),
    ACQUIRE_IRON (org.gplbukkit.Achievement.ACQUIRE_IRON),
    BUILD_HOE (org.gplbukkit.Achievement.BUILD_HOE),
    MAKE_BREAD (org.gplbukkit.Achievement.MAKE_BREAD),
    BAKE_CAKE (org.gplbukkit.Achievement.BAKE_CAKE),
    BUILD_BETTER_PICKAXE (org.gplbukkit.Achievement.BUILD_BETTER_PICKAXE),
    COOK_FISH (org.gplbukkit.Achievement.COOK_FISH),
    ON_A_RAIL (org.gplbukkit.Achievement.ON_A_RAIL),
    BUILD_SWORD (org.gplbukkit.Achievement.BUILD_SWORD),
    KILL_ENEMY (org.gplbukkit.Achievement.KILL_ENEMY),
    KILL_COW (org.gplbukkit.Achievement.KILL_COW),
    FLY_PIG (org.gplbukkit.Achievement.FLY_PIG),
    SNIPE_SKELETON (org.gplbukkit.Achievement.SNIPE_SKELETON),
    GET_DIAMONDS (org.gplbukkit.Achievement.GET_DIAMONDS),
    NETHER_PORTAL (org.gplbukkit.Achievement.NETHER_PORTAL),
    GHAST_RETURN (org.gplbukkit.Achievement.GHAST_RETURN),
    GET_BLAZE_ROD (org.gplbukkit.Achievement.GET_BLAZE_ROD),
    BREW_POTION (org.gplbukkit.Achievement.BREW_POTION),
    END_PORTAL (org.gplbukkit.Achievement.END_PORTAL),
    THE_END (org.gplbukkit.Achievement.THE_END),
    ENCHANTMENTS (org.gplbukkit.Achievement.ENCHANTMENTS),
    OVERKILL (org.gplbukkit.Achievement.OVERKILL),
    BOOKCASE (org.gplbukkit.Achievement.BOOKCASE),
    EXPLORE_ALL_BIOMES (org.gplbukkit.Achievement.EXPLORE_ALL_BIOMES),
    SPAWN_WITHER (org.gplbukkit.Achievement.SPAWN_WITHER),
    KILL_WITHER (org.gplbukkit.Achievement.KILL_WITHER),
    FULL_BEACON (org.gplbukkit.Achievement.FULL_BEACON),
    BREED_COW (org.gplbukkit.Achievement.BREED_COW),
    DIAMONDS_TO_YOU (org.gplbukkit.Achievement.DIAMONDS_TO_YOU);
    private final org.gplbukkit.Achievement me;
    private Achievement(org.gplbukkit.Achievement which) {
        this.me = which;
        }
    public boolean hasParent() {
        return this.me.hasParent();
    }
    public Achievement getParent() {
        org.gplbukkit.Achievement real = this.me.getParent();
        Achievement ret = null;
        for(Achievement achievement : Achievement.values()) {
            if(achievement.me.equals(real)) {
                ret = achievement;break;
            }        
        }
    return ret;
    }
}
