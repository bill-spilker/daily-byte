package com.spilker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest
{
    @Test
    void addOneTriple()
    {
        assertEquals("101", AddBinary.addBinary("100", "1"));
    }

    @Test
    void  addTwoDouble()
    {
        assertEquals("100", AddBinary.addBinary("11", "1"));
    }

    @Test
    void  addTwoDoubleInversted()
    {
        assertEquals("100", AddBinary.addBinary("1", "11"));
    }

    @Test
    void addTwoSingles()
    {
        assertEquals("1", AddBinary.addBinary("1", "0"));
    }

    @Test
    void addTwoDoubles()
    {
        assertEquals("100", AddBinary.addBinary("10", "10"));
    }

    @Test
    void addTwoTriples()
    {
        assertEquals("1000", AddBinary.addBinary("100", "100"));
    }

    @Test
    void addingInvertedTriples()
    {
        assertEquals("1010", AddBinary.addBinary("110", "100"));
    }

    @Test
    void addingInvertedTriplesSwitched()
    {
        assertEquals("1010", AddBinary.addBinary("100", "110"));
    }
}
