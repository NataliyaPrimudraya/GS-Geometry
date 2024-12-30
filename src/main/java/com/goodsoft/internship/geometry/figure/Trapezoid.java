package com.goodsoft.internship.geometry.figure;

public class Trapezoid extends Figure {
    private double a;
    private double b;
    private double h;

    public Trapezoid(double baseA, double baseB, double height) {
        super("трапеция");
        this.a = baseA;
        this.b = baseB;
        this.h = height;
    }

    @Override
    public double area() {
        return ((a + b) / 2) * h;
    }
}
