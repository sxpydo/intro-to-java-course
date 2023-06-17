package com.cbfacademy.car;

public class Car {
    
    int year;
    String make;
    String model;

    public Car(String mk, String mod, int yr) {
        
        this.make = mk;
        this.model = mod;
        this.year = yr;
    }


    public String getMake(){

        String info = "Make of the car is " + this.make;
        return info;

    }

      public String getModel(){
        
        String info = "Model of the car is " + this.model;
        return info;

    }

      public String getYear(){
        
        String info = "Year of the car is " + this.year;
        return info;

    }

    public static void main(String[] args){
        Car volvoCar = new Car("Volvo", "v40", 2012);
        Car porscheCar = new Car("Porsche", "Panamera", 2009);
        Car audiCar = new Car("Audi", "A3", 2005);

        String year = volvoCar.getYear();
        String model = porscheCar.getModel();
        String make = audiCar.getMake();

        System.out.println(year);
        System.out.println(model);
        System.out.println(make);

    }
}