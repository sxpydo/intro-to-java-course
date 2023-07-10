package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    double radius;
    double height;

    public Cylinder (String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
        
    }

    @Override
    public double area() {
        double area = height * Math.PI * (radius*radius);
        return area;
        
    }
    

    public static void main(String[] args){
        Cylinder cylinder1 = new Cylinder("Cyls #1", 10, 2);
        System.out.println(cylinder1.toString());
        System.out.println(cylinder1.area());
      
    }

}
