package com.pillartechnology.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzTest {
    private Fizz fizz;

    @Before
    public void setUp() {
        fizz = new Fizz();
    }

    @Test
    public void shouldReturnOneWhenOneIsGivenToFizzMethod() {
        assertEquals("1", fizz.fizz(1));
    }

    @Test
    public void shouldReturnTwoWhenTwoIsGivenToFizzMethod() {
        assertEquals("2", fizz.fizz(2));
    }
}
