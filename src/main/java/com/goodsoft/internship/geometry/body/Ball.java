package com.goodsoft.internship.geometry.body;

public class Ball extends Body {
    private double r;

    public Ball(double radius) {
        super("шар");
        this.r = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(r, 3);
    }
}