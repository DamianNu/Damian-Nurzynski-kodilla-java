package com.kodilla.testing.shape;

public class Circle implements Shape{
    String ShapeName;
    double field;

    public Circle(String shapeName, double field) {
        ShapeName = shapeName;
        this.field = field;
    }

    @Override
    public void getShapeName() {

    }

    @Override
    public void getField() {

    }

    @Override
    public String toString() {
        return "Circle name: " + ShapeName + ", ";
    }
}
