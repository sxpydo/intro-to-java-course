package com.cbfacademy;

public class Operators {
    public static void main(String... args) {

        // Arithmetic Operations
        // Following our example of arithmetic operations on integers, create a simple Java program with simple expressions for both float and double types
        
        float number1 = 12.2f;
        float number2 = 45.5f;
    
        // sums for decimal numbers
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiply = number1 * number2;
        float divide = number1 / number2;
        
        // print the results
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(divide);



       
        // Relational Operations
        // Following our example of relational operations on integers, create a simple Java program with simple expressions for doubles only
        
        double number3 = 1.2d;
        double number4 = 4.5d;

        // sums for decimal numbers + print the results
        System.out.println(number3 == number4);
        System.out.println(number3 >= number4);
        System.out.println(number3 <= number4);
        System.out.println(number3 != number4);

   

       
       // Unary Operators - Increment and Decrement
    
            int number5 = 12;
            int number6 = 12;

            System.out.println(number5++); // 12 - Number was incremented after, therefore you should get 13 on line 16
            System.out.println(number5); // 13
            System.out.println(++number6); // 13 - Number was incremented beforehand

    }
    
}
