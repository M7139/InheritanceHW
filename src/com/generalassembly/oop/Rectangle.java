package com.generalassembly.oop;

public class Rectangle extends Shape {
    protected double length;
    protected double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * (length + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }

}