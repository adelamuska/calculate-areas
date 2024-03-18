package com.shapes.shapes;

import org.springframework.stereotype.Component;

@Component
public class Cylinder implements Shape3D{
    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return shapeType.equals("Cylinder");
    }

    @Override
    public double calculateArea(double... a) {
        double radius = a[0];
        double height = a[1];
        return Math.PI * radius * radius * height;
    }

    @Override
    public double calculateVolume(double... a) {
        double radius = a[0];
        double height = a[1];
        return  2*Math.PI * radius * (radius+ height);
    }
}
