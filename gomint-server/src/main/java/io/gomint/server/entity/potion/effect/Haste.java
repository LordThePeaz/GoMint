/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.entity.potion.effect;

import io.gomint.server.entity.EntityLiving;
import io.gomint.server.registry.RegisterInfo;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 3 )
public class Haste extends Effect {

    public Haste( int amplifier, long runoutTimer ) {
        super( amplifier, runoutTimer );
    }

    @Override
    public void apply( EntityLiving player ) {

    }

    @Override
    public void update( long currentTimeMillis, float dT ) {

    }

    @Override
    public void remove( EntityLiving player ) {

    }

}
