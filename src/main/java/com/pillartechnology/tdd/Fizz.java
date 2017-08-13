package com.pillartechnology.tdd;

public class Fizz {
    public static final String FIZZ = "fizz";

    public String fizz(int fizzableNumber) {
        String answer = Integer.toString(fizzableNumber);

        if (fizzableNumber % 3 == 0) {
            answer = FIZZ;
        }

        return answer;
    }
}
