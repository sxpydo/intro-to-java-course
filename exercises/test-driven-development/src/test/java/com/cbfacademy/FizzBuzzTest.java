package com.cbfacademy;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    
    @Test
    public void shouldReturnNumber1() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertThat(fizzBuzz.run(), is("1"));
    }

     @Test
    public void shouldReturnNumber2() {
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        assertThat(fizzBuzz.run(), is("2"));
    }


    @Test
    public void multiplesOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertThat(fizzBuzz.run(), is("Fizz"));
    }


}
