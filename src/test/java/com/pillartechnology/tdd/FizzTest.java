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

    @Test
    public void shouldReturnFizzWhenThreeIsGivenToFizzMethod() {
        assertEquals("fizz", fizz.fizz(3));
    }

    @Test
    public void shouldReturnFizzWhenSixIsGivenToFizzMethod() {
        assertEquals("fizz", fizz.fizz(6));
    }

    @Test
    public void shouldReturnBuzzWhenFiveIsGivenToFizzMethod() {
        assertEquals("buzz", fizz.fizz(5));
    }

    @Test
    public void shouldReturnFizzBuzzWhenFifteenIsGivenToFizzMethod() {
        assertEquals("fizz buzz", fizz.fizz(15));
    }

}
