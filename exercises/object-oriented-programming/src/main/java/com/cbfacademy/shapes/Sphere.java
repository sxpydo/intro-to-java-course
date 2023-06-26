package com.cbfacademy.shapes;

public class Sphere extends Shape {

    double radius;

    public Sphere(String shapeName, double radius){
        super(shapeName);
        this.radius = radius;

    }

    @Override
    public double area() {
        double area = 4 * Math.PI * (radius*radius);
        return area;
    }

    

    public static void main(String[] args){
        Sphere sphere1 = new Sphere("Sphere #1", 10);
        System.out.println(sphere1.toString());
        System.out.println(sphere1.area());
      
    }

    
}
