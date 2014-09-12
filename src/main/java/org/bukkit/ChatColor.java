package org.bukkit;

public enum ChatColor {
    BLACK(org.gplbukkit.ChatColor.BLACK),
    DARK_BLUE(org.gplbukkit.ChatColor.DARK_BLUE),
    DARK_GREEN(org.gplbukkit.ChatColor.DARK_GREEN),
    DARK_AQUA(org.gplbukkit.ChatColor.DARK_AQUA),
    DARK_RED(org.gplbukkit.ChatColor.DARK_RED),
    DARK_PURPLE(org.gplbukkit.ChatColor.DARK_PURPLE),
    GOLD(org.gplbukkit.ChatColor.GOLD),
    GRAY(org.gplbukkit.ChatColor.GRAY),
    DARK_GRAY(org.gplbukkit.ChatColor.DARK_GRAY),
    BLUE(org.gplbukkit.ChatColor.BLUE),
    GREEN(org.gplbukkit.ChatColor.GREEN),
    AQUA(org.gplbukkit.ChatColor.AQUA),
    RED(org.gplbukkit.ChatColor.RED),
    LIGHT_PURPLE(org.gplbukkit.ChatColor.LIGHT_PURPLE),
    YELLOW(org.gplbukkit.ChatColor.YELLOW),
    WHITE(org.gplbukkit.ChatColor.WHITE),
    MAGIC(org.gplbukkit.ChatColor.MAGIC),
    BOLD(org.gplbukkit.ChatColor.BOLD),
    STRIKETHROUGH(org.gplbukkit.ChatColor.STRIKETHROUGH),
    UNDERLINE(org.gplbukkit.ChatColor.UNDERLINE),
    ITALIC(org.gplbukkit.ChatColor.ITALIC),
    RESET(org.gplbukkit.ChatColor.RESET);
    private org.gplbukkit.ChatColor me;
    private ChatColor(org.gplbukkit.ChatColor whoAmI) {
        this.me = whoAmI;
    }
    public char getChar() {
        return this.me.getChar();
    }
    @Override
    public String toString() {
        return this.me.toString();
    }
    public boolean isFormat() {
        return this.me.isFormat();
    }
    public boolean isColor() {
        return this.me.isColor();
    }
    public static ChatColor getByChar(char chr) {
        ChatColor ret = null;
        org.gplbukkit.ChatColor real = org.gplbukkit.ChatColor.getByChar(chr);
        for(ChatColor search : ChatColor.values()) {
            if(search.me.equals(real)) {
                ret = search;break;
            }        
        }
        return ret;
    }
    public static ChatColor getByChar(String chr) {
        ChatColor ret = null;
        org.gplbukkit.ChatColor real = org.gplbukkit.ChatColor.getByChar(chr);
        for(ChatColor search : ChatColor.values()) {
            if(search.me.equals(real)) {
                ret = search;break;
            }        
        }
        return ret;
    }
    public static String stripColor(final String which) {
        return org.gplbukkit.ChatColor.stripColor(which);
    }
    public static String translateAlternateColorCodes(char chr, String str) {
        return org.gplbukkit.ChatColor.translateAlternateColorCodes(chr,str);
    }
    public static String getLastColors(String str) {
        return org.gplbukkit.ChatColor.getLastColors(str);
    } 
    
}
