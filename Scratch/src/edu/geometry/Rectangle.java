package edu.geometry;

public class Rectangle implements Shape {
    double length;
    double width;
    private final int numOfSides = 4;

    public Rectangle() {
    }

    public Rectangle(double length, double width) throws InvalidNegativeNumberException {
        setLength(length);
        setWidth(width);
    }

    @Override
    public void getArea() {
        double area = getLength() * getWidth();
        System.out.printf("The area of your %s is %.2f\n", getClass().getSimpleName(), area);
    }

    @Override
    public void getNumOfSides() {
        System.out.println(getClass().getSimpleName() + " has " + numOfSides + " sides in it's shape.");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws InvalidNegativeNumberException {
        if (width <= 0.0) {
            throw new InvalidNegativeNumberException("Invalid input: " + width + ", " +
                    getClass().getSimpleName() + "'s width must be greater than " + min + "\n");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws InvalidNegativeNumberException {
        if (length <= 0.0) {
            throw new InvalidNegativeNumberException("Invalid input: " + length + ", " +
                    getClass().getSimpleName() + "'s length must be greater than " + min + "\n");
        }
        this.length = length;
    }
}