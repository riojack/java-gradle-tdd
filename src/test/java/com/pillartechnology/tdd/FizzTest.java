package com.pillartechnology.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzTest {
    @Test
    public void shouldReturnOneWhenOneIsGivenToFizzMethod() {
        Fizz fizz = new Fizz();

        assertEquals("1", fizz.fizz(1));
    }

}