package io.gomint.server.world.block;

import io.gomint.world.block.BlockType;

import io.gomint.inventory.item.*;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 251 )
public class Observer extends Block implements io.gomint.world.block.BlockObserver {

    @Override
    public int getBlockId() {
        return 251;
    }

    @Override
    public long getBreakTime() {
        return 5250;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

    @Override
    public Class<? extends ItemStack>[] getToolInterfaces() {
        return new Class[]{
            ItemWoodenPickaxe.class,
            ItemStonePickaxe.class,
            ItemGoldenPickaxe.class,
            ItemIronPickaxe.class,
            ItemDiamondPickaxe.class
        };
    }

    @Override
    public float getBlastResistance() {
        return 17.5f;
    }

    @Override
    public BlockType getType() {
        return BlockType.OBSERVER;
    }

    @Override
    public boolean canBeBrokenWithHand() {
        return true;
    }

}
