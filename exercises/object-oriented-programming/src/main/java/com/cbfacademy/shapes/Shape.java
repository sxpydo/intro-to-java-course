package com.cbfacademy.shapes;

public abstract class Shape {
    String shapeName;

    public Shape(String ShapeName){
       this.shapeName = ShapeName;
    }

    public abstract double area();

    @Override
    public String toString(){
        return("The shape is called " + this.shapeName);
    }
    
}
