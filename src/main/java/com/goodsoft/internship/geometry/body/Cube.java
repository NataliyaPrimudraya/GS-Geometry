package com.goodsoft.internship.geometry.body;

public class Cube extends Body {
    private double a;

    public Cube(double edge) {
        super("куб");
        this.a = edge;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }
}