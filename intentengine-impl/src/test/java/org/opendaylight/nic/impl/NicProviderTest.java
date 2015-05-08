/*
 * Copyright (c) 2015 Hewlett-Packard Development Company, L.P. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.nic.impl;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;

public class NicProviderTest {
    @Test
    public void testOnSessionInitiated() throws Exception {
        try (NicProvider provider = new NicProvider()) {

            // ensure no exceptions
            // currently this method is empty
            provider.onSessionInitiated(mock(BindingAwareBroker.ProviderContext.class));
        }
    }

    @Test
    public void testClose() throws Exception {
        try (NicProvider provider = new NicProvider()) {

        }
    }
}