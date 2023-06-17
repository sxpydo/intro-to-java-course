package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

   public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
        ArrayList<String> numbersArray = new ArrayList<>();
        //  it creates a list where for each element of the input list ${numbers}
        for (int i = 0; i < numbers.size(); i++) {
            //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            if ((numbers.get(i) % 3 == 0) && (numbers.get(i) % 5 == 0)) {
                numbersArray.add("FizzBuzz");
            //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            } else if (numbers.get(i) % 3 == 0) {
                numbersArray.add("Fizz");
            //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
            } else if (numbers.get(i) % 5 == 0) {
                numbersArray.add("Buzz");
            //  - it adds the element to the list in any other case
            } else {
                numbersArray.add(Integer.toString(numbers.get(i)));
            }
        }
        //  - it returns the constructed list
        return numbersArray;
    }

    public String whichMonth(Integer number) {
        // Implement this method such that
        switch (number) {
        //  - it returns the month corresponding to the input ${number}
        case 1:
                return "January";
            case 2:
                return "February";  
            case 3:
                return "March";                
            case 4:
                return "April";
            case 5:  
                return "May";
            case 6:  
                return "June";
            case 7:  
                return "July";
            case 8:  
                return "August";
            case 9:  
                return "September";
            case 10:  
                return "October";
            case 11:  
                return "November";
            case 12:  
                return "December";
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        default:
                return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // Implement this method such that
        ArrayList<Integer> number = new ArrayList<>();

        //  - creates and initialises a list of 100 numbers - from 1 to 100
            for (int i = 1; i < 100; i++) {
            number.add(i);
        }

        HashMap<String, Integer> numberMap = new HashMap<>();
        numberMap.put("SumOfEvens",0);
        numberMap.put("SumOfOdds",0);

        for (int i : number) {
        //  - determines the sum of all the even numbers in the list
            if (i % 2 == 0) {
                 numberMap.put("SumOfEvens", numberMap.get("SumOfEvens") + i);
        
                 //  - determines the sum of all the odd numbers in the list
            } else {
                numberMap.put("SumOfOdds", numberMap.get("SumOfOdds") + i);
            }
        }
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        
        return numberMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Implement this method such that
        //  - it takes an array list of integers
        ArrayList<Integer> numbersReverse = new ArrayList<>();
        int numbersLength = numbers.size();

            for (int i = 0; i < numbersLength; i++) {
                numbersReverse.add(numbers.get(numbersLength - 1 - i));
            }

        //  - it returns the list in reverse order
        return numbersReverse;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
