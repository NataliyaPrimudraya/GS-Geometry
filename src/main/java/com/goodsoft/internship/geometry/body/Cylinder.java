package com.goodsoft.internship.geometry.body;

public class Cylinder extends Body {
    private double r;
    private double h;

    public Cylinder(double radius, double height) {
        super("цилиндр");
        this.r = radius;
        this.h = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}