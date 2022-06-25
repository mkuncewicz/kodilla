package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String name;
    private float field;

    public Triangle(float field) {
        this.name = "Triangle";
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
