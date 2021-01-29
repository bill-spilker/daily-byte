package com.spilker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidPalindromeTest
{
    @Test
    void basicPalindrome()
    {
        assertTrue(ValidPalindrome.validate("level"));
    }

    @Test
    void notPalindrome()
    {
        assertFalse(ValidPalindrome.validate("algorithm"));
    }

    @Test
    void longPalindrome()
    {
        assertTrue(ValidPalindrome.validate("A man, a plan, a canal: Panama."));
    }

    @Test
    void blankSPalindrome()
    {
        assertTrue(ValidPalindrome.validate(""));
    }

    @Test
    void nonAlphaCharacters()
    {
        assertTrue(ValidPalindrome.validate("!@#$%"));
    }
}
