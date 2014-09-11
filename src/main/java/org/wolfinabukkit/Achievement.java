package org.wolfinabukkit;

/*
 * This represents the default achievements that players can earn or can be given to
 */

public enum Achievement {
    OPEN_INVENTORY,
    MINE_WOOD(OPEN_INVENTORY),
    BUILD_WORKBENCH(MINE_WOOD),
    BUILD_PICKAXE(BUILD_WORKBENCH),
    BUILD_BETTER_PICKAXE(BUILD_PICKAXE),
    BUILD_FURNACE(BUILD_PICKAXE),
    COOK_FISH(BUILD_FURNACE),
    ACQUIRE_IRON(BUILD_FURNACE),
    ON_A_RAIL(ACQUIRE_IRON),
    GET_DIAMONDS(ACQUIRE_IRON),
    NETHER_PORTAL(GET_DIAMONDS),
    GHAST_RETURN(NETHER_PORTAL),
    GET_BLAZE_ROD(NETHER_PORTAL),
    BREW_POTION(GET_BLAZE_ROD),
    END_PORTAL(GET_BLAZE_ROD),
    THE_END(END_PORTAL),
    SPAWN_WITHER(THE_END),
    KILL_WITHER(SPAWN_WITHER),
    FULL_BEACON(KILL_WITHER),
    EXPLORE_ALL_BIOMES(END_PORTAL),
    ENCHANTMENTS(GET_DIAMONDS),
    OVERKILL(ENCHANTMENTS),
    BOOKCASE(ENCHANTMENTS),
    DIAMONDS_TO_YOU(GET_DIAMONDS),
    BUILD_HOE(BUILD_WORKBENCH),
    MAKE_BREAD(BUILD_HOE),
    BAKE_CAKE(BUILD_HOE),
    BUILD_SWORD(BUILD_WORKBENCH),
    KILL_ENEMY(BUILD_SWORD),
    SNIPE_SKELETON(KILL_ENEMY),
    KILL_COW(BUILD_SWORD),
    FLY_PIG(KILL_COW),
    BREED_COW(KILL_COW);
    // private stuff here
    private final Achievement theParent;

    // set parent to null on initialisation
    private Achievement() {
        this.theParent = null;
    }

    // some guy is now your parent, deal with it bruce, his name is Alfred.
    private Achievement(Achievement someParent) {
        this.theParent = someParent;
    }

// public stuff below this line

    // has a parent been set?
    public boolean hasParent() {
        return this.theParent != null;
    }

    public Achievement getParent() {
        return this.theParent;
    }
}
