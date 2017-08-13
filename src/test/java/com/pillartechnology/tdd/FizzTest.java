package com.pillartechnology.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldReturnFizzesAndBuzzesAndFizzBuzzesAsExpected() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String[] expectedOutput = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz"};

        assertArrayEquals(expectedOutput, fizz.fizz(numbers));
    }

    @Test
    public void shouldReturnZeroWhenZeroIsGivenToFizzMethod() {
        assertEquals("0", fizz.fizz(0));
    }
}
