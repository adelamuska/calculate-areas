package com.shapes.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ShapeDemo implements CommandLineRunner {

    private final ShapeService shapeService;

    @Autowired
    public ShapeDemo(ShapeService shapeService) {
        this.shapeService = shapeService;
    }


    @Override
    public void run(String... args) { //throws Exception {
        System.err.println("Area of square: " + shapeService.calculateArea2D("Square", 3.0));
        System.err.println("Area of cuboid: " + shapeService.calculateArea3D("Cuboid", 4.0, 3.0, 2.0));
        System.err.println("Volume of cuboid: " + shapeService.calculateVolume3D("Cuboid", 2.0, 4.0, 5.0));
        System.err.println("Perimeter of triangle: " + shapeService.calculatePerimeter2D("Triangle", 6.0, 3.4, 3.2));

        //throw new Exception("Unsupported shape type");
    }

}
