package org.wolfinabukkit;

// need new comments here too, who volunteers to write?
public interface BlockChangeDelegate
    {
    public boolean isEmpty(int Xaxis, int Yaxis, int Zaxis);
    public int getHeight();
    // yea.... if we could stop using this that would be great
    @Deprecated
    public boolean setRawTypeId(int Xaxis, int Yaxis, int Zaxis, int newBlockID);
    @Deprecated
    public boolean setRawTypeIdAndData(int Xaxis, int Yaxis, int Zaxis, int newBlockID,int BlockData); 
    @Deprecated
    public boolean setTypeId(int Xaxis, int Yaxis, int Zaxis, int newBlockID);
    @Deprecated
    public boolean setTypeIdAndData(int Xaxis, int Yaxis, int Zaxis, int newBlockID, int BlockData);
    @Deprecated
    public int getTypeId(int Xaxis, int Yaxis, int Zaxis);
    }
