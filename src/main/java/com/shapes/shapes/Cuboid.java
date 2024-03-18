package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Cuboid implements Shape3D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Cuboid");
    }

    @Override
    public double calculateArea(double... a) {
        double A = a[0];
        double B = a[1];
        double height = a[2];
        return A * B * height;
    }

    @Override
    public double calculateVolume(double... a) {
        double A = a[0];
        double B = a[1];
        double height = a[2];
        return 2 * ( (A* height) + (B * height) + (A *B));
    }
}
