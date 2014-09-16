package org.bukkit.event.block;

import org.bukkit.block.Block;
/* - Tschallacka 16/09/2015
    Found reference to this in net.minecraft.server.BlockBloodStone line 3
    Assuming it extends otherwise untill we find more.
    Needs a constructor with 3 variables according to line 22 in BlockBloodStone.java
    The first one is an org.bukkit.block.Block object according to line 19 in BlockBloodStone.java
    The second and third one is an int according for the power strength according to line 20 in BlockBloodStone.java

*/

public class BlockRedstoneEvent extends Event {
    private Block block;
    private int power1;
    private int power2;
    // no adequate names yet for power1 and two as function is yet undetermined.
    // since they are internal naming doesn't matter that much.
    public BlockRedstonevent(Block block, int power1, int power2) {
        this.block = block;
        this.power1 = power1;
        this.power2 = power2;
    }
    
}
