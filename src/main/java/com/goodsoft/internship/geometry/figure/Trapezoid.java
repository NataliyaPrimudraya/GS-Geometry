package com.goodsoft.internship.geometry.figure;

import java.math.BigDecimal;

public class Trapezoid extends Figure {

    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal h;

    public Trapezoid(BigDecimal baseA, BigDecimal baseB, BigDecimal height) {
        super("трапеция");
        this.a = baseA;
        this.b = baseB;
        this.h = height;
    }

    @Override
    public BigDecimal getArea() {
        return ((a.add(b)).divide(BigDecimal.valueOf(2), MATH_CONTEXT)).multiply(h, MATH_CONTEXT);
    }
}
