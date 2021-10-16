package com.test.figures.model.impl;

import com.test.figures.model.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * PI * this.radius;
    }

    @Override
    public double getArea() {
        return PI * (this.radius *  this.radius);
    }
}
