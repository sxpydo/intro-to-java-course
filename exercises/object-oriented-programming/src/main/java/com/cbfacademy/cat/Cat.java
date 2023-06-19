package com.cbfacademy.cat;


public class Cat {
    final static String SPECIES = "Mammal";
    final static int LEGS = 4;

    public String breed;
    public double size;
    public int age;
    public String colour;

    Boolean eating;
    Boolean sleeping;
    Boolean sitting;
    Boolean running;
    
    public Cat(String breed, double size, int age, String colour) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.colour = colour;
    }


    public String getDetails(){
        String details = "This cat is a " + this.breed + " and weighs " + this.size + ". She/He " + this.age + " and he/she has " + this.colour + " fur! ";
        return details;
    }

    public String eat(){
        this.eating = true;
        return "The kitty is now eating!";
    }

    public String sleep(){
        this.eating = true;
        return "The kitty is now sleeping!";
    }

    public String sit(){
        this.eating = true;
        return "The kitty is now loafing!";
    }

    public String run(){
        this.eating = true;
        return "The kitty is now doing zoomies!";
    }



     public static void main(String[] args){
        Cat Abbi = new Cat("Calico", 8.5, 10, "Calico colours");
        Cat Ginger = new Cat("Ginger", 13, 7, "Orange");


        System.out.println(Abbi.getDetails());
        System.out.println(Ginger.eat());

    }

}
