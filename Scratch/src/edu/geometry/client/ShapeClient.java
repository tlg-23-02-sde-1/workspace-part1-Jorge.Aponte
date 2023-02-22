package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape shape = new Triangle(2, 5.0);
        shape.getArea();
        shape.getNumOfSides();
        System.out.println();

        Shape shape2 = new Circle(3.5);
        shape2.getArea();
        shape2.getNumOfSides();
        System.out.println();

        Shape shape3 = new Rectangle(5, 10);
        shape3.getArea();
        shape3.getNumOfSides();
    }
}