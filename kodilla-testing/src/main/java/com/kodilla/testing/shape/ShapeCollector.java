package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {

    public ArrayList<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape){
        list.add(shape);
    }

    public void removeFigure(Shape shape){
        list.remove(shape);
    }

    public Shape getFigure(int n){
        if(n < list.size() && n >= 0) {
            return list.get(n);
        }else {
            return null;
        }
    }

    public String showFigures(){
        String result = "";

        for (Shape shape : list){
            result += shape.getShapeName() + " ";
        }
        return result;
    }

}
