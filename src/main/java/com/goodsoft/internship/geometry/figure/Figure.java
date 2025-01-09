package com.goodsoft.internship.geometry.figure;

import com.goodsoft.internship.Printable;

abstract public class Figure implements Printable {

    private final String name;

    Figure(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public void print() {
        System.out.println("Это " + this.name + " площадью " + this.getArea());
    }
}