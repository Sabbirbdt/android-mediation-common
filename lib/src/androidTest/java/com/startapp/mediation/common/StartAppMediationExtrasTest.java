package com.startapp.mediation.common;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StartAppMediationExtrasTest {
    @Test
    public void testDefault() {
        StartAppMediationExtras extras = new StartAppMediationExtras(null, null, false, false);

        assertNotNull(extras.getAdPreferences());
    }
}
