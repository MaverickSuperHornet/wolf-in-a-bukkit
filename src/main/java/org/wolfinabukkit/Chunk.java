package org.wolfinabukkit;

import org.wolfinabukkit.block.Block;
import org.wolfinabukkit.block.BlockState;

import org.wolfinabukkit.entity.Entity;

public interface Chunk 
    {
    int getX();
    int getZ();
    World getWorld();
    Block getBlock(int Xaxis,int Yaxis,int Zaxis);
    ChunkSnapshot getChunkSnapshot();
    ChunkSnapshot getChunkSnapshot(boolean includeBuildLimit, boolean biome, boolean rain);
    Entity[] getEntities();
    BlockState[] getTileEntities();
    boolean isLoaded();
    boolean load(boolean runGenerator);
    boolean load();
    boolean unload(boolean savetodisk, boolean safe);
    boolean unload(boolean savetodisk);
    boolean unload();
    }
