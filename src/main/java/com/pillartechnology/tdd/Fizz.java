package com.pillartechnology.tdd;

public class Fizz {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_DIVIDER = 3;
    public static final int BUZZ_DIVIDER = 5;

    public String fizz(int fizzableNumber) {
        String answer = Integer.toString(fizzableNumber);
        boolean shouldFizz = isFizzNumber(fizzableNumber);
        boolean shouldBuzz = isBuzzNumber(fizzableNumber);

        if (shouldFizz) {
            answer = FIZZ;
        }

        if (shouldBuzz) {
            answer = BUZZ;
        }

        if (shouldFizz && shouldBuzz) {
            answer = FIZZ + " " + BUZZ;
        }

        return answer;
    }

    private boolean isBuzzNumber(int fizzableNumber) {
        return fizzableNumber % BUZZ_DIVIDER == 0;
    }

    private boolean isFizzNumber(int fizzableNumber) {
        return fizzableNumber % FIZZ_DIVIDER == 0;
    }
}
