package com.goodsoft.internship.geometry.figure;

import com.goodsoft.internship.Printable;
import java.math.BigDecimal;
import java.math.MathContext;

abstract public class Figure implements Printable {

    public static final MathContext MATH_CONTEXT = new MathContext(10);
    private final String name;

    Figure(String name) {
        this.name = name;
    }

    public abstract BigDecimal getArea();

    @Override
    public void print() {
        System.out.println("Это " + this.name + " площадью " + this.getArea());
    }
}