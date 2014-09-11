package org.wolfinabukkit;

import org.wolfinabukkit.block.Biome;

public interface ChunkSnapshot {

    int getX();

    int getZ();

    String getWorldName();

    int getBlockSkyLight(int xAxis, int yAxis, int zAxis);

    int getBlockEmittedLight(int xAxis, int yAxis, int zAxis);

    int getHighestBlockYAt(int xAxis, int zAxis);

    Biome getBiome(int xAxis, int zAxis);

    double getRawBiomeTemperature(int xAxis, int zAxis);

    double getRawBiomeRainfall(int xAxis, int zAxis);

    long getCaptureFullTime();

    // see if a chunk of air is just empty
    boolean isSectionEmpty(int yChunkBlock);

    @Deprecated
    int getBlockData(int xAxis, int yAxis, int zAxis);

    @Deprecated
    int getBlockTypeId(int xAxis, int yAxis, int zAxis);

}
