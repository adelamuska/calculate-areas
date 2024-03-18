package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape2D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Triangle");
    }

    @Override
    public double calculatePerimeter(double... a) {
        double base = a[0];
        double side = a[1];
        double side1 = a[2];
        return base + side + side1;
    }

    @Override
    public double calculateArea(double... a) {
        double base = a[0];
        double height = a[1];
        return (base*height)/2;
    }
}
