/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package test;

/**
 * @author efftinge - Initial contribution and API
 */
public class JavaB extends XtendC {
	public XtendA foo(XtendC test) {
		XtendA result = new XtendA();
		result.test2(new XtendB());
		test.test( result);
		return result;
	}
}
