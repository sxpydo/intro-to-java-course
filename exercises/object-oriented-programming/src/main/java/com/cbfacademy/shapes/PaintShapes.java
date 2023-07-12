package com.cbfacademy.shapes;

public class PaintShapes {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle("Rectangle",35,20);
        Sphere sphere = new Sphere("Sphere",15);
        Cylinder cylinder = new Cylinder("Cylinder", 10, 30);
        System.out.println(rectangle.area());
        System.out.println(sphere.area());
        System.out.println(cylinder.area());

        Paint paint = new Paint(25);
        double rectanglePaintAmount = paint.amount(rectangle);
        double spherePaintAmount = paint.amount(sphere);
        double cylinderPaintAmount = paint.amount(cylinder);
        System.out.println(rectanglePaintAmount + spherePaintAmount + cylinderPaintAmount);
        
     }
    
}
