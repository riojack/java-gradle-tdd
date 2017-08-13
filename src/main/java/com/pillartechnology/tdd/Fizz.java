package com.pillartechnology.tdd;

public class Fizz {
    public static final String FIZZ = "fizz";
    public static final int FIZZ_DIVIDER = 3;

    public String fizz(int fizzableNumber) {
        String answer = Integer.toString(fizzableNumber);

        if (fizzableNumber % FIZZ_DIVIDER == 0) {
            answer = FIZZ;
        }

        return answer;
    }
}
