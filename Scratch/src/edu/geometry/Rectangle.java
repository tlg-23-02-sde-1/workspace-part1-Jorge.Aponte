package edu.geometry;

public class Rectangle implements Shape{
    double length;
    double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public void getArea() {
        double area = getLength() * getWidth();
        System.out.println("The area of your Rectangle is " + area);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0) {
            this.width = width;
        }
        System.out.println("Invalid input: " + width + ", Width must be greater than " + min);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0) {
            this.length = length;
        } else {
            System.out.println("Invalid input: " + length + ", Length must be greater than " + min);
        }
    }
}