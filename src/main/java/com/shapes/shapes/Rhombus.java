package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Rhombus implements Shape2D{
    @Override
    public double calculatePerimeter(double... a) {
        return 4 * a[0];
    }

    @Override
    public double calculateArea(double... a) {
        double d1 = a[0];
        double d2 = a[1];
        return (d1*d2)/2;
    }

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Rhombus");
    }
}
