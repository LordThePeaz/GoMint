package io.gomint.server.world.block;

import io.gomint.world.block.BlockType;

import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 164 )
public class DarkOakWoodStairs extends Stairs {

    @Override
    public int getBlockId() {
        return 164;
    }

    @Override
    public long getBreakTime() {
        return 3000;
    }

    @Override
    public float getBlastResistance() {
        return 15.0f;
    }

    @Override
    public BlockType getType() {
        return BlockType.DARK_OAK_WOOD_STAIRS;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
