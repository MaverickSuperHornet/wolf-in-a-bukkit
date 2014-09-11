package org.wolfinabukkit;

import java.util.Map;

import org.apache.commons.lang.Validate;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;

import com.google.common.collect.ImmutableMap;

@SerializableAs("Color")
public final class Color implements ConfigurationSerializable 
    {
    private static final int COLORBIT = 0xff;
    public static final Color WHITE = fromRGB(0xFFFFFF);
    public static final Color SILVER = fromRGB(0xC0C0C0);
    public static final Color GRAY = fromRGB(0x808080);
    public static final Color BLACK = fromRGB(0x000000);
    public static final Color RED = fromRGB(0xFF0000);
    public static final Color MAROON = fromRGB(0x800000);
    public static final Color YELLOW = fromRGB(0xFFFF00);
    public static final Color OLIVE = fromRGB(0x808000);
    public static final Color LIME = fromRGB(0x00FF00);
    public static final Color GREEN = fromRGB(0x008000);
    public static final Color AQUA = fromRGB(0x00FFFF);
    public static final Color TEAL = fromRGB(0x008080);
    public static final Color BLUE = fromRGB(0x0000FF);
    public static final Color NAVY = fromRGB(0x000080);
    public static final Color FUCHSIA = fromRGB(0xFF00FF);
    public static final Color PURPLE = fromRGB(0x800080);
    public static final Color ORANGE = fromRGB(0xFFA500);

    private final byte r;
    private final byte g;
    private final byte b;// the color spectrum of the human eye
    private Color(int r, int g, int b)
        {
        Validate.isTrue(r >= 0 && r <= COLORBIT, "Please specify a red value between 0-255: ", r);
        Validate.isTrue(g >= 0 && g <= COLORBIT, "Please specify a green value between 0-255: ", g);
        Validate.isTrue(b >= 0 && b <= COLORBIT, "Please specify a blue value between 0-255: ", b);

        this.r = (byte)r;
        this.g = (byte)g;
        this.b = (byte)b;
        }
    private static int asInt(String find, Map<String, Object> target) 
        {
        Object value = map.get(find);
        if (value == null) 
            {
            throw new IllegalArgumentException(find+" is not present in " + target);
            }
        if (!(value instanceof Number)) 
            {
            throw new IllegalArgumentException("Number expected, something else found : "+find + '(' + value + ")");
            }
        return ((Number)value).intValue();
        }
    public static Color fromRGB(int r, int g, int b) throws IllegalArgumentException 
        {
        return new Color(r, g, b);
        }

    // lets do the color shuffle... ish
    public static Color fromBGR(int b, int g, int r) throws IllegalArgumentException 
        {
        return new Color(r, g, b);
        }

    public static Color fromRGB(int rgb) throws IllegalArgumentException 
        {
        Validate.isTrue((rgb >> 24) == 0, "Invalid RGB color data in: ", rgb);
        return fromRGB(rgb >> 16 & COLORBIT, rgb >> 8 & COLORBIT, rgb >> 0 & COLORBIT);
        }

    public static Color fromBGR(int bgr) throws IllegalArgumentException
        {
        Validate.isTrue((bgr >> 24) == 0, "Invalid BGR color data in: ", bgr);
        return fromBGR(bgr >> 16 & COLORBIT, bgr >> 8 & COLORBIT, bgr >> 0 & COLORBIT);
        }
    public int getRed() 
        {
        return COLORBIT & this.r;
        }
    public Color setRed(int r)
        {
        return fromRGB(r, getGreen(), getBlue());
        }
    public int getGreen() 
        {
        return COLORBIT & this.g;
        }
    public Color setGreen(int g) 
        {
        return fromRGB(getRed(), g, getBlue());
        }

    public int getBlue() 
        {
        return COLORBIT & this.b;
        }

    public Color setBlue(int b) 
        {
        return fromRGB(getRed(), getGreen(), b);
        }

    public int asRGB() 
        {
        return getRed() << 16 | getGreen() << 8 | getBlue() << 0;
        }
    public int asBGR() 
        {
        return getBlue() << 16 | getGreen() << 8 | getRed() << 0;
        }

    public Color mixDyes(DyeColor... colors) 
        {
        Validate.noNullElements(colors, "Dyes color specified as null");
        Color[] tmp = new Color[colors.length];
        for (int c=0;c<colors.length;c++) 
            {
            tmp[c] = colors[c].getColor();
            }
        return mixColors(tmp);
        }

    public Color mixColors(Color... colors) 
        {
        Validate.noNullElements(colors, "Colors specified as null");
        int red = this.getRed();
        int green = this.getGreen();
        int blue = this.getBlue();
        int max = Math.max(Math.max(red, green), blue);
        for(Color color:colors) 
            {
            red = red+color.getRed();
            green = green+color.getGreen();
            blue = blue+color.getBlue();
            max = max+Math.max(Math.max(color.getRed(), color.getGreen()), color.getBlue());
            }
        float avgRed = red/(colors.length+1);
        float avgGreen = green/(colors.length+1);
        float avgBlue = blue/(colors.length+1);
        float avgMax = max/(colors.length+1);
        float maxavg = Math.max(Math.max(avgRed, avgGreen), avgBlue);
        float change = avgMax / maxavg;
        return Color.fromRGB((int) (avgred * change), (int) (avgGreen * change), (int) (avgBlue * change));
        }

    @Override
    public boolean equals(Object test) 
        {
        if((test instanceof Color)==false)return false;
        final Color tmpColor = (Color)test;
        return (this.b == tmpColor.blue && this.g == tmpColor.g && this.r == tmpColor.r);
        }

    @Override
    public int hashCode() 
        {
        return asRGB()^Color.class.hashCode();
        }
    public Map<String, Object> serialize() 
        {
        return ImmutableMap.<String, Object>of("RED", getRed(),"BLUE", getBlue(),"GREEN", getGreen());
        }
    public static Color deserialize(Map<String, Object> target) 
        {
        return fromRGB(asInt("RED", target),asInt("GREEN", target),asInt("BLUE", target));
        }
    @Override
    public String toString() 
        {
        return "Color : [rgb 0x" + Integer.toHexString(getRed()).toUpperCase() + Integer.toHexString(getGreen()).toUpperCase() + Integer.toHexString(getBlue()).toUpperCase() + "]";
        }
}
