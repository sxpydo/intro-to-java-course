package com.cbfacademy.shapes;

public class Paint {
    double coverage;

    public Paint (double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape){
    return coverage * shape.area();
    }
    
}
