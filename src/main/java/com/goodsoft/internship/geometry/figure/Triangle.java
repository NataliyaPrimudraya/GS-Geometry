package com.goodsoft.internship.geometry.figure;

import java.math.BigDecimal;

public class Triangle extends Figure {

    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal c;

    public Triangle(BigDecimal a, BigDecimal b, BigDecimal c) {
        super("треугольник");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public BigDecimal getArea() {
        BigDecimal s = (a.add(b).add(c)).divide(BigDecimal.valueOf(2), MATH_CONTEXT);
        return (s.multiply(s.subtract(a)).multiply(s.subtract(b)).multiply(s.subtract(c))).sqrt(MATH_CONTEXT);
    }
}
