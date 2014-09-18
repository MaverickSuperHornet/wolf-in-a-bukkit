package org.bukkit.event.entity;

/*  18/09/2015 Tschallacka
    in net.minecraft.server.BlockButtonAbstract a reference to this event
    assuming it extends event until evidence found otherwise.
*/
import org.bukkit.block.Block;
import net.minecraft.server.CraftEntity;


public class EntityInteractEvent.java extends Event {
   /* 18/09/2015 Tschallacka constructor deduced from BlockButtonAbstract line 263
        where an Entity is called with method getBukkitEntity
        This function in net.minecraft.server.Entity.java line 1407
        indicates a CraftEntity in first constructor argument.
        the second is a org.bukkit.block.Block argument according to line 257
        */
    private CraftEntity entity;
    private Block block
    public EntityInteractEvent(CraftEntity entity,Block block) {
        this.entity = entity;
        this.block = block;
    }
    /* 18/09/2015 Tschallacka found isCancelled in BlockButtonAbstract line 266
       assuming its a boolean
    */
    public boolean isCancelled() {
        return false;
    }
    
    }
