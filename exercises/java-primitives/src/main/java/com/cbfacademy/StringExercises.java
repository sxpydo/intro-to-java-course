package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // Write code that creates a String from the input array of characters
        //throw new RuntimeException("Not implemented");

        String outputString = new String(characters);
            //System.out.println(outputString);
            return(outputString);
    }

    public Long howMany(String text, Character character) {
        // Write code to determine how many of the input ${character} are contained in the input ${text}
        //throw new RuntimeException("Not implemented");

        long count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == character)
                count++;
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
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


}
