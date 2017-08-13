package com.pillartechnology.tdd;

import java.util.Arrays;

public class Fizz {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_DIVIDER = 3;
    public static final int BUZZ_DIVIDER = 5;

    public String[] fizz(int[] numbers) {
        return Arrays.stream(numbers)
            .mapToObj(this::fizz)
            .toArray(String[]::new);
    }

    public String fizz(int fizzableNumber) {
        String answer = Integer.toString(fizzableNumber);

        boolean shouldFizz = isFizzNumber(fizzableNumber);
        boolean shouldBuzz = isBuzzNumber(fizzableNumber);

        if (shouldFizz && shouldBuzz) {
            answer = FIZZ + " " + BUZZ;
        } else if (shouldFizz) {
            answer = FIZZ;
        } else if (shouldBuzz) {
            answer = BUZZ;
        }

        return answer;
    }

    private boolean isBuzzNumber(int buzzableNumber) {
        return buzzableNumber != 0 && buzzableNumber % BUZZ_DIVIDER == 0;
    }

    private boolean isFizzNumber(int fizzableNumber) {
        return fizzableNumber != 0 && fizzableNumber % FIZZ_DIVIDER == 0;
    }
}
