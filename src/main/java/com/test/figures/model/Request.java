package com.test.figures.model;

import io.swagger.annotations.ApiModelProperty;

public class Request {

    @ApiModelProperty(required = true, notes = "Shape name", allowableValues = "rectangle,square,triangle,circle")
    private String shape;
    @ApiModelProperty(notes = "Circle radius, required if shape is circle")
    private double radius;
    @ApiModelProperty(notes = "Rectangle height, required if shape is rectangle")
    private double height;
    @ApiModelProperty(notes = "Rectangle width, required if shape is rectangle")
    private double width;
    @ApiModelProperty(notes = "\"a\" side of the shape, required if shape is triangle")
    private double a;
    @ApiModelProperty(notes = "\"b\" side of the shape, required if shape is triangle")
    private double b;
    @ApiModelProperty(notes = "\"c\" side of the shape, required if shape is triangle")
    private double c;

    public Request(String shape) {
        this.shape = shape;
    }

    public Request(String shape, double radius, double height, double width, double a, double b, double c) {
        this.shape = shape;
        this.radius = radius;
        this.height = height;
        this.width = width;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
