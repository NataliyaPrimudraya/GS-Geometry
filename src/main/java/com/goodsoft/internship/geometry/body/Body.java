package com.goodsoft.internship.geometry.body;

import com.goodsoft.internship.Printable;
import java.math.BigDecimal;
import java.math.MathContext;

abstract class Body implements Printable {

    public static final MathContext MATH_CONTEXT = new MathContext(10);
    private final String name;

    Body(String name) {
        this.name = name;
    }

    public abstract BigDecimal getVolume();

    @Override
    public void print() {
        System.out.println("Это " + name + " объёмом " + this.getVolume());
    }
}
