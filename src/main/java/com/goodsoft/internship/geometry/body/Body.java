package com.goodsoft.internship.geometry.body;

import com.goodsoft.internship.Printable;

abstract class Body implements Printable {

    private final String name;

    Body(String name) {
        this.name = name;
    }

    public abstract double getVolume();

    @Override
    public void print() {
        System.out.println("Это " + name + " объёмом " + this.getVolume());
    }
}
