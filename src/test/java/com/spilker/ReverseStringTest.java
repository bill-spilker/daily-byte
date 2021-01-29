package com.spilker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseStringTest
{
    @Test
    void threeCharacterString()
    {
        assertTrue(ReverseString.reverseString("Cat").equals("taC"));
    }

    @Test
    void dailyByteString()
    {
        assertTrue(ReverseString.reverseString("The Daily Byte").equals("etyB yliaD ehT"));
    }

    @Test
    void palidroneString()
    {
        assertTrue(ReverseString.reverseString("civic").equals("civic"));
    }

    @Test
    void nonABCString()
    {
        assertTrue(ReverseString.reverseString("!@#$").equals("$#@!"));
    }

    @Test
    void emptyString()
    {
        assertTrue(ReverseString.reverseString("").equals(""));
    }
}
