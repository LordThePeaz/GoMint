package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 234 )
public class ItemRedGlazedTerracotta extends ItemStack implements io.gomint.inventory.item.ItemRedGlazedTerracotta {

    // CHECKSTYLE:OFF
    public ItemRedGlazedTerracotta( short data, int amount ) {
        super( 234, data, amount );
    }

    public ItemRedGlazedTerracotta( short data, int amount, NBTTagCompound nbt ) {
        super( 234, data, amount, nbt );
    }
    // CHECKSTYLE:ON
    
    @Override
    public ItemType getType() {
        return ItemType.RED_GLAZED_TERRACOTTA;
    }

}
