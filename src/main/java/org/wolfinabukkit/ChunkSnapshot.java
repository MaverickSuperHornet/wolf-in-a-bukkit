package org.wolfinabukkit;

import org.wolfinabukkit.block.Biome;

public interface ChunkSnapshot 
    {
    int getX();
    int getZ();
    String getWorldName();
    int getBlockSkyLight(int Xaxis, int Yaxis, int Zaxis);
    int getBlockEmittedLight(int Xaxis, int Yaxis, int Zaxis);
    int getHighestBlockYAt(int Xaxis, int Zaxis);
    Biome getBiome(int Xaxis, int Zaxis);
    double getRawBiomeTemperature(int Xaxis, int Zaxis);
    double getRawBiomeRainfall(int Xaxis, int Zaxis);
    long getCaptureFullTime();
    // see if a chunk of air is just empty
    boolean isSectionEmpty(int Ychunkblock);

    @Deprecated
    int getBlockData(int Xaxis, int Yaxis, int Zaxis);
    @Deprecated
    int getBlockTypeId(int Xaxis, int Yaxis, int Zaxis);

}
