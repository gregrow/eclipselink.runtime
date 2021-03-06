/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
******************************************************************************/
package org.eclipse.persistence.tools.workbench.utility.string;

import org.eclipse.persistence.tools.workbench.utility.ClassTools;

/**
 * This implementation of PartialStringComparator will simply compare
 * the specified strings, returning 1 if they are equal (ignoring case),
 * 0 if they are not.
 */
public final class CaseInsensitivePartialStringComparator
	implements PartialStringComparator
{

	// singleton
	private static CaseInsensitivePartialStringComparator INSTANCE;

	/**
	 * Return the singleton.
	 */
	public static synchronized PartialStringComparator instance() {
		if (INSTANCE == null) {
			INSTANCE = new CaseInsensitivePartialStringComparator();
		}
		return INSTANCE;
	}

	/**
	 * Ensure non-instantiability.
	 */
	private CaseInsensitivePartialStringComparator() {
		super();
	}

	/**
	 * @see PartialStringComparator#compare(String, String)
	 */
	public double compare(String s1, String s2) {
		return s1.equalsIgnoreCase(s2) ? 1 : 0;
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return ClassTools.shortClassNameForObject(this);
	}

}
