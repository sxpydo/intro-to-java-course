package com.cbfacademy;

public class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String run() {
        String fizzBuzz = "";

        if (number % 3 == 0) {
            fizzBuzz += "Fizz";
        } 
        if (number % 5 == 0) {
            fizzBuzz += "Buzz";
        }

        return fizzBuzz != "" ? fizzBuzz : String.valueOf(number);
        // return fizzBuzz || String.valueOf(number);

    }

}
