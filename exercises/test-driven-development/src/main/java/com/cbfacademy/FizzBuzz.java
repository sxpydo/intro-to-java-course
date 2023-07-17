package com.cbfacademy;

public class FizzBuzz {
    int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String run() {
        if (number == 3) {
            return "Fizz";
        } 
        return String.valueOf(number);
    }

}
