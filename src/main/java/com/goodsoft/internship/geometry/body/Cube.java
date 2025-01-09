package com.goodsoft.internship.geometry.body;

import java.math.BigDecimal;

public class Cube extends Body {

    private BigDecimal a;

    public Cube(BigDecimal edge) {
        super("куб");
        this.a = edge;
    }

    @Override
    public BigDecimal getVolume() {
        return a.pow(3, MATH_CONTEXT);
    }
}