package com.test.figures.model.impl;

import com.test.figures.model.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getPerimeter() {
        return 2.0 * (this.width + this.height);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}