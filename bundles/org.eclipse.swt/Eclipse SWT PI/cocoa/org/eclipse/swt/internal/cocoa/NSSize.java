/*******************************************************************************
 * Copyright (c) 2007, 2012 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.swt.internal.cocoa;


public class NSSize {
	public double /*float*/ width;
	public double /*float*/ height;
	public static final int sizeof = OS.NSSize_sizeof();

	@Override
	public String toString() {
		return "NSSize{" + width + "," + height + "}";
	}
}
