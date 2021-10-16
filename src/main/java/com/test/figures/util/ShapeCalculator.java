package com.test.figures.util;

import com.test.figures.model.*;
import com.test.figures.model.impl.*;

public class ShapeCalculator {

    public static Shape calculateShape (Request request) throws BadRequestException {
        final String RECTANGLE = "rectangle";
        final String SQUARE = "square";
        final String TRIANGLE = "triangle";
        final String CIRCLE = "circle";

        Shape shape;
        switch (request.getShape()) {
            case RECTANGLE:
                if (request.getWidth() == 0 || request.getHeight() == 0){
                    throw new BadRequestException("Width and height are required!");
                }
                shape = new Rectangle(request.getWidth(), request.getHeight());
                break;
            case SQUARE:
                if (request.getA() == 0){
                    throw new BadRequestException("\"a\" is required!");
                }
                shape = new Square(request.getA());
                break;
            case TRIANGLE:
                if (request.getA() == 0 || request.getB() == 0 || request.getC() == 0){
                    throw new BadRequestException("\"a\", \"b\", \"c\" are required!");
                }
                shape = new Triangle(request.getA(), request.getB(), request.getC());
                break;
            case CIRCLE:
                if (request.getRadius() == 0){
                    throw new BadRequestException("Radius is required!");
                }
                shape = new Circle(request.getRadius());
                break;
            default:
                throw new BadRequestException("Invalid shape type");
        }
        return shape;
    }
}
