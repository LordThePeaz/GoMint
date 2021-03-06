package io.gomint.server.inventory.item.generator;

import io.gomint.server.inventory.item.ItemChainHelmet;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ItemChainHelmetGenerator implements ItemGenerator {

   @Override
   public ItemChainHelmet generate( short data, byte amount, NBTTagCompound nbt ) {
       return new ItemChainHelmet( data, amount, nbt );
   }

   @Override
   public ItemChainHelmet generate( short data, byte amount ) {
       return new ItemChainHelmet( data, amount );
   }

}
