/*******************************************************************************
 * Copyright (c) 2000, 2017 IBM Corporation and others.
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

public class NSAlert extends NSObject {

public NSAlert() {
	super();
}

public NSAlert(long /*int*/ id) {
	super(id);
}

public NSAlert(id id) {
	super(id);
}

public NSButton addButtonWithTitle(NSString title) {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_addButtonWithTitle_, title != null ? title.id : 0);
	return result != 0 ? new NSButton(result) : null;
}

public void beginSheetModalForWindow(NSWindow window, id delegate, long /*int*/ didEndSelector, long /*int*/ contextInfo) {
	OS.objc_msgSend(this.id, OS.sel_beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_, window != null ? window.id : 0, delegate != null ? delegate.id : 0, didEndSelector, contextInfo);
}

public long /*int*/ runModal() {
	return OS.objc_msgSend(this.id, OS.sel_runModal);
}

public void setAlertStyle(long /*int*/ alertStyle) {
	OS.objc_msgSend(this.id, OS.sel_setAlertStyle_, alertStyle);
}

public void setMessageText(NSString messageText) {
	OS.objc_msgSend(this.id, OS.sel_setMessageText_, messageText != null ? messageText.id : 0);
}

public NSPanel window() {
	long /*int*/ result = OS.objc_msgSend(this.id, OS.sel_window);
	return result != 0 ? new NSPanel(result) : null;
}

}
