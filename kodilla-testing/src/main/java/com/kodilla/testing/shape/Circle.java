package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name;
    private float field;

    public Circle(float field) {
        this.name = "Circle";
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
