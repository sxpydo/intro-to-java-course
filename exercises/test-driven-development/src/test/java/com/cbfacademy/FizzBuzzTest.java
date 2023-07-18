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
    public void shouldReturnFizzWhen3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertThat(fizzBuzz.run(), is("Fizz"));
    }

    @Test
    public void shouldReturnFizzWhen6() {
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        assertThat(fizzBuzz.run(), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhen5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertThat(fizzBuzz.run(), is("Buzz"));
    }

    @Test
    public void shouldReturnBuzzWhen10() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        assertThat(fizzBuzz.run(), is("Buzz"));
    }

     @Test
    public void shouldReturnFizzBuzzWhen15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertThat(fizzBuzz.run(), is("FizzBuzz"));
    }


}
