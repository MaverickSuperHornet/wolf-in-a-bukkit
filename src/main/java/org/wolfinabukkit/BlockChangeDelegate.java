package org.wolfinabukkit;

// need new comments here too, who volunteers to write?
public interface BlockChangeDelegate {

    public boolean isEmpty(int xAxis, int yAxis, int zAxis);

    public int getHeight();

    // yea.... if we could stop using this that would be great
    @Deprecated
    public boolean setRawTypeId(int xAxis, int yAxis, int zAxis, int newBlockId);

    @Deprecated
    public boolean setRawTypeIdAndData(int xAxis, int yAxis, int zAxis, int newBlockId, int blockData);

    @Deprecated
    public boolean setTypeId(int xAxis, int yAxis, int zAxis, int newBlockId);

    @Deprecated
    public boolean setTypeIdAndData(int xAxis, int yAxis, int zAxis, int newBlockId, int blockData);

    @Deprecated
    public int getTypeId(int xAxis, int yAxis, int zAxis);
}
