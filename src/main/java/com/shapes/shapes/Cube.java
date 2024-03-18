package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Cube implements Shape3D {

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Cube");
    }

    @Override
    public double calculateArea(double... a) {
        return 3*a[0];
    }

    @Override
    public double calculateVolume(double... a) {
        return 6 *(a[0] * a[0]);
    }
}
