package org.bukkit;

/* 28/09/2014 Weschke55

  recreating Achievement.java from javadocs at http://jd.bukkit.org/rb/apidocs/org/bukkit/Achievement.html and
  the doxygen at http://jd.bukkit.org/rb/doxygen/d1/dfb/enumorg_1_1bukkit_1_1Achievement.html

*/

public enum Achievement {
	
	OPEN_INVENTORY(null),
	
	MINE_WOOD(OPEN_INVENTORY);
	
	
	
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