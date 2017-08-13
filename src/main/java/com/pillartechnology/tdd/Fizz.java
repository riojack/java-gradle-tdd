package com.pillartechnology.tdd;

public class Fizz {
    public static final String FIZZ = "fizz";

    public String fizz(Integer fizzableNumber) {
        String answer = fizzableNumber.toString();

        if (fizzableNumber.equals(3)) {
            answer = FIZZ;
        }

        return answer;
    }
}
