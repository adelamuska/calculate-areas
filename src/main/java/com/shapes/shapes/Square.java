package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape2D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Square");
    }

    @Override
    public double calculatePerimeter(double ...a) {
        return 4 * a[0];
    }

    @Override
    public double calculateArea(double... a) {
        return a[0] * a[0];
    }
}
