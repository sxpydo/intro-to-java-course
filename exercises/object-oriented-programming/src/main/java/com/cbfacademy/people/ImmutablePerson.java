package com.cbfacademy.people;

import java.util.Arrays;


public class ImmutablePerson {
    private String firstName;
    private String lastName;
    private String middleName;
    private String[] nickNames;

    // Using constructor when inputting full name excluding nicknames
    public ImmutablePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Using constructor when inputting all attributes
    public ImmutablePerson(String firstName, String lastName, String middleName, String[] nickNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickNames = nickNames;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

     public void setNickNames(String[] nickNames) {
        this.nickNames = nickNames;
    }

    public String getFirstName(){
        return this.firstName;
    }

     public String getLastName(){
        return this.lastName;
    }

     public String getMiddleName(){
        return this.middleName;
    }

    public String getNickNames() {
        return Arrays.toString(this.nickNames);
    }


      public static void main(String[] args) {
        ImmutablePerson Shav = new ImmutablePerson("Shavana", "Peynado");

        Shav.setMiddleName("Elvereta");
        Shav.setNickNames(new String[]{"Shavs", "Shavy", "Shav"});
        System.out.println(Shav.getFirstName());
        System.out.println(Shav.getNickNames());
    }
    
}
