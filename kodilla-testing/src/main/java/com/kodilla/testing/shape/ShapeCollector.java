package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
            return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
            Shape shapeX = shapes.get(n);
            return shapeX;
    }
    public String showFigures(){
        if(shapes.size()>0){
            String text ="";
            for(int i=0;i<shapes.size();i++){
                text = text + shapes.get(i).toString();
            }
            return text;
        }
        return null;
    }
}
