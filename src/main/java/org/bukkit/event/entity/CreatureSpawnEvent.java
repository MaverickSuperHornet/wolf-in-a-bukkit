package org.bukkit.event.entity;

/* 
    - Tschallacka 16/09/2015 
    found reference to creature spawn event in craftbukkit
    net.minecraft.server.BiomeTheEndDecorator line 25
    has reference to a spawn reason.
    Assuming it extends event until we find specific event it extends
    Making new file as enum for spawn reason for which I also found a reference but has
    no similar matching blank file.

    - Correction. Will have to include spawnreason as an enum in creature 
        spawn event because its referenced as a member
        from CreatureSpawnEvent by biometheenddecorator. Noticed because the variable 
        name started with uppercase. Deleted extra file */
public class CreatureSpawnEvent extends Event {

    public enum SpawnReason {
        CHUNK_GEN;
    }
}
