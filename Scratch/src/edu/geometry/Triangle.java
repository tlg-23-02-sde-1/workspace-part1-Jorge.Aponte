package edu.geometry;

public class Triangle implements Shape {
    double height;
    double base;
    private final int numOfSides = 3;

    public Triangle() {
    }

    public Triangle(double height, double base) throws InvalidNegativeNumberException {
        setHeight(height);
        setBase(base);
    }

    @Override
    public void getArea() {
        double area = getHeight() * getBase() * half;
        System.out.printf("The area of your %s is %.2f\n", getClass().getSimpleName(), area);
    }

    @Override
    public void getNumOfSides() {
        System.out.println(getClass().getSimpleName() + " has " + numOfSides + " sides in it's shape.");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws InvalidNegativeNumberException {
        if (height <= 0.0) {
            throw new InvalidNegativeNumberException("Invalid input: " + height + ", " +
                    getClass().getSimpleName() + "'s height must be greater than " + min + "\n");
        }
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws InvalidNegativeNumberException {
        if (base <= 0) {
            throw new InvalidNegativeNumberException("Invalid input: " + base + ", " +
                    getClass().getSimpleName() + "'s base must be greater than " + min + "\n");
        }
        this.base = base;
    }
}