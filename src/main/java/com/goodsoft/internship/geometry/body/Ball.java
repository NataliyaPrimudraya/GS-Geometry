package com.goodsoft.internship.geometry.body;

import java.math.BigDecimal;

public class Ball extends Body {

    private BigDecimal r;

    public Ball(BigDecimal radius) {
        super("шар");
        this.r = radius;
    }

    @Override
    public BigDecimal getVolume() {
        return BigDecimal.valueOf((4.0 / 3) * Math.PI).multiply((r.pow(3, MATH_CONTEXT)));
    }
}