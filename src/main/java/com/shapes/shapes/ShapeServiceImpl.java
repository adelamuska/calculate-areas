package com.shapes.shapes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShapeServiceImpl implements ShapeService{

    final private List<Shape2D> SHAPE2D;
    final private List<Shape3D> SHAPE3D;

    public ShapeServiceImpl(List<Shape2D> shape2D, List<Shape3D> shape3D) {
        this.SHAPE2D = shape2D;
        this.SHAPE3D = shape3D;
    }

    @Override
    public double calculateArea2D(String shapeType, double...parameters) {
        return SHAPE2D.stream()
                .filter(shape -> shape.isShapeTypeSupported(shapeType))
                .findFirst()
                .map(shape2D -> shape2D.calculateArea(parameters))
                .orElseThrow(()-> new NullPointerException("List is null"));
    }

    @Override
    public double calculatePerimeter2D(String shapeType, double... parameters) {
        return SHAPE2D.stream().filter(shape -> shape.isShapeTypeSupported(shapeType))
                .findFirst().map(shape2D -> shape2D.calculatePerimeter(parameters))
                .orElseThrow(()-> new NullPointerException("List is null"));
    }

    @Override
    public double calculateArea3D(String shapeType, double... parameters) {
        return SHAPE3D.stream().filter(shape-> shape.isShapeTypeSupported(shapeType))
                .findFirst().map(shape3D -> shape3D.calculateArea(parameters))
                .orElseThrow(()-> new NullPointerException("List is null"));
    }

    @Override
    public double calculateVolume3D(String shapeType, double... parameters) {
        return SHAPE3D.stream().filter(shape-> shape.isShapeTypeSupported(shapeType))
                .findFirst().map(shape3D -> shape3D.calculateVolume(parameters))
                .orElseThrow(()-> new NullPointerException("List is null"));
    }
}
