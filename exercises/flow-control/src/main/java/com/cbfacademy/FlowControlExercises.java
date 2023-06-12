package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
        

        //  it creates a list where for each element of the input list ${numbers}
        
    
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
            
       
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
          
       
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
             
      
        //  - it adds the element to the list in any other case
           
      
        //  - it returns the constructed list
        throw new RuntimeException("Not implemented");

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
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Implement this method such that
        //  - it takes an array list of integers
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
