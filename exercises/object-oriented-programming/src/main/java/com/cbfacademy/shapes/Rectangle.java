package com.cbfacademy.shapes;

public class Rectangle extends Shape {

    double length;
    double width;
    
     public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
        
    }


    @Override
    public double area() {
         double area = this.length * this.width;
        return area;
    }


      public static void main(String[] args){
       Rectangle rectangle1 = new Rectangle("Rectangle #1", 1.5, 2);
       System.out.println(rectangle1.area());
      
    }


}
