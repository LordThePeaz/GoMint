package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface ItemPoisonousPotato extends ItemFood {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemPoisonousPotato create( int amount ) {
        return GoMint.instance().createItemStack( ItemPoisonousPotato.class, amount );
    }

}
