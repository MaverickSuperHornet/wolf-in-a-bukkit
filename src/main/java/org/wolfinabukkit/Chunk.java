package org.wolfinabukkit;

import org.wolfinabukkit.block.Block;
import org.wolfinabukkit.block.BlockState;

import org.wolfinabukkit.entity.Entity;

public interface Chunk {

    int getX();

    int getZ();

    World getWorld();

    Block getBlock(int xAxis, int yAxis, int zAxis);

    ChunkSnapshot getChunkSnapshot();

    ChunkSnapshot getChunkSnapshot(boolean includeBuildLimit, boolean biome, boolean rain);

    Entity[] getEntities();

    BlockState[] getTileEntities();

    boolean isLoaded();

    boolean load(boolean runGenerator);

    boolean load();

    boolean unload(boolean saveToDisk, boolean safe);

    boolean unload(boolean saveToDisk);

    boolean unload();
}
