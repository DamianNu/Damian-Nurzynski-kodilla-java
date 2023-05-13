package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String ShapeName;
    double field;

    public Triangle(String shapeName, double field) {
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
        return "Triangle name: " + ShapeName + ", ";
    }
}
