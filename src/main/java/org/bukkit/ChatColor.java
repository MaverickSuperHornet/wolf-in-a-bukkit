package org.bukkit;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 28/09/2014 AndrewWeschke

  recreating ChatColor.java from javadocs at http://jd.bukkit.org/rb/apidocs/org/bukkit/ChatColor.html and
  the doxygen at http://jd.bukkit.org/dev/doxygen/d7/dc0/enumorg_1_1bukkit_1_1ChatColor.html

*/

public enum ChatColor {

    /* Black */
    BLACK('0', 0x00),

    /* Dark Blue */
    DARK_BLUE('1', 0x1),

    /* Reset */
    RESET('r', 0x15);

    private char    charCode;
    private int     decAsciiCode;
    private boolean isFormat;
    private String                               strOfChar;

    static final char                            COLOR_CHAR = '\u00A7';
    
    private static HashMap<Character, ChatColor> charHash;

    private ChatColor(char charCode, int decAsciiCode) {
        this(charCode, decAsciiCode, false);
    }

    private ChatColor(char charCode, int decAsciiCode, boolean isformatValue) {
        this.charCode = charCode;
        this.decAsciiCode = decAsciiCode;
        this.isFormat = isformatValue;
    }

    public char getChar() {
        return charCode;
    }

    @Override
    public String toString() {
        return ((new StringBuilder().append(COLOR_CHAR).append(charCode)).toString());
    }

    public boolean isFormat() {
        return isFormat;
    }

    public boolean isColor() {
        if (!isFormat && this != RESET) {
            return true;
        } else {
            return false;
        }
    }

    public static ChatColor getByChar(char charCode) {
        return charHash.get(charCode);
    }

    public static ChatColor getByChar(String strOfChar) {
        if (strOfChar.length() != 1) {
            return null;
        }
        return charHash.get(strOfChar.charAt(0));
    }

    public static String stripColor(final String inputStr) {
        StringBuilder regexPattern = new StringBuilder().append(COLOR_CHAR).append("[");
        for (char keychar : charHash.keySet()) {
            regexPattern.append(keychar);
        }
        regexPattern.append("]");
        return inputStr.replaceAll(regexPattern.toString(), "");
    }

    public static String translateAlternateColorCodes(char altColorChar, String textToTranslate) {
        StringBuilder regexPattern = new StringBuilder().append(altColorChar).append("[");
        for (char keychar : charHash.keySet()) {
            regexPattern.append(keychar);
        }
        regexPattern.append("]");
        return textToTranslate.replaceAll(regexPattern.toString(), COLOR_CHAR + "$1");
    }

    public static String getLastColors(String queryStr) {
        StringBuilder regexPattern = new StringBuilder().append(COLOR_CHAR).append("[");
        for (char keychar : charHash.keySet()) {
            if (charHash.get(keychar).isColor()) {
                regexPattern.append(keychar);
            }
        }
        regexPattern.append("]");
        Pattern pattern = Pattern.compile(regexPattern.toString());
        Matcher matcher = pattern.matcher(queryStr);
        boolean found = false;
        while (matcher.find()) {
            found = true;
        }
        if (found) {
            return matcher.group();
        }
        else {
            return "";
        }
    }

    static {
        charHash = new HashMap<Character, ChatColor>();
        for (ChatColor colorkey : EnumSet.allOf(ChatColor.class))
        {
            charHash.put(colorkey.getChar(), colorkey);
        }
    }

}