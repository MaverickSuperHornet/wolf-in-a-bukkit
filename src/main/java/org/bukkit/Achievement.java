package org.bukkit;

/* 28/09/2014 Weschke55

  recreating Achievement.java from javadocs at http://jd.bukkit.org/rb/apidocs/org/bukkit/Achievement.html and
  the doxygen at http://jd.bukkit.org/rb/doxygen/d1/dfb/enumorg_1_1bukkit_1_1Achievement.html

*/

public enum Achievement {
	
	OPEN_INVENTORY(null),
	
	MINE_WOOD(OPEN_INVENTORY),
	
	BUILD_WORKBENCH(MINE_WOOD),
	
	BUILD_PICKAXE(BUILD_WORKBENCH),
	
	BUILD_FURNACE(BUILD_PICKAXE),
	
	ACQUIRE_IRON(BUILD_FURNACE),
	
 	BUILD_HOE(BUILD_WORKBENCH),
 	
 	MAKE_BREAD(BUILD_HOE),
 	
 	BAKE_CAKE(BUILD_HOE),
 	
 	BUILD_BETTER_PICKAXE(BUILD_PICKAXE),
 	
 	COOK_FISH(BUILD_FURNACE),
 	
 	ON_A_RAIL(ACQUIRE_IRON),
 	
 	BUILD_SWORD(BUILD_WORKBENCH),
 	
 	KILL_ENEMY(BUILD_SWORD),
 	
 	KILL_COW(BUILD_SWORD),
 	
 	FLY_PIG(KILL_COW),
 	
 	SNIPE_SKELETON(KILL_ENEMY),
 	
 	GET_DIAMONDS(ACQUIRE_IRON),
 	
 	NETHER_PORTAL(GET_DIAMONDS),
 	
 	GHAST_RETURN(NETHER_PORTAL),
 	
 	GET_BLAZE_ROD(NETHER_PORTAL),
 	
 	BREW_POTION(GET_BLAZE_ROD),
 	
 	END_PORTAL(GET_BLAZE_ROD),
 	
 	THE_END(END_PORTAL),
 	
 	ENCHANTMENTS(GET_DIAMONDS),
 	
 	OVERKILL(ENCHANTMENTS),
 	
 	BOOKCASE(ENCHANTMENTS),
 	
 	EXPLORE_ALL_BIOMES(END_PORTAL),
 	
 	SPAWN_WITHER(THE_END),
 	
 	KILL_WITHER(SPAWN_WITHER),
 	
 	FULL_BEACON(KILL_WITHER),
 	
 	BREED_COW(KILL_COW),
 	
 	DIAMONDS_TO_YOU(GET_DIAMONDS);
	
	
	
	
	
	private boolean hParent;
	private Achievement aParent;
	
	private Achievement(Achievement parent) {
		if (parent != null) {
			this.hParent = true;
			this.aParent = parent; 
		} else {
			this.hParent = false;
			this.aParent = null;
		}
	}
	
	public boolean hasParent() {
		return hParent;
	}
	
	public Achievement getParent() {
		return aParent;
	}
	
}