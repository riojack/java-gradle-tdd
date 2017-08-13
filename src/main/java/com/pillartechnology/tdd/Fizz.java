package com.pillartechnology.tdd;

public class Fizz {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_DIVIDER = 3;
    public static final int BUZZ_DIVIDER = 5;

    public String fizz(int fizzableNumber) {
        String answer = Integer.toString(fizzableNumber);

        if (fizzableNumber % FIZZ_DIVIDER == 0) {
            answer = FIZZ;
        }

        if (fizzableNumber % BUZZ_DIVIDER == 0) {
            answer = BUZZ;
        }

        if (fizzableNumber % FIZZ_DIVIDER == 0 && fizzableNumber % BUZZ_DIVIDER == 0) {
            answer = FIZZ + " " + BUZZ;
        }

        return answer;
    }
}
