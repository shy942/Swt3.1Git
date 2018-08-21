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
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.cocoa;

public class WebUndefined extends NSObject {

public WebUndefined() {
	super();
}

public WebUndefined(long /*int*/ id) {
	super(id);
}

public WebUndefined(id id) {
	super(id);
}

public static WebUndefined undefined() {
	long /*int*/ result = OS.objc_msgSend(OS.class_WebUndefined, OS.sel_undefined);
	return result != 0 ? new WebUndefined(result) : null;
}

}
