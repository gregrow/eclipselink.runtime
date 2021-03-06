/*******************************************************************************
 * Copyright (c) 2014 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Iaroslav Savytskyi - August 13/2014 - 2.6.0 - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.sdo.server;

/**
 * Used to indicate service fail during initialisation
 */
public class DeptServiceInitException extends RuntimeException {

    public DeptServiceInitException(Throwable cause) {
        super(cause);
    }
}
