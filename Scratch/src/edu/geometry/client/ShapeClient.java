package edu.geometry.client;

import edu.geometry.*;

class ShapeClient {

    public static void main(String[] args) {

        try {
            Shape shape1 = new Triangle(5, 8.75);
            shape1.getArea();
            shape1.getNumOfSides();
            System.out.println();
        } catch (InvalidNegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            Shape shape2 = new Circle(3.5);
            shape2.getArea();
            shape2.getNumOfSides();
            System.out.println();
        } catch (InvalidNegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            Shape shape3 = new Rectangle(5.5, 11.6);
            shape3.getArea();
            shape3.getNumOfSides();
        } catch (InvalidNegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}