package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 392 )
public class ItemPotato extends ItemFood implements io.gomint.inventory.item.ItemPotato {

    // CHECKSTYLE:OFF
    public ItemPotato( short data, int amount ) {
        super( 392, data, amount );
    }

    public ItemPotato( short data, int amount, NBTTagCompound nbt ) {
        super( 392, data, amount, nbt );
    }
    // CHECKSTYLE:ON

    @Override
    public int getBlockId() {
        return 142;
    }

    @Override
    public float getSaturation() {
        return 0.3f;
    }

    @Override
    public float getHunger() {
        return 1;
    }

    @Override
    public ItemType getType() {
        return ItemType.POTATO;
    }

}