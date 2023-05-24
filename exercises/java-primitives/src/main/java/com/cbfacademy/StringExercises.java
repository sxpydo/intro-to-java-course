package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // Write code that creates a String from the input array of characters
        
        throw new RuntimeException("Not implemented");
    }

    public Long howMany(String text, Character character) {
        // Write code to determine how many of the input ${character} are contained in the input ${text}
        throw new RuntimeException("Not implemented");
    }

    public static Boolean isPalindrome(String word) {
        // Write code to determine whether the input ${word} is a palindrome
        
        
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = word.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (word.charAt(i) != word.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
        


    public String getName() {
        return "String Exercises";
    }



     public static void main(String[] args) {
        // Input string
        String str = "geeks";

        //Convert the string to lowercase
        str = str.toLowerCase();
        // passing boolean function till holding true
        if (isPalindrome(str))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }

}


