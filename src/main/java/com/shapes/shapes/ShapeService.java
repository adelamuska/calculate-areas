package com.shapes.shapes;

import org.springframework.stereotype.Service;

@Service
public interface ShapeService {

     double calculateArea2D(String shapeType, double... parameters);
     double calculatePerimeter2D(String shapeType, double... parameters);
     double calculateArea3D(String shapeType, double... parameters);
     double calculateVolume3D(String shapeType, double... parameters);

}
