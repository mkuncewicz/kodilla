package com.kodilla.testing.shape;

public class Square implements Shape{

    private String name;
    private float field;

    public Square(float field) {
        this.name = "Square";
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public float getField() {
        return field;
    }
}
