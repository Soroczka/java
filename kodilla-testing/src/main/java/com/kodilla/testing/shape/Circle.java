package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name = "Circle";
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        return Math.PI * r;
    }
}
