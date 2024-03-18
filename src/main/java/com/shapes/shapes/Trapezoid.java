package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Trapezoid implements Shape2D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Trapezoid");
    }

    @Override
    public double calculatePerimeter(double... a) {
        double A = a[0];
        double B = a[1];
        double C = a[2];
        double D = a[3];
        return  A + B +C + D;
    }

    @Override
    public double calculateArea(double... a) {
        double A = a[0];
        double B = a[1];
        double height = a[2];
        return ((A+B) * height) / 2;
    }
}
