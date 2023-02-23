package edu.geometry;

public class Circle implements Shape {
    double radius;
    private final int numOfSides = 0;

    public Circle() {
    }

    public Circle(double radius) throws InvalidNegativeNumberException {
        setRadius(radius);
    }

    @Override
    public void getArea() {
        double area = pi * Math.pow(getRadius(), 2);
        System.out.printf("The area of your %s is %.2f\n", getClass().getSimpleName(), area);
    }

    @Override
    public void getNumOfSides() {
        System.out.println(getClass().getSimpleName() + " has " + numOfSides + " sides in it's shape.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidNegativeNumberException {
        if (radius <= 0.0) {
            throw new InvalidNegativeNumberException("Invalid input: " + radius + ", " +
                    getClass().getSimpleName() + "'s radius must be greater than " + min + "\n");
        }
        this.radius = radius;
    }
}
