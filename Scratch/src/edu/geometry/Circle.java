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
        System.out.printf("The area of your Circle is %.2f\n", area);
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
                    getClass().getSimpleName() + " Radius must be greater than " + min);
        }
        this.radius = radius;
    }
}
