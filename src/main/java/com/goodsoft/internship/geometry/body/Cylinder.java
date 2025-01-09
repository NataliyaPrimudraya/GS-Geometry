package com.goodsoft.internship.geometry.body;

import java.math.BigDecimal;

public class Cylinder extends Body {

    private BigDecimal r;
    private BigDecimal h;

    public Cylinder(BigDecimal radius, BigDecimal height) {
        super("цилиндр");
        this.r = radius;
        this.h = height;
    }

    @Override
    public BigDecimal getVolume() {
        return BigDecimal.valueOf(Math.PI).multiply(r.pow(2)).multiply(h, MATH_CONTEXT);
    }
}