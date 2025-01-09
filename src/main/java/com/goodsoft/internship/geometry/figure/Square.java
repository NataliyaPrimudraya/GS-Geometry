package com.goodsoft.internship.geometry.figure;

public class Square extends Figure {
    private double a;

    public Square(double side) {
        super("квадрат");
        this.a = side;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}