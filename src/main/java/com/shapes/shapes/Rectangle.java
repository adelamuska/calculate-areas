package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape2D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Rectangle");
    }

    @Override
    public double calculatePerimeter(double... a) {
        double A= a[0];
        double B=a[1];
        return (2*A) + (2*B);
    }

    @Override
    public double calculateArea(double... a) {
        double A= a[0];
        double B=a[1];
        return A*B;
    }
}
