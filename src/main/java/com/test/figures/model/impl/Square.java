package com.test.figures.model.impl;

import com.test.figures.model.Shape;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
