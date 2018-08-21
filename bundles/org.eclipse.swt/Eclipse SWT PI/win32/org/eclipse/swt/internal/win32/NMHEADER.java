/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
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
package org.eclipse.swt.internal.win32;

public class NMHEADER extends NMHDR {
	public int iItem;
	public int iButton;
	/** @field cast=(HDITEM FAR *) */
	public long /*int*/ pitem;
	public static int sizeof = OS.NMHEADER_sizeof ();
}
