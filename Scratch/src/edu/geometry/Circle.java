package edu.geometry;

public class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public void getArea() {
        double area = pi * getRadius();
        System.out.println("The area of your Circle is " + area);
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
