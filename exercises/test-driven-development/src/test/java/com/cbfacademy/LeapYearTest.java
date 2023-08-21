package com.cbfacademy;


import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearTest {
 
    @Test
    public void shouldReturnTrueWhenYear1600() {
        LeapYear leapYear = new LeapYear(1600);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenYear1700() {
        LeapYear leapYear = new LeapYear(1700);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear1800() {
        LeapYear leapYear = new LeapYear(1800);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear1900() {
        LeapYear leapYear = new LeapYear(1900);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnTrueWhenYear2000() {
        LeapYear leapYear = new LeapYear(2000);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenYear2001() {
        LeapYear leapYear = new LeapYear(2001);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2002() {
        LeapYear leapYear = new LeapYear(2002);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2003() {
        LeapYear leapYear = new LeapYear(2003);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnTrueWhenYear2004() {
        LeapYear leapYear = new LeapYear(2004);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenYear2005() {
        LeapYear leapYear = new LeapYear(2005);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2006() {
        LeapYear leapYear = new LeapYear(2006);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2007() {
        LeapYear leapYear = new LeapYear(2007);
        assertThat(leapYear.isLeapYear(), is(false));
    }

     @Test
    public void shouldReturnTrueWhenYear2008() {
        LeapYear leapYear = new LeapYear(2008);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenYear2009() {
        LeapYear leapYear = new LeapYear(2009);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2010() {
        LeapYear leapYear = new LeapYear(2010);
        assertThat(leapYear.isLeapYear(), is(false));
    }

     @Test
    public void shouldReturnTrueWhenYear2020() {
        LeapYear leapYear = new LeapYear(2020);
        assertThat(leapYear.isLeapYear(), is(true));
    }

    @Test
    public void shouldReturnFalseWhenYear2021() {
        LeapYear leapYear = new LeapYear(2021);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2022() {
        LeapYear leapYear = new LeapYear(2022);
        assertThat(leapYear.isLeapYear(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenYear2023() {
        LeapYear leapYear = new LeapYear(2023);
        assertThat(leapYear.isLeapYear(), is(false));
    }
    
}

