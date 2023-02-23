package edu.geometry.client;

import edu.geometry.*;

class ShapeClient {

    public static void main(String[] args) {

        try {
            Shape shape = new Triangle(5, 8.75);
            Shape shape2 = new Circle(3.5);
            Shape shape3 = new Rectangle(5.5, 10);

            shape.getArea();
            shape.getNumOfSides();
            System.out.println();

            shape2.getArea();
            shape2.getNumOfSides();
            System.out.println();

            shape3.getArea();
            shape3.getNumOfSides();
        } catch (InvalidNegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}