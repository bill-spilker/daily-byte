package com.spilker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CorrectCapitalizationTest {
    @Test
    void allCapital()
    {
        assertTrue(CorrectCapitalization.capitalizationCheck("USA"));
    }

    @Test
    void name()
    {
        assertTrue(CorrectCapitalization.capitalizationCheck("Calvin"));
    }

    @Test
    void midWordCapitalization()
    {
        assertFalse(CorrectCapitalization.capitalizationCheck("compUter"));
    }

    @Test
    void allLowerCase()
    {
        assertTrue(CorrectCapitalization.capitalizationCheck("coding"));
    }

    @Test
    void speicalCharacter()
    {
        assertTrue(CorrectCapitalization.capitalizationCheck("!>?."));
    }
}
