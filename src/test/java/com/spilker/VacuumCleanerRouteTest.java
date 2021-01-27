package com.spilker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VacuumCleanerRouteTest {
    @Test
    void leftRight()
    {
        assertTrue(VacuumCleanerRoute.originalLocation("LR"));
    }

    @Test
    void rightUp()
    {
        assertFalse(VacuumCleanerRoute.originalLocation("URURD"));
    }

    @Test
    void leftRightUpDownReturnToStart()
    {
        assertTrue(VacuumCleanerRoute.originalLocation("RUULLDRD"));
    }

    @Test
    void capitalizationError()
    {
        assertTrue(VacuumCleanerRoute.originalLocation("lr"));
    }
}
