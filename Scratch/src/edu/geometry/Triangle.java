package edu.geometry;

public class Triangle implements Shape {
    double height;
    double base;
    private final int numOfSides = 3;

    public Triangle(double height, double base) {
        setHeight(height);
        setBase(base);
    }

    @Override
    public void getArea() {
        double area = getHeight() * getBase() * half;
        System.out.println("The area of your Triangle is " + area);
    }

    @Override
    public void getNumOfSides() {
        System.out.println(getClass().getSimpleName() + " has " + numOfSides + " sides in it's shape.");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        } else {
            System.out.println("Invalid input: " + height + ", Height must be greater than " + min);
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Invalid input: " + base + ", Base must be greater than " + min);
        }
    }
}