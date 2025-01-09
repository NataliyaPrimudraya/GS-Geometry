package com.goodsoft.internship.geometry.figure;

import java.math.BigDecimal;

public class Square extends Figure {

    private BigDecimal a;

    public Square(BigDecimal side) {
        super("квадрат");
        this.a = side;
    }

    @Override
    public BigDecimal getArea() {
        return a.pow(2, MATH_CONTEXT);
    }
}