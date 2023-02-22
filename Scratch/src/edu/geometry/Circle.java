package edu.geometry;

public class Circle implements Shape {
    double radius;
    private final int numOfSides = 0;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public void getArea() {
        double area = pi * Math.pow(getRadius(), 2);
        System.out.println("The area of your Circle is " + area);
    }

    @Override
    public void getNumOfSides() {
        System.out.println(getClass().getSimpleName() + " has " + numOfSides + " sides in it's shape.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0.0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid input: " + radius + ", Radius must be greater than " + min);
        }
    }
}
