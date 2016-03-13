/*
 * Copyright (c) 2015, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.async;

/**
 * @author BlackyPaw
 * @version 1.0
 */
public interface Delegate<T> {

	void invoke( T arg );

}
