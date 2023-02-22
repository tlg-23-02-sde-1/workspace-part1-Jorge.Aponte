package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape shape = new Triangle(2, 5.0);
        shape.getArea();
        Shape shape2 = new Circle(3.5);
        shape2.getArea();
    }
}