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
    /* 16/09/2015 Tschallacka no adequate names yet for power1 and two as function is yet undetermined.
     since they are internal naming doesn't matter that much.    
    18/09/2015 renamed them to old and current as per
        net.minecraft.server.BlockButtonAbstract line 152
    preceding lines indicate a test if the power will be 15 or 0
    wether test passes or fails.
    */
    private int old;
    private int current;
    
    public BlockRedstonevent(Block block, int old, int current) {
        this.block = block;
        this.old = old;
        this.current = current;
    }
    /* 18/09/2015 Tschallacka function getnewcurrent as 
        net.minecraft.server.BlockButtonAbstract line 155
        calls this to test if the redstone current is bigger
        than 15. No idea as of yet what to return except an integer value
        of 0 - 15 to indicate redstone signal strength it seems.
        Theory: It takes the current redstone signal strength from
                block then adds button redstone power to it and
                returns the sum.
    */
        public int getNewCurrent()
            {
            return 0;
            }
    
}
